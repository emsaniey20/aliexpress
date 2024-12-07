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
*  cainiao.global.solution.inquiry
*/
public class CainiaoGlobalSolutionInquiryResponse extends IopResponse {

    /** 是否成功 */
        @ApiField("is_success")
        private Boolean isSuccess;
    /** 错误信息 */
        @ApiField("error_info")
        private CainiaoGlobalSolutionInquiryErrorInfo errorInfo;
    /** 请求结果 */
        @ApiField("result")
        private CainiaoGlobalSolutionInquiryOpenSolutionInquiryResponse result;

public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}
public CainiaoGlobalSolutionInquiryErrorInfo getErrorInfo(){
return this.errorInfo;
}
public void setErrorInfo(CainiaoGlobalSolutionInquiryErrorInfo errorInfo){
    this.errorInfo = errorInfo;
}
public CainiaoGlobalSolutionInquiryOpenSolutionInquiryResponse getResult(){
return this.result;
}
public void setResult(CainiaoGlobalSolutionInquiryOpenSolutionInquiryResponse result){
    this.result = result;
}

}