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

public class AliexpressFreightRedefiningCalculatefreightAeopFreightCalculateResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** errorCode */
                @ApiField("error_code")
            private Long errorCode;
        /** freight */
                @ApiField("freight")
            private AliexpressFreightRedefiningCalculatefreightMoney freight;
        /** standardFreight */
                @ApiField("standard_freight")
            private AliexpressFreightRedefiningCalculatefreightMoney standardFreight;
        /** serviceName */
                @ApiField("service_name")
            private String serviceName;
    
        public Long getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
    }
        public AliexpressFreightRedefiningCalculatefreightMoney getFreight() {
    return this.freight;
    }
    public void setFreight(AliexpressFreightRedefiningCalculatefreightMoney freight) {
    this.freight = freight;
    }
        public AliexpressFreightRedefiningCalculatefreightMoney getStandardFreight() {
    return this.standardFreight;
    }
    public void setStandardFreight(AliexpressFreightRedefiningCalculatefreightMoney standardFreight) {
    this.standardFreight = standardFreight;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
    }