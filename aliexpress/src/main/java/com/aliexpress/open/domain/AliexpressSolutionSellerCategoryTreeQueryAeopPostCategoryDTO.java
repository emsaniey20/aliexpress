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

public class AliexpressSolutionSellerCategoryTreeQueryAeopPostCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** category id */
                @ApiField("children_category_id")
            private Long childrenCategoryId;
        /** whether the category is leaf or not */
                @ApiField("is_leaf_category")
            private Boolean isLeafCategory;
        /** level of the categories. As for root categories, the level is 1 */
                @ApiField("level")
            private Long level;
        /** multi langauge names of the categories */
                @ApiField("multi_language_names")
            private String multiLanguageNames;
    
        public Long getChildrenCategoryId() {
    return this.childrenCategoryId;
    }
    public void setChildrenCategoryId(Long childrenCategoryId) {
    this.childrenCategoryId = childrenCategoryId;
    }
        public Boolean getIsLeafCategory() {
    return this.isLeafCategory;
    }
    public void setIsLeafCategory(Boolean isLeafCategory) {
    this.isLeafCategory = isLeafCategory;
    }
        public Long getLevel() {
    return this.level;
    }
    public void setLevel(Long level) {
    this.level = level;
    }
        public String getMultiLanguageNames() {
    return this.multiLanguageNames;
    }
    public void setMultiLanguageNames(String multiLanguageNames) {
    this.multiLanguageNames = multiLanguageNames;
    }
    }