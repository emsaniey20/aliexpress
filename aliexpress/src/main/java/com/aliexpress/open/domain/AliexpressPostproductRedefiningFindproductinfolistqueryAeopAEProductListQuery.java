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

public class AliexpressPostproductRedefiningFindproductinfolistqueryAeopAEProductListQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 需要商品的当前页数。默认第一页。 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 被排除在外的商品id,查询结果不返回填入的产品，多个产品id以数组形式填入 */
                @ApiListField("excepted_product_ids")
            private List<Long> exceptedProductIds;
        /** 商品的剩余有效期。如果想查3天之内即将下架的商品，则offLineTime值为3。 */
                @ApiField("off_line_time")
            private Integer offLineTime;
        /** 商品所属人loginId */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** 每页查询商品数量。输入值小于100，默认20。 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 商品id搜索字段。 */
                @ApiField("product_id")
            private Long productId;
        /** 商品业务状态，目前提供6种，输入参数分别是：上架:onSelling ；下架:offline ；审核中:auditing ；审核不通过:editingRequired；客服删除:service_delete ; 所有删除商品：deleted； */
                @ApiField("product_status_type")
            private String productStatusType;
        /** 商品标题模糊搜索字段。只支持半角英数字，长度不超过128。 */
                @ApiField("subject")
            private String subject;
        /** 商品下架原因：expire_offline(过期下架)，user_offline(用户手工下架)、violate_offline(违规下架)、punish_offline(处罚下架)、degrade_offline(降级下架)、industry_offline(行业准入未续约下架) */
                @ApiField("ws_display")
            private String wsDisplay;
        /** 是否有差异化报价: y有 n无 */
                @ApiField("have_national_quote")
            private String haveNationalQuote;
        /** 商品分组搜索字段。输入商品分组id(groupId). */
                @ApiField("group_id")
            private Long groupId;
        /** 创建时间开始于，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_create_start")
            private String gmtCreateStart;
        /** 创建时间结束于，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_create_end")
            private String gmtCreateEnd;
        /** 修改时间开始于，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_modified_start")
            private String gmtModifiedStart;
        /** 修改时间结束于，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_modified_end")
            private String gmtModifiedEnd;
    
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
    }