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
*  aliexpress.social.shopping.logistics.address.delete
*/
public class AliexpressSocialShoppingLogisticsAddressDeleteResponse extends IopResponse {

    /** error code */
        @ApiField("errorcode")
        private String errorcode;
    /** error message */
        @ApiField("error_message")
        private String errorMessage;
    /** placeholder value */
        @ApiField("result")
        private Boolean result;
    /** if is success */
        @ApiField("is_success")
        private Boolean isSuccess;

public String getErrorcode(){
return this.errorcode;
}
public void setErrorcode(String errorcode){
    this.errorcode = errorcode;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public Boolean getResult(){
return this.result;
}
public void setResult(Boolean result){
    this.result = result;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}