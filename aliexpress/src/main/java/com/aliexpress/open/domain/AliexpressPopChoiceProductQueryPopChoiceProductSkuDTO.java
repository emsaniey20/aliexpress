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

public class AliexpressPopChoiceProductQueryPopChoiceProductSkuDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** SKU分国家的零售价列表 */
                @ApiListField("choice_sku_price_list")
            private List<AliexpressPopChoiceProductQueryPopChoiceNationalPrice> choiceSkuPriceList;
        /** SKU货品信息 */
                @ApiField("pop_choice_product_sku_sc_item_info")
            private AliexpressPopChoiceProductQueryPopChoiceProductSkuScItemInfo popChoiceProductSkuScItemInfo;
        /** SKU物流尺寸-高，单位cm */
                @ApiField("package_height")
            private String packageHeight;
        /** SKU半托管库存列表 */
                @ApiListField("pop_choice_sku_warehouse_stock_list")
            private List<AliexpressPopChoiceProductQueryPopChoiceSkuWarehouseStock> popChoiceSkuWarehouseStockList;
        /** SKU属性列表 */
                @ApiListField("sku_property_list")
            private List<AliexpressPopChoiceProductQueryAeopSKUProperty> skuPropertyList;
        /** SKU级别重量，KG */
                @ApiField("package_weight")
            private String packageWeight;
        /** SKU物流尺寸-宽，单位cm */
                @ApiField("package_width")
            private String packageWidth;
        /** SKU物流尺寸-长，单位cm */
                @ApiField("package_length")
            private String packageLength;
        /** SKU物流费用分国家列表 */
                @ApiListField("freight_fee_list")
            private List<AliexpressPopChoiceProductQueryPopChoiceNationalPrice> freightFeeList;
        /** SkuId，平台生成的唯一性随机数 */
                @ApiField("sku_id")
            private String skuId;
        /** Sku商家编码。 格式:半角英数字,长度20,不包含空格大于号和小于号。如果用户只填写零售价（productprice）和商品编码，需要完整生成一条SKU记录提交，否则商品编码无法保存。系统会认为只提交了零售价，而没有SKU，导致商品编辑未保存。 */
                @ApiField("sku_code")
            private String skuCode;
        /** SKU裸价 */
                @ApiField("base_price")
            private String basePrice;
    
        public List<AliexpressPopChoiceProductQueryPopChoiceNationalPrice> getChoiceSkuPriceList() {
    return this.choiceSkuPriceList;
    }
    public void setChoiceSkuPriceList(List<AliexpressPopChoiceProductQueryPopChoiceNationalPrice> choiceSkuPriceList) {
    this.choiceSkuPriceList = choiceSkuPriceList;
    }
        public AliexpressPopChoiceProductQueryPopChoiceProductSkuScItemInfo getPopChoiceProductSkuScItemInfo() {
    return this.popChoiceProductSkuScItemInfo;
    }
    public void setPopChoiceProductSkuScItemInfo(AliexpressPopChoiceProductQueryPopChoiceProductSkuScItemInfo popChoiceProductSkuScItemInfo) {
    this.popChoiceProductSkuScItemInfo = popChoiceProductSkuScItemInfo;
    }
        public String getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(String packageHeight) {
    this.packageHeight = packageHeight;
    }
        public List<AliexpressPopChoiceProductQueryPopChoiceSkuWarehouseStock> getPopChoiceSkuWarehouseStockList() {
    return this.popChoiceSkuWarehouseStockList;
    }
    public void setPopChoiceSkuWarehouseStockList(List<AliexpressPopChoiceProductQueryPopChoiceSkuWarehouseStock> popChoiceSkuWarehouseStockList) {
    this.popChoiceSkuWarehouseStockList = popChoiceSkuWarehouseStockList;
    }
        public List<AliexpressPopChoiceProductQueryAeopSKUProperty> getSkuPropertyList() {
    return this.skuPropertyList;
    }
    public void setSkuPropertyList(List<AliexpressPopChoiceProductQueryAeopSKUProperty> skuPropertyList) {
    this.skuPropertyList = skuPropertyList;
    }
        public String getPackageWeight() {
    return this.packageWeight;
    }
    public void setPackageWeight(String packageWeight) {
    this.packageWeight = packageWeight;
    }
        public String getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(String packageWidth) {
    this.packageWidth = packageWidth;
    }
        public String getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(String packageLength) {
    this.packageLength = packageLength;
    }
        public List<AliexpressPopChoiceProductQueryPopChoiceNationalPrice> getFreightFeeList() {
    return this.freightFeeList;
    }
    public void setFreightFeeList(List<AliexpressPopChoiceProductQueryPopChoiceNationalPrice> freightFeeList) {
    this.freightFeeList = freightFeeList;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getBasePrice() {
    return this.basePrice;
    }
    public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
    }
    }