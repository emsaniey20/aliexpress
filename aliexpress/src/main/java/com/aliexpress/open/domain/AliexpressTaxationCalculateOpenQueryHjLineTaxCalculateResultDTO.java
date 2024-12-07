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

public class AliexpressTaxationCalculateOpenQueryHjLineTaxCalculateResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品数量 */
                @ApiField("quantity")
            private String quantity;
        /** 商品未含税总价 */
                @ApiField("order_tax_excluded_amount")
            private String orderTaxExcludedAmount;
        /** 运费未含税总价 */
                @ApiField("delivery_amount")
            private String deliveryAmount;
        /** 商品税金总价 */
                @ApiField("order_tax_amount")
            private String orderTaxAmount;
        /** 运费税金总价 */
                @ApiField("delivery_tax_amount")
            private String deliveryTaxAmount;
        /** 商品税率 */
                @ApiListField("tax_rates")
            private List<String> taxRates;
        /** 运费税率 */
                @ApiListField("delivery_tax_rates")
            private List<String> deliveryTaxRates;
        /** 子订单号id */
                @ApiField("sub_order_id")
            private String subOrderId;
    
        public String getQuantity() {
    return this.quantity;
    }
    public void setQuantity(String quantity) {
    this.quantity = quantity;
    }
        public String getOrderTaxExcludedAmount() {
    return this.orderTaxExcludedAmount;
    }
    public void setOrderTaxExcludedAmount(String orderTaxExcludedAmount) {
    this.orderTaxExcludedAmount = orderTaxExcludedAmount;
    }
        public String getDeliveryAmount() {
    return this.deliveryAmount;
    }
    public void setDeliveryAmount(String deliveryAmount) {
    this.deliveryAmount = deliveryAmount;
    }
        public String getOrderTaxAmount() {
    return this.orderTaxAmount;
    }
    public void setOrderTaxAmount(String orderTaxAmount) {
    this.orderTaxAmount = orderTaxAmount;
    }
        public String getDeliveryTaxAmount() {
    return this.deliveryTaxAmount;
    }
    public void setDeliveryTaxAmount(String deliveryTaxAmount) {
    this.deliveryTaxAmount = deliveryTaxAmount;
    }
        public List<String> getTaxRates() {
    return this.taxRates;
    }
    public void setTaxRates(List<String> taxRates) {
    this.taxRates = taxRates;
    }
        public List<String> getDeliveryTaxRates() {
    return this.deliveryTaxRates;
    }
    public void setDeliveryTaxRates(List<String> deliveryTaxRates) {
    this.deliveryTaxRates = deliveryTaxRates;
    }
        public String getSubOrderId() {
    return this.subOrderId;
    }
    public void setSubOrderId(String subOrderId) {
    this.subOrderId = subOrderId;
    }
    }