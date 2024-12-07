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
*  /yushen/test/charge4
*/
public class YushenTestCharge4Response extends IopResponse {

    /** 是否成功 */
        @ApiField("success")
        private Boolean success;
    /** 错误代码 */
        @ApiField("err_code")
        private String errCode;
    /** 错误信息 */
        @ApiField("err_msg")
        private String errMsg;
    /** 结果 */
        @ApiField("data")
        private String data;

public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getErrCode(){
return this.errCode;
}
public void setErrCode(String errCode){
    this.errCode = errCode;
}
public String getErrMsg(){
return this.errMsg;
}
public void setErrMsg(String errMsg){
    this.errMsg = errMsg;
}
public String getData(){
return this.data;
}
public void setData(String data){
    this.data = data;
}

}