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
*  /ai/demo2
*/
public class AiDemo2Response extends IopResponse {

    /** 返回code */
        @ApiField("code")
        private String code;
    /** 返回值json */
        @ApiField("data")
        private String data;
    /** 唯一请求id */
        @ApiField("requestId")
        private String requestId;
    /** 是否成功 */
        @ApiField("success")
        private Boolean success;
    /** 错误信息 */
        @ApiField("resMessage")
        private String resMessage;

public String getCode(){
return this.code;
}
public void setCode(String code){
    this.code = code;
}
public String getData(){
return this.data;
}
public void setData(String data){
    this.data = data;
}
public String getRequestId(){
return this.requestId;
}
public void setRequestId(String requestId){
    this.requestId = requestId;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getResMessage(){
return this.resMessage;
}
public void setResMessage(String resMessage){
    this.resMessage = resMessage;
}

}