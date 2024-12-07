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

public class GlobalCategoryTreeGetAuthDO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("seller_id")
            private Long sellerId;
        /** 1 */
                @ApiField("user_email")
            private String userEmail;
        /** 1 */
                @ApiField("user_id")
            private Long userId;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public String getUserEmail() {
    return this.userEmail;
    }
    public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
    }
        public Long getUserId() {
    return this.userId;
    }
    public void setUserId(Long userId) {
    this.userId = userId;
    }
    }