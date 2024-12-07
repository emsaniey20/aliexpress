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

public class AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpOperationLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** id */
                @ApiField("id")
            private Long id;
        /** order modification time */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** buyer memo */
                @ApiField("memo")
            private String memo;
        /** action type */
                @ApiField("action_type")
            private String actionType;
        /** child order ID */
                @ApiField("child_order_id")
            private Long childOrderId;
        /** operator */
                @ApiField("operator")
            private String operator;
        /** order ID */
                @ApiField("order_id")
            private Long orderId;
        /** order creation time */
                @ApiField("gmt_create")
            private String gmtCreate;
    
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public String getActionType() {
    return this.actionType;
    }
    public void setActionType(String actionType) {
    this.actionType = actionType;
    }
        public Long getChildOrderId() {
    return this.childOrderId;
    }
    public void setChildOrderId(Long childOrderId) {
    this.childOrderId = childOrderId;
    }
        public String getOperator() {
    return this.operator;
    }
    public void setOperator(String operator) {
    this.operator = operator;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
    }