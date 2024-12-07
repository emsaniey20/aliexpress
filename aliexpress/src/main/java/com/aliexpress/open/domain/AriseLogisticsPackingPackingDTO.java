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

public class AriseLogisticsPackingPackingDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 交易单号 */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** 交易子单号 */
                @ApiField("trade_order_item_id")
            private String tradeOrderItemId;
        /** 包裹单号 */
                @ApiField("package_id")
            private String packageId;
        /** 物流服务商编码 */
                @ApiField("shipment_provider_code")
            private String shipmentProviderCode;
        /** 运单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
        /** 打包结果（交易子单维度），0代表成功；40014代表打包失败 */
                @ApiField("result_code")
            private String resultCode;
        /** 打包结果描述（交易子单维度），40014错误码对应的失败原因有：1）请重新编辑发货地址和揽收地址并保存；2）包裹的长宽高体积重量超过官方物流限制，请联系您的小二申请开通自发货权限；3）订单校验异常，请联系客服小二；4）仓库地址不在揽收范围内，请自寄到仓库； */
                @ApiField("result_msg")
            private String resultMsg;
    
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getTradeOrderItemId() {
    return this.tradeOrderItemId;
    }
    public void setTradeOrderItemId(String tradeOrderItemId) {
    this.tradeOrderItemId = tradeOrderItemId;
    }
        public String getPackageId() {
    return this.packageId;
    }
    public void setPackageId(String packageId) {
    this.packageId = packageId;
    }
        public String getShipmentProviderCode() {
    return this.shipmentProviderCode;
    }
    public void setShipmentProviderCode(String shipmentProviderCode) {
    this.shipmentProviderCode = shipmentProviderCode;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
        public String getResultCode() {
    return this.resultCode;
    }
    public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
    }
        public String getResultMsg() {
    return this.resultMsg;
    }
    public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
    }
    }