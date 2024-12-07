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
*  /yushen/test/charge4
*/
public class YushenTestCharge4Request extends BaseGopRequest<YushenTestCharge4Response> {

    /** name */
    private String name;
    /** age */
    private Integer age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        }
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
        }

    @Override
    public String getApiName() {
        return "/yushen/test/charge4";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (name != null) {
                        super.addApiParameter("name", name.toString());
                    }
                            if (age != null) {
                        super.addApiParameter("age", age.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<YushenTestCharge4Response> getResponseClass() {
        return YushenTestCharge4Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}