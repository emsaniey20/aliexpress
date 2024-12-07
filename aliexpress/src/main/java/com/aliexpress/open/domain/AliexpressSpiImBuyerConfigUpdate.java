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

public class AliexpressSpiImBuyerConfigUpdate implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("tag_key")
            private String tagKey;
        /** 1 */
                @ApiField("tag_value")
            private String tagValue;
        /** 1 */
                @ApiField("type")
            private String type;
        /** 1 */
                @ApiField("subType")
            private String subType;
    
        public String getTagKey() {
    return this.tagKey;
    }
    public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
    }
        public String getTagValue() {
    return this.tagValue;
    }
    public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
        public String getSubType() {
    return this.subType;
    }
    public void setSubType(String subType) {
    this.subType = subType;
    }
    }