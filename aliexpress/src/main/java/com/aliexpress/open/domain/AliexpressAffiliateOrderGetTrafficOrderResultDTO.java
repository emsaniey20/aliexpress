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

public class AliexpressAffiliateOrderGetTrafficOrderResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Record count */
                @ApiField("current_record_count")
            private Long currentRecordCount;
        /** order list */
                @ApiListField("orders")
            private List<AliexpressAffiliateOrderGetTrafficOrderEffectDTO> orders;
    
        public Long getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Long currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public List<AliexpressAffiliateOrderGetTrafficOrderEffectDTO> getOrders() {
    return this.orders;
    }
    public void setOrders(List<AliexpressAffiliateOrderGetTrafficOrderEffectDTO> orders) {
    this.orders = orders;
    }
    }