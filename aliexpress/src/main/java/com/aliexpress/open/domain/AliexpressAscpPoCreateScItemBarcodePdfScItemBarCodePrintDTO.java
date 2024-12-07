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

public class AliexpressAscpPoCreateScItemBarcodePdfScItemBarCodePrintDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
        /** 业务租户Id，全托管 场景请填写 5110000, choice2.0(AEG)场景填: 288000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** 全托管和半托管支持尺寸（必填）: 1. SIZE_60_30: 60mm*30mm 。部分货品会自动打印品类标签。 */
                @ApiField("pdf_size")
            private String pdfSize;
    
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
        public Long getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(Long channelUserId) {
    this.channelUserId = channelUserId;
    }
        public String getPdfSize() {
    return this.pdfSize;
    }
    public void setPdfSize(String pdfSize) {
    this.pdfSize = pdfSize;
    }
    }