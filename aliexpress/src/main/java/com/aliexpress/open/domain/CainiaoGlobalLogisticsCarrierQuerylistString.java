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

public class CainiaoGlobalLogisticsCarrierQuerylistString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 承运商名字 */
                @ApiField("courier_name")
            private String courierName;
        /** 承运商code */
                @ApiField("courier_code")
            private String courierCode;
    
        public String getCourierName() {
    return this.courierName;
    }
    public void setCourierName(String courierName) {
    this.courierName = courierName;
    }
        public String getCourierCode() {
    return this.courierCode;
    }
    public void setCourierCode(String courierCode) {
    this.courierCode = courierCode;
    }
    }