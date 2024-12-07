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

public class AliexpressAsfSellerAddressGetPlatformLogisticsSellerAddressQueryResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** pickupSellerAddressList */
                @ApiListField("pickupSellerAddressList")
            private List<AliexpressAsfSellerAddressGetSellerAddressDTO> pickupSellerAddressList;
        /** refundSellerAddressList */
                @ApiListField("refundSellerAddressList")
            private List<AliexpressAsfSellerAddressGetSellerAddressDTO> refundSellerAddressList;
    
        public List<AliexpressAsfSellerAddressGetSellerAddressDTO> getPickupSellerAddressList() {
    return this.pickupSellerAddressList;
    }
    public void setPickupSellerAddressList(List<AliexpressAsfSellerAddressGetSellerAddressDTO> pickupSellerAddressList) {
    this.pickupSellerAddressList = pickupSellerAddressList;
    }
        public List<AliexpressAsfSellerAddressGetSellerAddressDTO> getRefundSellerAddressList() {
    return this.refundSellerAddressList;
    }
    public void setRefundSellerAddressList(List<AliexpressAsfSellerAddressGetSellerAddressDTO> refundSellerAddressList) {
    this.refundSellerAddressList = refundSellerAddressList;
    }
    }