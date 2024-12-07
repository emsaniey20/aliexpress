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

public class QimenAliexpressWarehouseInventoryGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("skuId")
            private String skuId;
        /** 1 */
                @ApiField("availableStock")
            private Long availableStock;
        /** 1 */
                @ApiField("onwayStock")
            private Long onwayStock;
        /** 1 */
                @ApiField("tobeshipStock")
            private Long tobeshipStock;
        /** 1 */
                @ApiField("rejectsStock")
            private Long rejectsStock;
        /** 1 */
                @ApiField("deliveryStock")
            private Long deliveryStock;
    
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public Long getAvailableStock() {
    return this.availableStock;
    }
    public void setAvailableStock(Long availableStock) {
    this.availableStock = availableStock;
    }
        public Long getOnwayStock() {
    return this.onwayStock;
    }
    public void setOnwayStock(Long onwayStock) {
    this.onwayStock = onwayStock;
    }
        public Long getTobeshipStock() {
    return this.tobeshipStock;
    }
    public void setTobeshipStock(Long tobeshipStock) {
    this.tobeshipStock = tobeshipStock;
    }
        public Long getRejectsStock() {
    return this.rejectsStock;
    }
    public void setRejectsStock(Long rejectsStock) {
    this.rejectsStock = rejectsStock;
    }
        public Long getDeliveryStock() {
    return this.deliveryStock;
    }
    public void setDeliveryStock(Long deliveryStock) {
    this.deliveryStock = deliveryStock;
    }
    }