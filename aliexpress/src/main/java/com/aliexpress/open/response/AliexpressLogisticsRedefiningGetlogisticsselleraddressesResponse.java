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
*  aliexpress.logistics.redefining.getlogisticsselleraddresses
*/
public class AliexpressLogisticsRedefiningGetlogisticsselleraddressesResponse extends IopResponse {

    /** 12345 */
        @ApiListField("sender_seller_address_list")
        private List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> senderSellerAddressList;
    /** 12345 */
        @ApiListField("refund_seller_address_list")
        private List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> refundSellerAddressList;
    /** 12345 */
        @ApiField("error_desc")
        private String errorDesc;
    /** 12345 */
        @ApiListField("pickup_seller_address_list")
        private List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> pickupSellerAddressList;
    /** 12345 */
        @ApiField("result_error_code")
        private Long resultErrorCode;
    /** success */
        @ApiField("result_success")
        private Boolean resultSuccess;

public List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> getSenderSellerAddressList(){
return this.senderSellerAddressList;
}
public void setSenderSellerAddressList(List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> senderSellerAddressList){
    this.senderSellerAddressList = senderSellerAddressList;
}
public List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> getRefundSellerAddressList(){
return this.refundSellerAddressList;
}
public void setRefundSellerAddressList(List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> refundSellerAddressList){
    this.refundSellerAddressList = refundSellerAddressList;
}
public String getErrorDesc(){
return this.errorDesc;
}
public void setErrorDesc(String errorDesc){
    this.errorDesc = errorDesc;
}
public List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> getPickupSellerAddressList(){
return this.pickupSellerAddressList;
}
public void setPickupSellerAddressList(List<AliexpressLogisticsRedefiningGetlogisticsselleraddressesString> pickupSellerAddressList){
    this.pickupSellerAddressList = pickupSellerAddressList;
}
public Long getResultErrorCode(){
return this.resultErrorCode;
}
public void setResultErrorCode(Long resultErrorCode){
    this.resultErrorCode = resultErrorCode;
}
public Boolean getResultSuccess(){
return this.resultSuccess;
}
public void setResultSuccess(Boolean resultSuccess){
    this.resultSuccess = resultSuccess;
}

}