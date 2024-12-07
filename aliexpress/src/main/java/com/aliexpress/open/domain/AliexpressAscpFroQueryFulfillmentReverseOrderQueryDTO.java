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

public class AliexpressAscpFroQueryFulfillmentReverseOrderQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 账套编码 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 用户订单号列表 */
                @ApiListField("customer_order_number_list")
            private List<String> customerOrderNumberList;
        /** 履约单号 */
                @ApiField("fulfillment_order_no")
            private String fulfillmentOrderNo;
        /** 分页页码 */
                @ApiField("page_index")
            private Long pageIndex;
        /** 分页大小 */
                @ApiField("page_size")
            private Long pageSize;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public List<String> getCustomerOrderNumberList() {
    return this.customerOrderNumberList;
    }
    public void setCustomerOrderNumberList(List<String> customerOrderNumberList) {
    this.customerOrderNumberList = customerOrderNumberList;
    }
        public String getFulfillmentOrderNo() {
    return this.fulfillmentOrderNo;
    }
    public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
    this.fulfillmentOrderNo = fulfillmentOrderNo;
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
    }