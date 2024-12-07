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
*  caocai.test.local.api.0815
*/
public class CaocaiTestLocalApi0815Request extends BaseGopRequest<CaocaiTestLocalApi0815Response> {

    /** 测试1 */
    private CaocaiTestLocalApi0815we ab;

    public CaocaiTestLocalApi0815we getAb(){
        return this.ab;
    }
    public void setAb(CaocaiTestLocalApi0815we ab){
        this.ab = ab;
        }

    @Override
    public String getApiName() {
        return "caocai.test.local.api.0815";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (ab != null) {
                        super.addApiParameter("ab", new JSONWriter(true, false).write(ab));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<CaocaiTestLocalApi0815Response> getResponseClass() {
        return CaocaiTestLocalApi0815Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}