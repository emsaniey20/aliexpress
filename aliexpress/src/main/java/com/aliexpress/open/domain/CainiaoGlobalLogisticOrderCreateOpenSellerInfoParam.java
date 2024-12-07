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

public class CainiaoGlobalLogisticOrderCreateOpenSellerInfoParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 跨店铺组包时的店铺分组ID */
                @ApiField("top_user_key")
            private String topUserKey;
    
        public String getTopUserKey() {
    return this.topUserKey;
    }
    public void setTopUserKey(String topUserKey) {
    this.topUserKey = topUserKey;
    }
    }