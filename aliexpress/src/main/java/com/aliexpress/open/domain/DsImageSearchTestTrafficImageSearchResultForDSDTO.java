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

public class DsImageSearchTestTrafficImageSearchResultForDSDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiListField("products")
            private List<DsImageSearchTestString> products;
        /** 1 */
                @ApiField("totalRecordCount")
            private Long totalRecordCount;
    
        public List<DsImageSearchTestString> getProducts() {
    return this.products;
    }
    public void setProducts(List<DsImageSearchTestString> products) {
    this.products = products;
    }
        public Long getTotalRecordCount() {
    return this.totalRecordCount;
    }
    public void setTotalRecordCount(Long totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    }
    }