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

public class AliexpressPostproductRedefiningEditaeproductAeopModifyProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误详情 */
                @ApiListField("error_details")
            private List<String> errorDetails;
        /** 编辑成功次数。对于编辑商品来说，这个参数为1。 */
                @ApiField("modify_count")
            private Integer modifyCount;
        /** 接口调用结果。成功为true，失败为false。 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 商品的ID。 */
                @ApiField("product_id")
            private Long productId;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
    
        public List<String> getErrorDetails() {
    return this.errorDetails;
    }
    public void setErrorDetails(List<String> errorDetails) {
    this.errorDetails = errorDetails;
    }
        public Integer getModifyCount() {
    return this.modifyCount;
    }
    public void setModifyCount(Integer modifyCount) {
    this.modifyCount = modifyCount;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
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
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
    }