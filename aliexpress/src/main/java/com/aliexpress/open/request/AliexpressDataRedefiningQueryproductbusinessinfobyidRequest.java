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
*  aliexpress.data.redefining.queryproductbusinessinfobyid
*/
public class AliexpressDataRedefiningQueryproductbusinessinfobyidRequest extends BaseGopRequest<AliexpressDataRedefiningQueryproductbusinessinfobyidResponse> {

    /** 商品id */
    private String paramString;

    public String getParamString(){
        return this.paramString;
    }
    public void setParamString(String paramString){
        this.paramString = paramString;
        }

    @Override
    public String getApiName() {
        return "aliexpress.data.redefining.queryproductbusinessinfobyid";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramString != null) {
                        super.addApiParameter("param_string", paramString.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressDataRedefiningQueryproductbusinessinfobyidResponse> getResponseClass() {
        return AliexpressDataRedefiningQueryproductbusinessinfobyidResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}