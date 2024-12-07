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
*  /yushen/spi/test
*/
public class YushenSpiTestRequest extends BaseGopRequest<YushenSpiTestResponse> {

    /** 1 */
    private String param1;
    /** 1 */
    private YushenSpiTest param2;

    public String getParam1(){
        return this.param1;
    }
    public void setParam1(String param1){
        this.param1 = param1;
        }
    public YushenSpiTest getParam2(){
        return this.param2;
    }
    public void setParam2(YushenSpiTest param2){
        this.param2 = param2;
        }

    @Override
    public String getApiName() {
        return "/yushen/spi/test";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param1 != null) {
                        super.addApiParameter("param1", param1.toString());
                    }
                            if (param2 != null) {
                        super.addApiParameter("param2", new JSONWriter(true, false).write(param2));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<YushenSpiTestResponse> getResponseClass() {
        return YushenSpiTestResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}