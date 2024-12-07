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
*  aliexpress.social.shopping.logistics.address.listprovinces
*/
public class AliexpressSocialShoppingLogisticsAddressListprovincesRequest extends BaseGopRequest<AliexpressSocialShoppingLogisticsAddressListprovincesResponse> {

    /** country code */
    private String countryCode;
    /** locale */
    private String locale;

    public String getCountryCode(){
        return this.countryCode;
    }
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.logistics.address.listprovinces";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (countryCode != null) {
                        super.addApiParameter("country_code", countryCode.toString());
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
    public Class<AliexpressSocialShoppingLogisticsAddressListprovincesResponse> getResponseClass() {
        return AliexpressSocialShoppingLogisticsAddressListprovincesResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}