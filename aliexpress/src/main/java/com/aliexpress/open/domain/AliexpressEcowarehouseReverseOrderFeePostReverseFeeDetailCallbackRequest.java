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

public class AliexpressEcowarehouseReverseOrderFeePostReverseFeeDetailCallbackRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 易仓多租户路由ID，自研系统为固定值 */
                @ApiField("warehouse_customer_id")
            private String warehouseCustomerId;
        /** 仓单号 */
                @ApiField("out_biz_id")
            private String outBizId;
        /** 货主ID */
                @ApiField("goods_owner_id")
            private String goodsOwnerId;
        /** wms仓订单号 */
                @ApiField("wms_order_id")
            private String wmsOrderId;
        /** 时间戳 */
                @ApiField("time_stamp")
            private Long timeStamp;
        /** 仓code */
                @ApiField("warehouse_code")
            private String warehouseCode;
        /** 运单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
        /** package_info */
                @ApiField("package_info")
            private AliexpressEcowarehouseReverseOrderFeePostPackageInfo packageInfo;
        /** fee_details */
                @ApiListField("fee_details")
            private List<AliexpressEcowarehouseReverseOrderFeePostString> feeDetails;
    
        public String getWarehouseCustomerId() {
    return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId) {
    this.warehouseCustomerId = warehouseCustomerId;
    }
        public String getOutBizId() {
    return this.outBizId;
    }
    public void setOutBizId(String outBizId) {
    this.outBizId = outBizId;
    }
        public String getGoodsOwnerId() {
    return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId) {
    this.goodsOwnerId = goodsOwnerId;
    }
        public String getWmsOrderId() {
    return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId) {
    this.wmsOrderId = wmsOrderId;
    }
        public Long getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
        public AliexpressEcowarehouseReverseOrderFeePostPackageInfo getPackageInfo() {
    return this.packageInfo;
    }
    public void setPackageInfo(AliexpressEcowarehouseReverseOrderFeePostPackageInfo packageInfo) {
    this.packageInfo = packageInfo;
    }
        public List<AliexpressEcowarehouseReverseOrderFeePostString> getFeeDetails() {
    return this.feeDetails;
    }
    public void setFeeDetails(List<AliexpressEcowarehouseReverseOrderFeePostString> feeDetails) {
    this.feeDetails = feeDetails;
    }
    }