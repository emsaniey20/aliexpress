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

public class AliexpressPostproductRedefiningFindaeproductmodulebyidAeopFindModuleResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 这个模块所有者的主账户ID */
                @ApiField("ali_member_id")
            private Long aliMemberId;
        /** displayContent */
                @ApiField("display_content")
            private String displayContent;
        /** 模块的创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 模块的最近一次修改时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 模块的id */
                @ApiField("id")
            private Long id;
        /** 模块的内容 */
                @ApiField("module_contents")
            private String moduleContents;
        /** 模块的名称 */
                @ApiField("name")
            private String name;
        /** 模块的状态 */
                @ApiField("status")
            private String status;
        /** 接口的调用结果。true/false分别表示成功和失败。 */
                @ApiField("success")
            private Boolean success;
        /** 模块的类型 */
                @ApiField("type")
            private String type;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
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
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
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
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }