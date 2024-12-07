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
*  aliexpress.logistics.redefining.getonlinelogisticsinfo
*/
public class AliexpressLogisticsRedefiningGetonlinelogisticsinfoResponse extends IopResponse {

    /** result */
        @ApiListField("result_list")
        private List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoString> resultList;
    /** error desc */
        @ApiField("error_desc")
        private String errorDesc;
    /** is success */
        @ApiField("is_success")
        private Boolean isSuccess;
    /** current page */
        @ApiField("current_page")
        private Integer currentPage;
    /** total page */
        @ApiField("total_page")
        private Integer totalPage;

public List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoString> getResultList(){
return this.resultList;
}
public void setResultList(List<AliexpressLogisticsRedefiningGetonlinelogisticsinfoString> resultList){
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
public Integer getCurrentPage(){
return this.currentPage;
}
public void setCurrentPage(Integer currentPage){
    this.currentPage = currentPage;
}
public Integer getTotalPage(){
return this.totalPage;
}
public void setTotalPage(Integer totalPage){
    this.totalPage = totalPage;
}

}