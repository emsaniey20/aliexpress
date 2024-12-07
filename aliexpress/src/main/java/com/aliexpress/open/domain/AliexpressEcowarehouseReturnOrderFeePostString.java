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

public class AliexpressEcowarehouseReturnOrderFeePostString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 币种单位，例如：USD/CNY */
                @ApiField("currency")
            private String currency;
        /** 费用项名称，例如：运费、质检、销毁、换标、装袋、其他 */
                @ApiField("expense_code")
            private String expenseCode;
        /** 单价，币种最小单位，例如：1.23元，返回为123 */
                @ApiField("unit_price")
            private Integer unitPrice;
        /** 数量 */
                @ApiField("quantity")
            private Integer quantity;
        /** 总价，数量*单价 */
                @ApiField("total_amount")
            private Integer totalAmount;
    
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getExpenseCode() {
    return this.expenseCode;
    }
    public void setExpenseCode(String expenseCode) {
    this.expenseCode = expenseCode;
    }
        public Integer getUnitPrice() {
    return this.unitPrice;
    }
    public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
    }
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public Integer getTotalAmount() {
    return this.totalAmount;
    }
    public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
    }
    }