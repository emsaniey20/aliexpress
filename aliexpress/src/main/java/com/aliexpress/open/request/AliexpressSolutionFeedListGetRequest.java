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
*  aliexpress.solution.feed.list.get
*/
public class AliexpressSolutionFeedListGetRequest extends BaseGopRequest<AliexpressSolutionFeedListGetResponse> {

    /** current page */
    private Integer currentPage;
    /** feed type */
    private String feedType;
    /** page size */
    private Integer pageSize;
    /** status of the job, currently there are 3 types: FINISH, PROCESSING, QUEUEING */
    private String status;
    /** Search for feeds submitted before a specific time, format: yyyy-MM-dd hh:mm:ss. Timezone:America/Los_Angeles */
    private String submittedTimeEnd;
    /** Search for feeds submitted after a specific time, format: yyyy-MM-dd hh:mm:ss  .Timezone:America/Los_Angeles */
    private String submittedTimeStart;

    public Integer getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage){
        this.currentPage = currentPage;
        }
    public String getFeedType(){
        return this.feedType;
    }
    public void setFeedType(String feedType){
        this.feedType = feedType;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
        }
    public String getSubmittedTimeEnd(){
        return this.submittedTimeEnd;
    }
    public void setSubmittedTimeEnd(String submittedTimeEnd){
        this.submittedTimeEnd = submittedTimeEnd;
        }
    public String getSubmittedTimeStart(){
        return this.submittedTimeStart;
    }
    public void setSubmittedTimeStart(String submittedTimeStart){
        this.submittedTimeStart = submittedTimeStart;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.feed.list.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                            if (feedType != null) {
                        super.addApiParameter("feed_type", feedType.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (status != null) {
                        super.addApiParameter("status", status.toString());
                    }
                            if (submittedTimeEnd != null) {
                        super.addApiParameter("submitted_time_end", submittedTimeEnd.toString());
                    }
                            if (submittedTimeStart != null) {
                        super.addApiParameter("submitted_time_start", submittedTimeStart.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionFeedListGetResponse> getResponseClass() {
        return AliexpressSolutionFeedListGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}