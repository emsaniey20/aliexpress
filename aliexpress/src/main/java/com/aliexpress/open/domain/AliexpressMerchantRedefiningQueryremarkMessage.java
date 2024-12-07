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

public class AliexpressMerchantRedefiningQueryremarkMessage implements Serializable {
    private static final long serialVersionUID = 1L;
        /** remarkId */
                @ApiField("remark_id")
            private Long remarkId;
        /** content */
                @ApiField("content")
            private String content;
    
        public Long getRemarkId() {
    return this.remarkId;
    }
    public void setRemarkId(Long remarkId) {
    this.remarkId = remarkId;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
    }