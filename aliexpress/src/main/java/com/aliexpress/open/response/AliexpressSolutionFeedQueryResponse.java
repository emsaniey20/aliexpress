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
*  aliexpress.solution.feed.query
*/
public class AliexpressSolutionFeedQueryResponse extends IopResponse {

    /** job id */
        @ApiField("job_id")
        private Long jobId;
    /** Count of successful items after executed under this job */
        @ApiField("success_item_count")
        private Integer successItemCount;
    /** Result list after all the item_content,which were previously submitted through API:aliexpress.solution.feed.submit, have been executed , including both successful and unsuccessful items. */
        @ApiListField("result_list")
        private List<AliexpressSolutionFeedQuerySingleItemResponseDTO> resultList;
    /** Count of total items under this job */
        @ApiField("total_item_count")
        private Integer totalItemCount;

public Long getJobId(){
return this.jobId;
}
public void setJobId(Long jobId){
    this.jobId = jobId;
}
public Integer getSuccessItemCount(){
return this.successItemCount;
}
public void setSuccessItemCount(Integer successItemCount){
    this.successItemCount = successItemCount;
}
public List<AliexpressSolutionFeedQuerySingleItemResponseDTO> getResultList(){
return this.resultList;
}
public void setResultList(List<AliexpressSolutionFeedQuerySingleItemResponseDTO> resultList){
    this.resultList = resultList;
}
public Integer getTotalItemCount(){
return this.totalItemCount;
}
public void setTotalItemCount(Integer totalItemCount){
    this.totalItemCount = totalItemCount;
}

}