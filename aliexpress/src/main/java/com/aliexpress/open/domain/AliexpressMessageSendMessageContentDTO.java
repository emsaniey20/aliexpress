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

public class AliexpressMessageSendMessageContentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片url */
                @ApiField("img_url")
            private String imgUrl;
        /** 消息内容 */
                @ApiField("txt")
            private String txt;
        /** 商品id */
                @ApiField("item_id")
            private String itemId;
        /** 订单id */
                @ApiField("order_id")
            private String orderId;
        /** 图片宽度 */
                @ApiField("width")
            private Integer width;
        /** 营销id */
                @ApiField("promotion_id")
            private String promotionId;
        /** 图片高度 */
                @ApiField("height")
            private Integer height;
    
        public String getImgUrl() {
    return this.imgUrl;
    }
    public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    }
        public String getTxt() {
    return this.txt;
    }
    public void setTxt(String txt) {
    this.txt = txt;
    }
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public String getOrderId() {
    return this.orderId;
    }
    public void setOrderId(String orderId) {
    this.orderId = orderId;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public String getPromotionId() {
    return this.promotionId;
    }
    public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
    }