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
*  /ai/virtual/model/generation/batch
*/
public class AiVirtualModelGenerationBatchResponse extends IopResponse {

    /** 请求返回code,200为成功 */
        @ApiField("resCode")
        private Integer resCode;
    /** 返回json数据 */
        @ApiField("data")
        private AiVirtualModelGenerationBatchVirtualModelGenerationResponse data;
    /** 请求唯一ID */
        @ApiField("requestId")
        private String requestId;
    /** 请求是否成功 */
        @ApiField("success")
        private Boolean success;
    /** 请求返回信息 */
        @ApiField("resMessage")
        private String resMessage;

public Integer getResCode(){
return this.resCode;
}
public void setResCode(Integer resCode){
    this.resCode = resCode;
}
public AiVirtualModelGenerationBatchVirtualModelGenerationResponse getData(){
return this.data;
}
public void setData(AiVirtualModelGenerationBatchVirtualModelGenerationResponse data){
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