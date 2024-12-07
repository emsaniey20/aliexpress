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

public class AriseReverseOrderReasonListOpenCancelReasonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 拒绝原因id */
                @ApiField("reason_id")
            private Integer reasonId;
        /** 拒绝原因文案 */
                @ApiField("text")
            private String text;
        /** 拒绝原因多语言文案 */
                @ApiField("muti_language_text")
            private String mutiLanguageText;
    
        public Integer getReasonId() {
    return this.reasonId;
    }
    public void setReasonId(Integer reasonId) {
    this.reasonId = reasonId;
    }
        public String getText() {
    return this.text;
    }
    public void setText(String text) {
    this.text = text;
    }
        public String getMutiLanguageText() {
    return this.mutiLanguageText;
    }
    public void setMutiLanguageText(String mutiLanguageText) {
    this.mutiLanguageText = mutiLanguageText;
    }
    }