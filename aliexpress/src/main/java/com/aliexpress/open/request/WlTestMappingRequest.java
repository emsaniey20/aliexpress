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
*  /wl/test/mapping
*/
public class WlTestMappingRequest extends BaseGopRequest<WlTestMappingResponse> {

    /** 21q */
    private String name;
    /** 31w */
    private Integer age;
    /** 4 */
    private List<WlTestMappingSubApiTestRequest> list;

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
    public List<WlTestMappingSubApiTestRequest> getList(){
        return this.list;
    }
    public void setList(List<WlTestMappingSubApiTestRequest> list){
        this.list = list;
        }

    @Override
    public String getApiName() {
        return "/wl/test/mapping";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (name != null) {
                        super.addApiParameter("name", name.toString());
                    }
                            if (age != null) {
                        super.addApiParameter("age", age.toString());
                    }
                            if (list != null) {
                        super.addApiParameter("list", new JSONWriter(true, false).write(list));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<WlTestMappingResponse> getResponseClass() {
        return WlTestMappingResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}