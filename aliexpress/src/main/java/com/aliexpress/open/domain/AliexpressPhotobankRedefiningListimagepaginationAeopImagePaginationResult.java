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

public class AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 本次查询结果返回的图片列表。 */
                @ApiListField("images")
            private List<AliexpressPhotobankRedefiningListimagepaginationAeopImage> images;
        /** 当前参数组成的查询对象。 */
                @ApiField("query")
            private AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationRequest query;
        /** 本次调用是否成功。 */
                @ApiField("success")
            private Boolean success;
        /** 当前分组下的图片总数。如果locationType取值为"allGroup", 则为这个用户的图片总数。 */
                @ApiField("total")
            private Integer total;
        /** 本次查询结果分页的页数。 */
                @ApiField("total_page")
            private Integer totalPage;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPhotobankRedefiningListimagepaginationAeopImage> getImages() {
    return this.images;
    }
    public void setImages(List<AliexpressPhotobankRedefiningListimagepaginationAeopImage> images) {
    this.images = images;
    }
        public AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationRequest getQuery() {
    return this.query;
    }
    public void setQuery(AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationRequest query) {
    this.query = query;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Integer getTotal() {
    return this.total;
    }
    public void setTotal(Integer total) {
    this.total = total;
    }
        public Integer getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
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