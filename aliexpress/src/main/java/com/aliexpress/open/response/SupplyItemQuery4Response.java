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
*  /supply/item/query4
*/
public class SupplyItemQuery4Response extends IopResponse {

    /** 是否成功 */
        @ApiField("success")
        private Boolean success;
    /** 错误代码 */
        @ApiField("error_code")
        private String errorCode;
    /** 是否需要重试 */
        @ApiField("need_retry")
        private Boolean needRetry;
    /** 数据 */
        @ApiField("model")
        private String model;
    /** 错误信息 */
        @ApiField("error_msg")
        private BigDecimal errorMsg;
    /** 测试 */
        @ApiField("test")
        private String test;

public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
}
public Boolean getNeedRetry(){
return this.needRetry;
}
public void setNeedRetry(Boolean needRetry){
    this.needRetry = needRetry;
}
public String getModel(){
return this.model;
}
public void setModel(String model){
    this.model = model;
}
public BigDecimal getErrorMsg(){
return this.errorMsg;
}
public void setErrorMsg(BigDecimal errorMsg){
    this.errorMsg = errorMsg;
}
public String getTest(){
return this.test;
}
public void setTest(String test){
    this.test = test;
}

}