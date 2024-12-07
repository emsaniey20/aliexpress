package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  global.publish.task.query
*/
public class GlobalPublishTaskQueryResponse extends IopResponse {

    /** 任务调度状态，代表任务是否开始执行，不代表铺货状态。一共三种状态： waiting、success、failed ； 铺货状态在 published_list 中 */
        @ApiListField("published_list")
        private List<GlobalPublishTaskQueryGlobalProductPublishedChannelDTO> publishedList;
    /** 任务状态  一共三种： waiting、success、failed */
        @ApiField("task_status")
        private String taskStatus;
    /** 铺货任务备注，创建铺货任务时传入 */
        @ApiField("remark")
        private String remark;

public List<GlobalPublishTaskQueryGlobalProductPublishedChannelDTO> getPublishedList(){
return this.publishedList;
}
public void setPublishedList(List<GlobalPublishTaskQueryGlobalProductPublishedChannelDTO> publishedList){
    this.publishedList = publishedList;
}
public String getTaskStatus(){
return this.taskStatus;
}
public void setTaskStatus(String taskStatus){
    this.taskStatus = taskStatus;
}
public String getRemark(){
return this.remark;
}
public void setRemark(String remark){
    this.remark = remark;
}

}