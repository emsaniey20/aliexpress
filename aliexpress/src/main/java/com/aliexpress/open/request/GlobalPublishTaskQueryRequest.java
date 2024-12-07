package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  global.publish.task.query
*/
public class GlobalPublishTaskQueryRequest extends BaseGopRequest<GlobalPublishTaskQueryResponse> {

    /** 任务id */
    private String taskId;

    public String getTaskId(){
        return this.taskId;
    }
    public void setTaskId(String taskId){
        this.taskId = taskId;
        }

    @Override
    public String getApiName() {
        return "global.publish.task.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (taskId != null) {
                        super.addApiParameter("task_id", taskId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<GlobalPublishTaskQueryResponse> getResponseClass() {
        return GlobalPublishTaskQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}