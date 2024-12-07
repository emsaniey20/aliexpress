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
*  aliexpress.solution.feed.invalidate
*/
public class AliexpressSolutionFeedInvalidateRequest extends BaseGopRequest<AliexpressSolutionFeedInvalidateResponse> {

    /** job id separated by ; No more than 100 job Ids could be passed in one request. */
    private String jobIdList;

    public String getJobIdList(){
        return this.jobIdList;
    }
    public void setJobIdList(String jobIdList){
        this.jobIdList = jobIdList;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.feed.invalidate";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (jobIdList != null) {
                        super.addApiParameter("job_id_list", jobIdList.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionFeedInvalidateResponse> getResponseClass() {
        return AliexpressSolutionFeedInvalidateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}