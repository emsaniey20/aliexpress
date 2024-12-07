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

public class AliexpressChoiceProductPostAeopProductInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品标题 */
                @ApiListField("subject_list")
            private List<AliexpressChoiceProductPostSubject> subjectList;
        /** 商品原发语种：en_US */
                @ApiField("locale")
            private String locale;
        /** 货币单位。如果不提供该值信息，则默认为"USD"；非俄罗斯卖家这个属性值可以不提供。对于俄罗斯海外卖家，该单位值必须提供，如: "RUB"。 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 类目id */
                @ApiField("category_id")
            private Long categoryId;
    
        public List<AliexpressChoiceProductPostSubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<AliexpressChoiceProductPostSubject> subjectList) {
    this.subjectList = subjectList;
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
    }