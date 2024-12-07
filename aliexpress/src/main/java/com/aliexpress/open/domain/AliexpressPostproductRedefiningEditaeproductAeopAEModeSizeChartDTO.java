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

public class AliexpressPostproductRedefiningEditaeproductAeopAEModeSizeChartDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 臀围 */
                @ApiField("hips")
            private String hips;
        /** 腰围 */
                @ApiField("waist")
            private String waist;
        /** 胸围 */
                @ApiField("bust")
            private String bust;
        /** 身高 */
                @ApiField("height")
            private String height;
        /** 试穿尺码 */
                @ApiField("mode_size")
            private String modeSize;
    
        public String getHips() {
    return this.hips;
    }
    public void setHips(String hips) {
    this.hips = hips;
    }
        public String getWaist() {
    return this.waist;
    }
    public void setWaist(String waist) {
    this.waist = waist;
    }
        public String getBust() {
    return this.bust;
    }
    public void setBust(String bust) {
    this.bust = bust;
    }
        public String getHeight() {
    return this.height;
    }
    public void setHeight(String height) {
    this.height = height;
    }
        public String getModeSize() {
    return this.modeSize;
    }
    public void setModeSize(String modeSize) {
    this.modeSize = modeSize;
    }
    }