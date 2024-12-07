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
*  /yushen
*/
public class YushenRequest extends BaseGopRequest<YushenResponse> {

    /** 测试 */
    private String api;

    public String getApi(){
        return this.api;
    }
    public void setApi(String api){
        this.api = api;
        }

    @Override
    public String getApiName() {
        return "/yushen";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (api != null) {
                        super.addApiParameter("api", api.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<YushenResponse> getResponseClass() {
        return YushenResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}