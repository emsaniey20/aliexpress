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

public class AliexpressLogisticsQuerysellershipmentinfoAeopSellerShipmentSubTradeOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** errorCode */
                @ApiField("error_code")
            private String errorCode;
        /** sendType */
                @ApiField("send_type")
            private String sendType;
        /** errorMsg */
                @ApiField("error_msg")
            private String errorMsg;
        /** subTradeOrderIndex */
                @ApiField("sub_trade_order_index")
            private Long subTradeOrderIndex;
        /** shipmentList */
                @ApiListField("shipment_list")
            private List<AliexpressLogisticsQuerysellershipmentinfoAeopShipmentDTO> shipmentList;
    
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getSendType() {
    return this.sendType;
    }
    public void setSendType(String sendType) {
    this.sendType = sendType;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public Long getSubTradeOrderIndex() {
    return this.subTradeOrderIndex;
    }
    public void setSubTradeOrderIndex(Long subTradeOrderIndex) {
    this.subTradeOrderIndex = subTradeOrderIndex;
    }
        public List<AliexpressLogisticsQuerysellershipmentinfoAeopShipmentDTO> getShipmentList() {
    return this.shipmentList;
    }
    public void setShipmentList(List<AliexpressLogisticsQuerysellershipmentinfoAeopShipmentDTO> shipmentList) {
    this.shipmentList = shipmentList;
    }
    }