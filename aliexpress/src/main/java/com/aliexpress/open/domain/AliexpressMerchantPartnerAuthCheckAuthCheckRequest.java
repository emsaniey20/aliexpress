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

public class AliexpressMerchantPartnerAuthCheckAuthCheckRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务来源 */
                @ApiField("source")
            private String source;
        /** 集团会员账号 */
                @ApiField("havana_id")
            private Long havanaId;
        /** 待验证参数 */
                @ApiField("auth_info_map")
            private HashMap<String, Object> authInfoMap;
        /** 认证类型：1企业，5个人 */
                @ApiField("auth_type")
            private Integer authType;
    
        public String getSource() {
    return this.source;
    }
    public void setSource(String source) {
    this.source = source;
    }
        public Long getHavanaId() {
    return this.havanaId;
    }
    public void setHavanaId(Long havanaId) {
    this.havanaId = havanaId;
    }
        public HashMap<String, Object> getAuthInfoMap() {
    return this.authInfoMap;
    }
    public void setAuthInfoMap(HashMap<String, Object> authInfoMap) {
    this.authInfoMap = authInfoMap;
    }
        public Integer getAuthType() {
    return this.authType;
    }
    public void setAuthType(Integer authType) {
    this.authType = authType;
    }
    }