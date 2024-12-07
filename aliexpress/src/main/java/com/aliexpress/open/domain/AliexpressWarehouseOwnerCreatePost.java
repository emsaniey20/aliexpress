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

public class AliexpressWarehouseOwnerCreatePost implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 货主ID */
                @ApiField("ownerId")
            private String ownerId;
        /** 密钥:支持免登 */
                @ApiField("secretKey")
            private String secretKey;
    
        public String getOwnerId() {
    return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
    }
        public String getSecretKey() {
    return this.secretKey;
    }
    public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
    }
    }