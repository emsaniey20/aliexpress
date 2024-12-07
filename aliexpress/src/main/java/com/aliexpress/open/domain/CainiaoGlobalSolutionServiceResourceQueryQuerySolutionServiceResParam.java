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

public class CainiaoGlobalSolutionServiceResourceQueryQuerySolutionServiceResParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 解决方案code */
                @ApiField("solution_code")
            private String solutionCode;
        /** 服务参数 */
                @ApiField("service_param")
            private CainiaoGlobalSolutionServiceResourceQueryServiceParam serviceParam;
    
        public String getSolutionCode() {
    return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode) {
    this.solutionCode = solutionCode;
    }
        public CainiaoGlobalSolutionServiceResourceQueryServiceParam getServiceParam() {
    return this.serviceParam;
    }
    public void setServiceParam(CainiaoGlobalSolutionServiceResourceQueryServiceParam serviceParam) {
    this.serviceParam = serviceParam;
    }
    }