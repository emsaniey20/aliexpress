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

public class AliexpressInfluencerContentItemSearchItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品唯一标识 */
                @ApiField("item_id")
            private Integer itemId;
        /** 商品图片 */
                @ApiField("pic_url")
            private String picUrl;
        /** 佣金率 */
                @ApiField("commission_rate")
            private String commissionRate;
        /** 价格 */
                @ApiField("price")
            private String price;
        /** 商品短标题 */
                @ApiField("brief_title")
            private String briefTitle;
        /** 店铺标题 */
                @ApiField("shop_title")
            private String shopTitle;
        /** 商品标题 */
                @ApiField("title")
            private String title;
        /** 商品链接 */
                @ApiField("item_url")
            private String itemUrl;
    
        public Integer getItemId() {
    return this.itemId;
    }
    public void setItemId(Integer itemId) {
    this.itemId = itemId;
    }
        public String getPicUrl() {
    return this.picUrl;
    }
    public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
    }
        public String getCommissionRate() {
    return this.commissionRate;
    }
    public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
    }
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public String getBriefTitle() {
    return this.briefTitle;
    }
    public void setBriefTitle(String briefTitle) {
    this.briefTitle = briefTitle;
    }
        public String getShopTitle() {
    return this.shopTitle;
    }
    public void setShopTitle(String shopTitle) {
    this.shopTitle = shopTitle;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public String getItemUrl() {
    return this.itemUrl;
    }
    public void setItemUrl(String itemUrl) {
    this.itemUrl = itemUrl;
    }
    }