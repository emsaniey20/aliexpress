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

public class AliexpressPostproductRedefiningGetwindowproductsAeopWindowProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 已推荐为橱窗商品的ID列表。与windowProducts中的产品ID一致。 */
                @ApiListField("product_list")
            private List<String> productList;
        /** 接口调用结果。true/false分别表示成功和失败。 */
                @ApiField("success")
            private Boolean success;
        /** 已使用的橱窗个数，与windowProducts中记录的条数一致。 */
                @ApiField("used_count")
            private Long usedCount;
        /** 当前用户的橱窗总数＝已使用的橱窗数＋未使用的橱窗数。 */
                @ApiField("window_count")
            private Long windowCount;
        /** 已使用的橱窗信息。 */
                @ApiListField("window_products")
            private List<AliexpressPostproductRedefiningGetwindowproductsString> windowProducts;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<String> getProductList() {
    return this.productList;
    }
    public void setProductList(List<String> productList) {
    this.productList = productList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Long getUsedCount() {
    return this.usedCount;
    }
    public void setUsedCount(Long usedCount) {
    this.usedCount = usedCount;
    }
        public Long getWindowCount() {
    return this.windowCount;
    }
    public void setWindowCount(Long windowCount) {
    this.windowCount = windowCount;
    }
        public List<AliexpressPostproductRedefiningGetwindowproductsString> getWindowProducts() {
    return this.windowProducts;
    }
    public void setWindowProducts(List<AliexpressPostproductRedefiningGetwindowproductsString> windowProducts) {
    this.windowProducts = windowProducts;
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