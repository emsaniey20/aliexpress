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

public class AliexpressLogisticsRedefiningGetprintinfosAeopWarehouseOrderQueryPdfRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** international logistics waybill ID */
                @ApiField("international_logistics_id")
            private String internationalLogisticsId;
        /** id is optional */
                @ApiField("id")
            private Long id;
    
        public String getInternationalLogisticsId() {
    return this.internationalLogisticsId;
    }
    public void setInternationalLogisticsId(String internationalLogisticsId) {
    this.internationalLogisticsId = internationalLogisticsId;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    }