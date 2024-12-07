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

public class GlobalProductUpdateProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku日常促销价 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** 销售属性模块 */
                @ApiListField("sku_property_list")
            private List<GlobalProductUpdateSKUProperty> skuPropertyList;
        /** sku价格  	 */
                @ApiField("sku_price")
            private String skuPrice;
        /** sku库存，该属性值的合理取值范围为0~999999，如该商品有SKU时，请确保至少有一个SKU是有货状态 */
                @ApiField("sku_stock")
            private Long skuStock;
        /** 渠道价格库存信息。 */
                @ApiListField("channel_sku_list")
            private List<GlobalProductUpdateCspChannelSkuApiDTO> channelSkuList;
        /** sku套图 */
                @ApiListField("image_list")
            private List<String> imageList;
        /** 统一sku_id */
                @ApiField("sku_id")
            private Long skuId;
        /** Sku商家编码。 格式:半角英数字,长度20,不包含空格大于号和小于号。 */
                @ApiField("sku_code")
            private String skuCode;
        /** 女装类目色卡图 */
                @ApiField("colour_image")
            private String colourImage;
    
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public List<GlobalProductUpdateSKUProperty> getSkuPropertyList() {
    return this.skuPropertyList;
    }
    public void setSkuPropertyList(List<GlobalProductUpdateSKUProperty> skuPropertyList) {
    this.skuPropertyList = skuPropertyList;
    }
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public Long getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Long skuStock) {
    this.skuStock = skuStock;
    }
        public List<GlobalProductUpdateCspChannelSkuApiDTO> getChannelSkuList() {
    return this.channelSkuList;
    }
    public void setChannelSkuList(List<GlobalProductUpdateCspChannelSkuApiDTO> channelSkuList) {
    this.channelSkuList = channelSkuList;
    }
        public List<String> getImageList() {
    return this.imageList;
    }
    public void setImageList(List<String> imageList) {
    this.imageList = imageList;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getColourImage() {
    return this.colourImage;
    }
    public void setColourImage(String colourImage) {
    this.colourImage = colourImage;
    }
    }