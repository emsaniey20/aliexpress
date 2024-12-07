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

public class AliexpressSolutionProductPostSingleLanguageDescriptionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Support: en(English) ru(Russian) es(Spanish) fr(French) it(Italian) tr(Turkish) pt(Portuguese) de(German) nl(Dutch) in(Indonesian) ar(Arabic) ja(Japanese) ko(Korean) th(Thai) vi(Vietnamese) iw(Hebrew).Must contains the original locale. */
                @ApiField("language")
            private String language;
        /** web detail for this language, please check the format here: https://developers.aliexpress.com/en/doc.htm?docId=109534&docType=1 */
                @ApiField("web_detail")
            private String webDetail;
        /** mobile detail for this language, do not support "html" and "dynamic" type, for more information, please check the format here https://developers.aliexpress.com/en/doc.htm?docId=109534&docType=1 */
                @ApiField("mobile_detail")
            private String mobileDetail;
    
        public String getLanguage() {
    return this.language;
    }
    public void setLanguage(String language) {
    this.language = language;
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