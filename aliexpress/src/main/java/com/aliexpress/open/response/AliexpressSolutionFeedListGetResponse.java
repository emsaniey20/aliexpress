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
*  aliexpress.solution.feed.list.get
*/
public class AliexpressSolutionFeedListGetResponse extends IopResponse {

    /** current page */
        @ApiField("current_page")
        private Integer currentPage;
    /** data */
        @ApiListField("job_list")
        private List<AliexpressSolutionFeedListGetBatchOperationJobDTO> jobList;
    /** page size */
        @ApiField("page_size")
        private Integer pageSize;
    /** total count of jobs submitted for this seller */
        @ApiField("total_count")
        private Integer totalCount;
    /** total page based on the total_count and page_size */
        @ApiField("total_page")
        private Integer totalPage;

public Integer getCurrentPage(){
return this.currentPage;
}
public void setCurrentPage(Integer currentPage){
    this.currentPage = currentPage;
}
public List<AliexpressSolutionFeedListGetBatchOperationJobDTO> getJobList(){
return this.jobList;
}
public void setJobList(List<AliexpressSolutionFeedListGetBatchOperationJobDTO> jobList){
    this.jobList = jobList;
}
public Integer getPageSize(){
return this.pageSize;
}
public void setPageSize(Integer pageSize){
    this.pageSize = pageSize;
}
public Integer getTotalCount(){
return this.totalCount;
}
public void setTotalCount(Integer totalCount){
    this.totalCount = totalCount;
}
public Integer getTotalPage(){
return this.totalPage;
}
public void setTotalPage(Integer totalPage){
    this.totalPage = totalPage;
}

}