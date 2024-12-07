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

public class AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpIssueInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** issue creation time */
                @ApiField("issue_time")
            private String issueTime;
        /** issue status: processing, canceled_issue, finish */
                @ApiField("issue_status")
            private String issueStatus;
        /** issue model */
                @ApiField("issue_model")
            private String issueModel;
    
        public String getIssueTime() {
    return this.issueTime;
    }
    public void setIssueTime(String issueTime) {
    this.issueTime = issueTime;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public String getIssueModel() {
    return this.issueModel;
    }
    public void setIssueModel(String issueModel) {
    this.issueModel = issueModel;
    }
    }