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
*  aliexpress.ds.product.specialinfo.get
*/
public class AliexpressDsProductSpecialinfoGetRequest extends BaseGopRequest<AliexpressDsProductSpecialinfoGetResponse> {

    /** 商品id */
    private Long itemId;
    /** 国家二字码 */
    private List<String> countryCodes;
    /** 您的appkey */
    private String appKey;

    public Long getItemId(){
        return this.itemId;
    }
    public void setItemId(Long itemId){
        this.itemId = itemId;
        }
    public List<String> getCountryCodes(){
        return this.countryCodes;
    }
    public void setCountryCodes(List<String> countryCodes){
        this.countryCodes = countryCodes;
        }
    public String getAppKey(){
        return this.appKey;
    }
    public void setAppKey(String appKey){
        this.appKey = appKey;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ds.product.specialinfo.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (itemId != null) {
                        super.addApiParameter("itemId", itemId.toString());
                    }
                            if (countryCodes != null) {
                        super.addApiParameter("countryCodes", new JSONWriter(true, false).write(countryCodes));
                    }
                            if (appKey != null) {
                        super.addApiParameter("appKey", appKey.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressDsProductSpecialinfoGetResponse> getResponseClass() {
        return AliexpressDsProductSpecialinfoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}