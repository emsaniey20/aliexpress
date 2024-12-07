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

public class AliexpressMessageSessionOpenAeImSessionOpenResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否开启成功，SUCCESS-成功，FAIL-失败 */
                @ApiField("open_result")
            private String openResult;
        /** 当前的买家id */
                @ApiField("current_buyer_id")
            private Long currentBuyerId;
    
        public String getOpenResult() {
    return this.openResult;
    }
    public void setOpenResult(String openResult) {
    this.openResult = openResult;
    }
        public Long getCurrentBuyerId() {
    return this.currentBuyerId;
    }
    public void setCurrentBuyerId(Long currentBuyerId) {
    this.currentBuyerId = currentBuyerId;
    }
    }