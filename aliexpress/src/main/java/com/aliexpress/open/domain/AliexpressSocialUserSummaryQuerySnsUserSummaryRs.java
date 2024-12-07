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

public class AliexpressSocialUserSummaryQuerySnsUserSummaryRs implements Serializable {
    private static final long serialVersionUID = 1L;
        /** AE account ID */
                @ApiField("ae_account")
            private Long aeAccount;
        /** Indicates if it's new user or not */
                @ApiField("new_user")
            private Boolean newUser;
        /** Indicates if user has saved credit card in AE or not */
                @ApiField("has_credit_card")
            private Boolean hasCreditCard;
        /** Indicates if user enabled push notifications */
                @ApiField("allow_pushes")
            private Boolean allowPushes;
        /** Indicates if user saved delivery address */
                @ApiField("has_mailing_address")
            private Boolean hasMailingAddress;
        /** Indicates if user has order for provided filter or not */
                @ApiField("has_order")
            private Boolean hasOrder;
    
        public Long getAeAccount() {
    return this.aeAccount;
    }
    public void setAeAccount(Long aeAccount) {
    this.aeAccount = aeAccount;
    }
        public Boolean getNewUser() {
    return this.newUser;
    }
    public void setNewUser(Boolean newUser) {
    this.newUser = newUser;
    }
        public Boolean getHasCreditCard() {
    return this.hasCreditCard;
    }
    public void setHasCreditCard(Boolean hasCreditCard) {
    this.hasCreditCard = hasCreditCard;
    }
        public Boolean getAllowPushes() {
    return this.allowPushes;
    }
    public void setAllowPushes(Boolean allowPushes) {
    this.allowPushes = allowPushes;
    }
        public Boolean getHasMailingAddress() {
    return this.hasMailingAddress;
    }
    public void setHasMailingAddress(Boolean hasMailingAddress) {
    this.hasMailingAddress = hasMailingAddress;
    }
        public Boolean getHasOrder() {
    return this.hasOrder;
    }
    public void setHasOrder(Boolean hasOrder) {
    this.hasOrder = hasOrder;
    }
    }