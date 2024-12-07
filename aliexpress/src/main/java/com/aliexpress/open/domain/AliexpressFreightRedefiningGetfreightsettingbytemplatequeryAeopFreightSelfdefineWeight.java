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

public class AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSelfdefineWeight implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 区间内,单位重量 */
                @ApiField("interval_unit_weight")
            private Long intervalUnitWeight;
        /** 重量区间结束 */
                @ApiField("end_weight")
            private Long endWeight;
        /** 重量区间起始 */
                @ApiField("start_weight")
            private Long startWeight;
        /** 区间内,单元重量运费 */
                @ApiField("interval_unit_freight")
            private Long intervalUnitFreight;
    
        public Long getIntervalUnitWeight() {
    return this.intervalUnitWeight;
    }
    public void setIntervalUnitWeight(Long intervalUnitWeight) {
    this.intervalUnitWeight = intervalUnitWeight;
    }
        public Long getEndWeight() {
    return this.endWeight;
    }
    public void setEndWeight(Long endWeight) {
    this.endWeight = endWeight;
    }
        public Long getStartWeight() {
    return this.startWeight;
    }
    public void setStartWeight(Long startWeight) {
    this.startWeight = startWeight;
    }
        public Long getIntervalUnitFreight() {
    return this.intervalUnitFreight;
    }
    public void setIntervalUnitFreight(Long intervalUnitFreight) {
    this.intervalUnitFreight = intervalUnitFreight;
    }
    }