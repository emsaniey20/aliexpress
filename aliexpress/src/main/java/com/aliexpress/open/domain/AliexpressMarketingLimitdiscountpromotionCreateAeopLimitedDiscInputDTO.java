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

public class AliexpressMarketingLimitdiscountpromotionCreateAeopLimitedDiscInputDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否大促活动 */
                @ApiField("has_promo")
            private Boolean hasPromo;
        /** 活动结束时间 */
                @ApiField("promotion_end_time")
            private String promotionEndTime;
        /** 活动名称 */
                @ApiField("promotion_name")
            private String promotionName;
        /** 活动开始时间 */
                @ApiField("promotion_start_time")
            private String promotionStartTime;
    
        public Boolean getHasPromo() {
    return this.hasPromo;
    }
    public void setHasPromo(Boolean hasPromo) {
    this.hasPromo = hasPromo;
    }
        public String getPromotionEndTime() {
    return this.promotionEndTime;
    }
    public void setPromotionEndTime(String promotionEndTime) {
    this.promotionEndTime = promotionEndTime;
    }
        public String getPromotionName() {
    return this.promotionName;
    }
    public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
    }
        public String getPromotionStartTime() {
    return this.promotionStartTime;
    }
    public void setPromotionStartTime(String promotionStartTime) {
    this.promotionStartTime = promotionStartTime;
    }
    }