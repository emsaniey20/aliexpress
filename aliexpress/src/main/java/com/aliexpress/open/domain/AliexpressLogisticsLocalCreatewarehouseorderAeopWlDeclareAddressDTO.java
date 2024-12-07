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

public class AliexpressLogisticsLocalCreatewarehouseorderAeopWlDeclareAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sender address */
                @ApiField("sender")
            private AliexpressLogisticsLocalCreatewarehouseorderstruct sender;
        /** receiver address */
                @ApiField("receiver")
            private AliexpressLogisticsLocalCreatewarehouseorderstruct receiver;
    
        public AliexpressLogisticsLocalCreatewarehouseorderstruct getSender() {
    return this.sender;
    }
    public void setSender(AliexpressLogisticsLocalCreatewarehouseorderstruct sender) {
    this.sender = sender;
    }
        public AliexpressLogisticsLocalCreatewarehouseorderstruct getReceiver() {
    return this.receiver;
    }
    public void setReceiver(AliexpressLogisticsLocalCreatewarehouseorderstruct receiver) {
    this.receiver = receiver;
    }
    }