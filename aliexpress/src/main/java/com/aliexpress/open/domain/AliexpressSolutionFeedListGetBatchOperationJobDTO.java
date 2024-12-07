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

public class AliexpressSolutionFeedListGetBatchOperationJobDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** The status of the feed */
                @ApiField("status")
            private String status;
        /** feed type */
                @ApiField("operation_type")
            private String operationType;
        /** job id */
                @ApiField("job_id")
            private Long jobId;
    
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getOperationType() {
    return this.operationType;
    }
    public void setOperationType(String operationType) {
    this.operationType = operationType;
    }
        public Long getJobId() {
    return this.jobId;
    }
    public void setJobId(Long jobId) {
    this.jobId = jobId;
    }
    }