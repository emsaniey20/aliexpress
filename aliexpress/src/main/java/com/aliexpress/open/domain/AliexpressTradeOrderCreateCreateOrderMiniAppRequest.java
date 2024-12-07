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

public class AliexpressTradeOrderCreateCreateOrderMiniAppRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总价 */
                @ApiField("total")
            private AliexpressTradeOrderCreatePrice total;
        /** 物流服务商 */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** 用户openId */
                @ApiField("open_id")
            private String openId;
        /** 外部订单ID */
                @ApiField("out_id")
            private String outId;
        /** AE地址组件的地址ID */
                @ApiField("address_id")
            private Long addressId;
    
        public AliexpressTradeOrderCreatePrice getTotal() {
    return this.total;
    }
    public void setTotal(AliexpressTradeOrderCreatePrice total) {
    this.total = total;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public String getOpenId() {
    return this.openId;
    }
    public void setOpenId(String openId) {
    this.openId = openId;
    }
        public String getOutId() {
    return this.outId;
    }
    public void setOutId(String outId) {
    this.outId = outId;
    }
        public Long getAddressId() {
    return this.addressId;
    }
    public void setAddressId(Long addressId) {
    this.addressId = addressId;
    }
    }