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

public class AliexpressLogisticsQueryRuleInfoNetRuleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 服务网规信息列表 */
                @ApiListField("service_net_rule_info_list")
            private List<AliexpressLogisticsQueryRuleInfoServiceNetRuleInfo> serviceNetRuleInfoList;
        /** 包裹规则列表 */
                @ApiListField("package_net_rule_info_list")
            private List<AliexpressLogisticsQueryRuleInfoPackageNetRuleInfo> packageNetRuleInfoList;
    
        public List<AliexpressLogisticsQueryRuleInfoServiceNetRuleInfo> getServiceNetRuleInfoList() {
    return this.serviceNetRuleInfoList;
    }
    public void setServiceNetRuleInfoList(List<AliexpressLogisticsQueryRuleInfoServiceNetRuleInfo> serviceNetRuleInfoList) {
    this.serviceNetRuleInfoList = serviceNetRuleInfoList;
    }
        public List<AliexpressLogisticsQueryRuleInfoPackageNetRuleInfo> getPackageNetRuleInfoList() {
    return this.packageNetRuleInfoList;
    }
    public void setPackageNetRuleInfoList(List<AliexpressLogisticsQueryRuleInfoPackageNetRuleInfo> packageNetRuleInfoList) {
    this.packageNetRuleInfoList = packageNetRuleInfoList;
    }
    }