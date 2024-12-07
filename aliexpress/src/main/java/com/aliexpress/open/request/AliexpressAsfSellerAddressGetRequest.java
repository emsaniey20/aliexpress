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
*  aliexpress.asf.seller.address.get
*/
public class AliexpressAsfSellerAddressGetRequest extends BaseGopRequest<AliexpressAsfSellerAddressGetResponse> {

    /** locale */
    private String locale;
    /** Please fill in the address type as "pickup" or "refund", or use a comma to separate them if both are applicable. The address ID returned by this interface can be used as the address ID parameter in the platform logistics packed interface. However, please note that currently the "packed" interface only requires the address ID of the "pickup" type to be passed, and there is no need to pass the address ID of the "refund" type (i.e. there is no need to pass the return address). */
    private String addressType;

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public String getAddressType(){
        return this.addressType;
    }
    public void setAddressType(String addressType){
        this.addressType = addressType;
        }

    @Override
    public String getApiName() {
        return "aliexpress.asf.seller.address.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (addressType != null) {
                        super.addApiParameter("addressType", addressType.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressAsfSellerAddressGetResponse> getResponseClass() {
        return AliexpressAsfSellerAddressGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}