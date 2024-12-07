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

public class AliexpressLogisticsGetpdfsbycloudprintAeopWarehouseOrderQueryPdfRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 物流订单号 */
                @ApiField("id")
            private Long id;
        /** 创建线上发货  产生的 国际运单号 */
                @ApiField("international_logistics_id")
            private String internationalLogisticsId;
        /** 自定义分拣单信息 */
                @ApiField("extend_data")
            private String extendData;
    
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getInternationalLogisticsId() {
    return this.internationalLogisticsId;
    }
    public void setInternationalLogisticsId(String internationalLogisticsId) {
    this.internationalLogisticsId = internationalLogisticsId;
    }
        public String getExtendData() {
    return this.extendData;
    }
    public void setExtendData(String extendData) {
    this.extendData = extendData;
    }
    }