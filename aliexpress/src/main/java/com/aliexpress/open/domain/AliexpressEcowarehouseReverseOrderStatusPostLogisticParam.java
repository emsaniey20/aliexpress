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

public class AliexpressEcowarehouseReverseOrderStatusPostLogisticParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** logistics_company_name */
                @ApiField("logistics_company_name")
            private String logisticsCompanyName;
        /** tracking_no */
                @ApiField("tracking_no")
            private String trackingNo;
        /** bill_info_url */
                @ApiField("bill_info_url")
            private String billInfoUrl;
        /** shipping_method */
                @ApiField("shipping_method")
            private String shippingMethod;
        /** consign_type */
                @ApiField("consign_type")
            private String consignType;
        /** 揽收类型 */
                @ApiField("collect_type")
            private String collectType;
    
        public String getLogisticsCompanyName() {
    return this.logisticsCompanyName;
    }
    public void setLogisticsCompanyName(String logisticsCompanyName) {
    this.logisticsCompanyName = logisticsCompanyName;
    }
        public String getTrackingNo() {
    return this.trackingNo;
    }
    public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
    }
        public String getBillInfoUrl() {
    return this.billInfoUrl;
    }
    public void setBillInfoUrl(String billInfoUrl) {
    this.billInfoUrl = billInfoUrl;
    }
        public String getShippingMethod() {
    return this.shippingMethod;
    }
    public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    }
        public String getConsignType() {
    return this.consignType;
    }
    public void setConsignType(String consignType) {
    this.consignType = consignType;
    }
        public String getCollectType() {
    return this.collectType;
    }
    public void setCollectType(String collectType) {
    this.collectType = collectType;
    }
    }