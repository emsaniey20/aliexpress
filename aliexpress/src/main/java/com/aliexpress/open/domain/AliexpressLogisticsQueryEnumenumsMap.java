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

public class AliexpressLogisticsQueryEnumenumsMap implements Serializable {
    private static final long serialVersionUID = 1L;
        /** destination国家 */
                @ApiListField("country_of_destination_list")
            private List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> countryOfDestinationList;
        /** delivery国家 */
                @ApiListField("country_of_delivery_list")
            private List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> countryOfDeliveryList;
        /** 头程单状态 */
                @ApiListField("logistics_order_status_list")
            private List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> logisticsOrderStatusList;
    
        public List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> getCountryOfDestinationList() {
    return this.countryOfDestinationList;
    }
    public void setCountryOfDestinationList(List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> countryOfDestinationList) {
    this.countryOfDestinationList = countryOfDestinationList;
    }
        public List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> getCountryOfDeliveryList() {
    return this.countryOfDeliveryList;
    }
    public void setCountryOfDeliveryList(List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> countryOfDeliveryList) {
    this.countryOfDeliveryList = countryOfDeliveryList;
    }
        public List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> getLogisticsOrderStatusList() {
    return this.logisticsOrderStatusList;
    }
    public void setLogisticsOrderStatusList(List<AliexpressLogisticsQueryEnumSelectCommonStructureInfo> logisticsOrderStatusList) {
    this.logisticsOrderStatusList = logisticsOrderStatusList;
    }
    }