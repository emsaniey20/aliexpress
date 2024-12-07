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

public class CainiaoGlobalLogisticsServiceQueryAeopLogisticsUsableServiceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 物流方案code */
                @ApiField("solution_code")
            private String solutionCode;
        /** 物流方案name */
                @ApiField("solution_name")
            private String solutionName;
        /** 预计时效 */
                @ApiField("estimate_time")
            private String estimateTime;
        /** 预计新费用(CNY) */
                @ApiField("new_estimate_fee")
            private String newEstimateFee;
        /** 预计原费用(CNY) */
                @ApiField("original_estimate_fee")
            private String originalEstimateFee;
    
        public String getSolutionCode() {
    return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode) {
    this.solutionCode = solutionCode;
    }
        public String getSolutionName() {
    return this.solutionName;
    }
    public void setSolutionName(String solutionName) {
    this.solutionName = solutionName;
    }
        public String getEstimateTime() {
    return this.estimateTime;
    }
    public void setEstimateTime(String estimateTime) {
    this.estimateTime = estimateTime;
    }
        public String getNewEstimateFee() {
    return this.newEstimateFee;
    }
    public void setNewEstimateFee(String newEstimateFee) {
    this.newEstimateFee = newEstimateFee;
    }
        public String getOriginalEstimateFee() {
    return this.originalEstimateFee;
    }
    public void setOriginalEstimateFee(String originalEstimateFee) {
    this.originalEstimateFee = originalEstimateFee;
    }
    }