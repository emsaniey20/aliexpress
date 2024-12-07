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

public class AliexpressSocialShoppingPaymentApplySnsApplyPayResp implements Serializable {
    private static final long serialVersionUID = 1L;
        /** for query result params */
                @ApiField("cashier_request_token")
            private String cashierRequestToken;
        /** for query result params */
                @ApiField("pmnt_id")
            private String pmntId;
        /** for query result params */
                @ApiField("cashier_request_no")
            private String cashierRequestNo;
    
        public String getCashierRequestToken() {
    return this.cashierRequestToken;
    }
    public void setCashierRequestToken(String cashierRequestToken) {
    this.cashierRequestToken = cashierRequestToken;
    }
        public String getPmntId() {
    return this.pmntId;
    }
    public void setPmntId(String pmntId) {
    this.pmntId = pmntId;
    }
        public String getCashierRequestNo() {
    return this.cashierRequestNo;
    }
    public void setCashierRequestNo(String cashierRequestNo) {
    this.cashierRequestNo = cashierRequestNo;
    }
    }