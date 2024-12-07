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

public class AliexpressInfluencerContentResourceUploadResourceUploadRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 待上传资源URL列表，需公网可访问 */
                @ApiListField("resource_urls")
            private List<String> resourceUrls;
        /** 邮箱 */
                @ApiField("email")
            private String email;
    
        public List<String> getResourceUrls() {
    return this.resourceUrls;
    }
    public void setResourceUrls(List<String> resourceUrls) {
    this.resourceUrls = resourceUrls;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    }