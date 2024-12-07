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

public class AliexpressAscpItemQueryErpScItemBindRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品id */
                @ApiField("item_id")
            private String itemId;
        /** 绑定状态 (1-未绑定 2-已绑定 3-解绑待审核 4-审核拒绝) */
                @ApiField("bind_status")
            private String bindStatus;
        /** skuId */
                @ApiField("sku_id")
            private String skuId;
    
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public String getBindStatus() {
    return this.bindStatus;
    }
    public void setBindStatus(String bindStatus) {
    this.bindStatus = bindStatus;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
    }