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

public class AriseCategoryTreeListAriseCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 类目等级 */
                @ApiField("level")
            private Integer level;
        /** 是否叶子类目 */
                @ApiField("leaf")
            private Boolean leaf;
        /** 类目名称 */
                @ApiField("category_name")
            private String categoryName;
        /** 类目ID */
                @ApiField("category_id")
            private Long categoryId;
    
        public Integer getLevel() {
    return this.level;
    }
    public void setLevel(Integer level) {
    this.level = level;
    }
        public Boolean getLeaf() {
    return this.leaf;
    }
    public void setLeaf(Boolean leaf) {
    this.leaf = leaf;
    }
        public String getCategoryName() {
    return this.categoryName;
    }
    public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
    }