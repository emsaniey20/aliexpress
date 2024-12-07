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
*  aliexpress.solution.feed.query
*/
public class AliexpressSolutionFeedQueryRequest extends BaseGopRequest<AliexpressSolutionFeedQueryResponse> {

    /** job id */
    private Long jobId;

    public Long getJobId(){
        return this.jobId;
    }
    public void setJobId(Long jobId){
        this.jobId = jobId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.feed.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (jobId != null) {
                        super.addApiParameter("job_id", jobId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionFeedQueryResponse> getResponseClass() {
        return AliexpressSolutionFeedQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}