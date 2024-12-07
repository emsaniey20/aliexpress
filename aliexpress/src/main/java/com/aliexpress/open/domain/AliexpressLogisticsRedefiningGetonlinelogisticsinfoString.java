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

public class AliexpressLogisticsRedefiningGetonlinelogisticsinfoString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** original International Mail No.(原始国际运单号) */
                @ApiField("original_international_logistics_id")
            private String originalInternationalLogisticsId;
        /** chinaLogisticsType */
                @ApiField("china_logistics_type")
            private String chinaLogisticsType;
        /** channelCode */
                @ApiField("channel_code")
            private String channelCode;
        /** logisticsStatus */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** lpNumber(物流单LP号) */
                @ApiField("lp_number")
            private String lpNumber;
        /** latest International Mail No.(最新国际运单号)	 */
                @ApiField("internationallogistics_id")
            private String internationallogisticsId;
        /** internationalLogisticsType */
                @ApiField("international_logistics_type")
            private String internationalLogisticsType;
        /** orderId */
                @ApiField("order_id")
            private Long orderId;
        /** onlineLogisticsId */
                @ApiField("online_logistics_id")
            private Long onlineLogisticsId;
        /** logisticsFee(优先参考logistics_fee_list) */
                @ApiField("logistics_fee")
            private AliexpressLogisticsRedefiningGetonlinelogisticsinfoMoney logisticsFee;
        /** 物流服务列表 */
                @ApiListField("logistics_service_list")
            private List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoLogisticsServiceDTO> logisticsServiceList;
        /** 解决方案code */
                @ApiField("solution_code")
            private String solutionCode;
        /** 多币种运费列表 */
                @ApiListField("logistics_fee_list")
            private List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoMoney> logisticsFeeList;
        /** lm资源code */
                @ApiField("lm_resource_code")
            private String lmResourceCode;
    
        public String getOriginalInternationalLogisticsId() {
    return this.originalInternationalLogisticsId;
    }
    public void setOriginalInternationalLogisticsId(String originalInternationalLogisticsId) {
    this.originalInternationalLogisticsId = originalInternationalLogisticsId;
    }
        public String getChinaLogisticsType() {
    return this.chinaLogisticsType;
    }
    public void setChinaLogisticsType(String chinaLogisticsType) {
    this.chinaLogisticsType = chinaLogisticsType;
    }
        public String getChannelCode() {
    return this.channelCode;
    }
    public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public String getLpNumber() {
    return this.lpNumber;
    }
    public void setLpNumber(String lpNumber) {
    this.lpNumber = lpNumber;
    }
        public String getInternationallogisticsId() {
    return this.internationallogisticsId;
    }
    public void setInternationallogisticsId(String internationallogisticsId) {
    this.internationallogisticsId = internationallogisticsId;
    }
        public String getInternationalLogisticsType() {
    return this.internationalLogisticsType;
    }
    public void setInternationalLogisticsType(String internationalLogisticsType) {
    this.internationalLogisticsType = internationalLogisticsType;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getOnlineLogisticsId() {
    return this.onlineLogisticsId;
    }
    public void setOnlineLogisticsId(Long onlineLogisticsId) {
    this.onlineLogisticsId = onlineLogisticsId;
    }
        public AliexpressLogisticsRedefiningGetonlinelogisticsinfoMoney getLogisticsFee() {
    return this.logisticsFee;
    }
    public void setLogisticsFee(AliexpressLogisticsRedefiningGetonlinelogisticsinfoMoney logisticsFee) {
    this.logisticsFee = logisticsFee;
    }
        public List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoLogisticsServiceDTO> getLogisticsServiceList() {
    return this.logisticsServiceList;
    }
    public void setLogisticsServiceList(List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoLogisticsServiceDTO> logisticsServiceList) {
    this.logisticsServiceList = logisticsServiceList;
    }
        public String getSolutionCode() {
    return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode) {
    this.solutionCode = solutionCode;
    }
        public List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoMoney> getLogisticsFeeList() {
    return this.logisticsFeeList;
    }
    public void setLogisticsFeeList(List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoMoney> logisticsFeeList) {
    this.logisticsFeeList = logisticsFeeList;
    }
        public String getLmResourceCode() {
    return this.lmResourceCode;
    }
    public void setLmResourceCode(String lmResourceCode) {
    this.lmResourceCode = lmResourceCode;
    }
    }