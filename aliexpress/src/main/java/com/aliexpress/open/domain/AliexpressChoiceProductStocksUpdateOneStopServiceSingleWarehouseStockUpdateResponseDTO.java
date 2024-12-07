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

public class AliexpressChoiceProductStocksUpdateOneStopServiceSingleWarehouseStockUpdateResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 单个sku单个仓库下是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 具体仓库下库存更新的错误说明 */
                @ApiField("error_message")
            private String errorMessage;
        /** 具体仓库下库存更新的错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 仓库编码 */
                @ApiField("warehouse_code")
            private String warehouseCode;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
    }