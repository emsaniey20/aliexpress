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

public class AliexpressInfluencerContentResourceCheckResourceCheckRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 资源唯一标识符，由上传接口返回 */
                @ApiListField("resource_ids")
            private List<Long> resourceIds;
        /** 邮箱 */
                @ApiField("email")
            private String email;
    
        public List<Long> getResourceIds() {
    return this.resourceIds;
    }
    public void setResourceIds(List<Long> resourceIds) {
    this.resourceIds = resourceIds;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    }