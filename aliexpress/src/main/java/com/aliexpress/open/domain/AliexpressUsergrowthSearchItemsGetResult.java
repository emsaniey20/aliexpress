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

public class AliexpressUsergrowthSearchItemsGetResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Code is used to determine whether the result is correct */
                @ApiField("code")
            private String code;
        /** Result,The product  are located at the top,maybe null  when success = false */
                @ApiListField("data_list")
            private List<AliexpressUsergrowthSearchItemsGetData> dataList;
        /** success is used to determine whether invoke service success */
                @ApiField("success")
            private Boolean success;
        /** other extend message */
                @ApiField("message")
            private String message;
        /** extend param */
                @ApiField("ext")
            private AliexpressUsergrowthSearchItemsGetExt ext;
    
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public List<AliexpressUsergrowthSearchItemsGetData> getDataList() {
    return this.dataList;
    }
    public void setDataList(List<AliexpressUsergrowthSearchItemsGetData> dataList) {
    this.dataList = dataList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getMessage() {
    return this.message;
    }
    public void setMessage(String message) {
    this.message = message;
    }
        public AliexpressUsergrowthSearchItemsGetExt getExt() {
    return this.ext;
    }
    public void setExt(AliexpressUsergrowthSearchItemsGetExt ext) {
    this.ext = ext;
    }
    }