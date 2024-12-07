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

public class AliexpressProductDiagnosisQueryProblemProductProblemDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品问题描述 */
                @ApiField("problem_description")
            private String problemDescription;
        /** 商品问题类型 */
                @ApiField("problem_type")
            private String problemType;
    
        public String getProblemDescription() {
    return this.problemDescription;
    }
    public void setProblemDescription(String problemDescription) {
    this.problemDescription = problemDescription;
    }
        public String getProblemType() {
    return this.problemType;
    }
    public void setProblemType(String problemType) {
    this.problemType = problemType;
    }
    }