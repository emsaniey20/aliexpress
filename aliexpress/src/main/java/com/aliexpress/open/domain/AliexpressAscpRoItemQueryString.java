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

public class AliexpressAscpRoItemQueryString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 退供单号 */
                @ApiField("return_order_no")
            private String returnOrderNo;
        /** 货品Id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 货品名称 */
                @ApiField("title")
            private String title;
        /** 退供数量 */
                @ApiField("quantity")
            private Long quantity;
        /** 实际退供数量 */
                @ApiField("return_quantity")
            private Long returnQuantity;
        /** 库存类型 */
                @ApiField("inventory_type_desc")
            private String inventoryTypeDesc;
        /** 税率 */
                @ApiField("tax_rate")
            private String taxRate;
        /** 含税退供价，单位分 */
                @ApiField("return_price")
            private String returnPrice;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
    
        public String getReturnOrderNo() {
    return this.returnOrderNo;
    }
    public void setReturnOrderNo(String returnOrderNo) {
    this.returnOrderNo = returnOrderNo;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public Long getReturnQuantity() {
    return this.returnQuantity;
    }
    public void setReturnQuantity(Long returnQuantity) {
    this.returnQuantity = returnQuantity;
    }
        public String getInventoryTypeDesc() {
    return this.inventoryTypeDesc;
    }
    public void setInventoryTypeDesc(String inventoryTypeDesc) {
    this.inventoryTypeDesc = inventoryTypeDesc;
    }
        public String getTaxRate() {
    return this.taxRate;
    }
    public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
    }
        public String getReturnPrice() {
    return this.returnPrice;
    }
    public void setReturnPrice(String returnPrice) {
    this.returnPrice = returnPrice;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
    }