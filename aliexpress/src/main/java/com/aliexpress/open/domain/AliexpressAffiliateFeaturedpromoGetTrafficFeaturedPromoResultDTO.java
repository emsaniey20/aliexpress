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

public class AliexpressAffiliateFeaturedpromoGetTrafficFeaturedPromoResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Current record count of return */
                @ApiField("current_record_count")
            private Long currentRecordCount;
        /** Returned list of featured promotion */
                @ApiListField("promos")
            private List<AliexpressAffiliateFeaturedpromoGetTrafficFeaturedPromoDTO> promos;
    
        public Long getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Long currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public List<AliexpressAffiliateFeaturedpromoGetTrafficFeaturedPromoDTO> getPromos() {
    return this.promos;
    }
    public void setPromos(List<AliexpressAffiliateFeaturedpromoGetTrafficFeaturedPromoDTO> promos) {
    this.promos = promos;
    }
    }