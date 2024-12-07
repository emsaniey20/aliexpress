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

public class CainiaoGlobalCommithandovercontentUpdateHandoverContentUpdateParcelDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 小包对应的店铺id;填入相关信息性能更好 */
                @ApiField("seller_id")
            private String sellerId;
        /** 小包对应的店铺账号;比如cnxxxx;填入补充相关信息性能更好 */
                @ApiField("login_id")
            private String loginId;
        /** 小包的LP号,必填; */
                @ApiField("lp_code")
            private String lpCode;
    
        public String getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
    }
        public String getLoginId() {
    return this.loginId;
    }
    public void setLoginId(String loginId) {
    this.loginId = loginId;
    }
        public String getLpCode() {
    return this.lpCode;
    }
    public void setLpCode(String lpCode) {
    this.lpCode = lpCode;
    }
    }