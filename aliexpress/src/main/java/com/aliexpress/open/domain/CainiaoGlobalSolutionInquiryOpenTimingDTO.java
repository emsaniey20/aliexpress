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

public class CainiaoGlobalSolutionInquiryOpenTimingDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 展示文案 */
                @ApiField("display_text")
            private String displayText;
        /** 最慢时效 */
                @ApiField("slowest_timing")
            private Long slowestTiming;
        /** 最快时效 */
                @ApiField("fast_timing")
            private Long fastTiming;
        /** 时效类型，ESTIMATE：预估时效，PROMISE：承诺时效 */
                @ApiField("timing_type")
            private String timingType;
    
        public String getDisplayText() {
    return this.displayText;
    }
    public void setDisplayText(String displayText) {
    this.displayText = displayText;
    }
        public Long getSlowestTiming() {
    return this.slowestTiming;
    }
    public void setSlowestTiming(Long slowestTiming) {
    this.slowestTiming = slowestTiming;
    }
        public Long getFastTiming() {
    return this.fastTiming;
    }
    public void setFastTiming(Long fastTiming) {
    this.fastTiming = fastTiming;
    }
        public String getTimingType() {
    return this.timingType;
    }
    public void setTimingType(String timingType) {
    this.timingType = timingType;
    }
    }