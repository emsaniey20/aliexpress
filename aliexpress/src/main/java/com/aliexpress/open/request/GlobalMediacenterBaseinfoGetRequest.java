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
*  global.mediacenter.baseinfo.get
*/
public class GlobalMediacenterBaseinfoGetRequest extends BaseGopRequest<GlobalMediacenterBaseinfoGetResponse> {

    /** 查询默认参数 */
    private String requestParams;

    public String getRequestParams(){
        return this.requestParams;
    }
    public void setRequestParams(String requestParams){
        this.requestParams = requestParams;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.baseinfo.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (requestParams != null) {
                        super.addApiParameter("requestParams", requestParams.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<GlobalMediacenterBaseinfoGetResponse> getResponseClass() {
        return GlobalMediacenterBaseinfoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}