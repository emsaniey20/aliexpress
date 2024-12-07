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

public class AliexpressPostproductRedefiningEditproductcategoryattributesAeopModifyProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** errorDetails */
                @ApiListField("error_details")
            private List<AliexpressPostproductRedefiningEditproductcategoryattributesErrorDetail> errorDetails;
        /** 修改的产品数 */
                @ApiField("modify_count")
            private Integer modifyCount;
        /** 该产品的ID */
                @ApiField("product_id")
            private Long productId;
        /** 接口调用结果。true/false分别表示成功和失败。 */
                @ApiField("success")
            private Boolean success;
        /** 错误子代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPostproductRedefiningEditproductcategoryattributesErrorDetail> getErrorDetails() {
    return this.errorDetails;
    }
    public void setErrorDetails(List<AliexpressPostproductRedefiningEditproductcategoryattributesErrorDetail> errorDetails) {
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