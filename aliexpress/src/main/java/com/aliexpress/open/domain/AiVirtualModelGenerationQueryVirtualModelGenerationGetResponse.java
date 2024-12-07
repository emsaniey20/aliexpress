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

public class AiVirtualModelGenerationQueryVirtualModelGenerationGetResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 任务返回信息 */
                @ApiField("taskMessage")
            private String taskMessage;
        /** 任务执行结果 */
                @ApiListField("taskResult")
            private List<AiVirtualModelGenerationQueryImageGenClothesResponse> taskResult;
        /** 任务执行ID */
                @ApiField("taskId")
            private String taskId;
        /** 任务执行状态 */
                @ApiField("taskStatus")
            private String taskStatus;
    
        public String getTaskMessage() {
    return this.taskMessage;
    }
    public void setTaskMessage(String taskMessage) {
    this.taskMessage = taskMessage;
    }
        public List<AiVirtualModelGenerationQueryImageGenClothesResponse> getTaskResult() {
    return this.taskResult;
    }
    public void setTaskResult(List<AiVirtualModelGenerationQueryImageGenClothesResponse> taskResult) {
    this.taskResult = taskResult;
    }
        public String getTaskId() {
    return this.taskId;
    }
    public void setTaskId(String taskId) {
    this.taskId = taskId;
    }
        public String getTaskStatus() {
    return this.taskStatus;
    }
    public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
    }
    }