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

public class GspOrderQueryforsupplierDistributorDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 分销商sellerId */
                @ApiField("id")
            private String id;
        /** 代采商sellerId */
                @ApiField("proxyId")
            private String proxyId;
    
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public String getProxyId() {
    return this.proxyId;
    }
    public void setProxyId(String proxyId) {
    this.proxyId = proxyId;
    }
    }