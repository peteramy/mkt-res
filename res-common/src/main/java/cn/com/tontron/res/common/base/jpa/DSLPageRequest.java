package cn.com.tontron.res.common.base.jpa;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class DSLPageRequest extends DSLRequest implements Pageable {
    private final Integer page;
    private final Integer size;

    public DSLPageRequest(Integer page, Integer size) {
        super();
        this.page = (page == null ? 0 : page);
        this.size = (size == null ? 0 : size);
    }

    public DSLPageRequest(Integer page, Integer size, List<BooleanExpression> where,
                          List<OrderSpecifier<? extends Comparable>> orderByList) {
        super(where, orderByList);
        this.page = (page == null ? 0 : page);
        this.size = (size == null ? 0 : size);
    }

    public DSLPageRequest(Integer page, Integer size, List<BooleanExpression> where) {
        super(where);
        this.page = (page == null ? 0 : page);
        this.size = (size == null ? 0 : size);
    }

    @Override
    public int getPageNumber() {
        return page;
    }

    @Override
    public int getPageSize() {
        return size;
    }

    @Override
    public int getOffset() {
        return (this.page.intValue() * this.size.intValue());
    }

    @Override
    public Sort getSort() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return page > 0;
    }

    @Override
    public DSLPageRequest previousOrFirst() {
        return hasPrevious() ? previous() : first();
    }

    @Override
    public DSLPageRequest next() {
        return new DSLPageRequest(getPageNumber() + 1, getPageSize(), where, orderByList);
    }

    public DSLPageRequest previous() {
        return getPageNumber() == 0 ? this : new DSLPageRequest(getPageNumber() - 1, getPageSize(), where, orderByList);
    }

    @Override
    public DSLPageRequest first() {
        return new DSLPageRequest(0, getPageSize(), where, orderByList);
    }

    public Pageable asPageable() {
        return new PageRequest(page, size);
    }
}
