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
*  aliexpress.logistics.redefining.listlogisticsservice
*/
public class AliexpressLogisticsRedefiningListlogisticsserviceResponse extends IopResponse {

    /** result */
        @ApiListField("result_list")
        private List<AliexpressLogisticsRedefiningListlogisticsserviceAeopLogisticsServiceResult> resultList;
    /** error description */
        @ApiField("error_desc")
        private String errorDesc;
    /** success */
        @ApiField("result_success")
        private Boolean resultSuccess;

public List<AliexpressLogisticsRedefiningListlogisticsserviceAeopLogisticsServiceResult> getResultList(){
return this.resultList;
}
public void setResultList(List<AliexpressLogisticsRedefiningListlogisticsserviceAeopLogisticsServiceResult> resultList){
    this.resultList = resultList;
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