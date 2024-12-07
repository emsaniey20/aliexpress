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

public class DsProductGetAeopNationalQuoteConfiguration implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111 */
                @ApiField("configuration_data")
            private String configurationData;
        /** 111 */
                @ApiField("configuration_type")
            private String configurationType;
    
        public String getConfigurationData() {
    return this.configurationData;
    }
    public void setConfigurationData(String configurationData) {
    this.configurationData = configurationData;
    }
        public String getConfigurationType() {
    return this.configurationType;
    }
    public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
    }
    }