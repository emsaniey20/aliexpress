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

public class CainiaoGlobalHandoverContentQueryOpenSlaveBagDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 交接物物流订单编号 */
                @ApiField("order_code")
            private String orderCode;
        /** 交接物运单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
        /** 状态 */
                @ApiField("status")
            private String status;
        /** 状态名 */
                @ApiField("status_name")
            private String statusName;
        /** 揽收失败时的实操回传备注 */
                @ApiField("op_remark")
            private String opRemark;
        /** 交接id */
                @ApiField("order_content_id")
            private Long orderContentId;
        /** 创建时间戳 */
                @ApiField("gmt_create")
            private String gmtCreate;
    
        public String getOrderCode() {
    return this.orderCode;
    }
    public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getStatusName() {
    return this.statusName;
    }
    public void setStatusName(String statusName) {
    this.statusName = statusName;
    }
        public String getOpRemark() {
    return this.opRemark;
    }
    public void setOpRemark(String opRemark) {
    this.opRemark = opRemark;
    }
        public Long getOrderContentId() {
    return this.orderContentId;
    }
    public void setOrderContentId(Long orderContentId) {
    this.orderContentId = orderContentId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
    }