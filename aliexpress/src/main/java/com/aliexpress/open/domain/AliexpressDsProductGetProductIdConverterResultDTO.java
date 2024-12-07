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

public class AliexpressDsProductGetProductIdConverterResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** main productId */
                @ApiField("main_product_id")
            private Long mainProductId;
        /** sub productId */
                @ApiField("sub_product_id")
            private HashMap<String, Object> subProductId;
    
        public Long getMainProductId() {
    return this.mainProductId;
    }
    public void setMainProductId(Long mainProductId) {
    this.mainProductId = mainProductId;
    }
        public HashMap<String, Object> getSubProductId() {
    return this.subProductId;
    }
    public void setSubProductId(HashMap<String, Object> subProductId) {
    this.subProductId = subProductId;
    }
    }