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

public class AliexpressOfferProductQuerySubject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 多语言标题内容 */
                @ApiField("value")
            private String value;
        /** 语种标记locale */
                @ApiField("locale")
            private String locale;
    
        public String getValue() {
    return this.value;
    }
    public void setValue(String value) {
    this.value = value;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
    }