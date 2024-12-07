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
*  aliexpress.pop.choice.products.list
*/
public class AliexpressPopChoiceProductsListRequest extends BaseGopRequest<AliexpressPopChoiceProductsListResponse> {

    /**  */
    private AliexpressPopChoiceProductsListPopChoiceProductListQueryRequest param;

    public AliexpressPopChoiceProductsListPopChoiceProductListQueryRequest getParam(){
        return this.param;
    }
    public void setParam(AliexpressPopChoiceProductsListPopChoiceProductListQueryRequest param){
        this.param = param;
        }

    @Override
    public String getApiName() {
        return "aliexpress.pop.choice.products.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param != null) {
                        super.addApiParameter("param", new JSONWriter(true, false).write(param));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPopChoiceProductsListResponse> getResponseClass() {
        return AliexpressPopChoiceProductsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}