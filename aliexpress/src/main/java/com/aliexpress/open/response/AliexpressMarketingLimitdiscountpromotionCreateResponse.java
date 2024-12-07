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
*  aliexpress.marketing.limitdiscountpromotion.create
*/
public class AliexpressMarketingLimitdiscountpromotionCreateResponse extends IopResponse {

    /** 活动id */
        @ApiField("target")
        private Long target;
    /** timeStamp */
        @ApiField("time_stamp")
        private String timeStamp;

public Long getTarget(){
return this.target;
}
public void setTarget(Long target){
    this.target = target;
}
public String getTimeStamp(){
return this.timeStamp;
}
public void setTimeStamp(String timeStamp){
    this.timeStamp = timeStamp;
}

}