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

public class AliexpressAscpFfoItemQueryFulfillmentForwardOrderItemQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 账套编码 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 履约单号 */
                @ApiField("fulfillment_order_no")
            private String fulfillmentOrderNo;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public String getFulfillmentOrderNo() {
    return this.fulfillmentOrderNo;
    }
    public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
    this.fulfillmentOrderNo = fulfillmentOrderNo;
    }
    }