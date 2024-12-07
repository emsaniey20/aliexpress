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

public class AriseOrderDetailQueryOrderDetailOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 收件人地址 */
                @ApiField("receiver_address")
            private String receiverAddress;
        /** 子订单列表 */
                @ApiListField("order_lines")
            private List<AriseOrderDetailQueryOrderLineDetailOpenDTO> orderLines;
        /** 收货人名字 */
                @ApiField("receiver_name")
            private String receiverName;
        /** 收货人邮编 */
                @ApiField("receiver_postal_code")
            private String receiverPostalCode;
        /** 订单创建时间，unix时间戳，单位毫秒 */
                @ApiField("order_create_time")
            private Long orderCreateTime;
        /** 订单id */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** 收货人电话 */
                @ApiField("receiver_phone_number")
            private String receiverPhoneNumber;
        /** 卖家订单备注 */
                @ApiField("seller_memo")
            private String sellerMemo;
        /** 买家名字 */
                @ApiField("buyer_full_name")
            private String buyerFullName;
        /** 买家收货地址信息 */
                @ApiField("receiver_address_info")
            private AriseOrderDetailQueryAddressInfoDTO receiverAddressInfo;
        /** 支付信息，包括总价格折扣 */
                @ApiField("pay_info")
            private AriseOrderDetailQueryPayInfoDTO payInfo;
        /** 订单总状态 */
                @ApiField("order_status")
            private String orderStatus;
    
        public String getReceiverAddress() {
    return this.receiverAddress;
    }
    public void setReceiverAddress(String receiverAddress) {
    this.receiverAddress = receiverAddress;
    }
        public List<AriseOrderDetailQueryOrderLineDetailOpenDTO> getOrderLines() {
    return this.orderLines;
    }
    public void setOrderLines(List<AriseOrderDetailQueryOrderLineDetailOpenDTO> orderLines) {
    this.orderLines = orderLines;
    }
        public String getReceiverName() {
    return this.receiverName;
    }
    public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
    }
        public String getReceiverPostalCode() {
    return this.receiverPostalCode;
    }
    public void setReceiverPostalCode(String receiverPostalCode) {
    this.receiverPostalCode = receiverPostalCode;
    }
        public Long getOrderCreateTime() {
    return this.orderCreateTime;
    }
    public void setOrderCreateTime(Long orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getReceiverPhoneNumber() {
    return this.receiverPhoneNumber;
    }
    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
    this.receiverPhoneNumber = receiverPhoneNumber;
    }
        public String getSellerMemo() {
    return this.sellerMemo;
    }
    public void setSellerMemo(String sellerMemo) {
    this.sellerMemo = sellerMemo;
    }
        public String getBuyerFullName() {
    return this.buyerFullName;
    }
    public void setBuyerFullName(String buyerFullName) {
    this.buyerFullName = buyerFullName;
    }
        public AriseOrderDetailQueryAddressInfoDTO getReceiverAddressInfo() {
    return this.receiverAddressInfo;
    }
    public void setReceiverAddressInfo(AriseOrderDetailQueryAddressInfoDTO receiverAddressInfo) {
    this.receiverAddressInfo = receiverAddressInfo;
    }
        public AriseOrderDetailQueryPayInfoDTO getPayInfo() {
    return this.payInfo;
    }
    public void setPayInfo(AriseOrderDetailQueryPayInfoDTO payInfo) {
    this.payInfo = payInfo;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
    }