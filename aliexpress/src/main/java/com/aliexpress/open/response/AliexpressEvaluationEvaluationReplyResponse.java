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
*  aliexpress.evaluation.evaluation.reply
*/
public class AliexpressEvaluationEvaluationReplyResponse extends IopResponse {

    /** 操作是否成功 */
        @ApiField("target")
        private Boolean target;
    /** timeStamp */
        @ApiField("time_stamp")
        private String timeStamp;

public Boolean getTarget(){
return this.target;
}
public void setTarget(Boolean target){
    this.target = target;
}
public String getTimeStamp(){
return this.timeStamp;
}
public void setTimeStamp(String timeStamp){
    this.timeStamp = timeStamp;
}

}