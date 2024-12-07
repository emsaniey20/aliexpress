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
*  aliexpress.ds.member.orderdata.submit
*/
public class AliexpressDsMemberOrderdataSubmitResponse extends IopResponse {

    /** Result object */
        @ApiField("result")
        private Boolean result;
    /** result msg */
        @ApiField("rsp_msg")
        private String rspMsg;
    /** result code */
        @ApiField("rsp_code")
        private Long rspCode;

public Boolean getResult(){
return this.result;
}
public void setResult(Boolean result){
    this.result = result;
}
public String getRspMsg(){
return this.rspMsg;
}
public void setRspMsg(String rspMsg){
    this.rspMsg = rspMsg;
}
public Long getRspCode(){
return this.rspCode;
}
public void setRspCode(Long rspCode){
    this.rspCode = rspCode;
}

}