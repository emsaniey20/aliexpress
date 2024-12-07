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

public class CainiaoGlobalHandoverContentSubbagAddHandoverContentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 子包id */
                @ApiField("subbag_id")
            private Long subbagId;
        /** 子包创建时间时间戳 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 子包号 */
                @ApiField("subbag_code")
            private String subbagCode;
    
        public Long getSubbagId() {
    return this.subbagId;
    }
    public void setSubbagId(Long subbagId) {
    this.subbagId = subbagId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getSubbagCode() {
    return this.subbagCode;
    }
    public void setSubbagCode(String subbagCode) {
    this.subbagCode = subbagCode;
    }
    }