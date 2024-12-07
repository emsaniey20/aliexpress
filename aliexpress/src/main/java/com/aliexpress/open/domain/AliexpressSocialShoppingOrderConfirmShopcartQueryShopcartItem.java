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

public class AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Order amount */
                @ApiField("actual_order_amount_cents")
            private Long actualOrderAmountCents;
        /** delevery services */
                @ApiListField("available_delivery_services")
            private List<AliexpressSocialShoppingOrderConfirmShopcartQueryDeliveryService> availableDeliveryServices;
        /** Freight amount */
                @ApiField("freight_amount_cents")
            private Long freightAmountCents;
        /** Order  amount */
                @ApiField("original_order_amount_cents")
            private Long originalOrderAmountCents;
        /** Item id */
                @ApiField("product_id")
            private Long productId;
        /** Recommended service name */
                @ApiField("recommended_delivery_service")
            private AliexpressSocialShoppingOrderConfirmShopcartQueryDeliveryService recommendedDeliveryService;
        /** Product sku */
                @ApiField("sku_attr")
            private String skuAttr;
    
        public Long getActualOrderAmountCents() {
    return this.actualOrderAmountCents;
    }
    public void setActualOrderAmountCents(Long actualOrderAmountCents) {
    this.actualOrderAmountCents = actualOrderAmountCents;
    }
        public List<AliexpressSocialShoppingOrderConfirmShopcartQueryDeliveryService> getAvailableDeliveryServices() {
    return this.availableDeliveryServices;
    }
    public void setAvailableDeliveryServices(List<AliexpressSocialShoppingOrderConfirmShopcartQueryDeliveryService> availableDeliveryServices) {
    this.availableDeliveryServices = availableDeliveryServices;
    }
        public Long getFreightAmountCents() {
    return this.freightAmountCents;
    }
    public void setFreightAmountCents(Long freightAmountCents) {
    this.freightAmountCents = freightAmountCents;
    }
        public Long getOriginalOrderAmountCents() {
    return this.originalOrderAmountCents;
    }
    public void setOriginalOrderAmountCents(Long originalOrderAmountCents) {
    this.originalOrderAmountCents = originalOrderAmountCents;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public AliexpressSocialShoppingOrderConfirmShopcartQueryDeliveryService getRecommendedDeliveryService() {
    return this.recommendedDeliveryService;
    }
    public void setRecommendedDeliveryService(AliexpressSocialShoppingOrderConfirmShopcartQueryDeliveryService recommendedDeliveryService) {
    this.recommendedDeliveryService = recommendedDeliveryService;
    }
        public String getSkuAttr() {
    return this.skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
    this.skuAttr = skuAttr;
    }
    }