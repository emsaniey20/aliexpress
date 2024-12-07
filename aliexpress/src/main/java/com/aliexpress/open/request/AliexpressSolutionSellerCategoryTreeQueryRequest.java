package com.aliexpress.open.request;

import java.io.Serializable;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Long;
import java.lang.String;
import java.lang.Byte;
import java.lang.Object;
import java.math.BigDecimal;
import com.global.iop.api.*;
import com.global.iop.util.*;
import com.global.iop.util.json.*;
import com.aliexpress.open.domain.*;
import com.aliexpress.open.response.*;


/**
*  aliexpress.solution.seller.category.tree.query
*/
public class AliexpressSolutionSellerCategoryTreeQueryRequest extends BaseGopRequest<AliexpressSolutionSellerCategoryTreeQueryResponse> {

    /** parent category ID. To obtain the root categories, setting the category_id = 0 */
    private Long categoryId;
    /** filter the categories which seller does not have permission */
    private Boolean filterNoPermission;

    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }
    public Boolean getFilterNoPermission(){
        return this.filterNoPermission;
    }
    public void setFilterNoPermission(Boolean filterNoPermission){
        this.filterNoPermission = filterNoPermission;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.seller.category.tree.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                            if (filterNoPermission != null) {
                        super.addApiParameter("filter_no_permission", filterNoPermission.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionSellerCategoryTreeQueryResponse> getResponseClass() {
        return AliexpressSolutionSellerCategoryTreeQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}