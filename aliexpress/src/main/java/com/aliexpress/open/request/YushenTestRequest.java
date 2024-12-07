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
*  /yushen/test
*/
public class YushenTestRequest extends BaseGopRequest<YushenTestResponse> {

    /** test */
    private String yushen;
    /** yu */
    private String name;

    public String getYushen(){
        return this.yushen;
    }
    public void setYushen(String yushen){
        this.yushen = yushen;
        }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        }

    @Override
    public String getApiName() {
        return "/yushen/test";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (yushen != null) {
                        super.addApiParameter("yushen", yushen.toString());
                    }
                            if (name != null) {
                        super.addApiParameter("name", name.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<YushenTestResponse> getResponseClass() {
        return YushenTestResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}