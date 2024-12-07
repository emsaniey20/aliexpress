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

public class AliexpressFreightRedefiningListfreighttemplateAeopFreightTemplateDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** templateName */
                @ApiField("template_name")
            private String templateName;
        /** is_default */
                @ApiField("is_default")
            private Boolean isDefault;
        /** templateId */
                @ApiField("template_id")
            private Long templateId;
    
        public String getTemplateName() {
    return this.templateName;
    }
    public void setTemplateName(String templateName) {
    this.templateName = templateName;
    }
        public Boolean getIsDefault() {
    return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    }
        public Long getTemplateId() {
    return this.templateId;
    }
    public void setTemplateId(Long templateId) {
    this.templateId = templateId;
    }
    }