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

public class AliexpressMessageSessionOpenAeImSessionOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家id */
                @ApiField("buyer_id")
            private Long buyerId;
        /** 买家登录id */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
    
        public Long getBuyerId() {
    return this.buyerId;
    }
    public void setBuyerId(Long buyerId) {
    this.buyerId = buyerId;
    }
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
    }