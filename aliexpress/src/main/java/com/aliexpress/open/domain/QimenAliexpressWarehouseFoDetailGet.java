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

public class QimenAliexpressWarehouseFoDetailGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹宽度，单位：毫米 */
                @ApiField("quantity")
            private Long quantity;
        /** wms系统内skuid */
                @ApiField("skuId")
            private String skuId;
    
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
    }