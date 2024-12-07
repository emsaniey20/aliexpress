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

public class AliexpressSocialCategoryMobileQueryMobileCategoryDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** id */
                @ApiField("id")
            private Long id;
        /** leaf */
                @ApiField("leaf")
            private Boolean leaf;
        /** name */
                @ApiField("name")
            private String name;
        /** en name */
                @ApiField("en_name")
            private String enName;
    
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public Boolean getLeaf() {
    return this.leaf;
    }
    public void setLeaf(Boolean leaf) {
    this.leaf = leaf;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getEnName() {
    return this.enName;
    }
    public void setEnName(String enName) {
    this.enName = enName;
    }
    }