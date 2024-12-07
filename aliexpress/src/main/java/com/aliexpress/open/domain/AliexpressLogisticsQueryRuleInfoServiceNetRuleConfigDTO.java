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

public class AliexpressLogisticsQueryRuleInfoServiceNetRuleConfigDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 条件 */
                @ApiListField("condition")
            private List<AliexpressLogisticsQueryRuleInfoServiceNetRuleConditionDTO> condition;
        /** 物流服务code列表 */
                @ApiListField("logistics_code_levels")
            private List<String> logisticsCodeLevels;
        /** 物流服务code列表 */
                @ApiListField("logistics_codes")
            private List<String> logisticsCodes;
    
        public List<AliexpressLogisticsQueryRuleInfoServiceNetRuleConditionDTO> getCondition() {
    return this.condition;
    }
    public void setCondition(List<AliexpressLogisticsQueryRuleInfoServiceNetRuleConditionDTO> condition) {
    this.condition = condition;
    }
        public List<String> getLogisticsCodeLevels() {
    return this.logisticsCodeLevels;
    }
    public void setLogisticsCodeLevels(List<String> logisticsCodeLevels) {
    this.logisticsCodeLevels = logisticsCodeLevels;
    }
        public List<String> getLogisticsCodes() {
    return this.logisticsCodes;
    }
    public void setLogisticsCodes(List<String> logisticsCodes) {
    this.logisticsCodes = logisticsCodes;
    }
    }