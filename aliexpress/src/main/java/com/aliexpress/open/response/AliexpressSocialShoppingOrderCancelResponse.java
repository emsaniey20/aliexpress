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
*  aliexpress.social.shopping.order.cancel
*/
public class AliexpressSocialShoppingOrderCancelResponse extends IopResponse {

    /** Error code */
        @ApiField("error")
        private String error;
    /** Error message */
        @ApiField("error_message")
        private String errorMessage;
    /** If request is completed */
        @ApiField("result")
        private Boolean result;
    /** Success result */
        @ApiField("is_success")
        private Boolean isSuccess;

public String getError(){
return this.error;
}
public void setError(String error){
    this.error = error;
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