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
*  aliexpress.logistics.sellershipmentfortop
*/
public class AliexpressLogisticsSellershipmentfortopResponse extends IopResponse {

    /** errorDesc */
        @ApiField("result_error_desc")
        private String resultErrorDesc;
    /** errorCode */
        @ApiField("result_error_code")
        private String resultErrorCode;
    /** result */
        @ApiField("result_success")
        private Boolean resultSuccess;

public String getResultErrorDesc(){
return this.resultErrorDesc;
}
public void setResultErrorDesc(String resultErrorDesc){
    this.resultErrorDesc = resultErrorDesc;
}
public String getResultErrorCode(){
return this.resultErrorCode;
}
public void setResultErrorCode(String resultErrorCode){
    this.resultErrorCode = resultErrorCode;
}
public Boolean getResultSuccess(){
return this.resultSuccess;
}
public void setResultSuccess(Boolean resultSuccess){
    this.resultSuccess = resultSuccess;
}

}