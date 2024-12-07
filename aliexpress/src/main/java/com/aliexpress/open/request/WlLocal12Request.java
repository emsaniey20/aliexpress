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
*  /wl/local/12
*/
public class WlLocal12Request extends BaseGopRequest<WlLocal12Response> {

    /** 中文入参描述1回退前6 */
    private String name;
    /** age中文入参描述1回退前6 */
    private String age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        }
    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
        }

    @Override
    public String getApiName() {
        return "/wl/local/12";
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
    public Class<WlLocal12Response> getResponseClass() {
        return WlLocal12Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}