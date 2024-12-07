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
*  aliexpress.ds.add.info
*/
public class AliexpressDsAddInfoResponse extends IopResponse {

    /** Return result */
        @ApiField("result")
        private Boolean result;
    /** Return result message */
        @ApiField("result_msg")
        private String resultMsg;
    /** Return result status code */
        @ApiField("result_code")
        private Long resultCode;

public Boolean getResult(){
return this.result;
}
public void setResult(Boolean result){
    this.result = result;
}
public String getResultMsg(){
return this.resultMsg;
}
public void setResultMsg(String resultMsg){
    this.resultMsg = resultMsg;
}
public Long getResultCode(){
return this.resultCode;
}
public void setResultCode(Long resultCode){
    this.resultCode = resultCode;
}

}