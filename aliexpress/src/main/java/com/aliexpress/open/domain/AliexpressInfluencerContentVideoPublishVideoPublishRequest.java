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

public class AliexpressInfluencerContentVideoPublishVideoPublishRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 视频资源标识符 */
                @ApiField("video_resource_id")
            private String videoResourceId;
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
            private List<AliexpressInfluencerContentVideoPublishContentHashtagDTO> hashtags;
        /** 关联商品，最多5个 */
                @ApiListField("items")
            private List<AliexpressInfluencerContentVideoPublishContentItemDTO> items;
        /** 关联的外部商品，最多15个 */
                @ApiListField("external_items")
            private List<AliexpressInfluencerContentVideoPublishExternalItemDTO> externalItems;
        /** 扩展信息 */
                @ApiField("attributes")
            private HashMap<String, Object> attributes;
        /** 邮箱 */
                @ApiField("email")
            private String email;
    
        public String getVideoResourceId() {
    return this.videoResourceId;
    }
    public void setVideoResourceId(String videoResourceId) {
    this.videoResourceId = videoResourceId;
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
        public List<AliexpressInfluencerContentVideoPublishContentHashtagDTO> getHashtags() {
    return this.hashtags;
    }
    public void setHashtags(List<AliexpressInfluencerContentVideoPublishContentHashtagDTO> hashtags) {
    this.hashtags = hashtags;
    }
        public List<AliexpressInfluencerContentVideoPublishContentItemDTO> getItems() {
    return this.items;
    }
    public void setItems(List<AliexpressInfluencerContentVideoPublishContentItemDTO> items) {
    this.items = items;
    }
        public List<AliexpressInfluencerContentVideoPublishExternalItemDTO> getExternalItems() {
    return this.externalItems;
    }
    public void setExternalItems(List<AliexpressInfluencerContentVideoPublishExternalItemDTO> externalItems) {
    this.externalItems = externalItems;
    }
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
    }