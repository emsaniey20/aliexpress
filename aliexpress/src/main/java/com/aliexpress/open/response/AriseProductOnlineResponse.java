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
*  arise.product.online
*/
public class AriseProductOnlineResponse extends IopResponse {

    /** 错误信息 */
        @ApiListField("error_detail_list")
        private List<AriseProductOnlineErrorDetail> errorDetailList;
    /** 请求结果 */
        @ApiField("success")
        private String success;
    /** 异常信息 */
        @ApiField("error_message")
        private String errorMessage;
    /** 错误码 */
        @ApiField("error_code")
        private String errorCode;
    /** 商品Id */
        @ApiListField("success_product_id_list")
        private List<Long> successProductIdList;

public List<AriseProductOnlineErrorDetail> getErrorDetailList(){
return this.errorDetailList;
}
public void setErrorDetailList(List<AriseProductOnlineErrorDetail> errorDetailList){
    this.errorDetailList = errorDetailList;
}
public String getSuccess(){
return this.success;
}
public void setSuccess(String success){
    this.success = success;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
}
public List<Long> getSuccessProductIdList(){
return this.successProductIdList;
}
public void setSuccessProductIdList(List<Long> successProductIdList){
    this.successProductIdList = successProductIdList;
}

}