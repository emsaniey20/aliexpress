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

public class AliexpressSocialShoppingOrderConfirmSingleproductQuerySNSOrderConfirmResp implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Result order amount (subcurrency) */
                @ApiField("actual_order_amount_cents")
            private Long actualOrderAmountCents;
        /** Cheapest delivery service name */
                @ApiField("cheapest_delivery_service")
            private String cheapestDeliveryService;
        /** Currency code */
                @ApiField("currency")
            private String currency;
        /** Expected delivery date */
                @ApiField("expected_delivery_date")
            private String expectedDeliveryDate;
        /** Freight amount (subcurrency) */
                @ApiField("freight_amount_cents")
            private Long freightAmountCents;
        /** Min estimated delivery days number */
                @ApiField("max_delivery_days")
            private Integer maxDeliveryDays;
        /** Max estimated delivery days number */
                @ApiField("min_delivery_days")
            private Integer minDeliveryDays;
        /** Order amount before discount */
                @ApiField("original_order_amount_cents")
            private Long originalOrderAmountCents;
        /** Recommended delivery service name */
                @ApiField("recommended_delivery_service")
            private String recommendedDeliveryService;
        /** Delivery address object */
                @ApiField("selected_address")
            private AliexpressSocialShoppingOrderConfirmSingleproductQueryLogisticAddressVO selectedAddress;
        /** Store name */
                @ApiField("seller_company_name")
            private String sellerCompanyName;
        /** Seller country code */
                @ApiField("seller_country_code")
            private String sellerCountryCode;
        /** Indicates if promocode has been successfully applied */
                @ApiField("is_promocode_applied")
            private Boolean isPromocodeApplied;
        /** Promocode discount in subcurrency */
                @ApiField("promocode_discount_cents")
            private Long promocodeDiscountCents;
    
        public Long getActualOrderAmountCents() {
    return this.actualOrderAmountCents;
    }
    public void setActualOrderAmountCents(Long actualOrderAmountCents) {
    this.actualOrderAmountCents = actualOrderAmountCents;
    }
        public String getCheapestDeliveryService() {
    return this.cheapestDeliveryService;
    }
    public void setCheapestDeliveryService(String cheapestDeliveryService) {
    this.cheapestDeliveryService = cheapestDeliveryService;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getExpectedDeliveryDate() {
    return this.expectedDeliveryDate;
    }
    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
    }
        public Long getFreightAmountCents() {
    return this.freightAmountCents;
    }
    public void setFreightAmountCents(Long freightAmountCents) {
    this.freightAmountCents = freightAmountCents;
    }
        public Integer getMaxDeliveryDays() {
    return this.maxDeliveryDays;
    }
    public void setMaxDeliveryDays(Integer maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
    }
        public Integer getMinDeliveryDays() {
    return this.minDeliveryDays;
    }
    public void setMinDeliveryDays(Integer minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
    }
        public Long getOriginalOrderAmountCents() {
    return this.originalOrderAmountCents;
    }
    public void setOriginalOrderAmountCents(Long originalOrderAmountCents) {
    this.originalOrderAmountCents = originalOrderAmountCents;
    }
        public String getRecommendedDeliveryService() {
    return this.recommendedDeliveryService;
    }
    public void setRecommendedDeliveryService(String recommendedDeliveryService) {
    this.recommendedDeliveryService = recommendedDeliveryService;
    }
        public AliexpressSocialShoppingOrderConfirmSingleproductQueryLogisticAddressVO getSelectedAddress() {
    return this.selectedAddress;
    }
    public void setSelectedAddress(AliexpressSocialShoppingOrderConfirmSingleproductQueryLogisticAddressVO selectedAddress) {
    this.selectedAddress = selectedAddress;
    }
        public String getSellerCompanyName() {
    return this.sellerCompanyName;
    }
    public void setSellerCompanyName(String sellerCompanyName) {
    this.sellerCompanyName = sellerCompanyName;
    }
        public String getSellerCountryCode() {
    return this.sellerCountryCode;
    }
    public void setSellerCountryCode(String sellerCountryCode) {
    this.sellerCountryCode = sellerCountryCode;
    }
        public Boolean getIsPromocodeApplied() {
    return this.isPromocodeApplied;
    }
    public void setIsPromocodeApplied(Boolean isPromocodeApplied) {
    this.isPromocodeApplied = isPromocodeApplied;
    }
        public Long getPromocodeDiscountCents() {
    return this.promocodeDiscountCents;
    }
    public void setPromocodeDiscountCents(Long promocodeDiscountCents) {
    this.promocodeDiscountCents = promocodeDiscountCents;
    }
    }