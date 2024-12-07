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

public class GspOrderQueryforsupplierSalesOrderLineDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 子单ID */
                @ApiField("id")
            private String id;
        /** Created Payed Shipped Canceled */
                @ApiField("status")
            private String status;
        /** 销售市场itemId */
                @ApiField("itemId")
            private String itemId;
        /** 销售市场skuId */
                @ApiField("skuId")
            private String skuId;
        /** 销售市场商品title */
                @ApiField("title")
            private String title;
        /** 主图链接 */
                @ApiField("image")
            private String image;
        /** 件数 */
                @ApiField("quantity")
            private String quantity;
    
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
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public String getImage() {
    return this.image;
    }
    public void setImage(String image) {
    this.image = image;
    }
        public String getQuantity() {
    return this.quantity;
    }
    public void setQuantity(String quantity) {
    this.quantity = quantity;
    }
    }