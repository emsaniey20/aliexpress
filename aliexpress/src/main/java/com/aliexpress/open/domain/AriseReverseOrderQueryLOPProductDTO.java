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

public class AriseReverseOrderQueryLOPProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品id */
                @ApiField("id")
            private Long id;
        /** 商品sku */
                @ApiField("sku")
            private String sku;
    
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getSku() {
    return this.sku;
    }
    public void setSku(String sku) {
    this.sku = sku;
    }
    }