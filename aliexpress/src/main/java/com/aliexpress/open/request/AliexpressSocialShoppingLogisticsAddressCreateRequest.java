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
*  aliexpress.social.shopping.logistics.address.create
*/
public class AliexpressSocialShoppingLogisticsAddressCreateRequest extends BaseGopRequest<AliexpressSocialShoppingLogisticsAddressCreateResponse> {

    /** country */
    private String country;
    /** province */
    private String province;
    /** city */
    private String city;
    /** address */
    private String address;
    /** zip_code */
    private String zipCode;
    /** country phone code */
    private String phoneCountry;
    /** phone */
    private String phone;
    /** contact person */
    private String contactPerson;
    /** if is default address */
    private Boolean isSetAsDefaultLogisticAdress;

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }
    public String getProvince(){
        return this.province;
    }
    public void setProvince(String province){
        this.province = province;
        }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
        }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
        }
    public String getZipCode(){
        return this.zipCode;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
        }
    public String getPhoneCountry(){
        return this.phoneCountry;
    }
    public void setPhoneCountry(String phoneCountry){
        this.phoneCountry = phoneCountry;
        }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
        }
    public String getContactPerson(){
        return this.contactPerson;
    }
    public void setContactPerson(String contactPerson){
        this.contactPerson = contactPerson;
        }
    public Boolean getIsSetAsDefaultLogisticAdress(){
        return this.isSetAsDefaultLogisticAdress;
    }
    public void setIsSetAsDefaultLogisticAdress(Boolean isSetAsDefaultLogisticAdress){
        this.isSetAsDefaultLogisticAdress = isSetAsDefaultLogisticAdress;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.logistics.address.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                            if (province != null) {
                        super.addApiParameter("province", province.toString());
                    }
                            if (city != null) {
                        super.addApiParameter("city", city.toString());
                    }
                            if (address != null) {
                        super.addApiParameter("address", address.toString());
                    }
                            if (zipCode != null) {
                        super.addApiParameter("zip_code", zipCode.toString());
                    }
                            if (phoneCountry != null) {
                        super.addApiParameter("phone_country", phoneCountry.toString());
                    }
                            if (phone != null) {
                        super.addApiParameter("phone", phone.toString());
                    }
                            if (contactPerson != null) {
                        super.addApiParameter("contact_person", contactPerson.toString());
                    }
                            if (isSetAsDefaultLogisticAdress != null) {
                        super.addApiParameter("is_set_as_default_logistic_adress", isSetAsDefaultLogisticAdress.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingLogisticsAddressCreateResponse> getResponseClass() {
        return AliexpressSocialShoppingLogisticsAddressCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}