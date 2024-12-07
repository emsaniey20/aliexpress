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

public class AliexpressSolutionProductPostSingleLanguageTitleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** product subject, maximum length 218 characters. */
                @ApiField("subject")
            private String subject;
        /** Support: en(English) ru(Russian) es(Spanish) fr(French) it(Italian) tr(Turkish) pt(Portuguese) de(German) nl(Dutch) in(Indonesian) ar(Arabic) ja(Japanese) ko(Korean) th(Thai) vi(Vietnamese) iw(Hebrew).Must contains the original locale. */
                @ApiField("language")
            private String language;
    
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getLanguage() {
    return this.language;
    }
    public void setLanguage(String language) {
    this.language = language;
    }
    }