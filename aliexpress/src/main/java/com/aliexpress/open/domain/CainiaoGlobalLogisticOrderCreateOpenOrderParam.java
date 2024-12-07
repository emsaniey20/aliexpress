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

public class CainiaoGlobalLogisticOrderCreateOpenOrderParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 交易单参数 */
                @ApiField("trade_order_param")
            private CainiaoGlobalLogisticOrderCreateOpenTradeOrderParam tradeOrderParam;
        /** 解决方案参数 */
                @ApiField("solution_param")
            private CainiaoGlobalLogisticOrderCreateOpenSolutionParam solutionParam;
        /** 包裹参数 */
                @ApiListField("package_params")
            private List<CainiaoGlobalLogisticOrderCreateOpenPackageParam> packageParams;
        /** 商家信息参数 */
                @ApiField("seller_info_param")
            private CainiaoGlobalLogisticOrderCreateOpenSellerInfoParam sellerInfoParam;
        /** 发件人信息 */
                @ApiField("sender_param")
            private CainiaoGlobalLogisticOrderCreateOpenSenderParam senderParam;
        /** 退货联系人信息 */
                @ApiField("returner_param")
            private CainiaoGlobalLogisticOrderCreateOpenReturnerParam returnerParam;
        /** 收件人信息 */
                @ApiField("receiver_param")
            private CainiaoGlobalLogisticOrderCreateOpenReceiverParam receiverParam;
        /** 揽收信息参数 */
                @ApiField("pickup_info_param")
            private CainiaoGlobalLogisticOrderCreateOpenPickupInfoParam pickupInfoParam;
    
        public CainiaoGlobalLogisticOrderCreateOpenTradeOrderParam getTradeOrderParam() {
    return this.tradeOrderParam;
    }
    public void setTradeOrderParam(CainiaoGlobalLogisticOrderCreateOpenTradeOrderParam tradeOrderParam) {
    this.tradeOrderParam = tradeOrderParam;
    }
        public CainiaoGlobalLogisticOrderCreateOpenSolutionParam getSolutionParam() {
    return this.solutionParam;
    }
    public void setSolutionParam(CainiaoGlobalLogisticOrderCreateOpenSolutionParam solutionParam) {
    this.solutionParam = solutionParam;
    }
        public List<CainiaoGlobalLogisticOrderCreateOpenPackageParam> getPackageParams() {
    return this.packageParams;
    }
    public void setPackageParams(List<CainiaoGlobalLogisticOrderCreateOpenPackageParam> packageParams) {
    this.packageParams = packageParams;
    }
        public CainiaoGlobalLogisticOrderCreateOpenSellerInfoParam getSellerInfoParam() {
    return this.sellerInfoParam;
    }
    public void setSellerInfoParam(CainiaoGlobalLogisticOrderCreateOpenSellerInfoParam sellerInfoParam) {
    this.sellerInfoParam = sellerInfoParam;
    }
        public CainiaoGlobalLogisticOrderCreateOpenSenderParam getSenderParam() {
    return this.senderParam;
    }
    public void setSenderParam(CainiaoGlobalLogisticOrderCreateOpenSenderParam senderParam) {
    this.senderParam = senderParam;
    }
        public CainiaoGlobalLogisticOrderCreateOpenReturnerParam getReturnerParam() {
    return this.returnerParam;
    }
    public void setReturnerParam(CainiaoGlobalLogisticOrderCreateOpenReturnerParam returnerParam) {
    this.returnerParam = returnerParam;
    }
        public CainiaoGlobalLogisticOrderCreateOpenReceiverParam getReceiverParam() {
    return this.receiverParam;
    }
    public void setReceiverParam(CainiaoGlobalLogisticOrderCreateOpenReceiverParam receiverParam) {
    this.receiverParam = receiverParam;
    }
        public CainiaoGlobalLogisticOrderCreateOpenPickupInfoParam getPickupInfoParam() {
    return this.pickupInfoParam;
    }
    public void setPickupInfoParam(CainiaoGlobalLogisticOrderCreateOpenPickupInfoParam pickupInfoParam) {
    this.pickupInfoParam = pickupInfoParam;
    }
    }