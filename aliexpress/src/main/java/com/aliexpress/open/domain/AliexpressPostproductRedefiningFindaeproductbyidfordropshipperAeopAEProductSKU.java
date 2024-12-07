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

public class AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAEProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Sku库存,数据格式有货true，无货false；至少有一条sku记录是有货的。 */
                @ApiField("sku_stock")
            private Boolean skuStock;
        /** Sku价格。取值范围:0.01-100000;单位:美元。 如:200.07，表示:200美元7分。需要在正确的价格区间内。 */
                @ApiField("sku_price")
            private String skuPrice;
        /** Sku商家编码。 格式:半角英数字,长度20,不包含空格大于号和小于号。如果用户只填写零售价（productprice）和商品编码，需要完整生成一条SKU记录提交，否则商品编码无法保存。系统会认为只提交了零售价，而没有SKU，导致商品编辑未保存。 */
                @ApiField("sku_code")
            private String skuCode;
        /** SKU实际可售库存属性ipmSkuStock，该属性值的合理取值范围为0~999999，如该商品有SKU时，请确保至少有一个SKU是有货状态，也就是ipmSkuStock取值是1~999999，在整个商品纬度库存值的取值范围是1~999999。 如果同时设置了skuStock属性，那么系统以ipmSkuStock属性为优先；如果没有设置ipmSkuStock属性，那么系统会根据skuStock属性进行设置库存，true表示999，false表示0。 */
                @ApiField("ipm_sku_stock")
            private Long ipmSkuStock;
        /** SKU ID */
                @ApiField("id")
            private String id;
        /** 产品的货币单位。美元: USD, 卢布: RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** Sku属性对象list，允许1-3个sku属性对象，按sku属性顺序排放。sku属性从类目属性接口getAttributesResultByCateId获取。该项值输入sku属性，不能输入普通类目属性。注意，sku属性是有顺序的，必须按照顺序存放。 */
                @ApiListField("aeop_s_k_u_propertys")
            private List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopSKUProperty> aeopSKUPropertys;
        /** 商品条形码 */
                @ApiField("barcode")
            private String barcode;
        /** sku折扣价格 */
                @ApiField("offer_sale_price")
            private String offerSalePrice;
        /** sku批量折扣价 */
                @ApiField("offer_bulk_sale_price")
            private String offerBulkSalePrice;
        /** 最少起批的数量 */
                @ApiField("sku_bulk_order")
            private Integer skuBulkOrder;
        /** sku库存 */
                @ApiField("s_k_u_available_stock")
            private Long sKUAvailableStock;
    
        public Boolean getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Boolean skuStock) {
    this.skuStock = skuStock;
    }
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public Long getIpmSkuStock() {
    return this.ipmSkuStock;
    }
    public void setIpmSkuStock(Long ipmSkuStock) {
    this.ipmSkuStock = ipmSkuStock;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopSKUProperty> getAeopSKUPropertys() {
    return this.aeopSKUPropertys;
    }
    public void setAeopSKUPropertys(List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopSKUProperty> aeopSKUPropertys) {
    this.aeopSKUPropertys = aeopSKUPropertys;
    }
        public String getBarcode() {
    return this.barcode;
    }
    public void setBarcode(String barcode) {
    this.barcode = barcode;
    }
        public String getOfferSalePrice() {
    return this.offerSalePrice;
    }
    public void setOfferSalePrice(String offerSalePrice) {
    this.offerSalePrice = offerSalePrice;
    }
        public String getOfferBulkSalePrice() {
    return this.offerBulkSalePrice;
    }
    public void setOfferBulkSalePrice(String offerBulkSalePrice) {
    this.offerBulkSalePrice = offerBulkSalePrice;
    }
        public Integer getSkuBulkOrder() {
    return this.skuBulkOrder;
    }
    public void setSkuBulkOrder(Integer skuBulkOrder) {
    this.skuBulkOrder = skuBulkOrder;
    }
        public Long getSKUAvailableStock() {
    return this.sKUAvailableStock;
    }
    public void setSKUAvailableStock(Long sKUAvailableStock) {
    this.sKUAvailableStock = sKUAvailableStock;
    }
    }