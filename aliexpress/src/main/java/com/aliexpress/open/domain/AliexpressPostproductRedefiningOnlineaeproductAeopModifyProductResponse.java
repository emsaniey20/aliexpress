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

public class AliexpressPostproductRedefiningOnlineaeproductAeopModifyProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品上架错误详情 */
                @ApiListField("error_details")
            private List<AliexpressPostproductRedefiningOnlineaeproductErrorDetail> errorDetails;
        /** 操作成功返回成功产品个数。 */
                @ApiField("modify_count")
            private Integer modifyCount;
        /** 操作成功返回的产品id */
                @ApiField("product_id")
            private Long productId;
        /** 接口调用结果。成功为true, 失败为false。 */
                @ApiField("success")
            private Boolean success;
        /** 错误子代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 系统异常信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPostproductRedefiningOnlineaeproductErrorDetail> getErrorDetails() {
    return this.errorDetails;
    }
    public void setErrorDetails(List<AliexpressPostproductRedefiningOnlineaeproductErrorDetail> errorDetails) {
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