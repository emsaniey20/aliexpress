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

public class AliexpressWarehouseReturnFoCancelPost implements Serializable {
    private static final long serialVersionUID = 1L;
        /** true表示取消成功，false表示取消失败，当返回false时，需要返回取消失败原因 */
                @ApiField("cancelStatus")
            private Boolean cancelStatus;
        /** 取消失败原因 */
                @ApiField("reason")
            private String reason;
    
        public Boolean getCancelStatus() {
    return this.cancelStatus;
    }
    public void setCancelStatus(Boolean cancelStatus) {
    this.cancelStatus = cancelStatus;
    }
        public String getReason() {
    return this.reason;
    }
    public void setReason(String reason) {
    this.reason = reason;
    }
    }