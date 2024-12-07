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

public class AliexpressInfluencerContentResourceCheckResourceStatusDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 资源唯一标识符 */
                @ApiField("resource_id")
            private Long resourceId;
        /** 资源URL */
                @ApiField("url")
            private String url;
        /** 资源状态 0=可用，1=未上传 2=上传中 3=链接访问失败 4=资源校验失败 */
                @ApiField("status")
            private Integer status;
    
        public Long getResourceId() {
    return this.resourceId;
    }
    public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
    }
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public Integer getStatus() {
    return this.status;
    }
    public void setStatus(Integer status) {
    this.status = status;
    }
    }