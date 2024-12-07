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

public class DsImageSearchTrafficImageSearchResultForDSDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** products */
                @ApiListField("products")
            private List<DsImageSearchTrafficImageProductDTO> products;
        /** total record count */
                @ApiField("total_record_count")
            private Integer totalRecordCount;
    
        public List<DsImageSearchTrafficImageProductDTO> getProducts() {
    return this.products;
    }
    public void setProducts(List<DsImageSearchTrafficImageProductDTO> products) {
    this.products = products;
    }
        public Integer getTotalRecordCount() {
    return this.totalRecordCount;
    }
    public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    }
    }