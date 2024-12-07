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

public class AliexpressLogisticsQueryRuleInfoServiceNetRuleInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 服务类型 */
                @ApiField("service_type")
            private String serviceType;
        /** 服务规则明细 */
                @ApiField("service_net_rule_config_dto")
            private AliexpressLogisticsQueryRuleInfoServiceNetRuleConfigDTO serviceNetRuleConfigDto;
    
        public String getServiceType() {
    return this.serviceType;
    }
    public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
    }
        public AliexpressLogisticsQueryRuleInfoServiceNetRuleConfigDTO getServiceNetRuleConfigDto() {
    return this.serviceNetRuleConfigDto;
    }
    public void setServiceNetRuleConfigDto(AliexpressLogisticsQueryRuleInfoServiceNetRuleConfigDTO serviceNetRuleConfigDto) {
    this.serviceNetRuleConfigDto = serviceNetRuleConfigDto;
    }
    }