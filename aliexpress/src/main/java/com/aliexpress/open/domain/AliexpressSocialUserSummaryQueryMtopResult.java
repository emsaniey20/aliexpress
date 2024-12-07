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

public class AliexpressSocialUserSummaryQueryMtopResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Result body */
                @ApiField("model")
            private AliexpressSocialUserSummaryQuerySnsUserSummaryRs model;
        /** Result */
                @ApiField("success")
            private Boolean success;
    
        public AliexpressSocialUserSummaryQuerySnsUserSummaryRs getModel() {
    return this.model;
    }
    public void setModel(AliexpressSocialUserSummaryQuerySnsUserSummaryRs model) {
    this.model = model;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }