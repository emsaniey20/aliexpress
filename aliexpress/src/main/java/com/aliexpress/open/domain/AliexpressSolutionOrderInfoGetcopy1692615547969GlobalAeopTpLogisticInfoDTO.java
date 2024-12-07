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

public class AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpLogisticInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** logistics tracking number */
                @ApiField("logistics_no")
            private String logisticsNo;
        /** to get logistics tracking information */
                @ApiField("have_tracking_info")
            private Boolean haveTrackingInfo;
        /** un-receive reason,such as Country does not match */
                @ApiField("recv_status_desc")
            private String recvStatusDesc;
        /** logistics service show name */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** ship order id */
                @ApiField("ship_order_id")
            private Long shipOrderId;
        /** send time */
                @ApiField("gmt_send")
            private String gmtSend;
        /** received time */
                @ApiField("gmt_received")
            private String gmtReceived;
        /** logistics service name key */
                @ApiField("logistics_type_code")
            private String logisticsTypeCode;
        /** receive status。(default:initial value; received:; not_received; suspected_received) */
                @ApiField("receive_status")
            private String receiveStatus;
    
        public String getLogisticsNo() {
    return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo) {
    this.logisticsNo = logisticsNo;
    }
        public Boolean getHaveTrackingInfo() {
    return this.haveTrackingInfo;
    }
    public void setHaveTrackingInfo(Boolean haveTrackingInfo) {
    this.haveTrackingInfo = haveTrackingInfo;
    }
        public String getRecvStatusDesc() {
    return this.recvStatusDesc;
    }
    public void setRecvStatusDesc(String recvStatusDesc) {
    this.recvStatusDesc = recvStatusDesc;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public Long getShipOrderId() {
    return this.shipOrderId;
    }
    public void setShipOrderId(Long shipOrderId) {
    this.shipOrderId = shipOrderId;
    }
        public String getGmtSend() {
    return this.gmtSend;
    }
    public void setGmtSend(String gmtSend) {
    this.gmtSend = gmtSend;
    }
        public String getGmtReceived() {
    return this.gmtReceived;
    }
    public void setGmtReceived(String gmtReceived) {
    this.gmtReceived = gmtReceived;
    }
        public String getLogisticsTypeCode() {
    return this.logisticsTypeCode;
    }
    public void setLogisticsTypeCode(String logisticsTypeCode) {
    this.logisticsTypeCode = logisticsTypeCode;
    }
        public String getReceiveStatus() {
    return this.receiveStatus;
    }
    public void setReceiveStatus(String receiveStatus) {
    this.receiveStatus = receiveStatus;
    }
    }