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

public class AliexpressPostproductRedefiningEditproductcidattidskuAeopAEProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 货币单位。如果不提供该值信息，则默认为"USD"；非俄罗斯卖家这个属性值可以不提供。对于俄罗斯海外卖家，该单位值必须提供，如: "RUB"。 */
                @ApiField("currency_code")
            private String currencyCode;
        /** eanCode */
                @ApiField("ean_code")
            private String eanCode;
        /** SKU属性 */
                @ApiListField("aeop_s_k_u_property")
            private List<AliexpressPostproductRedefiningEditproductcidattidskuAeopSKUProperty> aeopSKUProperty;
        /** SKU id，格式：sku_property_id:sku_property_value_id,不需要变更类目不用传，自定义属性必传 */
                @ApiField("id")
            private String id;
        /** SKU实际可售库存属性ipmSkuStock，该属性值的合理取值范围为0~999999 */
                @ApiField("ipm_sku_stock")
            private Long ipmSkuStock;
        /** Sku商家编码。 格式:半角英数字,长度20,不包含空格大于号和小于号。如果用户只填写零售价（productprice）和商品编码，需要完整生成一条SKU记录提交，否则商品编码无法保存。系统会认为只提交了零售价，而没有SKU，导致商品编辑未保存。 */
                @ApiField("sku_code")
            private String skuCode;
        /** Sku价格。取值范围:0.01-100000;单位:美元。 如:200.07，表示:200美元7分。需要在正确的价格区间内。 */
                @ApiField("sku_price")
            private String skuPrice;
        /** sku日常促销价 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** sku分国家的日常促销价 */
                @ApiListField("aeop_s_k_u_national_discount_price")
            private List<AliexpressPostproductRedefiningEditproductcidattidskuAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPrice;
    
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getEanCode() {
    return this.eanCode;
    }
    public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
    }
        public List<AliexpressPostproductRedefiningEditproductcidattidskuAeopSKUProperty> getAeopSKUProperty() {
    return this.aeopSKUProperty;
    }
    public void setAeopSKUProperty(List<AliexpressPostproductRedefiningEditproductcidattidskuAeopSKUProperty> aeopSKUProperty) {
    this.aeopSKUProperty = aeopSKUProperty;
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
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public List<AliexpressPostproductRedefiningEditproductcidattidskuAeopSKUNationalDiscountPrice> getAeopSKUNationalDiscountPrice() {
    return this.aeopSKUNationalDiscountPrice;
    }
    public void setAeopSKUNationalDiscountPrice(List<AliexpressPostproductRedefiningEditproductcidattidskuAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPrice) {
    this.aeopSKUNationalDiscountPrice = aeopSKUNationalDiscountPrice;
    }
    }