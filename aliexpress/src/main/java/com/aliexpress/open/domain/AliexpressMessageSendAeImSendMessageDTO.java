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

public class AliexpressMessageSendAeImSendMessageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 发送消息是否仅买家可见 true：仅买家可见 flase或不传：双方可见 */
                @ApiField("only_for_target")
            private Boolean onlyForTarget;
        /** 场景id  1：基础接待 2：智能客服接待 3：自动催拍 4：自动催付 5：弃单挽回 6：物流呵护 */
                @ApiField("scene_id")
            private Integer sceneId;
        /** 消息模版id  1： 正常文本消息 3： 图片消息 10006：表示商品卡片 10007：表示订单卡片 21004：优惠券卡片 */
                @ApiField("template_id")
            private Long templateId;
        /** 买家id */
                @ApiField("buyer_id")
            private Long buyerId;
        /** 消息内容请求体 */
                @ApiField("message_content_dto")
            private AliexpressMessageSendMessageContentDTO messageContentDto;
    
        public Boolean getOnlyForTarget() {
    return this.onlyForTarget;
    }
    public void setOnlyForTarget(Boolean onlyForTarget) {
    this.onlyForTarget = onlyForTarget;
    }
        public Integer getSceneId() {
    return this.sceneId;
    }
    public void setSceneId(Integer sceneId) {
    this.sceneId = sceneId;
    }
        public Long getTemplateId() {
    return this.templateId;
    }
    public void setTemplateId(Long templateId) {
    this.templateId = templateId;
    }
        public Long getBuyerId() {
    return this.buyerId;
    }
    public void setBuyerId(Long buyerId) {
    this.buyerId = buyerId;
    }
        public AliexpressMessageSendMessageContentDTO getMessageContentDto() {
    return this.messageContentDto;
    }
    public void setMessageContentDto(AliexpressMessageSendMessageContentDTO messageContentDto) {
    this.messageContentDto = messageContentDto;
    }
    }