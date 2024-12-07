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

public class AliexpressPostproductRedefiningPostaeproductAeopAEProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** none */
                @ApiListField("aeop_s_k_u_property")
            private List<AliexpressPostproductRedefiningPostaeproductAeopSKUProperty> aeopSKUProperty;
        /** 货币单位。如果不提供该值信息，则默认为"USD"；非俄罗斯卖家这个属性值可以不提供。对于俄罗斯海外卖家，该单位值必须提供，如: "RUB"。 */
                @ApiField("currency_code")
            private String currencyCode;
        /** none */
                @ApiField("id")
            private String id;
        /** none */
                @ApiField("ipm_sku_stock")
            private Long ipmSkuStock;
        /** none */
                @ApiField("sku_code")
            private String skuCode;
        /** none */
                @ApiField("sku_price")
            private String skuPrice;
        /** none */
                @ApiField("sku_stock")
            private Boolean skuStock;
        /** sku日常促销价 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** sku分国家的日常促销价 */
                @ApiListField("aeop_s_k_u_national_discount_price")
            private List<AliexpressPostproductRedefiningPostaeproductAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPrice;
        /** sku维度eanCode */
                @ApiField("ean_code")
            private String eanCode;
    
        public List<AliexpressPostproductRedefiningPostaeproductAeopSKUProperty> getAeopSKUProperty() {
    return this.aeopSKUProperty;
    }
    public void setAeopSKUProperty(List<AliexpressPostproductRedefiningPostaeproductAeopSKUProperty> aeopSKUProperty) {
    this.aeopSKUProperty = aeopSKUProperty;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public Long getIpmSkuStock() {
    return this.ipmSkuStock;
    }
    public void setIpmSkuStock(Long ipmSkuStock) {
    this.ipmSkuStock = ipmSkuStock;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public Boolean getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Boolean skuStock) {
    this.skuStock = skuStock;
    }
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public List<AliexpressPostproductRedefiningPostaeproductAeopSKUNationalDiscountPrice> getAeopSKUNationalDiscountPrice() {
    return this.aeopSKUNationalDiscountPrice;
    }
    public void setAeopSKUNationalDiscountPrice(List<AliexpressPostproductRedefiningPostaeproductAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPrice) {
    this.aeopSKUNationalDiscountPrice = aeopSKUNationalDiscountPrice;
    }
        public String getEanCode() {
    return this.eanCode;
    }
    public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
    }
    }