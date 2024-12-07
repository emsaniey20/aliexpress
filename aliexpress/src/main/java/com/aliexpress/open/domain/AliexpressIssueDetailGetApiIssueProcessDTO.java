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

public class AliexpressIssueDetailGetApiIssueProcessDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 操作类型 发起纠纷initiate取消纠纷，cancel买家取消纠纷, 买家同意方案buyer_accept,卖家同意方案seller_accept,买家拒绝方案buyer_refuse, 买家创建方案buyer_create_solution, 买家修改方案buyer_modify_solution,买家删除方案buyer_delete_solution,卖家创建方案seller_create_solution,卖家修改方案seller_modify_solution,卖家删除方案seller_delete_solution */
                @ApiField("action_type")
            private String actionType;
        /** 图片附件 */
                @ApiListField("attachments")
            private List<AliexpressIssueDetailGetApiAttachmentDTO> attachments;
        /** 过程context,eg:buyer提起填写内容,seller拒绝填写内容 */
                @ApiField("content")
            private String content;
        /** 创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 是否有buyer视频(淘宝视频必须授权才能播放,目前不支持) */
                @ApiField("has_buyer_video")
            private Boolean hasBuyerVideo;
        /** 是否有seller视频(淘宝视频必须授权才能播放,目前不支持) */
                @ApiField("has_seller_video")
            private Boolean hasSellerVideo;
        /** 过程id：过期字段，已经不返回。请忽略。 */
                @ApiField("id")
            private Long id;
        /** issueId */
                @ApiField("issue_id")
            private Long issueId;
        /** 是否收到货 */
                @ApiField("receive_goods")
            private Boolean receiveGoods;
        /** 操作人类型：seller卖家，buyer买家，waiter客服，system */
                @ApiField("submit_member_type")
            private String submitMemberType;
    
        public String getActionType() {
    return this.actionType;
    }
    public void setActionType(String actionType) {
    this.actionType = actionType;
    }
        public List<AliexpressIssueDetailGetApiAttachmentDTO> getAttachments() {
    return this.attachments;
    }
    public void setAttachments(List<AliexpressIssueDetailGetApiAttachmentDTO> attachments) {
    this.attachments = attachments;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public Boolean getHasBuyerVideo() {
    return this.hasBuyerVideo;
    }
    public void setHasBuyerVideo(Boolean hasBuyerVideo) {
    this.hasBuyerVideo = hasBuyerVideo;
    }
        public Boolean getHasSellerVideo() {
    return this.hasSellerVideo;
    }
    public void setHasSellerVideo(Boolean hasSellerVideo) {
    this.hasSellerVideo = hasSellerVideo;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public Long getIssueId() {
    return this.issueId;
    }
    public void setIssueId(Long issueId) {
    this.issueId = issueId;
    }
        public Boolean getReceiveGoods() {
    return this.receiveGoods;
    }
    public void setReceiveGoods(Boolean receiveGoods) {
    this.receiveGoods = receiveGoods;
    }
        public String getSubmitMemberType() {
    return this.submitMemberType;
    }
    public void setSubmitMemberType(String submitMemberType) {
    this.submitMemberType = submitMemberType;
    }
    }