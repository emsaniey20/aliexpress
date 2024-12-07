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

public class AliexpressSolutionProductListGetItemListQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Current page of products to be needed. The default page is page 1. */
                @ApiField("current_page")
            private Integer currentPage;
        /** Product Ids which needs to be excluded */
                @ApiListField("excepted_product_ids")
            private List<Long> exceptedProductIds;
        /** Search field by expiration date. For example, if the value for expiration date is 3, it means to query products to be offline within 3 days. */
                @ApiField("off_line_time")
            private Integer offLineTime;
        /** Login ID of product owner */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** Number of products to be queried at each page. The input value must be less than 100, the default value of which is 20. */
                @ApiField("page_size")
            private Integer pageSize;
        /** product id */
                @ApiField("product_id")
            private Long productId;
        /** onSelling	Product operation status. Currently, it is divided into 4 types with the following input parameters respectively: onSelling; offline; auditing; and editingRequired. */
                @ApiField("product_status_type")
            private String productStatusType;
        /** Fuzzy search field by product subject. It only supports half-width numbers in English with a length not more than 128. */
                @ApiField("subject")
            private String subject;
        /** Reasons for product offline: expire_offline; user_offline; violate_offline; punish_offline; and degrade_offline. */
                @ApiField("ws_display")
            private String wsDisplay;
        /** Whether having national quotation. "y" for yes, "n" for no. */
                @ApiField("have_national_quote")
            private String haveNationalQuote;
        /** Search field by product groups. Enter product group id (groupId). */
                @ApiField("group_id")
            private Long groupId;
        /** Search for products created after a specific time, format: yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_create_start")
            private String gmtCreateStart;
        /** Search for products created before a specific time，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_create_end")
            private String gmtCreateEnd;
        /** Search for product modified after a specific time，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_modified_start")
            private String gmtModifiedStart;
        /** Search for products modified before a specific time，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_modified_end")
            private String gmtModifiedEnd;
        /** merchant sku code */
                @ApiField("sku_code")
            private String skuCode;
    
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public List<Long> getExceptedProductIds() {
    return this.exceptedProductIds;
    }
    public void setExceptedProductIds(List<Long> exceptedProductIds) {
    this.exceptedProductIds = exceptedProductIds;
    }
        public Integer getOffLineTime() {
    return this.offLineTime;
    }
    public void setOffLineTime(Integer offLineTime) {
    this.offLineTime = offLineTime;
    }
        public String getOwnerMemberId() {
    return this.ownerMemberId;
    }
    public void setOwnerMemberId(String ownerMemberId) {
    this.ownerMemberId = ownerMemberId;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductStatusType() {
    return this.productStatusType;
    }
    public void setProductStatusType(String productStatusType) {
    this.productStatusType = productStatusType;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getWsDisplay() {
    return this.wsDisplay;
    }
    public void setWsDisplay(String wsDisplay) {
    this.wsDisplay = wsDisplay;
    }
        public String getHaveNationalQuote() {
    return this.haveNationalQuote;
    }
    public void setHaveNationalQuote(String haveNationalQuote) {
    this.haveNationalQuote = haveNationalQuote;
    }
        public Long getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Long groupId) {
    this.groupId = groupId;
    }
        public String getGmtCreateStart() {
    return this.gmtCreateStart;
    }
    public void setGmtCreateStart(String gmtCreateStart) {
    this.gmtCreateStart = gmtCreateStart;
    }
        public String getGmtCreateEnd() {
    return this.gmtCreateEnd;
    }
    public void setGmtCreateEnd(String gmtCreateEnd) {
    this.gmtCreateEnd = gmtCreateEnd;
    }
        public String getGmtModifiedStart() {
    return this.gmtModifiedStart;
    }
    public void setGmtModifiedStart(String gmtModifiedStart) {
    this.gmtModifiedStart = gmtModifiedStart;
    }
        public String getGmtModifiedEnd() {
    return this.gmtModifiedEnd;
    }
    public void setGmtModifiedEnd(String gmtModifiedEnd) {
    this.gmtModifiedEnd = gmtModifiedEnd;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
    }