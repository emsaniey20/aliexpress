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

public class CainiaoGlobalHandoverCommitSellerParcelOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** seller id */
                @ApiField("seller_id")
            private Long sellerId;
        /** 小包LP号列表 */
                @ApiListField("order_code_list")
            private List<String> orderCodeList;
        /** 店铺id */
                @ApiField("user_nick")
            private String userNick;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public List<String> getOrderCodeList() {
    return this.orderCodeList;
    }
    public void setOrderCodeList(List<String> orderCodeList) {
    this.orderCodeList = orderCodeList;
    }
        public String getUserNick() {
    return this.userNick;
    }
    public void setUserNick(String userNick) {
    this.userNick = userNick;
    }
    }