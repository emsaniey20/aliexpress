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
*  /wl/test/1234
*/
public class WlTest1234Request extends BaseGopRequest<WlTest1234Response> {

    /** parma1 */
    private String param1;

    public String getParam1(){
        return this.param1;
    }
    public void setParam1(String param1){
        this.param1 = param1;
        }

    @Override
    public String getApiName() {
        return "/wl/test/1234";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param1 != null) {
                        super.addApiParameter("param1", param1.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<WlTest1234Response> getResponseClass() {
        return WlTest1234Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}