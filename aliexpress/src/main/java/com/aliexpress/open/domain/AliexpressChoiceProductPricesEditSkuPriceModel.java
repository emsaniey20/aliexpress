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

public class AliexpressChoiceProductPricesEditSkuPriceModel implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku供货价 */
                @ApiField("supply_price")
            private String supplyPrice;
        /** SKU 的 id字段，格式：“sku_property_id:property_value_id”。调商品详情查询接口获取：aliexpress.choice.product.query */
                @ApiField("id")
            private String id;
    
        public String getSupplyPrice() {
    return this.supplyPrice;
    }
    public void setSupplyPrice(String supplyPrice) {
    this.supplyPrice = supplyPrice;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
    }