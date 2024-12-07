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
*  caocai.test.local.api.0815.2
*/
public class CaocaiTestLocalApi08152Request extends BaseGopRequest<CaocaiTestLocalApi08152Response> {

    /** 1测试1 */
    private String test;

    public String getTest(){
        return this.test;
    }
    public void setTest(String test){
        this.test = test;
        }

    @Override
    public String getApiName() {
        return "caocai.test.local.api.0815.2";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (test != null) {
                        super.addApiParameter("test", test.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<CaocaiTestLocalApi08152Response> getResponseClass() {
        return CaocaiTestLocalApi08152Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}