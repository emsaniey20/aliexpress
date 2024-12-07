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

public class AliexpressChoiceProductQueryAeopProductInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品多语言标题 */
                @ApiListField("subject_list")
            private List<AliexpressChoiceProductQuerySubject> subjectList;
        /** 修改日期 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 原发语种： en_US */
                @ApiField("locale")
            private String locale;
        /** 货币单位。如果不提供该值信息，则默认为"USD"；非俄罗斯卖家这个属性值可以不提供。对于俄罗斯海外卖家，该单位值必须提供，如: "RUB"。 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 类目id */
                @ApiField("category_id")
            private Long categoryId;
        /** 产品的状态，包括onSelling（正在销售），PENDING_LAUNCH (待上架),offline（已下架），auditing（审核中），editingRequired（审核不通过） */
                @ApiField("product_status_type")
            private String productStatusType;
    
        public List<AliexpressChoiceProductQuerySubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<AliexpressChoiceProductQuerySubject> subjectList) {
    this.subjectList = subjectList;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getProductStatusType() {
    return this.productStatusType;
    }
    public void setProductStatusType(String productStatusType) {
    this.productStatusType = productStatusType;
    }
    }