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

public class AliexpressOfferRedefiningQuerybundleAeopOfferBundleQueryResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 当前页码 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 错误码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 搭配列表 */
                @ApiListField("offer_bundle_list")
            private List<AliexpressOfferRedefiningQuerybundleAeopOfferBundle> offerBundleList;
        /** 总页数 */
                @ApiField("total_page")
            private Integer totalPage;
        /** 总记录数 */
                @ApiField("total_record")
            private Long totalRecord;
    
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
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
        public List<AliexpressOfferRedefiningQuerybundleAeopOfferBundle> getOfferBundleList() {
    return this.offerBundleList;
    }
    public void setOfferBundleList(List<AliexpressOfferRedefiningQuerybundleAeopOfferBundle> offerBundleList) {
    this.offerBundleList = offerBundleList;
    }
        public Integer getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
    }
        public Long getTotalRecord() {
    return this.totalRecord;
    }
    public void setTotalRecord(Long totalRecord) {
    this.totalRecord = totalRecord;
    }
    }