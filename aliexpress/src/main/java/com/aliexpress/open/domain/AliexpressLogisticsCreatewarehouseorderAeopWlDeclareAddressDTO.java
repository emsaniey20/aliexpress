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

public class AliexpressLogisticsCreatewarehouseorderAeopWlDeclareAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sender address */
                @ApiField("sender")
            private AliexpressLogisticsCreatewarehouseorderstruct sender;
        /** pickup address */
                @ApiField("pickup")
            private AliexpressLogisticsCreatewarehouseorderstruct pickup;
        /** receiver address */
                @ApiField("receiver")
            private AliexpressLogisticsCreatewarehouseorderstruct receiver;
        /** refund address */
                @ApiField("refund")
            private AliexpressLogisticsCreatewarehouseorderstruct refund;
    
        public AliexpressLogisticsCreatewarehouseorderstruct getSender() {
    return this.sender;
    }
    public void setSender(AliexpressLogisticsCreatewarehouseorderstruct sender) {
    this.sender = sender;
    }
        public AliexpressLogisticsCreatewarehouseorderstruct getPickup() {
    return this.pickup;
    }
    public void setPickup(AliexpressLogisticsCreatewarehouseorderstruct pickup) {
    this.pickup = pickup;
    }
        public AliexpressLogisticsCreatewarehouseorderstruct getReceiver() {
    return this.receiver;
    }
    public void setReceiver(AliexpressLogisticsCreatewarehouseorderstruct receiver) {
    this.receiver = receiver;
    }
        public AliexpressLogisticsCreatewarehouseorderstruct getRefund() {
    return this.refund;
    }
    public void setRefund(AliexpressLogisticsCreatewarehouseorderstruct refund) {
    this.refund = refund;
    }
    }