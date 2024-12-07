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

public class AliexpressAscpFroItemQueryString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品Id */
                @ApiField("item_id")
            private String itemId;
        /** 商品名称 */
                @ApiField("item_title")
            private String itemTitle;
        /** 货品Id */
                @ApiField("sc_item_id")
            private String scItemId;
        /** 货品条码 */
                @ApiField("barcode")
            private String barcode;
        /** 申请退货数量 */
                @ApiField("plan_qty")
            private String planQty;
        /** 价格 */
                @ApiField("order_line_price")
            private String orderLinePrice;
        /** 仓库实收正品 */
                @ApiField("return_normal_qty")
            private String returnNormalQty;
        /** 仓库实收残品 */
                @ApiField("return_scrap_qty")
            private String returnScrapQty;
        /** 仓名称 */
                @ApiField("warehouse_name")
            private String warehouseName;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
    
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public String getItemTitle() {
    return this.itemTitle;
    }
    public void setItemTitle(String itemTitle) {
    this.itemTitle = itemTitle;
    }
        public String getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(String scItemId) {
    this.scItemId = scItemId;
    }
        public String getBarcode() {
    return this.barcode;
    }
    public void setBarcode(String barcode) {
    this.barcode = barcode;
    }
        public String getPlanQty() {
    return this.planQty;
    }
    public void setPlanQty(String planQty) {
    this.planQty = planQty;
    }
        public String getOrderLinePrice() {
    return this.orderLinePrice;
    }
    public void setOrderLinePrice(String orderLinePrice) {
    this.orderLinePrice = orderLinePrice;
    }
        public String getReturnNormalQty() {
    return this.returnNormalQty;
    }
    public void setReturnNormalQty(String returnNormalQty) {
    this.returnNormalQty = returnNormalQty;
    }
        public String getReturnScrapQty() {
    return this.returnScrapQty;
    }
    public void setReturnScrapQty(String returnScrapQty) {
    this.returnScrapQty = returnScrapQty;
    }
        public String getWarehouseName() {
    return this.warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
    }