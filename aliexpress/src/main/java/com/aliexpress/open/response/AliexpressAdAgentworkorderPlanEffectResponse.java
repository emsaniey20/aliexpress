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
*  aliexpress.ad.agentworkorder.plan.effect
*/
public class AliexpressAdAgentworkorderPlanEffectResponse extends IopResponse {

    /** 数据对象，预留 */
        @ApiField("data")
        private String data;
    /** 错误码 */
        @ApiField("result_code")
        private String resultCode;
    /** 错误码描述 */
        @ApiField("result_message")
        private String resultMessage;

public String getData(){
return this.data;
}
public void setData(String data){
    this.data = data;
}
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

}