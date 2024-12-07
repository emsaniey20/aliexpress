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
*  /ai/image/removal
*/
public class AiImageRemovalResponse extends IopResponse {

    /** 返回码，200为成功 */
        @ApiField("resCode")
        private String resCode;
    /** 返回值JSON */
        @ApiField("data")
        private String data;
    /** 请求唯一ID */
        @ApiField("requestId")
        private String requestId;
    /** 是否成功 */
        @ApiField("success")
        private Boolean success;
    /** 返回message */
        @ApiField("resMessage")
        private String resMessage;

public String getResCode(){
return this.resCode;
}
public void setResCode(String resCode){
    this.resCode = resCode;
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