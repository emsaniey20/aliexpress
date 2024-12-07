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
*  aliexpress.social.product.evaluation.query
*/
public class AliexpressSocialProductEvaluationQueryRequest extends BaseGopRequest<AliexpressSocialProductEvaluationQueryResponse> {

    /** Country of buyers */
    private String countryCode;
    /** Page number */
    private Integer page;
    /** Page size */
    private Integer pageSize;
    /** Product to get evaluations for */
    private Long productId;

    public String getCountryCode(){
        return this.countryCode;
    }
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
        }
    public Integer getPage(){
        return this.page;
    }
    public void setPage(Integer page){
        this.page = page;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.product.evaluation.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (countryCode != null) {
                        super.addApiParameter("country_code", countryCode.toString());
                    }
                            if (page != null) {
                        super.addApiParameter("page", page.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialProductEvaluationQueryResponse> getResponseClass() {
        return AliexpressSocialProductEvaluationQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}