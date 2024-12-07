package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressLogisticsLocalGetlogisticsselleraddressAeopSellerAddressQueryResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** pickupSellerAddressList */
                @ApiListField("pickup_seller_address_list")
            private List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> pickupSellerAddressList;
        /** errorDesc */
                @ApiField("error_desc")
            private String errorDesc;
        /** errorCode */
                @ApiField("error_code")
            private Long errorCode;
        /** senderSellerAddressList */
                @ApiListField("sender_seller_address_list")
            private List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> senderSellerAddressList;
        /** refundSellerAddressList */
                @ApiListField("refund_seller_address_list")
            private List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> refundSellerAddressList;
        /** isSuccess */
                @ApiField("is_success")
            private Boolean isSuccess;
    
        public List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> getPickupSellerAddressList() {
    return this.pickupSellerAddressList;
    }
    public void setPickupSellerAddressList(List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> pickupSellerAddressList) {
    this.pickupSellerAddressList = pickupSellerAddressList;
    }
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public Long getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
    }
        public List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> getSenderSellerAddressList() {
    return this.senderSellerAddressList;
    }
    public void setSenderSellerAddressList(List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> senderSellerAddressList) {
    this.senderSellerAddressList = senderSellerAddressList;
    }
        public List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> getRefundSellerAddressList() {
    return this.refundSellerAddressList;
    }
    public void setRefundSellerAddressList(List<AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO> refundSellerAddressList) {
    this.refundSellerAddressList = refundSellerAddressList;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
    }