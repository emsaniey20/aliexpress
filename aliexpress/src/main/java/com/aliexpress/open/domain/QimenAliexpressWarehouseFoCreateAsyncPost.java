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

public class QimenAliexpressWarehouseFoCreateAsyncPost implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 仓订单号 */
                @ApiField("wmsOrderId")
            private String wmsOrderId;
    
        public String getWmsOrderId() {
    return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId) {
    this.wmsOrderId = wmsOrderId;
    }
    }