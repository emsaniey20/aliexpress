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

public class AliexpressMiniappOrderCreatePrecheckMarketClientInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** biz code */
                @ApiField("open_biz_code")
            private String openBizCode;
        /** mini program app id */
                @ApiField("open_app_id")
            private String openAppId;
    
        public String getOpenBizCode() {
    return this.openBizCode;
    }
    public void setOpenBizCode(String openBizCode) {
    this.openBizCode = openBizCode;
    }
        public String getOpenAppId() {
    return this.openAppId;
    }
    public void setOpenAppId(String openAppId) {
    this.openAppId = openAppId;
    }
    }