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

public class AiVirtualModelGenerationBatchVirtualModelGenerationResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 任务唯一ID，用于后续查询 */
                @ApiField("taskId")
            private String taskId;
    
        public String getTaskId() {
    return this.taskId;
    }
    public void setTaskId(String taskId) {
    this.taskId = taskId;
    }
    }