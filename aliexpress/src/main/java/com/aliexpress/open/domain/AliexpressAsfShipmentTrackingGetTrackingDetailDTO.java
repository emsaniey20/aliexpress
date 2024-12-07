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

public class AliexpressAsfShipmentTrackingGetTrackingDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** trackingCodeDesc */
                @ApiField("trackingCodeDesc")
            private String trackingCodeDesc;
        /** trackingDetailDesc */
                @ApiField("trackingDetailDesc")
            private String trackingDetailDesc;
        /** time */
                @ApiField("time")
            private Long time;
    
        public String getTrackingCodeDesc() {
    return this.trackingCodeDesc;
    }
    public void setTrackingCodeDesc(String trackingCodeDesc) {
    this.trackingCodeDesc = trackingCodeDesc;
    }
        public String getTrackingDetailDesc() {
    return this.trackingDetailDesc;
    }
    public void setTrackingDetailDesc(String trackingDetailDesc) {
    this.trackingDetailDesc = trackingDetailDesc;
    }
        public Long getTime() {
    return this.time;
    }
    public void setTime(Long time) {
    this.time = time;
    }
    }