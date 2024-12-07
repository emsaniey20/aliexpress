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

public class AliexpressPostproductRedefiningSetsizechartAeopRelateSizeChartResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 尺码表模版Id */
                @ApiField("sizechart_id")
            private Long sizechartId;
        /** 设置结果。true/false分别表示成功和失败。 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Long getSizechartId() {
    return this.sizechartId;
    }
    public void setSizechartId(Long sizechartId) {
    this.sizechartId = sizechartId;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }