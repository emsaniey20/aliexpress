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

public class AliexpressOfferProductSkupricesEditAeopModifyProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 异常信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 异常 */
                @ApiField("error_code")
            private String errorCode;
        /** 成功条数 */
                @ApiField("modify_count")
            private Integer modifyCount;
        /** 成功 */
                @ApiField("success")
            private Boolean success;
    
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
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
        public Integer getModifyCount() {
    return this.modifyCount;
    }
    public void setModifyCount(Integer modifyCount) {
    this.modifyCount = modifyCount;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }