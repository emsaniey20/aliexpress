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

public class GspOrderQueryforsupplierPurchaseOrdrerLineDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 单价，单位：分 */
                @ApiField("unitPrice")
            private String unitPrice;
        /** 币种  USD RMB */
                @ApiField("currency")
            private String currency;
        /** 物流公司 */
                @ApiField("logisticCompany")
            private String logisticCompany;
        /** 运单号 */
                @ApiField("trackingNum")
            private String trackingNum;
        /** 采购子单ID */
                @ApiField("id")
            private String id;
        /** 履约状态  Created Payed Shipped InBound OutBound Canceled */
                @ApiField("status")
            private String status;
        /** 供应商itemId */
                @ApiField("itemId")
            private String itemId;
        /** 供应商skuId */
                @ApiField("skuId")
            private String skuId;
        /** 件数 */
                @ApiField("quantity")
            private String quantity;
    
        public String getUnitPrice() {
    return this.unitPrice;
    }
    public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getLogisticCompany() {
    return this.logisticCompany;
    }
    public void setLogisticCompany(String logisticCompany) {
    this.logisticCompany = logisticCompany;
    }
        public String getTrackingNum() {
    return this.trackingNum;
    }
    public void setTrackingNum(String trackingNum) {
    this.trackingNum = trackingNum;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public String getQuantity() {
    return this.quantity;
    }
    public void setQuantity(String quantity) {
    this.quantity = quantity;
    }
    }