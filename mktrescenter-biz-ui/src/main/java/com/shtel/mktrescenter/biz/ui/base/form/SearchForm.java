package com.shtel.mktrescenter.biz.ui.base.form;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class SearchForm {
    private Logger LOGGER = LoggerFactory.getLogger(SearchForm.class);

    private Integer pageSize;
    private Integer pageNo;
    private Map<String, String> order;

    public Map<String, String> getOrder() {
        return order;
    }

    public void setOrder(Map<String, String> order) {
        this.order = order;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public int getOffset() {
        return (this.pageNo - 1) * this.pageSize;
    }
}
