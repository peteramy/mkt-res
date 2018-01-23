package cn.com.tontron.res.common.base.jpa;

import cn.com.tontron.res.common.base.page.TablePage;
import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.PathBuilder;
import com.querydsl.jpa.JPAQueryBase;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPADeleteClause;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAUpdateClause;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.QueryUtils;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.data.querydsl.EntityPathResolver;
import org.springframework.data.querydsl.SimpleEntityPathResolver;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.springframework.data.jpa.repository.query.QueryUtils.getQueryString;

@Transactional
public class JpaRepositoryImpl<T, ID extends Serializable> extends QueryDslJpaRepository<T, ID>
        implements JpaRepository<T, ID> {
    private final JpaEntityInformation<T, ID> entityInformation;
    private final EntityManager em;
    private final EntityPath<T> path;
    private final PathBuilder<T> builder;
    private final Querydsl querydsl;
    protected Logger logger = LoggerFactory.getLogger(JpaRepositoryImpl.class);

    public JpaRepositoryImpl(JpaEntityInformation<T, ID> entityInformation, EntityManager em,
                             EntityPathResolver resolver) {
        super(entityInformation, em, resolver);
        this.entityInformation = entityInformation;
        this.em = em;
        this.path = resolver.createPath(entityInformation.getJavaType());
        this.builder = new PathBuilder<T>(path.getType(), path.getMetadata());
        this.querydsl = new Querydsl(em, builder);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public JpaRepositoryImpl(Class<T> domainClass, EntityManager em) {
        this((JpaEntityInformation<T, ID>) JpaEntityInformationSupport.getEntityInformation(domainClass, em), em, SimpleEntityPathResolver.INSTANCE);
    }

    public int deleteInId(Collection<ID> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        String ql = getQueryString(QueryUtils.DELETE_ALL_QUERY_STRING, entityInformation.getEntityName());
        logger.debug(ql);
        return applyAndBind(ql, ids, em).executeUpdate();
    }

    public Query applyAndBind(String queryString, Collection<ID> ids, EntityManager entityManager) {
        Assert.notNull(queryString);
        Assert.notNull(ids);
        Assert.notNull(entityManager);

        String alias = QueryUtils.detectAlias(queryString);
        StringBuilder builder = new StringBuilder(queryString);
        builder.append(" where ");
        builder.append(String.format(" %s.id IN(?1)", alias));

        Query query = entityManager.createQuery(builder.toString());
        query.setParameter(1, ids);
        return query;
    }

    public TablePage<T> findAll(DSLPageRequest pageRequest) {
        JPQLQuery countQuery = createQuery(pageRequest.toPredicate());
        JPQLQuery query = createQuery(pageRequest.toPredicate());
        query.offset(pageRequest.getOffset());
        query.limit(pageRequest.getPageSize());

        Long total = countQuery.fetchCount();
        query.orderBy(pageRequest.toOrderSpecifier(path));
        List<T> content = total > pageRequest.getOffset() ? query.from(path).fetch() : Collections.<T>emptyList();
        return new TablePage<T>(content, total);
    }

    public <RT> TablePage<RT> findAll(DSLPageRequest pageRequest, Expression<RT> listExpr) {
        JPQLQuery countQuery = createQuery(pageRequest.toPredicate());
        JPQLQuery query = createQuery(pageRequest.toPredicate());
        query.offset(pageRequest.getOffset());
        query.limit(pageRequest.getPageSize());

        Long total = countQuery.fetchCount();
        query.orderBy(pageRequest.toOrderSpecifier(path));
        List<RT> content = total > pageRequest.getOffset() ? query.select(listExpr).fetch() : Collections.<RT>emptyList();
        return new TablePage<RT>(content, total);
    }

    public List<T> findAll(DSLRequest request) {
        JPQLQuery query = createQuery(request.toPredicate());
        query.orderBy(request.toOrderSpecifier(path));
        List<T> content = query.from(path).fetch();
        return content;
    }

    public List<T> findAll(OrderSpecifier<?>... orderSpecifiers) {
        JPQLQuery query = createQuery();
        query.orderBy(orderSpecifiers);
        return query.from(path).fetch();
    }

    public JPAQuery query() {
        JPAQuery jpaQuery = new JPAQuery(em);
        return jpaQuery;
    }

    public JPAQueryBase from() {
        return query().from(path);
    }

    public JPAUpdateClause updateClause() {
        return new JPAUpdateClause(em, path);
    }

    public JPADeleteClause deleteClause() {
        return new JPADeleteClause(em, path);
    }

//    @Transactional
//    public <S extends T> S save(S entity) {
//        if(this.entityInformation.isNew(entity)) {
//            this.em.persist(entity);
//            return entity;
//        } else {
//            return this.em.merge(entity);
//        }
//    }
}