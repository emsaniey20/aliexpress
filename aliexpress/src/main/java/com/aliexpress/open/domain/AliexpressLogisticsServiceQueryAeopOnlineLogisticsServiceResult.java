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

public class AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 可用物流服务列表 */
                @ApiListField("available_logistic_service_list")
            private List<AliexpressLogisticsServiceQueryLogisticsServiceDTO> availableLogisticServiceList;
        /** 推荐指数 */
                @ApiField("recommend_index")
            private String recommendIndex;
        /** - */
                @ApiField("is_express_logistics_service")
            private Boolean isExpressLogisticsService;
        /** 其它费用项 */
                @ApiListField("other_fees")
            private List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsFeeItem> otherFees;
        /** 仓库中文名称 */
                @ApiField("warehouse_name")
            private String warehouseName;
        /** 折扣试算结果 */
                @ApiField("discount_trial_result")
            private String discountTrialResult;
        /** 试算结果 */
                @ApiField("trial_result")
            private String trialResult;
        /** 交货地址 */
                @ApiField("delivery_address")
            private String deliveryAddress;
        /** 运输时效 */
                @ApiField("logistics_timeliness")
            private String logisticsTimeliness;
        /** 物流方案名称 */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** 物流方案ID */
                @ApiField("logistics_service_id")
            private String logisticsServiceId;
    
        public List<AliexpressLogisticsServiceQueryLogisticsServiceDTO> getAvailableLogisticServiceList() {
    return this.availableLogisticServiceList;
    }
    public void setAvailableLogisticServiceList(List<AliexpressLogisticsServiceQueryLogisticsServiceDTO> availableLogisticServiceList) {
    this.availableLogisticServiceList = availableLogisticServiceList;
    }
        public String getRecommendIndex() {
    return this.recommendIndex;
    }
    public void setRecommendIndex(String recommendIndex) {
    this.recommendIndex = recommendIndex;
    }
        public Boolean getIsExpressLogisticsService() {
    return this.isExpressLogisticsService;
    }
    public void setIsExpressLogisticsService(Boolean isExpressLogisticsService) {
    this.isExpressLogisticsService = isExpressLogisticsService;
    }
        public List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsFeeItem> getOtherFees() {
    return this.otherFees;
    }
    public void setOtherFees(List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsFeeItem> otherFees) {
    this.otherFees = otherFees;
    }
        public String getWarehouseName() {
    return this.warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
    }
        public String getDiscountTrialResult() {
    return this.discountTrialResult;
    }
    public void setDiscountTrialResult(String discountTrialResult) {
    this.discountTrialResult = discountTrialResult;
    }
        public String getTrialResult() {
    return this.trialResult;
    }
    public void setTrialResult(String trialResult) {
    this.trialResult = trialResult;
    }
        public String getDeliveryAddress() {
    return this.deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    }
        public String getLogisticsTimeliness() {
    return this.logisticsTimeliness;
    }
    public void setLogisticsTimeliness(String logisticsTimeliness) {
    this.logisticsTimeliness = logisticsTimeliness;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public String getLogisticsServiceId() {
    return this.logisticsServiceId;
    }
    public void setLogisticsServiceId(String logisticsServiceId) {
    this.logisticsServiceId = logisticsServiceId;
    }
    }