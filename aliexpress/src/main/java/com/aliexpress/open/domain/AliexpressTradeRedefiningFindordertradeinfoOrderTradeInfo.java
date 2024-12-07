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

public class AliexpressTradeRedefiningFindordertradeinfoOrderTradeInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单金额的货币单位 */
                @ApiField("init_oder_amount_cur")
            private String initOderAmountCur;
        /** 订单ID */
                @ApiField("id")
            private Long id;
        /** 订单初始金额 */
                @ApiField("init_oder_amount")
            private String initOderAmount;
        /** 物流金额的货币单位 */
                @ApiField("logistics_amount_cur")
            private String logisticsAmountCur;
        /** 商品列表 */
                @ApiListField("child_order_list")
            private List<AliexpressTradeRedefiningFindordertradeinfoChildOrderDTO> childOrderList;
        /** 是否手机订单 */
                @ApiField("is_phone")
            private Boolean isPhone;
        /** 物流金额（仅返回买家支付的物流费用） */
                @ApiField("logistics_amount")
            private String logisticsAmount;
        /** 订单金额 */
                @ApiField("order_amount")
            private String orderAmount;
        /** 订单金额货币单位 */
                @ApiField("order_amount_cur")
            private String orderAmountCur;
    
        public String getInitOderAmountCur() {
    return this.initOderAmountCur;
    }
    public void setInitOderAmountCur(String initOderAmountCur) {
    this.initOderAmountCur = initOderAmountCur;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getInitOderAmount() {
    return this.initOderAmount;
    }
    public void setInitOderAmount(String initOderAmount) {
    this.initOderAmount = initOderAmount;
    }
        public String getLogisticsAmountCur() {
    return this.logisticsAmountCur;
    }
    public void setLogisticsAmountCur(String logisticsAmountCur) {
    this.logisticsAmountCur = logisticsAmountCur;
    }
        public List<AliexpressTradeRedefiningFindordertradeinfoChildOrderDTO> getChildOrderList() {
    return this.childOrderList;
    }
    public void setChildOrderList(List<AliexpressTradeRedefiningFindordertradeinfoChildOrderDTO> childOrderList) {
    this.childOrderList = childOrderList;
    }
        public Boolean getIsPhone() {
    return this.isPhone;
    }
    public void setIsPhone(Boolean isPhone) {
    this.isPhone = isPhone;
    }
        public String getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(String logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public String getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(String orderAmount) {
    this.orderAmount = orderAmount;
    }
        public String getOrderAmountCur() {
    return this.orderAmountCur;
    }
    public void setOrderAmountCur(String orderAmountCur) {
    this.orderAmountCur = orderAmountCur;
    }
    }