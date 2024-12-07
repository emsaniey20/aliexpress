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

public class BrazilLocalInvoiceUploadBrazilInvoiceUploadResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** result flag */
                @ApiField("result")
            private Boolean result;
        /** trade order id */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** error msg */
                @ApiField("error_msg")
            private String errorMsg;
    
        public Boolean getResult() {
    return this.result;
    }
    public void setResult(Boolean result) {
    this.result = result;
    }
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }