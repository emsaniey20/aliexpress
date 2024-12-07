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

public class AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 子交易单列表 */
                @ApiListField("sub_trade_order_list")
            private List<AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 交易单号 */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
    
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public List<AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderDTO> getSubTradeOrderList() {
    return this.subTradeOrderList;
    }
    public void setSubTradeOrderList(List<AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList) {
    this.subTradeOrderList = subTradeOrderList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
    }