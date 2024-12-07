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

public class AliexpressOfferRedefiningInitialnewbundleAeopBundleSubItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 搭配商品主图 */
                @ApiListField("image_list")
            private List<String> imageList;
        /** 搭配商品ID */
                @ApiField("item_id")
            private Long itemId;
        /** 搭配商品排列顺序 */
                @ApiField("order")
            private Integer order;
        /** sku列表 */
                @ApiListField("sku_list")
            private List<AliexpressOfferRedefiningInitialnewbundleAeopBundleItemSku> skuList;
        /** 搭配商品标题 */
                @ApiField("subject")
            private String subject;
    
        public List<String> getImageList() {
    return this.imageList;
    }
    public void setImageList(List<String> imageList) {
    this.imageList = imageList;
    }
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
        public Integer getOrder() {
    return this.order;
    }
    public void setOrder(Integer order) {
    this.order = order;
    }
        public List<AliexpressOfferRedefiningInitialnewbundleAeopBundleItemSku> getSkuList() {
    return this.skuList;
    }
    public void setSkuList(List<AliexpressOfferRedefiningInitialnewbundleAeopBundleItemSku> skuList) {
    this.skuList = skuList;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
    }