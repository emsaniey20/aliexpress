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
*  aliexpress.logistics.querysellershipmentinfo
*/
public class AliexpressLogisticsQuerysellershipmentinfoResponse extends IopResponse {

    /** subTradeOrderList */
        @ApiListField("sub_trade_order_list")
        private List<AliexpressLogisticsQuerysellershipmentinfoAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList;
    /** tradeOrderId */
        @ApiField("trade_order_id")
        private Long tradeOrderId;
    /** errorCode */
        @ApiField("result_error_code")
        private String resultErrorCode;
    /** errorMsg */
        @ApiField("error_msg")
        private String errorMsg;
    /** success */
        @ApiField("result_success")
        private Boolean resultSuccess;

public List<AliexpressLogisticsQuerysellershipmentinfoAeopSellerShipmentSubTradeOrderDTO> getSubTradeOrderList(){
return this.subTradeOrderList;
}
public void setSubTradeOrderList(List<AliexpressLogisticsQuerysellershipmentinfoAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList){
    this.subTradeOrderList = subTradeOrderList;
}
public Long getTradeOrderId(){
return this.tradeOrderId;
}
public void setTradeOrderId(Long tradeOrderId){
    this.tradeOrderId = tradeOrderId;
}
public String getResultErrorCode(){
return this.resultErrorCode;
}
public void setResultErrorCode(String resultErrorCode){
    this.resultErrorCode = resultErrorCode;
}
public String getErrorMsg(){
return this.errorMsg;
}
public void setErrorMsg(String errorMsg){
    this.errorMsg = errorMsg;
}
public Boolean getResultSuccess(){
return this.resultSuccess;
}
public void setResultSuccess(Boolean resultSuccess){
    this.resultSuccess = resultSuccess;
}

}