package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  aliexpress.solution.merchant.profile.get
*/
public class AliexpressSolutionMerchantProfileGetResponse extends IopResponse {

    /** country code which the merchant chose when registered */
        @ApiField("country_code")
        private String countryCode;
    /** Indicate whether the mechant could post product or not. FALSE means the merchant could normally post product. */
        @ApiField("product_posting_forbidden")
        private Boolean productPostingForbidden;
    /** merchant login id of Aliexpress */
        @ApiField("merchant_login_id")
        private String merchantLoginId;
    /** shop id */
        @ApiField("shop_id")
        private Long shopId;
    /** shop name */
        @ApiField("shop_name")
        private String shopName;
    /** shop type */
        @ApiField("shop_type")
        private String shopType;
    /** shop url */
        @ApiField("shop_url")
        private String shopUrl;

public String getCountryCode(){
return this.countryCode;
}
public void setCountryCode(String countryCode){
    this.countryCode = countryCode;
}
public Boolean getProductPostingForbidden(){
return this.productPostingForbidden;
}
public void setProductPostingForbidden(Boolean productPostingForbidden){
    this.productPostingForbidden = productPostingForbidden;
}
public String getMerchantLoginId(){
return this.merchantLoginId;
}
public void setMerchantLoginId(String merchantLoginId){
    this.merchantLoginId = merchantLoginId;
}
public Long getShopId(){
return this.shopId;
}
public void setShopId(Long shopId){
    this.shopId = shopId;
}
public String getShopName(){
return this.shopName;
}
public void setShopName(String shopName){
    this.shopName = shopName;
}
public String getShopType(){
return this.shopType;
}
public void setShopType(String shopType){
    this.shopType = shopType;
}
public String getShopUrl(){
return this.shopUrl;
}
public void setShopUrl(String shopUrl){
    this.shopUrl = shopUrl;
}

}