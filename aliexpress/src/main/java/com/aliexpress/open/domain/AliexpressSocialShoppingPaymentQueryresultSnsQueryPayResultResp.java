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

public class AliexpressSocialShoppingPaymentQueryresultSnsQueryPayResultResp implements Serializable {
    private static final long serialVersionUID = 1L;
        /** redirect url params */
                @ApiField("redirect_params")
            private String redirectParams;
        /** redirect url */
                @ApiField("redirect_url")
            private String redirectUrl;
        /** polling query params */
                @ApiField("query_params")
            private String queryParams;
        /** if need redirect, it's true */
                @ApiField("need_redirect")
            private String needRedirect;
        /** PAY_REDIRECT| QUERY_PAY_RESULT */
                @ApiField("action_code")
            private String actionCode;
        /** polling times */
                @ApiField("counter")
            private Integer counter;
        /** redirect type, post or get */
                @ApiField("redirect_type")
            private String redirectType;
        /** pmnt id */
                @ApiField("pmnt_id")
            private String pmntId;
    
        public String getRedirectParams() {
    return this.redirectParams;
    }
    public void setRedirectParams(String redirectParams) {
    this.redirectParams = redirectParams;
    }
        public String getRedirectUrl() {
    return this.redirectUrl;
    }
    public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    }
        public String getQueryParams() {
    return this.queryParams;
    }
    public void setQueryParams(String queryParams) {
    this.queryParams = queryParams;
    }
        public String getNeedRedirect() {
    return this.needRedirect;
    }
    public void setNeedRedirect(String needRedirect) {
    this.needRedirect = needRedirect;
    }
        public String getActionCode() {
    return this.actionCode;
    }
    public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
    }
        public Integer getCounter() {
    return this.counter;
    }
    public void setCounter(Integer counter) {
    this.counter = counter;
    }
        public String getRedirectType() {
    return this.redirectType;
    }
    public void setRedirectType(String redirectType) {
    this.redirectType = redirectType;
    }
        public String getPmntId() {
    return this.pmntId;
    }
    public void setPmntId(String pmntId) {
    this.pmntId = pmntId;
    }
    }