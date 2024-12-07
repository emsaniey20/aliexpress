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

public class AliexpressOfferProductQueryAeopNationalQuoteConfiguration implements Serializable {
    private static final long serialVersionUID = 1L;
        /** jsonArray格式的分国家定价规则数据。 1)基于基准价格按比例配置的数据格式；2)基于基准价格按涨或者跌多少；3）为每个SKU直接设置价格绝对值。其中shiptoCountry：ISO两位的国家编码（目前支持国家：RU US CA ES FR UK NL IL BR CL AU UA BY JP TH SG KR ID MY PH VN IT DE SA AE PL TR）， percentage：相对于基准价的调价比例（百分比整数，支持负数，当前限制>=-30 && <=100）；configuration_type为absolute：14:193为sku属性ID：SKU属性值， 多个属性用，号拼接。 */
                @ApiField("configuration_data")
            private String configurationData;
        /** 分国家定价规则类型[absolute: 为每个SKU直接设置价格绝对值；percentage：基于基准价格按比例配置; relative:相对原价涨或跌多少; */
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