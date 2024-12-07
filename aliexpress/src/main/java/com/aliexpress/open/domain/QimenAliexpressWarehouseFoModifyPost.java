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

public class QimenAliexpressWarehouseFoModifyPost implements Serializable {
    private static final long serialVersionUID = 1L;
        /** WMS仓库订单号 */
                @ApiField("wmsOrderId")
            private String wmsOrderId;
        /** 订单状态 */
                @ApiField("orderStatus")
            private String orderStatus;
        /** 物流追踪单号 */
                @ApiField("trackingNo")
            private String trackingNo;
    
        public String getWmsOrderId() {
    return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId) {
    this.wmsOrderId = wmsOrderId;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getTrackingNo() {
    return this.trackingNo;
    }
    public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
    }
    }