package com.shtel.mktrescenter.biz.ui.base.page;

import java.util.ArrayList;
import java.util.List;

public class TablePage<T> {
    private long recordsTotal;
    private List<T> data;

    public TablePage() {
        this.recordsTotal = 0;
        data = new ArrayList<T>();
    }

    public TablePage(List<T> data, long recordsTotal) {
        this.recordsTotal = recordsTotal;
        this.data = data;
    }

    public long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
