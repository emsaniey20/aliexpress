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

public class GlobalProductQueryHsCodeDO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** hscode 主键，可以通过hscode预测接口或关键字搜索接口获取。global.hscode.forecast.query     ；     global.hscode.keywords.query    ； */
                @ApiField("hs_code")
            private String hsCode;
        /** 具体的海关描述文本说明 */
                @ApiField("text")
            private String text;
    
        public String getHsCode() {
    return this.hsCode;
    }
    public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
    }
        public String getText() {
    return this.text;
    }
    public void setText(String text) {
    this.text = text;
    }
    }