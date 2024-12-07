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
*  aliexpress.ad.agentworkorder.plan.create
*/
public class AliexpressAdAgentworkorderPlanCreateResponse extends IopResponse {

    /** 错误码 */
        @ApiField("result_code")
        private String resultCode;
    /** 错误码描述 */
        @ApiField("result_message")
        private String resultMessage;
    /** 数据实体对象 */
        @ApiField("data")
        private String data;

public String getResultCode(){
return this.resultCode;
}
public void setResultCode(String resultCode){
    this.resultCode = resultCode;
}
public String getResultMessage(){
return this.resultMessage;
}
public void setResultMessage(String resultMessage){
    this.resultMessage = resultMessage;
}
public String getData(){
return this.data;
}
public void setData(String data){
    this.data = data;
}

}