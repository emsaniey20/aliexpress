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

public class AliexpressAffiliateHotproductQueryPromoCodeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** promotion code */
                @ApiField("promo_code")
            private String promoCode;
        /** campaigntype of promotion 0 means get X$ off from XX, 1 means get X% off from XX. */
                @ApiField("code_campaigntype")
            private String codeCampaigntype;
        /** value of promotion */
                @ApiField("code_value")
            private String codeValue;
        /** Start time of expiry date, PST time */
                @ApiField("code_availabletime_start")
            private String codeAvailabletimeStart;
        /** End time of expiry date, PST time */
                @ApiField("code_availabletime_end")
            private String codeAvailabletimeEnd;
        /** code minimum threshold 0 means unlimited */
                @ApiField("code_mini_spend")
            private String codeMiniSpend;
        /** code remaining usable quantity */
                @ApiField("code_quantity")
            private String codeQuantity;
        /** product&code in one promotion url */
                @ApiField("code_promotionurl")
            private String codePromotionurl;
    
        public String getPromoCode() {
    return this.promoCode;
    }
    public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
    }
        public String getCodeCampaigntype() {
    return this.codeCampaigntype;
    }
    public void setCodeCampaigntype(String codeCampaigntype) {
    this.codeCampaigntype = codeCampaigntype;
    }
        public String getCodeValue() {
    return this.codeValue;
    }
    public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
    }
        public String getCodeAvailabletimeStart() {
    return this.codeAvailabletimeStart;
    }
    public void setCodeAvailabletimeStart(String codeAvailabletimeStart) {
    this.codeAvailabletimeStart = codeAvailabletimeStart;
    }
        public String getCodeAvailabletimeEnd() {
    return this.codeAvailabletimeEnd;
    }
    public void setCodeAvailabletimeEnd(String codeAvailabletimeEnd) {
    this.codeAvailabletimeEnd = codeAvailabletimeEnd;
    }
        public String getCodeMiniSpend() {
    return this.codeMiniSpend;
    }
    public void setCodeMiniSpend(String codeMiniSpend) {
    this.codeMiniSpend = codeMiniSpend;
    }
        public String getCodeQuantity() {
    return this.codeQuantity;
    }
    public void setCodeQuantity(String codeQuantity) {
    this.codeQuantity = codeQuantity;
    }
        public String getCodePromotionurl() {
    return this.codePromotionurl;
    }
    public void setCodePromotionurl(String codePromotionurl) {
    this.codePromotionurl = codePromotionurl;
    }
    }