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

public class AliexpressRuAffiliateProductdetailGetPromoCodeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** The end time of the valid period of code usage */
                @ApiField("code_available_time_end")
            private String codeAvailableTimeEnd;
        /** The start time of the valid period of code usage */
                @ApiField("code_available_time_start")
            private String codeAvailableTimeStart;
        /** Discount method 1 full discount, 2 full discount */
                @ApiField("code_campaign_type")
            private String codeCampaignType;
        /** Minimum use threshold */
                @ApiField("code_mini_spend")
            private String codeMiniSpend;
        /** Product code in one url */
                @ApiField("code_promotion_url")
            private String codePromotionUrl;
        /** The remaining amount of code that can be used */
                @ApiField("code_quantity")
            private String codeQuantity;
        /** Denomination */
                @ApiField("code_value")
            private String codeValue;
        /** Exclusive binding PID code code */
                @ApiField("promo_code")
            private String promoCode;
    
        public String getCodeAvailableTimeEnd() {
    return this.codeAvailableTimeEnd;
    }
    public void setCodeAvailableTimeEnd(String codeAvailableTimeEnd) {
    this.codeAvailableTimeEnd = codeAvailableTimeEnd;
    }
        public String getCodeAvailableTimeStart() {
    return this.codeAvailableTimeStart;
    }
    public void setCodeAvailableTimeStart(String codeAvailableTimeStart) {
    this.codeAvailableTimeStart = codeAvailableTimeStart;
    }
        public String getCodeCampaignType() {
    return this.codeCampaignType;
    }
    public void setCodeCampaignType(String codeCampaignType) {
    this.codeCampaignType = codeCampaignType;
    }
        public String getCodeMiniSpend() {
    return this.codeMiniSpend;
    }
    public void setCodeMiniSpend(String codeMiniSpend) {
    this.codeMiniSpend = codeMiniSpend;
    }
        public String getCodePromotionUrl() {
    return this.codePromotionUrl;
    }
    public void setCodePromotionUrl(String codePromotionUrl) {
    this.codePromotionUrl = codePromotionUrl;
    }
        public String getCodeQuantity() {
    return this.codeQuantity;
    }
    public void setCodeQuantity(String codeQuantity) {
    this.codeQuantity = codeQuantity;
    }
        public String getCodeValue() {
    return this.codeValue;
    }
    public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
    }
        public String getPromoCode() {
    return this.promoCode;
    }
    public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
    }
    }