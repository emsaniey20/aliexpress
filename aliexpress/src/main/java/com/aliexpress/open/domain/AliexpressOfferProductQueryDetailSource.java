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

public class AliexpressOfferProductQueryDetailSource implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 详描语种locale */
                @ApiField("locale")
            private String locale;
        /** PC 端详描内容，注意!!! 对于PC端详描内容校验规则：关联模块(relation)数量至多1个，PC端详描下总信息模块数至多3个，当type=”html"并且其content中包含关联模块(relation)或自定义模块(custom)时，其中的关联模块和自定义模块也会被参与计数，请isv自行排查"html"模块中是否有关联模块(relation)和自定义模块(custom),请isv们做好前置校验，避免重复计数。具体格式请参考：https://open.aliexpress.com/doc/doc.htm#/?docId=725 */
                @ApiField("web_detail")
            private String webDetail;
        /** 移动端详描内容，具体格式请参考： https://open.aliexpress.com/doc/doc.htm#/?docId=725 */
                @ApiField("mobile_detail")
            private String mobileDetail;
    
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
        public String getMobileDetail() {
    return this.mobileDetail;
    }
    public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
    }
    }