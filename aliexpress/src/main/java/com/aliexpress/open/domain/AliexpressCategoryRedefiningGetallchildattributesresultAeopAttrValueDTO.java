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

public class AliexpressCategoryRedefiningGetallchildattributesresultAeopAttrValueDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 下一层属性 */
                @ApiListField("attributes")
            private List<String> attributes;
        /** 属性值id */
                @ApiField("id")
            private Long id;
        /** 属性值名称 */
                @ApiField("names")
            private String names;
        /** valueTags */
                @ApiField("value_tags")
            private String valueTags;
        /** 属性值下是否有子属性 */
                @ApiField("has_sub_attr")
            private Boolean hasSubAttr;
    
        public List<String> getAttributes() {
    return this.attributes;
    }
    public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getNames() {
    return this.names;
    }
    public void setNames(String names) {
    this.names = names;
    }
        public String getValueTags() {
    return this.valueTags;
    }
    public void setValueTags(String valueTags) {
    this.valueTags = valueTags;
    }
        public Boolean getHasSubAttr() {
    return this.hasSubAttr;
    }
    public void setHasSubAttr(Boolean hasSubAttr) {
    this.hasSubAttr = hasSubAttr;
    }
    }