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

public class AliexpressAscpPoCreateErpPurchaseOrderCreateItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 计划入库数量 */
                @ApiField("quantity")
            private Long quantity;
        /** 货品Id */
                @ApiField("sc_item_id")
            private Long scItemId;
    
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
    }