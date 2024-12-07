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
*  aliexpress.solution.feed.submit
*/
public class AliexpressSolutionFeedSubmitResponse extends IopResponse {

    /** job id,which is for querying the job response later. */
        @ApiField("job_id")
        private Long jobId;

public Long getJobId(){
return this.jobId;
}
public void setJobId(Long jobId){
    this.jobId = jobId;
}

}