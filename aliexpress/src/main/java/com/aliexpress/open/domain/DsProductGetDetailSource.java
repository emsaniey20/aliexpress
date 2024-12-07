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

public class DsProductGetDetailSource implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111 */
                @ApiField("is_auto_translate")
            private Boolean isAutoTranslate;
        /** 111 */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** 111 */
                @ApiField("locale")
            private String locale;
        /** 111 */
                @ApiField("web_detail")
            private String webDetail;
    
        public Boolean getIsAutoTranslate() {
    return this.isAutoTranslate;
    }
    public void setIsAutoTranslate(Boolean isAutoTranslate) {
    this.isAutoTranslate = isAutoTranslate;
    }
        public String getMobileDetail() {
    return this.mobileDetail;
    }
    public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getWebDetail() {
    return this.webDetail;
    }
    public void setWebDetail(String webDetail) {
    this.webDetail = webDetail;
    }
    }