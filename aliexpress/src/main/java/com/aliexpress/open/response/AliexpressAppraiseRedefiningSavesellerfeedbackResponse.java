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
*  aliexpress.appraise.redefining.savesellerfeedback
*/
public class AliexpressAppraiseRedefiningSavesellerfeedbackResponse extends IopResponse {

    /** 错误信息 */
        @ApiField("error_message")
        private String errorMessage;
    /** 错误码 */
        @ApiField("sub_error_code")
        private Integer subErrorCode;
    /** 操作是否成功 */
        @ApiField("is_success")
        private Boolean isSuccess;

public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public Integer getSubErrorCode(){
return this.subErrorCode;
}
public void setSubErrorCode(Integer subErrorCode){
    this.subErrorCode = subErrorCode;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}