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
*  aliexpress.social.shopping.search
*/
public class AliexpressSocialShoppingSearchResponse extends IopResponse {

    /** error code */
        @ApiField("error_code1")
        private String errorCode1;
    /** error_message */
        @ApiField("error_message")
        private String errorMessage;
    /** result */
        @ApiListField("result_list")
        private List<Long> resultList;
    /** success */
        @ApiField("success1")
        private Boolean success1;

public String getErrorCode1(){
return this.errorCode1;
}
public void setErrorCode1(String errorCode1){
    this.errorCode1 = errorCode1;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public List<Long> getResultList(){
return this.resultList;
}
public void setResultList(List<Long> resultList){
    this.resultList = resultList;
}
public Boolean getSuccess1(){
return this.success1;
}
public void setSuccess1(Boolean success1){
    this.success1 = success1;
}

}