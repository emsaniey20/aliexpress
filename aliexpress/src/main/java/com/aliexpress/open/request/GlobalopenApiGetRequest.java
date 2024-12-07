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
*  /globalopen/api/get
*/
public class GlobalopenApiGetRequest extends BaseGopRequest<GlobalopenApiGetResponse> {

    /** api id */
    private Long apiId;

    public Long getApiId(){
        return this.apiId;
    }
    public void setApiId(Long apiId){
        this.apiId = apiId;
        }

    @Override
    public String getApiName() {
        return "/globalopen/api/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (apiId != null) {
                        super.addApiParameter("apiId", apiId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<GlobalopenApiGetResponse> getResponseClass() {
        return GlobalopenApiGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}