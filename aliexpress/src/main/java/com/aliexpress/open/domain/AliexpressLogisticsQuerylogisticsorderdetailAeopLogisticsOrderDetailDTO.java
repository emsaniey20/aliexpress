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

public class AliexpressLogisticsQuerylogisticsorderdetailAeopLogisticsOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 物流单超时关单时间（1.从物流单创建时间起，30天内可以查询到该字段； 2. 仅支持4PL线上创建的物流单查询超时关单时间）	 */
                @ApiField("close_time")
            private Long closeTime;
        /** 渠道编码 */
                @ApiField("channel_code")
            private String channelCode;
        /** gmtCreate */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 国际运单号 */
                @ApiField("international_logistics_num")
            private String internationalLogisticsNum;
        /** 物流服务编码 */
                @ApiField("international_logistics_type")
            private String internationalLogisticsType;
        /** 运费 */
                @ApiField("logistics_fee")
            private AliexpressLogisticsQuerylogisticsorderdetailMoney logisticsFee;
        /** 物流订单号 */
                @ApiField("logistics_order_id")
            private Long logisticsOrderId;
        /** 物流订单状态 */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** tradeOrderId */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** outOrderCode(Lpnumber) */
                @ApiField("out_order_code")
            private String outOrderCode;
        /** batchId */
                @ApiField("batch_id")
            private String batchId;
        /** 物流服务列表 */
                @ApiListField("logistics_service_list")
            private List<AliexpressLogisticsQuerylogisticsorderdetailLogisticsServiceDTO> logisticsServiceList;
        /** 解决方案code */
                @ApiField("solution_code")
            private String solutionCode;
        /** 多币种运费list */
                @ApiListField("logistics_fee_list")
            private List<AliexpressLogisticsQuerylogisticsorderdetailMoney> logisticsFeeList;
    
        public Long getCloseTime() {
    return this.closeTime;
    }
    public void setCloseTime(Long closeTime) {
    this.closeTime = closeTime;
    }
        public String getChannelCode() {
    return this.channelCode;
    }
    public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getInternationalLogisticsNum() {
    return this.internationalLogisticsNum;
    }
    public void setInternationalLogisticsNum(String internationalLogisticsNum) {
    this.internationalLogisticsNum = internationalLogisticsNum;
    }
        public String getInternationalLogisticsType() {
    return this.internationalLogisticsType;
    }
    public void setInternationalLogisticsType(String internationalLogisticsType) {
    this.internationalLogisticsType = internationalLogisticsType;
    }
        public AliexpressLogisticsQuerylogisticsorderdetailMoney getLogisticsFee() {
    return this.logisticsFee;
    }
    public void setLogisticsFee(AliexpressLogisticsQuerylogisticsorderdetailMoney logisticsFee) {
    this.logisticsFee = logisticsFee;
    }
        public Long getLogisticsOrderId() {
    return this.logisticsOrderId;
    }
    public void setLogisticsOrderId(Long logisticsOrderId) {
    this.logisticsOrderId = logisticsOrderId;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getOutOrderCode() {
    return this.outOrderCode;
    }
    public void setOutOrderCode(String outOrderCode) {
    this.outOrderCode = outOrderCode;
    }
        public String getBatchId() {
    return this.batchId;
    }
    public void setBatchId(String batchId) {
    this.batchId = batchId;
    }
        public List<AliexpressLogisticsQuerylogisticsorderdetailLogisticsServiceDTO> getLogisticsServiceList() {
    return this.logisticsServiceList;
    }
    public void setLogisticsServiceList(List<AliexpressLogisticsQuerylogisticsorderdetailLogisticsServiceDTO> logisticsServiceList) {
    this.logisticsServiceList = logisticsServiceList;
    }
        public String getSolutionCode() {
    return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode) {
    this.solutionCode = solutionCode;
    }
        public List<AliexpressLogisticsQuerylogisticsorderdetailMoney> getLogisticsFeeList() {
    return this.logisticsFeeList;
    }
    public void setLogisticsFeeList(List<AliexpressLogisticsQuerylogisticsorderdetailMoney> logisticsFeeList) {
    this.logisticsFeeList = logisticsFeeList;
    }
    }