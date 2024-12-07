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

public class AliexpressAscpPoItemQueryPurchaseOrderItemQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** 业务租户Id，全托管 场景请填写 5110000, choice2.0(AEG)场景填: 288000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 分页页码 */
                @ApiField("page_index")
            private Long pageIndex;
        /** 分页大小 */
                @ApiField("page_size")
            private Long pageSize;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
    
        public Long getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(Long channelUserId) {
    this.channelUserId = channelUserId;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Long getPageIndex() {
    return this.pageIndex;
    }
    public void setPageIndex(Long pageIndex) {
    this.pageIndex = pageIndex;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
    }