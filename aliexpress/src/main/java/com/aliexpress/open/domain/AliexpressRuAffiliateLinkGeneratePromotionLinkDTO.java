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

public class AliexpressRuAffiliateLinkGeneratePromotionLinkDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Generated link */
                @ApiField("promotion_link")
            private String promotionLink;
        /** Original link */
                @ApiField("source_value")
            private String sourceValue;
    
        public String getPromotionLink() {
    return this.promotionLink;
    }
    public void setPromotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
    }
        public String getSourceValue() {
    return this.sourceValue;
    }
    public void setSourceValue(String sourceValue) {
    this.sourceValue = sourceValue;
    }
    }