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
*  aliexpress.warranty.order.uploadimage
*/
public class AliexpressWarrantyOrderUploadimageResponse extends IopResponse {

    /** exceptionCode */
        @ApiField("exception_code")
        private String exceptionCode;
    /** exceptionDesc */
        @ApiField("exception_desc")
        private String exceptionDesc;
    /** fileName */
        @ApiField("return_value")
        private String returnValue;
    /** successed */
        @ApiField("successed")
        private Boolean successed;

public String getExceptionCode(){
return this.exceptionCode;
}
public void setExceptionCode(String exceptionCode){
    this.exceptionCode = exceptionCode;
}
public String getExceptionDesc(){
return this.exceptionDesc;
}
public void setExceptionDesc(String exceptionDesc){
    this.exceptionDesc = exceptionDesc;
}
public String getReturnValue(){
return this.returnValue;
}
public void setReturnValue(String returnValue){
    this.returnValue = returnValue;
}
public Boolean getSuccessed(){
return this.successed;
}
public void setSuccessed(Boolean successed){
    this.successed = successed;
}

}