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

public class AliexpressSolutionSkuAttributeQuerySkuAttributeInfoQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** aliexpress category ID. aliexpress_category_id and category_id could not be both empty. */
                @ApiField("aliexpress_category_id")
            private Long aliexpressCategoryId;
        /** merchant's category ID */
                @ApiField("category_id")
            private String categoryId;
    
        public Long getAliexpressCategoryId() {
    return this.aliexpressCategoryId;
    }
    public void setAliexpressCategoryId(Long aliexpressCategoryId) {
    this.aliexpressCategoryId = aliexpressCategoryId;
    }
        public String getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
    }
    }