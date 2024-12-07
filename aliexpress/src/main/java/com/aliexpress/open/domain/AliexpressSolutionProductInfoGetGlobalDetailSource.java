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

public class AliexpressSolutionProductInfoGetGlobalDetailSource implements Serializable {
    private static final long serialVersionUID = 1L;
        /** locale of the descripiton */
                @ApiField("locale")
            private String locale;
        /** mobile detail */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** web detail */
                @ApiField("web_detail")
            private String webDetail;
    
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getMobileDetail() {
    return this.mobileDetail;
    }
    public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
    }
        public String getWebDetail() {
    return this.webDetail;
    }
    public void setWebDetail(String webDetail) {
    this.webDetail = webDetail;
    }
    }