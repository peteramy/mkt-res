package cn.com.tontron.res.data.simple.base.page;

import java.util.List;

public class TablePage<T> {
    private long total;
    private List<T> rows;

    public TablePage() {
    }

    public TablePage(List<T> rows, long total) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
