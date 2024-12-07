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

public class AriseReverseOrderReturnUpdatereasonInfosMap implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 退货退款原因 */
                @ApiField("reason_name")
            private String reasonName;
        /** 退货退款原因ID */
                @ApiField("reason_id")
            private Integer reasonId;
    
        public String getReasonName() {
    return this.reasonName;
    }
    public void setReasonName(String reasonName) {
    this.reasonName = reasonName;
    }
        public Integer getReasonId() {
    return this.reasonId;
    }
    public void setReasonId(Integer reasonId) {
    this.reasonId = reasonId;
    }
    }