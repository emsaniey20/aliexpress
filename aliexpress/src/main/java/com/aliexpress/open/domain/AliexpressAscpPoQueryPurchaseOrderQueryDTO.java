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

public class AliexpressAscpPoQueryPurchaseOrderQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务租户Id，全托管 场景请填写 5110000, choice2.0(AEG)场景填: 288000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
    }