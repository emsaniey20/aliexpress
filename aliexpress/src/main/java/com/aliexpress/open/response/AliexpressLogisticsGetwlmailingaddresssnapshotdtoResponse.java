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
*  aliexpress.logistics.getwlmailingaddresssnapshotdto
*/
public class AliexpressLogisticsGetwlmailingaddresssnapshotdtoResponse extends IopResponse {

    /** cpf */
        @ApiField("cpf")
        private String cpf;
    /** errorMsg */
        @ApiField("error_msg")
        private String errorMsg;
    /** success */
        @ApiField("is_success")
        private Boolean isSuccess;
    /** 智利税号 */
        @ApiField("rut_no")
        private String rutNo;

public String getCpf(){
return this.cpf;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}
public String getErrorMsg(){
return this.errorMsg;
}
public void setErrorMsg(String errorMsg){
    this.errorMsg = errorMsg;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}
public String getRutNo(){
return this.rutNo;
}
public void setRutNo(String rutNo){
    this.rutNo = rutNo;
}

}