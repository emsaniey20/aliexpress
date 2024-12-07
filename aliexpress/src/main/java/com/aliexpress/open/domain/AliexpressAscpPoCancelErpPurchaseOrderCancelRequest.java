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

public class AliexpressAscpPoCancelErpPurchaseOrderCancelRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 入库单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
        /** 业务租户编码，AEG场景请填写AEGDCHAIN */
                @ApiField("merchant_code")
            private String merchantCode;
        /** 业务租户Id，AEG场景请填写288000 */
                @ApiField("biz_type")
            private String bizType;
        /** 入库单取消原因 */
                @ApiField("cancel_reason")
            private String cancelReason;
    
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
        public String getMerchantCode() {
    return this.merchantCode;
    }
    public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
    }
        public String getBizType() {
    return this.bizType;
    }
    public void setBizType(String bizType) {
    this.bizType = bizType;
    }
        public String getCancelReason() {
    return this.cancelReason;
    }
    public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    }
    }