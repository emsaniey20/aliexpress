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
*  aliexpress.product.diagnosis.queryProblem
*/
public class AliexpressProductDiagnosisQueryProblemResponse extends IopResponse {

    /** 请求是否成功 */
        @ApiField("success")
        private Boolean success;
    /** 错误信息 */
        @ApiField("error_message")
        private String errorMessage;
    /** 错误码 */
        @ApiField("error_code")
        private String errorCode;
    /** 商品问题类型列表 */
        @ApiListField("product_problem_type_list")
        private List<AliexpressProductDiagnosisQueryProblemProductProblemDTO> productProblemTypeList;

public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
}
public List<AliexpressProductDiagnosisQueryProblemProductProblemDTO> getProductProblemTypeList(){
return this.productProblemTypeList;
}
public void setProductProblemTypeList(List<AliexpressProductDiagnosisQueryProblemProductProblemDTO> productProblemTypeList){
    this.productProblemTypeList = productProblemTypeList;
}

}