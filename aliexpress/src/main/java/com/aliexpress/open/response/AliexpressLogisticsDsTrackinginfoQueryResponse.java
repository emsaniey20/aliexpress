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
*  aliexpress.logistics.ds.trackinginfo.query
*/
public class AliexpressLogisticsDsTrackinginfoQueryResponse extends IopResponse {

    /** Tracking Details List */
        @ApiListField("details")
        private List<AliexpressLogisticsDsTrackinginfoQueryString> details;
    /** Tracking URL */
        @ApiField("official_website")
        private String officialWebsite;
    /** error description */
        @ApiField("error_desc")
        private String errorDesc;
    /** success */
        @ApiField("result_success")
        private Boolean resultSuccess;

public List<AliexpressLogisticsDsTrackinginfoQueryString> getDetails(){
return this.details;
}
public void setDetails(List<AliexpressLogisticsDsTrackinginfoQueryString> details){
    this.details = details;
}
public String getOfficialWebsite(){
return this.officialWebsite;
}
public void setOfficialWebsite(String officialWebsite){
    this.officialWebsite = officialWebsite;
}
public String getErrorDesc(){
return this.errorDesc;
}
public void setErrorDesc(String errorDesc){
    this.errorDesc = errorDesc;
}
public Boolean getResultSuccess(){
return this.resultSuccess;
}
public void setResultSuccess(Boolean resultSuccess){
    this.resultSuccess = resultSuccess;
}

}