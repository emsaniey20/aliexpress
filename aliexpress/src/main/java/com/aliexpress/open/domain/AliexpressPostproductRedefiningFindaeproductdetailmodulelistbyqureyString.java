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

public class AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卖家主账户的ID */
                @ApiField("ali_member_id")
            private Long aliMemberId;
        /** 模块的内容（已废弃） */
                @ApiField("display_content")
            private String displayContent;
        /** 模块ID */
                @ApiField("id")
            private Long id;
        /** 模块的内容 */
                @ApiField("module_contents")
            private String moduleContents;
        /** 模块名称 */
                @ApiField("name")
            private String name;
        /** 模块的状态 */
                @ApiField("status")
            private String status;
        /** 模块的类型 */
                @ApiField("type")
            private String type;
    
        public Long getAliMemberId() {
    return this.aliMemberId;
    }
    public void setAliMemberId(Long aliMemberId) {
    this.aliMemberId = aliMemberId;
    }
        public String getDisplayContent() {
    return this.displayContent;
    }
    public void setDisplayContent(String displayContent) {
    this.displayContent = displayContent;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getModuleContents() {
    return this.moduleContents;
    }
    public void setModuleContents(String moduleContents) {
    this.moduleContents = moduleContents;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
    }