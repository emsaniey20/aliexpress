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

public class AliexpressEcowarehouseOrderStatusPostSendPackageSku implements Serializable {
    private static final long serialVersionUID = 1L;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("quantity")
            private Integer quantity;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("ae_sku_id")
            private String aeSkuId;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("sku_id")
            private String skuId;
    
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public String getAeSkuId() {
    return this.aeSkuId;
    }
    public void setAeSkuId(String aeSkuId) {
    this.aeSkuId = aeSkuId;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
    }