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

public class AliexpressPostproductRedefiningEditmultilanguageproductAeopModifyProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误详情 */
                @ApiListField("error_details")
            private List<AliexpressPostproductRedefiningEditmultilanguageproductErrorDetail> errorDetails;
        /** 成功修改的商品数目 */
                @ApiField("modify_count")
            private Integer modifyCount;
        /** 成功修改的商品id */
                @ApiField("product_id")
            private Long productId;
        /** success  true or false */
                @ApiField("success")
            private Boolean success;
        /** 错误子代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 系统异常信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPostproductRedefiningEditmultilanguageproductErrorDetail> getErrorDetails() {
    return this.errorDetails;
    }
    public void setErrorDetails(List<AliexpressPostproductRedefiningEditmultilanguageproductErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
    }
        public Integer getModifyCount() {
    return this.modifyCount;
    }
    public void setModifyCount(Integer modifyCount) {
    this.modifyCount = modifyCount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
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