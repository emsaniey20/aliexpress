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
*  /ds/order/list
*/
public class DsOrderListResponse extends IopResponse {

    /** response msg */
        @ApiField("resp_msg")
        private String respMsg;
    /** result */
        @ApiField("result")
        private DsOrderListTrafficOrderResultDTO result;
    /** response code */
        @ApiField("resp_code")
        private Integer respCode;

public String getRespMsg(){
return this.respMsg;
}
public void setRespMsg(String respMsg){
    this.respMsg = respMsg;
}
public DsOrderListTrafficOrderResultDTO getResult(){
return this.result;
}
public void setResult(DsOrderListTrafficOrderResultDTO result){
    this.result = result;
}
public Integer getRespCode(){
return this.respCode;
}
public void setRespCode(Integer respCode){
    this.respCode = respCode;
}

}