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

public class AliexpressLogisticsGetpdfsbycloudprintAeopCloudPrintDataResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** cloudPrintDataList */
                @ApiListField("cloud_print_data_list")
            private List<AliexpressLogisticsGetpdfsbycloudprintCloudPrintData> cloudPrintDataList;
        /** internationalLogisticsNum */
                @ApiField("international_logistics_num")
            private String internationalLogisticsNum;
        /** orderCode */
                @ApiField("order_code")
            private String orderCode;
        /** wlWarehouseOrderId */
                @ApiField("wl_warehouse_order_id")
            private Long wlWarehouseOrderId;
    
        public List<AliexpressLogisticsGetpdfsbycloudprintCloudPrintData> getCloudPrintDataList() {
    return this.cloudPrintDataList;
    }
    public void setCloudPrintDataList(List<AliexpressLogisticsGetpdfsbycloudprintCloudPrintData> cloudPrintDataList) {
    this.cloudPrintDataList = cloudPrintDataList;
    }
        public String getInternationalLogisticsNum() {
    return this.internationalLogisticsNum;
    }
    public void setInternationalLogisticsNum(String internationalLogisticsNum) {
    this.internationalLogisticsNum = internationalLogisticsNum;
    }
        public String getOrderCode() {
    return this.orderCode;
    }
    public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
    }
        public Long getWlWarehouseOrderId() {
    return this.wlWarehouseOrderId;
    }
    public void setWlWarehouseOrderId(Long wlWarehouseOrderId) {
    this.wlWarehouseOrderId = wlWarehouseOrderId;
    }
    }