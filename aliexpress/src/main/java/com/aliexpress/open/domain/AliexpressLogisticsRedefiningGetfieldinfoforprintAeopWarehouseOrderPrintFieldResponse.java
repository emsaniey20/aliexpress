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

public class AliexpressLogisticsRedefiningGetfieldinfoforprintAeopWarehouseOrderPrintFieldResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Partition code */
                @ApiField("zoning_code")
            private String zoningCode;
        /** Whether to print the sort code */
                @ApiField("print_presorting")
            private Boolean printPresorting;
        /** success */
                @ApiField("success")
            private Boolean success;
        /** PresortingCode */
                @ApiField("presorting_code")
            private String presortingCode;
        /** Call the error description message */
                @ApiField("error_desc")
            private String errorDesc;
        /** Transaction order number */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
    
        public String getZoningCode() {
    return this.zoningCode;
    }
    public void setZoningCode(String zoningCode) {
    this.zoningCode = zoningCode;
    }
        public Boolean getPrintPresorting() {
    return this.printPresorting;
    }
    public void setPrintPresorting(Boolean printPresorting) {
    this.printPresorting = printPresorting;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getPresortingCode() {
    return this.presortingCode;
    }
    public void setPresortingCode(String presortingCode) {
    this.presortingCode = presortingCode;
    }
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
    }