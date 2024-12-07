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

public class AliexpressEcowarehouseReturnOrderFeePostReturnFeeDetailCallbackRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** warehouse_customer_id */
                @ApiField("warehouse_customer_id")
            private String warehouseCustomerId;
        /** 退仓单ID */
                @ApiField("out_biz_id")
            private String outBizId;
        /** 货主ID */
                @ApiField("goods_owner_id")
            private String goodsOwnerId;
        /** 时间戳 */
                @ApiField("time_stamp")
            private Long timeStamp;
        /** 仓code */
                @ApiField("warehouse_code")
            private String warehouseCode;
        /** package_info_list */
                @ApiListField("package_info")
            private List<AliexpressEcowarehouseReturnOrderFeePostString> packageInfo;
        /** fee_detail_list */
                @ApiListField("fee_details")
            private List<AliexpressEcowarehouseReturnOrderFeePostString> feeDetails;
    
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
        public List<AliexpressEcowarehouseReturnOrderFeePostString> getPackageInfo() {
    return this.packageInfo;
    }
    public void setPackageInfo(List<AliexpressEcowarehouseReturnOrderFeePostString> packageInfo) {
    this.packageInfo = packageInfo;
    }
        public List<AliexpressEcowarehouseReturnOrderFeePostString> getFeeDetails() {
    return this.feeDetails;
    }
    public void setFeeDetails(List<AliexpressEcowarehouseReturnOrderFeePostString> feeDetails) {
    this.feeDetails = feeDetails;
    }
    }