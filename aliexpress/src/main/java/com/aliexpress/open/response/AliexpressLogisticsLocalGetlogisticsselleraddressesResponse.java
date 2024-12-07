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
*  aliexpress.logistics.local.getlogisticsselleraddresses
*/
public class AliexpressLogisticsLocalGetlogisticsselleraddressesResponse extends IopResponse {

    /** pickupSellerAddressList */
        @ApiListField("pickup_seller_address_list")
        private List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> pickupSellerAddressList;
    /** errorDesc */
        @ApiField("error_desc")
        private String errorDesc;
    /** errorCode */
        @ApiField("result_error_code")
        private Long resultErrorCode;
    /** senderSellerAddressList */
        @ApiListField("sender_seller_address_list")
        private List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> senderSellerAddressList;
    /** refundSellerAddressList */
        @ApiListField("refund_seller_address_list")
        private List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> refundSellerAddressList;
    /** isSuccess */
        @ApiField("is_success")
        private Boolean isSuccess;

public List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> getPickupSellerAddressList(){
return this.pickupSellerAddressList;
}
public void setPickupSellerAddressList(List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> pickupSellerAddressList){
    this.pickupSellerAddressList = pickupSellerAddressList;
}
public String getErrorDesc(){
return this.errorDesc;
}
public void setErrorDesc(String errorDesc){
    this.errorDesc = errorDesc;
}
public Long getResultErrorCode(){
return this.resultErrorCode;
}
public void setResultErrorCode(Long resultErrorCode){
    this.resultErrorCode = resultErrorCode;
}
public List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> getSenderSellerAddressList(){
return this.senderSellerAddressList;
}
public void setSenderSellerAddressList(List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> senderSellerAddressList){
    this.senderSellerAddressList = senderSellerAddressList;
}
public List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> getRefundSellerAddressList(){
return this.refundSellerAddressList;
}
public void setRefundSellerAddressList(List<AliexpressLogisticsLocalGetlogisticsselleraddressesAeopWlDeclareAddressDTO> refundSellerAddressList){
    this.refundSellerAddressList = refundSellerAddressList;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}