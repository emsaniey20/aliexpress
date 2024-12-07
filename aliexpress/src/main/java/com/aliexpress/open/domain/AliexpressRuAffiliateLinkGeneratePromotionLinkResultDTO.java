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

public class AliexpressRuAffiliateLinkGeneratePromotionLinkResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Links */
                @ApiListField("promotion_links")
            private List<AliexpressRuAffiliateLinkGeneratePromotionLinkDTO> promotionLinks;
        /** Total results count */
                @ApiField("total_result_count")
            private Long totalResultCount;
        /** Promoter tracking id */
                @ApiField("tracking_id")
            private String trackingId;
    
        public List<AliexpressRuAffiliateLinkGeneratePromotionLinkDTO> getPromotionLinks() {
    return this.promotionLinks;
    }
    public void setPromotionLinks(List<AliexpressRuAffiliateLinkGeneratePromotionLinkDTO> promotionLinks) {
    this.promotionLinks = promotionLinks;
    }
        public Long getTotalResultCount() {
    return this.totalResultCount;
    }
    public void setTotalResultCount(Long totalResultCount) {
    this.totalResultCount = totalResultCount;
    }
        public String getTrackingId() {
    return this.trackingId;
    }
    public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
    }
    }