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

public class AliexpressAscpPoConfirmPurchaseOrderPurchaseOrderConfirmDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
        /** 行业账套编码 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 是否全部确认 JIT传True */
                @ApiField("all_quantity_confirm")
            private Boolean allQuantityConfirm;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private String channelUserId;
    
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Boolean getAllQuantityConfirm() {
    return this.allQuantityConfirm;
    }
    public void setAllQuantityConfirm(Boolean allQuantityConfirm) {
    this.allQuantityConfirm = allQuantityConfirm;
    }
        public String getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(String channelUserId) {
    this.channelUserId = channelUserId;
    }
    }