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

public class AliexpressIssueDetailGetApiAttachmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片路径 */
                @ApiField("file_path")
            private String filePath;
        /** 创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 纠纷id */
                @ApiField("issue_id")
            private Long issueId;
        /** 过程id */
                @ApiField("issue_process_id")
            private Long issueProcessId;
        /** 所属人:buyer\seller */
                @ApiField("owner")
            private String owner;
    
        public String getFilePath() {
    return this.filePath;
    }
    public void setFilePath(String filePath) {
    this.filePath = filePath;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public Long getIssueId() {
    return this.issueId;
    }
    public void setIssueId(Long issueId) {
    this.issueId = issueId;
    }
        public Long getIssueProcessId() {
    return this.issueProcessId;
    }
    public void setIssueProcessId(Long issueProcessId) {
    this.issueProcessId = issueProcessId;
    }
        public String getOwner() {
    return this.owner;
    }
    public void setOwner(String owner) {
    this.owner = owner;
    }
    }