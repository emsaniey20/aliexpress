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

public class AliexpressPostproductRedefiningEditmultilanguageproductAeopAEProductMultilanguageInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品对应语种的详描 */
                @ApiField("detail")
            private String detail;
        /** 语种，合法的参数有: ru_RU(俄语);pt_BR(葡语);fr_FR(法语);es_ES(西班牙语);in_ID(印尼语);it_IT(意大利语);de_DE(德语);nl_NL(荷兰语);tr_TR(土耳其语);iw_IL(以色列语);ja_JP(日语);ar_MA(阿拉伯语);th_TH(泰语);vi_VN(越南语);ko_KR(韩语); */
                @ApiField("locale")
            private String locale;
        /** 商品对应语种的无线端详描（json格式），如要清空无线详描请传""空串 */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** 商品对应语种的标题, 长度控制在1～218个字符之间。 */
                @ApiField("subject")
            private String subject;
    
        public String getDetail() {
    return this.detail;
    }
    public void setDetail(String detail) {
    this.detail = detail;
    }
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
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
    }