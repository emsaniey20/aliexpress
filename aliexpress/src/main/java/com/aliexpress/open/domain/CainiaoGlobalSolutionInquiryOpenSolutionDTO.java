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

public class CainiaoGlobalSolutionInquiryOpenSolutionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 解决方案code */
                @ApiField("code")
            private String code;
        /** 解决方案名称 */
                @ApiField("name")
            private String name;
        /** 时效信息 */
                @ApiListField("timing_list")
            private List<CainiaoGlobalSolutionInquiryOpenTimingDTO> timingList;
        /** 费用列表 */
                @ApiListField("fee_list")
            private List<CainiaoGlobalSolutionInquiryOpenFeeDTO> feeList;
        /** 推荐指数 */
                @ApiField("recommend_index")
            private Integer recommendIndex;
    
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public List<CainiaoGlobalSolutionInquiryOpenTimingDTO> getTimingList() {
    return this.timingList;
    }
    public void setTimingList(List<CainiaoGlobalSolutionInquiryOpenTimingDTO> timingList) {
    this.timingList = timingList;
    }
        public List<CainiaoGlobalSolutionInquiryOpenFeeDTO> getFeeList() {
    return this.feeList;
    }
    public void setFeeList(List<CainiaoGlobalSolutionInquiryOpenFeeDTO> feeList) {
    this.feeList = feeList;
    }
        public Integer getRecommendIndex() {
    return this.recommendIndex;
    }
    public void setRecommendIndex(Integer recommendIndex) {
    this.recommendIndex = recommendIndex;
    }
    }