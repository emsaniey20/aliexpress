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
*  /reverse/test/api
*/
public class ReverseTestApiRequest extends BaseGopRequest<ReverseTestApiResponse> {

    /** 1 */
    private ReverseTestApi param2;
    /** 1 */
    private String testName;

    public ReverseTestApi getParam2(){
        return this.param2;
    }
    public void setParam2(ReverseTestApi param2){
        this.param2 = param2;
        }
    public String getTestName(){
        return this.testName;
    }
    public void setTestName(String testName){
        this.testName = testName;
        }

    @Override
    public String getApiName() {
        return "/reverse/test/api";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param2 != null) {
                        super.addApiParameter("param2", new JSONWriter(true, false).write(param2));
                    }
                            if (testName != null) {
                        super.addApiParameter("test_name", testName.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<ReverseTestApiResponse> getResponseClass() {
        return ReverseTestApiResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}