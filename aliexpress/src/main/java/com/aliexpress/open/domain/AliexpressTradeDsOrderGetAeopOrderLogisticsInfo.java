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

public class AliexpressTradeDsOrderGetAeopOrderLogisticsInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** logistics tracking number */
                @ApiField("logistics_no")
            private String logisticsNo;
        /** logistics service */
                @ApiField("logistics_service")
            private String logisticsService;
    
        public String getLogisticsNo() {
    return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo) {
    this.logisticsNo = logisticsNo;
    }
        public String getLogisticsService() {
    return this.logisticsService;
    }
    public void setLogisticsService(String logisticsService) {
    this.logisticsService = logisticsService;
    }
    }