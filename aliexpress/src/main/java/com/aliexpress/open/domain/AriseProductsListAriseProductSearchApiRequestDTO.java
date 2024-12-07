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

public class AriseProductsListAriseProductSearchApiRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 当前页码 */
                @ApiField("current_page")
            private Long currentPage;
        /** 创建时间范围（指定时间之后） case：2022-07-13 16:41:00 */
                @ApiField("create_after")
            private String createAfter;
        /** 商品业务状态，目前提供5种，输入参数分别是：全部商品:all_exclude_delete（默认状态）上架:onSelling ；下架:inactive ；审核中:auditing ；平台下架:suspend；已删除:deleted； */
                @ApiField("product_status")
            private String productStatus;
        /** 每页商品数量 */
                @ApiField("page_size")
            private Long pageSize;
        /** 商品渠道 */
                @ApiField("channel")
            private String channel;
        /** 更新时间范围（指定时间之前） case：2022-07-13 16:41:00 */
                @ApiField("update_before")
            private String updateBefore;
        /** 渠道卖家ID */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 创建时间范围（指定时间之前） case：2022-07-13 16:41:00 */
                @ApiField("create_before")
            private String createBefore;
        /** 更新时间范围（指定时间之后） case：2022-07-13 16:41:00 */
                @ApiField("update_after")
            private String updateAfter;
        /** 其他过滤选项 json形式字符串 。productId": 商品ID     "leafCategoryId": 商品所属类目ID   case ：{     "productId":1355778035659611,     "leafCategoryId":123 } */
                @ApiField("options")
            private String options;
    
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
        public String getCreateAfter() {
    return this.createAfter;
    }
    public void setCreateAfter(String createAfter) {
    this.createAfter = createAfter;
    }
        public String getProductStatus() {
    return this.productStatus;
    }
    public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public String getUpdateBefore() {
    return this.updateBefore;
    }
    public void setUpdateBefore(String updateBefore) {
    this.updateBefore = updateBefore;
    }
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public String getCreateBefore() {
    return this.createBefore;
    }
    public void setCreateBefore(String createBefore) {
    this.createBefore = createBefore;
    }
        public String getUpdateAfter() {
    return this.updateAfter;
    }
    public void setUpdateAfter(String updateAfter) {
    this.updateAfter = updateAfter;
    }
        public String getOptions() {
    return this.options;
    }
    public void setOptions(String options) {
    this.options = options;
    }
    }