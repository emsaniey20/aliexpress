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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLogisticInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("have_tracking_info")
            private String haveTrackingInfo;
        /** 1 */
                @ApiField("ship_order_id")
            private String shipOrderId;
        /** 1 */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** 1 */
                @ApiField("logistics_no")
            private String logisticsNo;
        /** 1 */
                @ApiField("receive_status")
            private String receiveStatus;
        /** 1 */
                @ApiField("recv_status_desc")
            private String recvStatusDesc;
        /** 1 */
                @ApiField("gmt_send")
            private String gmtSend;
        /** 1 */
                @ApiField("logistics_type_code")
            private String logisticsTypeCode;
        /** 1 */
                @ApiField("gmt_received")
            private String gmtReceived;
    
        public String getHaveTrackingInfo() {
    return this.haveTrackingInfo;
    }
    public void setHaveTrackingInfo(String haveTrackingInfo) {
    this.haveTrackingInfo = haveTrackingInfo;
    }
        public String getShipOrderId() {
    return this.shipOrderId;
    }
    public void setShipOrderId(String shipOrderId) {
    this.shipOrderId = shipOrderId;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public String getLogisticsNo() {
    return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo) {
    this.logisticsNo = logisticsNo;
    }
        public String getReceiveStatus() {
    return this.receiveStatus;
    }
    public void setReceiveStatus(String receiveStatus) {
    this.receiveStatus = receiveStatus;
    }
        public String getRecvStatusDesc() {
    return this.recvStatusDesc;
    }
    public void setRecvStatusDesc(String recvStatusDesc) {
    this.recvStatusDesc = recvStatusDesc;
    }
        public String getGmtSend() {
    return this.gmtSend;
    }
    public void setGmtSend(String gmtSend) {
    this.gmtSend = gmtSend;
    }
        public String getLogisticsTypeCode() {
    return this.logisticsTypeCode;
    }
    public void setLogisticsTypeCode(String logisticsTypeCode) {
    this.logisticsTypeCode = logisticsTypeCode;
    }
        public String getGmtReceived() {
    return this.gmtReceived;
    }
    public void setGmtReceived(String gmtReceived) {
    this.gmtReceived = gmtReceived;
    }
    }