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

public class AeMerchantAssortmentSellerPlanChanceListMotorcyclePlanChanceVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** - */
                @ApiField("total_ranking")
            private Integer totalRanking;
        /** - */
                @ApiField("oemi")
            private String oemi;
        /** - */
                @ApiField("country")
            private String country;
        /** - */
                @ApiField("trims")
            private String trims;
        /** - */
                @ApiField("model")
            private String model;
        /** - */
                @ApiField("plan_id")
            private String planId;
        /** - */
                @ApiField("star_grade")
            private Integer starGrade;
        /** - */
                @ApiField("make")
            private String make;
        /** - */
                @ApiField("years")
            private String years;
    
        public Integer getTotalRanking() {
    return this.totalRanking;
    }
    public void setTotalRanking(Integer totalRanking) {
    this.totalRanking = totalRanking;
    }
        public String getOemi() {
    return this.oemi;
    }
    public void setOemi(String oemi) {
    this.oemi = oemi;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getTrims() {
    return this.trims;
    }
    public void setTrims(String trims) {
    this.trims = trims;
    }
        public String getModel() {
    return this.model;
    }
    public void setModel(String model) {
    this.model = model;
    }
        public String getPlanId() {
    return this.planId;
    }
    public void setPlanId(String planId) {
    this.planId = planId;
    }
        public Integer getStarGrade() {
    return this.starGrade;
    }
    public void setStarGrade(Integer starGrade) {
    this.starGrade = starGrade;
    }
        public String getMake() {
    return this.make;
    }
    public void setMake(String make) {
    this.make = make;
    }
        public String getYears() {
    return this.years;
    }
    public void setYears(String years) {
    this.years = years;
    }
    }