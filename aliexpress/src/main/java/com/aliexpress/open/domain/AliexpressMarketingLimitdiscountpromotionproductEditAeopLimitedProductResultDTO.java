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

public class AliexpressMarketingLimitdiscountpromotionproductEditAeopLimitedProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 有冲突的商品信息 */
                @ApiField("conflict_products")
            private String conflictProducts;
    
        public String getConflictProducts() {
    return this.conflictProducts;
    }
    public void setConflictProducts(String conflictProducts) {
    this.conflictProducts = conflictProducts;
    }
    }