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

public class AliexpressLogisticsOrderCreateorderAeopWlDeclareAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** receiver address */
                @ApiField("receiver")
            private AliexpressLogisticsOrderCreateorderstruct receiver;
        /** refund address */
                @ApiField("refund")
            private AliexpressLogisticsOrderCreateorderstruct refund;
        /** sender address */
                @ApiField("sender")
            private AliexpressLogisticsOrderCreateorderstruct sender;
        /** 上门揽收时必填，自寄自送不填 */
                @ApiField("pickup")
            private AliexpressLogisticsOrderCreateorderstruct pickup;
    
        public AliexpressLogisticsOrderCreateorderstruct getReceiver() {
    return this.receiver;
    }
    public void setReceiver(AliexpressLogisticsOrderCreateorderstruct receiver) {
    this.receiver = receiver;
    }
        public AliexpressLogisticsOrderCreateorderstruct getRefund() {
    return this.refund;
    }
    public void setRefund(AliexpressLogisticsOrderCreateorderstruct refund) {
    this.refund = refund;
    }
        public AliexpressLogisticsOrderCreateorderstruct getSender() {
    return this.sender;
    }
    public void setSender(AliexpressLogisticsOrderCreateorderstruct sender) {
    this.sender = sender;
    }
        public AliexpressLogisticsOrderCreateorderstruct getPickup() {
    return this.pickup;
    }
    public void setPickup(AliexpressLogisticsOrderCreateorderstruct pickup) {
    this.pickup = pickup;
    }
    }