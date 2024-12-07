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
*  aliexpress.solution.product.schema.get
*/
public class AliexpressSolutionProductSchemaGetRequest extends BaseGopRequest<AliexpressSolutionProductSchemaGetResponse> {

    /** aliexpress category id. You can get it from category API */
    private Long aliexpressCategoryId;

    public Long getAliexpressCategoryId(){
        return this.aliexpressCategoryId;
    }
    public void setAliexpressCategoryId(Long aliexpressCategoryId){
        this.aliexpressCategoryId = aliexpressCategoryId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.product.schema.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aliexpressCategoryId != null) {
                        super.addApiParameter("aliexpress_category_id", aliexpressCategoryId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionProductSchemaGetResponse> getResponseClass() {
        return AliexpressSolutionProductSchemaGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}