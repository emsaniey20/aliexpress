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
*  cainiao.global.logistic.order.create
*/
public class CainiaoGlobalLogisticOrderCreateResponse extends IopResponse {

    /** 创建是否成功 */
        @ApiField("is_success")
        private String isSuccess;
    /** 是否需要重试 */
        @ApiField("need_retry")
        private Boolean needRetry;
    /** 请求结果 */
        @ApiField("result")
        private CainiaoGlobalLogisticOrderCreateOpenTakingOrderResponse result;
    /** 错误信息 */
        @ApiField("error_info")
        private CainiaoGlobalLogisticOrderCreateErrorInfo errorInfo;

public String getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(String isSuccess){
    this.isSuccess = isSuccess;
}
public Boolean getNeedRetry(){
return this.needRetry;
}
public void setNeedRetry(Boolean needRetry){
    this.needRetry = needRetry;
}
public CainiaoGlobalLogisticOrderCreateOpenTakingOrderResponse getResult(){
return this.result;
}
public void setResult(CainiaoGlobalLogisticOrderCreateOpenTakingOrderResponse result){
    this.result = result;
}
public CainiaoGlobalLogisticOrderCreateErrorInfo getErrorInfo(){
return this.errorInfo;
}
public void setErrorInfo(CainiaoGlobalLogisticOrderCreateErrorInfo errorInfo){
    this.errorInfo = errorInfo;
}

}