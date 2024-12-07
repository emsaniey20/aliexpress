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

public class AriseReverseOrderReturnUpdateOpenApiReturnRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 逆向子单 */
                @ApiListField("reverse_order_item_ids")
            private List<String> reverseOrderItemIds;
        /** 图片信息 */
                @ApiListField("image_infos")
            private List<AriseReverseOrderReturnUpdateOpenApiReturnRequest$ImageInfo> imageInfos;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 商家拒绝原因 */
                @ApiField("reason_id")
            private Long reasonId;
        /** 逆向主单 */
                @ApiField("reverse_order_id")
            private Long reverseOrderId;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel")
            private String channel;
        /** 操作 InstantRefund：买家发起申请后直接同意退款 agreeReturn：同意退货 refuseReturn：拒绝退货 agreeRefund：同意退款 refuseRefund：拒绝退款 confirmDelivery：确认收货 forwardToAgent：申请平台介入 */
                @ApiField("action")
            private String action;
        /** 否（当操作为forwardToAgent/refuseReturn/refuseRefund必填） */
                @ApiField("comment")
            private String comment;
    
        public List<String> getReverseOrderItemIds() {
    return this.reverseOrderItemIds;
    }
    public void setReverseOrderItemIds(List<String> reverseOrderItemIds) {
    this.reverseOrderItemIds = reverseOrderItemIds;
    }
        public List<AriseReverseOrderReturnUpdateOpenApiReturnRequest$ImageInfo> getImageInfos() {
    return this.imageInfos;
    }
    public void setImageInfos(List<AriseReverseOrderReturnUpdateOpenApiReturnRequest$ImageInfo> imageInfos) {
    this.imageInfos = imageInfos;
    }
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public Long getReasonId() {
    return this.reasonId;
    }
    public void setReasonId(Long reasonId) {
    this.reasonId = reasonId;
    }
        public Long getReverseOrderId() {
    return this.reverseOrderId;
    }
    public void setReverseOrderId(Long reverseOrderId) {
    this.reverseOrderId = reverseOrderId;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public String getAction() {
    return this.action;
    }
    public void setAction(String action) {
    this.action = action;
    }
        public String getComment() {
    return this.comment;
    }
    public void setComment(String comment) {
    this.comment = comment;
    }
    }