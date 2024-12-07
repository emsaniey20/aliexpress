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

public class AliexpressMerchantDiagnosisQueryIsvMerchantHealthLevel implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 体检等级。0：健康；100：一般；200：严重；300：店铺冻结；400：关店 */
                @ApiField("levelCode")
            private Integer levelCode;
        /** 体检等级名称 */
                @ApiField("name")
            private String name;
    
        public Integer getLevelCode() {
    return this.levelCode;
    }
    public void setLevelCode(Integer levelCode) {
    this.levelCode = levelCode;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
    }