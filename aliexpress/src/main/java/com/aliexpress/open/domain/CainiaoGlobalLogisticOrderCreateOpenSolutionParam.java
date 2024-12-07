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

public class CainiaoGlobalLogisticOrderCreateOpenSolutionParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 解决方案code */
                @ApiField("solution_code")
            private String solutionCode;
        /** 物流服务列表 */
                @ApiListField("service_params")
            private List<CainiaoGlobalLogisticOrderCreateOpenServiceParam> serviceParams;
    
        public String getSolutionCode() {
    return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode) {
    this.solutionCode = solutionCode;
    }
        public List<CainiaoGlobalLogisticOrderCreateOpenServiceParam> getServiceParams() {
    return this.serviceParams;
    }
    public void setServiceParams(List<CainiaoGlobalLogisticOrderCreateOpenServiceParam> serviceParams) {
    this.serviceParams = serviceParams;
    }
    }