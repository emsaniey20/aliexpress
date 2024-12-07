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

public class AliexpressOfferDraftproductsGetAeopAEProductDisplaySampleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卡券商品结束有效期 */
                @ApiField("coupon_end_date")
            private String couponEndDate;
        /** 卡券商品开始有效期 */
                @ApiField("coupon_start_date")
            private String couponStartDate;
        /** 货币单位 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 产品关联的运费模版ID */
                @ApiField("freight_template_id")
            private Integer freightTemplateId;
        /** 产品发布时间。 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 商品最后更新时间 （系统更新时间也会记录）。 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 图片URL.静态单图主图个数为1,动态多图主图个数为2-6. 多个图片url用‘;’分隔符连接。 */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** 商品所属人loginId */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** 商品所属人Seq */
                @ApiField("owner_member_seq")
            private Integer ownerMemberSeq;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 最大价格。 */
                @ApiField("product_max_price")
            private String productMaxPrice;
        /** 最小价格。 */
                @ApiField("product_min_price")
            private String productMinPrice;
        /** 产品来源。'tdx'为淘宝代销产品，'1688'为1688分销商品，'isv'为通过API发布的商品。其他字符或空为普通产品。 */
                @ApiField("src")
            private String src;
        /** 商品标题 */
                @ApiField("subject")
            private String subject;
        /** 产品来源的详情地址，目前仅支持1688 */
                @ApiField("src_detail_url")
            private String srcDetailUrl;
    
        public String getCouponEndDate() {
    return this.couponEndDate;
    }
    public void setCouponEndDate(String couponEndDate) {
    this.couponEndDate = couponEndDate;
    }
        public String getCouponStartDate() {
    return this.couponStartDate;
    }
    public void setCouponStartDate(String couponStartDate) {
    this.couponStartDate = couponStartDate;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Integer getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Integer freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getImageURLs() {
    return this.imageURLs;
    }
    public void setImageURLs(String imageURLs) {
    this.imageURLs = imageURLs;
    }
        public String getOwnerMemberId() {
    return this.ownerMemberId;
    }
    public void setOwnerMemberId(String ownerMemberId) {
    this.ownerMemberId = ownerMemberId;
    }
        public Integer getOwnerMemberSeq() {
    return this.ownerMemberSeq;
    }
    public void setOwnerMemberSeq(Integer ownerMemberSeq) {
    this.ownerMemberSeq = ownerMemberSeq;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductMaxPrice() {
    return this.productMaxPrice;
    }
    public void setProductMaxPrice(String productMaxPrice) {
    this.productMaxPrice = productMaxPrice;
    }
        public String getProductMinPrice() {
    return this.productMinPrice;
    }
    public void setProductMinPrice(String productMinPrice) {
    this.productMinPrice = productMinPrice;
    }
        public String getSrc() {
    return this.src;
    }
    public void setSrc(String src) {
    this.src = src;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getSrcDetailUrl() {
    return this.srcDetailUrl;
    }
    public void setSrcDetailUrl(String srcDetailUrl) {
    this.srcDetailUrl = srcDetailUrl;
    }
    }