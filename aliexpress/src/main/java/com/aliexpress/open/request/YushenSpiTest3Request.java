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
*  /yushen/spi/test3
*/
public class YushenSpiTest3Request extends BaseGopRequest<YushenSpiTest3Response> {

    /** test */
    private YushenSpiTest3 person;
    /** test */
    private String address;

    public YushenSpiTest3 getPerson(){
        return this.person;
    }
    public void setPerson(YushenSpiTest3 person){
        this.person = person;
        }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
        }

    @Override
    public String getApiName() {
        return "/yushen/spi/test3";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (person != null) {
                        super.addApiParameter("person", new JSONWriter(true, false).write(person));
                    }
                            if (address != null) {
                        super.addApiParameter("address", address.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<YushenSpiTest3Response> getResponseClass() {
        return YushenSpiTest3Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}