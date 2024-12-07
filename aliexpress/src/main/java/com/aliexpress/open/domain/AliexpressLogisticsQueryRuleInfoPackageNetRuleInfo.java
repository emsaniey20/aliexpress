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

public class AliexpressLogisticsQueryRuleInfoPackageNetRuleInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹规则明细 */
                @ApiField("package_net_rule_config_dto")
            private AliexpressLogisticsQueryRuleInfoPackageNetRuleConfigDTO packageNetRuleConfigDto;
        /** 标准 */
                @ApiField("logistics_class")
            private String logisticsClass;
    
        public AliexpressLogisticsQueryRuleInfoPackageNetRuleConfigDTO getPackageNetRuleConfigDto() {
    return this.packageNetRuleConfigDto;
    }
    public void setPackageNetRuleConfigDto(AliexpressLogisticsQueryRuleInfoPackageNetRuleConfigDTO packageNetRuleConfigDto) {
    this.packageNetRuleConfigDto = packageNetRuleConfigDto;
    }
        public String getLogisticsClass() {
    return this.logisticsClass;
    }
    public void setLogisticsClass(String logisticsClass) {
    this.logisticsClass = logisticsClass;
    }
    }