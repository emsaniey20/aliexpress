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
*  aliexpress.trade.seller.order.decrypt
*/
public class AliexpressTradeSellerOrderDecryptResponse extends IopResponse {

    /** 返回值 */
        @ApiField("result_obj")
        private AliexpressTradeSellerOrderDecryptresultObjObject resultObj;
    /** 状态码 */
        @ApiField("result_code")
        private Integer resultCode;
    /** 详细信息 */
        @ApiField("result_info")
        private String resultInfo;

public AliexpressTradeSellerOrderDecryptresultObjObject getResultObj(){
return this.resultObj;
}
public void setResultObj(AliexpressTradeSellerOrderDecryptresultObjObject resultObj){
    this.resultObj = resultObj;
}
public Integer getResultCode(){
return this.resultCode;
}
public void setResultCode(Integer resultCode){
    this.resultCode = resultCode;
}
public String getResultInfo(){
return this.resultInfo;
}
public void setResultInfo(String resultInfo){
    this.resultInfo = resultInfo;
}

}