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

public class AliexpressAscpRoQueryReturnOrderQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 账套编码 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 退供单号 */
                @ApiField("return_order_no")
            private String returnOrderNo;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public String getReturnOrderNo() {
    return this.returnOrderNo;
    }
    public void setReturnOrderNo(String returnOrderNo) {
    this.returnOrderNo = returnOrderNo;
    }
    }