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
*  /ds/dropshpper/add
*/
public class DsDropshpperAddResponse extends IopResponse {

    /** 错误信息 */
        @ApiField("msg")
        private String msg;
    /** 结果 */
        @ApiField("result")
        private Boolean result;
    /** 错误码 */
        @ApiField("result_code")
        private Integer resultCode;
    /** 是否调用成功 */
        @ApiField("success")
        private Boolean success;

public String getMsg(){
return this.msg;
}
public void setMsg(String msg){
    this.msg = msg;
}
public Boolean getResult(){
return this.result;
}
public void setResult(Boolean result){
    this.result = result;
}
public Integer getResultCode(){
return this.resultCode;
}
public void setResultCode(Integer resultCode){
    this.resultCode = resultCode;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}

}