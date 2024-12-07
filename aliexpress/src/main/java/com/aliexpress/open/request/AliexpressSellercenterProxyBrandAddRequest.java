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
*  aliexpress.sellercenter.proxy.brand.add
*/
public class AliexpressSellercenterProxyBrandAddRequest extends BaseGopRequest<AliexpressSellercenterProxyBrandAddResponse> {

    /** Seller ID */
    private Long sellerId;
    /** Brand name */
    private String brandName;
    /** Brand name in english */
    private String brandNameEng;
    /** Registration number */
    private String brandRegistrationNumber;
    /** Register name */
    private String brandRegisterName;
    /** Country code */
    private String countryCode;

    public Long getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(Long sellerId){
        this.sellerId = sellerId;
        }
    public String getBrandName(){
        return this.brandName;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
        }
    public String getBrandNameEng(){
        return this.brandNameEng;
    }
    public void setBrandNameEng(String brandNameEng){
        this.brandNameEng = brandNameEng;
        }
    public String getBrandRegistrationNumber(){
        return this.brandRegistrationNumber;
    }
    public void setBrandRegistrationNumber(String brandRegistrationNumber){
        this.brandRegistrationNumber = brandRegistrationNumber;
        }
    public String getBrandRegisterName(){
        return this.brandRegisterName;
    }
    public void setBrandRegisterName(String brandRegisterName){
        this.brandRegisterName = brandRegisterName;
        }
    public String getCountryCode(){
        return this.countryCode;
    }
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.proxy.brand.add";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerId != null) {
                        super.addApiParameter("seller_id", sellerId.toString());
                    }
                            if (brandName != null) {
                        super.addApiParameter("brand_name", brandName.toString());
                    }
                            if (brandNameEng != null) {
                        super.addApiParameter("brand_name_eng", brandNameEng.toString());
                    }
                            if (brandRegistrationNumber != null) {
                        super.addApiParameter("brand_registration_number", brandRegistrationNumber.toString());
                    }
                            if (brandRegisterName != null) {
                        super.addApiParameter("brand_register_name", brandRegisterName.toString());
                    }
                            if (countryCode != null) {
                        super.addApiParameter("country_code", countryCode.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSellercenterProxyBrandAddResponse> getResponseClass() {
        return AliexpressSellercenterProxyBrandAddResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}