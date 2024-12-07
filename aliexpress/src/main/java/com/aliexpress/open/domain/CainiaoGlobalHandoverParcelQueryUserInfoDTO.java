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

public class CainiaoGlobalHandoverParcelQueryUserInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 每个商家在ISV系统的唯一标识，一般为商家ISV账号的id */
                @ApiField("top_user_key")
            private String topUserKey;
    
        public String getTopUserKey() {
    return this.topUserKey;
    }
    public void setTopUserKey(String topUserKey) {
    this.topUserKey = topUserKey;
    }
    }