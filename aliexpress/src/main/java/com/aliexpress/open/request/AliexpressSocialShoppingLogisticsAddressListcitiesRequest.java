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
*  aliexpress.social.shopping.logistics.address.listcities
*/
public class AliexpressSocialShoppingLogisticsAddressListcitiesRequest extends BaseGopRequest<AliexpressSocialShoppingLogisticsAddressListcitiesResponse> {

    /** country code */
    private String countryCode;
    /** address code */
    private String addressCode;
    /** locale */
    private String locale;

    public String getCountryCode(){
        return this.countryCode;
    }
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
        }
    public String getAddressCode(){
        return this.addressCode;
    }
    public void setAddressCode(String addressCode){
        this.addressCode = addressCode;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.logistics.address.listcities";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (countryCode != null) {
                        super.addApiParameter("country_code", countryCode.toString());
                    }
                            if (addressCode != null) {
                        super.addApiParameter("address_code", addressCode.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingLogisticsAddressListcitiesResponse> getResponseClass() {
        return AliexpressSocialShoppingLogisticsAddressListcitiesResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}