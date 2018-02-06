package cn.com.tontron.res.data.simple.base.search;

import cn.com.tontron.res.common.base.form.SearchForm;
import cn.com.tontron.res.data.simple.base.jpa.DSLPageRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Sort;

/**
 * Created by yangyang on 2018/2/6.
 */
public class QSearchForm extends SearchForm implements IQueryDslPage {
    @Override
    public DSLPageRequest asDslPageRequest() {
        DSLPageRequest dslPageRequest = new DSLPageRequest(super.getPageNo() - 1, super.getPageSize());
        if (super.getOrder() != null && super.getOrder().size() > 0) {
            for (String key : super.getOrder().keySet()) {
                Sort.Order sortOrder = new Sort.Order(StringUtils.equals(super.getOrder().get(key), "asc")
                        ? Sort.Direction.ASC : Sort.Direction.DESC, key);
                dslPageRequest.addOrderBy(sortOrder);
            }
        }
        return dslPageRequest;
    }
}
