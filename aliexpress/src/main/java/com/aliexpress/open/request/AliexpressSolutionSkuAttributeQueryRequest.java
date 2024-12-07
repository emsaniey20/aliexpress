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
*  aliexpress.solution.sku.attribute.query
*/
public class AliexpressSolutionSkuAttributeQueryRequest extends BaseGopRequest<AliexpressSolutionSkuAttributeQueryResponse> {

    /** input parameters */
    private AliexpressSolutionSkuAttributeQuerySkuAttributeInfoQueryRequest querySkuAttributeInfoRequest;

    public AliexpressSolutionSkuAttributeQuerySkuAttributeInfoQueryRequest getQuerySkuAttributeInfoRequest(){
        return this.querySkuAttributeInfoRequest;
    }
    public void setQuerySkuAttributeInfoRequest(AliexpressSolutionSkuAttributeQuerySkuAttributeInfoQueryRequest querySkuAttributeInfoRequest){
        this.querySkuAttributeInfoRequest = querySkuAttributeInfoRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.sku.attribute.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (querySkuAttributeInfoRequest != null) {
                        super.addApiParameter("query_sku_attribute_info_request", new JSONWriter(true, false).write(querySkuAttributeInfoRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionSkuAttributeQueryResponse> getResponseClass() {
        return AliexpressSolutionSkuAttributeQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}