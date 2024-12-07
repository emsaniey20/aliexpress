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

public class CainiaoGlobalSolutionInquiryOpenFeeDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 已支付费用 */
                @ApiField("paid_fee")
            private Long paidFee;
        /** 已支付费用币种 */
                @ApiField("paid_fee_currency")
            private String paidFeeCurrency;
        /** 应支付费用 */
                @ApiField("fee")
            private Long fee;
        /** 应支付费用币种 */
                @ApiField("fee_currency")
            private String feeCurrency;
        /** 详细费用类型，normal_delivery_fee：配送费，sms_service_fee */
                @ApiField("fee_detail_type")
            private String feeDetailType;
    
        public Long getPaidFee() {
    return this.paidFee;
    }
    public void setPaidFee(Long paidFee) {
    this.paidFee = paidFee;
    }
        public String getPaidFeeCurrency() {
    return this.paidFeeCurrency;
    }
    public void setPaidFeeCurrency(String paidFeeCurrency) {
    this.paidFeeCurrency = paidFeeCurrency;
    }
        public Long getFee() {
    return this.fee;
    }
    public void setFee(Long fee) {
    this.fee = fee;
    }
        public String getFeeCurrency() {
    return this.feeCurrency;
    }
    public void setFeeCurrency(String feeCurrency) {
    this.feeCurrency = feeCurrency;
    }
        public String getFeeDetailType() {
    return this.feeDetailType;
    }
    public void setFeeDetailType(String feeDetailType) {
    this.feeDetailType = feeDetailType;
    }
    }