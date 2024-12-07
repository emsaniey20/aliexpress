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

public class AliexpressAffiliateCategoryGetCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Category ID */
                @ApiField("category_id")
            private Long categoryId;
        /** Category Name */
                @ApiField("category_name")
            private String categoryName;
        /** Parent category ID */
                @ApiField("parent_category_id")
            private Long parentCategoryId;
    
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getCategoryName() {
    return this.categoryName;
    }
    public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
    }
        public Long getParentCategoryId() {
    return this.parentCategoryId;
    }
    public void setParentCategoryId(Long parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
    }
    }