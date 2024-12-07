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
*  aliexpress.marketing.limitdiscountpromotionproduct.edit
*/
public class AliexpressMarketingLimitdiscountpromotionproductEditResponse extends IopResponse {

    /** true */
        @ApiField("is_success")
        private Boolean isSuccess;
    /** target */
        @ApiField("target")
        private AliexpressMarketingLimitdiscountpromotionproductEditAeopLimitedProductResultDTO target;
    /** timeStamp */
        @ApiField("time_stamp")
        private String timeStamp;

public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}
public AliexpressMarketingLimitdiscountpromotionproductEditAeopLimitedProductResultDTO getTarget(){
return this.target;
}
public void setTarget(AliexpressMarketingLimitdiscountpromotionproductEditAeopLimitedProductResultDTO target){
    this.target = target;
}
public String getTimeStamp(){
return this.timeStamp;
}
public void setTimeStamp(String timeStamp){
    this.timeStamp = timeStamp;
}

}