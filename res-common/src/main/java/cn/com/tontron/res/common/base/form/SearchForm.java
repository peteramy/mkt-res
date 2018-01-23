package cn.com.tontron.res.common.base.form;

import cn.com.tontron.res.common.base.jpa.DSLPageRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;

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

    public DSLPageRequest asDslPageRequest() {
        DSLPageRequest dslPageRequest = new DSLPageRequest(pageNo - 1, pageSize);
        if (order != null && order.size() > 0) {
            for (String key : order.keySet()) {
                Sort.Order sortOrder = new Sort.Order(StringUtils.equals(order.get(key), "asc")
                        ? Sort.Direction.ASC : Sort.Direction.DESC, key);
                dslPageRequest.addOrderBy(sortOrder);
            }
        }
        return dslPageRequest;
    }
}
