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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpLogisticInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 妥投时间（此时间为美国太平洋时间） */
                @ApiField("gmt_received")
            private String gmtReceived;
        /** 发货时间（此时间为美国太平洋时间） */
                @ApiField("gmt_send")
            private String gmtSend;
        /** 是否可获取物流追踪信息 */
                @ApiField("have_tracking_info")
            private Boolean haveTrackingInfo;
        /** 物流追踪号 */
                @ApiField("logistics_no")
            private String logisticsNo;
        /** 发货物流服务展示线路英文名称 */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** 物流服务名称key(与声明发货中的service_name相同) */
                @ApiField("logistics_type_code")
            private String logisticsTypeCode;
        /** 投递状态。(default:初始值; received:已经妥投; not_received:没有妥投; suspected_received:疑似妥投) */
                @ApiField("receive_status")
            private String receiveStatus;
        /** 未妥投原因，如国家/地区不匹配 */
                @ApiField("recv_status_desc")
            private String recvStatusDesc;
        /** 物流订单ID */
                @ApiField("ship_order_id")
            private Long shipOrderId;
    
        public String getGmtReceived() {
    return this.gmtReceived;
    }
    public void setGmtReceived(String gmtReceived) {
    this.gmtReceived = gmtReceived;
    }
        public String getGmtSend() {
    return this.gmtSend;
    }
    public void setGmtSend(String gmtSend) {
    this.gmtSend = gmtSend;
    }
        public Boolean getHaveTrackingInfo() {
    return this.haveTrackingInfo;
    }
    public void setHaveTrackingInfo(Boolean haveTrackingInfo) {
    this.haveTrackingInfo = haveTrackingInfo;
    }
        public String getLogisticsNo() {
    return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo) {
    this.logisticsNo = logisticsNo;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
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
        public String getRecvStatusDesc() {
    return this.recvStatusDesc;
    }
    public void setRecvStatusDesc(String recvStatusDesc) {
    this.recvStatusDesc = recvStatusDesc;
    }
        public Long getShipOrderId() {
    return this.shipOrderId;
    }
    public void setShipOrderId(Long shipOrderId) {
    this.shipOrderId = shipOrderId;
    }
    }