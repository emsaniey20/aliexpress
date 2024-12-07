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
*  aliexpress.logistics.redefining.getallprovince
*/
public class AliexpressLogisticsRedefiningGetallprovinceResponse extends IopResponse {

    /** result */
        @ApiListField("result_list")
        private List<AliexpressLogisticsRedefiningGetallprovinceString> resultList;
    /** error description */
        @ApiField("error_desc")
        private String errorDesc;
    /** is success */
        @ApiField("is_success")
        private Boolean isSuccess;

public List<AliexpressLogisticsRedefiningGetallprovinceString> getResultList(){
return this.resultList;
}
public void setResultList(List<AliexpressLogisticsRedefiningGetallprovinceString> resultList){
    this.resultList = resultList;
}
public String getErrorDesc(){
return this.errorDesc;
}
public void setErrorDesc(String errorDesc){
    this.errorDesc = errorDesc;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}