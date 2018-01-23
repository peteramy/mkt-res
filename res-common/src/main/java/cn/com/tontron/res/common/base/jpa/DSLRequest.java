package cn.com.tontron.res.common.base.jpa;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.*;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class DSLRequest {
    protected List<Sort.Order> springOrderByList = new ArrayList<Sort.Order>();
    protected List<BooleanExpression> where;
    protected List<OrderSpecifier<? extends Comparable>> orderByList;

    public DSLRequest() {
        this(new ArrayList<BooleanExpression>(), new ArrayList<OrderSpecifier<? extends Comparable>>());
    }

    public DSLRequest(List<BooleanExpression> where) {
        this(where, new ArrayList<OrderSpecifier<? extends Comparable>>());
    }

    public DSLRequest(List<BooleanExpression> where, List<OrderSpecifier<? extends Comparable>> orderByList) {
        this.where = where;
        this.orderByList = orderByList;
    }

    public void addOrderBy(OrderSpecifier<? extends Comparable> orderBy) {
        orderByList.add(orderBy);
    }

    public void addOrderBy(Sort.Order order) {
        springOrderByList.add(order);
    }

    public void addWhere(BooleanExpression whereItem) {
        where.add(whereItem);
    }

    public Predicate toPredicate() {
        BooleanBuilder resultWhere = new BooleanBuilder();
        for (BooleanExpression item : where) {
            resultWhere.and(item);
        }
        return resultWhere;
    }

    @SuppressWarnings("unchecked")
    public OrderSpecifier<? extends Comparable>[] toOrderSpecifier(EntityPath<?> root) {
        List<OrderSpecifier<? extends Comparable>> orderSpecifiers = new ArrayList<OrderSpecifier<? extends Comparable>>();
        orderSpecifiers.addAll(orderByList);
        for (Sort.Order order : springOrderByList) {
            Expression<Comparable> expression = Expressions.path(Comparable.class, root, order.getProperty());
            OrderSpecifier<? extends Comparable> orderSpecifier = new OrderSpecifier<Comparable>(order.getDirection()
                    .equals(Sort.Direction.ASC) ?
                    Order.ASC : Order.DESC, expression);
            orderSpecifiers.add(orderSpecifier);
        }
        return orderSpecifiers.toArray(new OrderSpecifier[]{});
    }

    @SuppressWarnings("unchecked")
    public OrderSpecifier<? extends Comparable>[] toOrderSpecifier() {
        return orderByList.toArray(new OrderSpecifier[]{});
    }

    public List<OrderSpecifier<? extends Comparable>> getOrderByList() {
        return orderByList;
    }

    public void setSpringOrderByList(List<Sort.Order> springOrderByList) {
        this.springOrderByList = springOrderByList;
    }

    public void setWhere(List<BooleanExpression> where) {
        this.where = where;
    }

    public void addAllOrderBy(List<Sort.Order> orderList) {
        this.springOrderByList.addAll(orderList);
    }
}
