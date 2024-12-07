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
*  /gsp/order/queryforsupplier
*/
public class GspOrderQueryforsupplierResponse extends IopResponse {

    /** 错误编码  B-14-10-001     非法请求 B-14-00-001    系统内部错误 */
        @ApiField("error_message")
        private String errorMessage;
    /** 错误编码  B-14-10-001     非法请求 B-14-00-001    系统内部错误 */
        @ApiField("error_code")
        private String errorCode;
    /** 是否成功标识 */
        @ApiField("success")
        private Boolean success;
    /** 查询响应数据 */
        @ApiField("data")
        private GspOrderQueryforsupplierQueryOrderResponse data;

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
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public GspOrderQueryforsupplierQueryOrderResponse getData(){
return this.data;
}
public void setData(GspOrderQueryforsupplierQueryOrderResponse data){
    this.data = data;
}

}