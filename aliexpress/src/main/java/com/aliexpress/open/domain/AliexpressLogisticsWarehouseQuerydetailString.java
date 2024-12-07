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

public class AliexpressLogisticsWarehouseQuerydetailString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 多币种运费list */
                @ApiListField("logistics_fee_list")
            private List<AliexpressLogisticsWarehouseQuerydetailMoney> logisticsFeeList;
        /** 物流订单号 */
                @ApiField("logistics_order_id")
            private Long logisticsOrderId;
        /** 交易单 */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** 物流服务编码 */
                @ApiField("international_logistics_type")
            private String internationalLogisticsType;
        /** LP */
                @ApiField("out_order_code")
            private String outOrderCode;
        /** 运费 */
                @ApiField("logistics_fee")
            private AliexpressLogisticsWarehouseQuerydetailMoney logisticsFee;
        /** 物流服务列表 */
                @ApiListField("logistics_service_list")
            private List<AliexpressLogisticsWarehouseQuerydetailLogisticsServiceDTO> logisticsServiceList;
        /** 物流订单状态 */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** 国际运单号 */
                @ApiField("international_logistics_num")
            private String internationalLogisticsNum;
    
        public List<AliexpressLogisticsWarehouseQuerydetailMoney> getLogisticsFeeList() {
    return this.logisticsFeeList;
    }
    public void setLogisticsFeeList(List<AliexpressLogisticsWarehouseQuerydetailMoney> logisticsFeeList) {
    this.logisticsFeeList = logisticsFeeList;
    }
        public Long getLogisticsOrderId() {
    return this.logisticsOrderId;
    }
    public void setLogisticsOrderId(Long logisticsOrderId) {
    this.logisticsOrderId = logisticsOrderId;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getInternationalLogisticsType() {
    return this.internationalLogisticsType;
    }
    public void setInternationalLogisticsType(String internationalLogisticsType) {
    this.internationalLogisticsType = internationalLogisticsType;
    }
        public String getOutOrderCode() {
    return this.outOrderCode;
    }
    public void setOutOrderCode(String outOrderCode) {
    this.outOrderCode = outOrderCode;
    }
        public AliexpressLogisticsWarehouseQuerydetailMoney getLogisticsFee() {
    return this.logisticsFee;
    }
    public void setLogisticsFee(AliexpressLogisticsWarehouseQuerydetailMoney logisticsFee) {
    this.logisticsFee = logisticsFee;
    }
        public List<AliexpressLogisticsWarehouseQuerydetailLogisticsServiceDTO> getLogisticsServiceList() {
    return this.logisticsServiceList;
    }
    public void setLogisticsServiceList(List<AliexpressLogisticsWarehouseQuerydetailLogisticsServiceDTO> logisticsServiceList) {
    this.logisticsServiceList = logisticsServiceList;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public String getInternationalLogisticsNum() {
    return this.internationalLogisticsNum;
    }
    public void setInternationalLogisticsNum(String internationalLogisticsNum) {
    this.internationalLogisticsNum = internationalLogisticsNum;
    }
    }