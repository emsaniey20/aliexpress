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

public class AliexpressOfferDraftproductGetAeopAEProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Sku属性对象list，允许1-3个sku属性对象，按sku属性顺序排放。sku属性从类目属性接口getAttributesResultByCateId获取。该项值输入sku属性，不能输入普通类目属性。注意，sku属性是有顺序的，必须按照顺序存放。 */
                @ApiListField("aeop_s_k_u_property_list")
            private List<AliexpressOfferDraftproductGetAeopSKUProperty> aeopSKUPropertyList;
        /** 产品的货币单位。美元: USD, 卢布: RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** SKU ID，格式：“sku_property_id:property_value_id” */
                @ApiField("id")
            private String id;
        /** SKU实际可售库存属性ipmSkuStock，该属性值的合理取值范围为0~999999，如该商品有SKU时，请确保至少有一个SKU是有货状态，也就是ipmSkuStock取值是1~999999，在整个商品纬度库存值的取值范围是1~999999。 如果同时设置了skuStock属性，那么系统以ipmSkuStock属性为优先；如果没有设置ipmSkuStock属性，那么系统会根据skuStock属性进行设置库存，true表示999，false表示0。 */
                @ApiField("ipm_sku_stock")
            private Long ipmSkuStock;
        /** Sku商家编码。 格式:半角英数字,长度20,不包含空格大于号和小于号。如果用户只填写零售价（productprice）和商品编码，需要完整生成一条SKU记录提交，否则商品编码无法保存。系统会认为只提交了零售价，而没有SKU，导致商品编辑未保存。 */
                @ApiField("sku_code")
            private String skuCode;
        /** Sku价格。取值范围:0.01-100000;单位:美元。 如:200.07，表示:200美元7分。需要在正确的价格区间内。 */
                @ApiField("sku_price")
            private String skuPrice;
        /** Sku库存,数据格式有货true，无货false；至少有一条sku记录是有货的。 */
                @ApiField("sku_stock")
            private Boolean skuStock;
        /** 条码，所有的仓发商品（尖货，自营，假发）会返回这个参数 */
                @ApiField("barcode")
            private String barcode;
        /** sku分国家的日常促销价 */
                @ApiListField("aeop_s_k_u_national_discount_price_list")
            private List<AliexpressOfferDraftproductGetAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPriceList;
        /** sku日常促销价 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
    
        public List<AliexpressOfferDraftproductGetAeopSKUProperty> getAeopSKUPropertyList() {
    return this.aeopSKUPropertyList;
    }
    public void setAeopSKUPropertyList(List<AliexpressOfferDraftproductGetAeopSKUProperty> aeopSKUPropertyList) {
    this.aeopSKUPropertyList = aeopSKUPropertyList;
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
        public String getBarcode() {
    return this.barcode;
    }
    public void setBarcode(String barcode) {
    this.barcode = barcode;
    }
        public List<AliexpressOfferDraftproductGetAeopSKUNationalDiscountPrice> getAeopSKUNationalDiscountPriceList() {
    return this.aeopSKUNationalDiscountPriceList;
    }
    public void setAeopSKUNationalDiscountPriceList(List<AliexpressOfferDraftproductGetAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPriceList) {
    this.aeopSKUNationalDiscountPriceList = aeopSKUNationalDiscountPriceList;
    }
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
    }