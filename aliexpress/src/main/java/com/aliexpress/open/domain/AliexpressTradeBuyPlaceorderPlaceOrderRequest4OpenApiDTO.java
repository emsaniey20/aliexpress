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

public class AliexpressTradeBuyPlaceorderPlaceOrderRequest4OpenApiDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** outer order id, used for idempotent checkout */
                @ApiField("out_order_id")
            private String outOrderId;
        /** logistic address information */
                @ApiField("logistics_address")
            private AliexpressTradeBuyPlaceorderMaillingAddressRequestDTO logisticsAddress;
        /** product attributes */
                @ApiListField("product_items")
            private List<AliexpressTradeBuyPlaceorderProductBaseItem> productItems;
    
        public String getOutOrderId() {
    return this.outOrderId;
    }
    public void setOutOrderId(String outOrderId) {
    this.outOrderId = outOrderId;
    }
        public AliexpressTradeBuyPlaceorderMaillingAddressRequestDTO getLogisticsAddress() {
    return this.logisticsAddress;
    }
    public void setLogisticsAddress(AliexpressTradeBuyPlaceorderMaillingAddressRequestDTO logisticsAddress) {
    this.logisticsAddress = logisticsAddress;
    }
        public List<AliexpressTradeBuyPlaceorderProductBaseItem> getProductItems() {
    return this.productItems;
    }
    public void setProductItems(List<AliexpressTradeBuyPlaceorderProductBaseItem> productItems) {
    this.productItems = productItems;
    }
    }