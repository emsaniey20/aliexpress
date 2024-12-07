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

public class GlobalProductCreateDetailSource implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 多语言详描语种标记 。ja_JP ： 日本日语 ko_KR：韩国韩语 tr_TR：土耳其土耳其语 nl_NL：荷兰荷兰语 pl_PL：波兰波兰语 ru_RU：俄国俄语 fr_FR：法国法语 en_US：美国英语 th_TH：泰国泰语 de_DE：德国德语 es_ES：西班牙西班牙语 */
                @ApiField("locale")
            private String locale;
        /** 多语言详描， HTML原始类型 */
                @ApiField("web_detail")
            private String webDetail;
    
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