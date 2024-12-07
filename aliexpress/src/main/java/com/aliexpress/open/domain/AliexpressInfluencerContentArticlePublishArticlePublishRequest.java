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

public class AliexpressInfluencerContentArticlePublishArticlePublishRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 扩展信息 */
                @ApiField("attributes")
            private HashMap<String, Object> attributes;
        /** 邮箱 */
                @ApiField("email")
            private String email;
        /** 图片资源标识符，最多9个 */
                @ApiListField("image_resource_ids")
            private List<String> imageResourceIds;
        /** 封面资源标识符 */
                @ApiField("cover_img_resource_id")
            private String coverImgResourceId;
        /** 语言_国家 */
                @ApiField("locale")
            private String locale;
        /** 货币 */
                @ApiField("currency")
            private String currency;
        /** 帖子内容 */
                @ApiField("content")
            private String content;
        /** hashtag */
                @ApiListField("hashtags")
            private List<AliexpressInfluencerContentArticlePublishContentHashtagDTO> hashtags;
        /** 关联商品，最多5个 */
                @ApiListField("items")
            private List<AliexpressInfluencerContentArticlePublishContentItemDTO> items;
        /** 关联的外部商品，最多15个 */
                @ApiListField("external_items")
            private List<AliexpressInfluencerContentArticlePublishExternalItemDTO> externalItems;
    
        public HashMap<String, Object> getAttributes() {
    return this.attributes;
    }
    public void setAttributes(HashMap<String, Object> attributes) {
    this.attributes = attributes;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public List<String> getImageResourceIds() {
    return this.imageResourceIds;
    }
    public void setImageResourceIds(List<String> imageResourceIds) {
    this.imageResourceIds = imageResourceIds;
    }
        public String getCoverImgResourceId() {
    return this.coverImgResourceId;
    }
    public void setCoverImgResourceId(String coverImgResourceId) {
    this.coverImgResourceId = coverImgResourceId;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
        public List<AliexpressInfluencerContentArticlePublishContentHashtagDTO> getHashtags() {
    return this.hashtags;
    }
    public void setHashtags(List<AliexpressInfluencerContentArticlePublishContentHashtagDTO> hashtags) {
    this.hashtags = hashtags;
    }
        public List<AliexpressInfluencerContentArticlePublishContentItemDTO> getItems() {
    return this.items;
    }
    public void setItems(List<AliexpressInfluencerContentArticlePublishContentItemDTO> items) {
    this.items = items;
    }
        public List<AliexpressInfluencerContentArticlePublishExternalItemDTO> getExternalItems() {
    return this.externalItems;
    }
    public void setExternalItems(List<AliexpressInfluencerContentArticlePublishExternalItemDTO> externalItems) {
    this.externalItems = externalItems;
    }
    }