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

public class AliexpressPostproductRedefiningGetwindowproductsString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 橱窗的开始生效时间。 */
                @ApiField("enabled_date")
            private String enabledDate;
        /** 橱窗的失效时间。 */
                @ApiField("expired_date")
            private String expiredDate;
        /** 被推荐的产品ID */
                @ApiField("product_id")
            private Long productId;
        /** 当前橱窗的剩余有效天数。 */
                @ApiField("remaining_days")
            private Long remainingDays;
    
        public String getEnabledDate() {
    return this.enabledDate;
    }
    public void setEnabledDate(String enabledDate) {
    this.enabledDate = enabledDate;
    }
        public String getExpiredDate() {
    return this.expiredDate;
    }
    public void setExpiredDate(String expiredDate) {
    this.expiredDate = expiredDate;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Long getRemainingDays() {
    return this.remainingDays;
    }
    public void setRemainingDays(Long remainingDays) {
    this.remainingDays = remainingDays;
    }
    }