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
*  aliexpress.social.shopping.order.confirm.shopcart.query
*/
public class AliexpressSocialShoppingOrderConfirmShopcartQueryResponse extends IopResponse {

    /** error code */
        @ApiField("service_error_code")
        private String serviceErrorCode;
    /** Error message */
        @ApiField("service_error_message")
        private String serviceErrorMessage;
    /** Total buy amount */
        @ApiField("total_amount_cents")
        private Long totalAmountCents;
    /** If the promocode has been applied */
        @ApiField("is_promocode_applied")
        private Boolean isPromocodeApplied;
    /** The json containing promo information for the products */
        @ApiField("platform_allowance_json_string")
        private String platformAllowanceJsonString;
    /** Discount */
        @ApiField("promocode_discount_cents")
        private Long promocodeDiscountCents;
    /** Delivery address dto */
        @ApiField("selected_address")
        private AliexpressSocialShoppingOrderConfirmShopcartQueryLogisticAddressVO selectedAddress;
    /** Items */
        @ApiListField("shopcart_seller_items")
        private List<AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartSellerItem> shopcartSellerItems;
    /** success */
        @ApiField("is_success")
        private String isSuccess;

public String getServiceErrorCode(){
return this.serviceErrorCode;
}
public void setServiceErrorCode(String serviceErrorCode){
    this.serviceErrorCode = serviceErrorCode;
}
public String getServiceErrorMessage(){
return this.serviceErrorMessage;
}
public void setServiceErrorMessage(String serviceErrorMessage){
    this.serviceErrorMessage = serviceErrorMessage;
}
public Long getTotalAmountCents(){
return this.totalAmountCents;
}
public void setTotalAmountCents(Long totalAmountCents){
    this.totalAmountCents = totalAmountCents;
}
public Boolean getIsPromocodeApplied(){
return this.isPromocodeApplied;
}
public void setIsPromocodeApplied(Boolean isPromocodeApplied){
    this.isPromocodeApplied = isPromocodeApplied;
}
public String getPlatformAllowanceJsonString(){
return this.platformAllowanceJsonString;
}
public void setPlatformAllowanceJsonString(String platformAllowanceJsonString){
    this.platformAllowanceJsonString = platformAllowanceJsonString;
}
public Long getPromocodeDiscountCents(){
return this.promocodeDiscountCents;
}
public void setPromocodeDiscountCents(Long promocodeDiscountCents){
    this.promocodeDiscountCents = promocodeDiscountCents;
}
public AliexpressSocialShoppingOrderConfirmShopcartQueryLogisticAddressVO getSelectedAddress(){
return this.selectedAddress;
}
public void setSelectedAddress(AliexpressSocialShoppingOrderConfirmShopcartQueryLogisticAddressVO selectedAddress){
    this.selectedAddress = selectedAddress;
}
public List<AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartSellerItem> getShopcartSellerItems(){
return this.shopcartSellerItems;
}
public void setShopcartSellerItems(List<AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartSellerItem> shopcartSellerItems){
    this.shopcartSellerItems = shopcartSellerItems;
}
public String getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(String isSuccess){
    this.isSuccess = isSuccess;
}

}