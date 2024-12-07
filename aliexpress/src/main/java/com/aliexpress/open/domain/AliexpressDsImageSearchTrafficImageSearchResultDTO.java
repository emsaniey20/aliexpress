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

public class AliexpressDsImageSearchTrafficImageSearchResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** products */
                @ApiListField("products")
            private List<AliexpressDsImageSearchTrafficImageProductDTO> products;
        /** total count */
                @ApiField("total_record_count")
            private Integer totalRecordCount;
    
        public List<AliexpressDsImageSearchTrafficImageProductDTO> getProducts() {
    return this.products;
    }
    public void setProducts(List<AliexpressDsImageSearchTrafficImageProductDTO> products) {
    this.products = products;
    }
        public Integer getTotalRecordCount() {
    return this.totalRecordCount;
    }
    public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    }
    }