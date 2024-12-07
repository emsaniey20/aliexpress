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
*  aliexpress.logistics.sellershipmentsupportsubtradeorder
*/
public class AliexpressLogisticsSellershipmentsupportsubtradeorderResponse extends IopResponse {

    /** subTradeOrderList */
        @ApiListField("sub_trade_order_list")
        private List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList;
    /** Transaction order number */
        @ApiField("trade_order_id")
        private Long tradeOrderId;
    /** errorCode */
        @ApiField("code_of_error")
        private String codeOfError;
    /** errorMsg */
        @ApiField("error_msg")
        private String errorMsg;
    /** success */
        @ApiField("is_success")
        private Boolean isSuccess;

public List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> getSubTradeOrderList(){
return this.subTradeOrderList;
}
public void setSubTradeOrderList(List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList){
    this.subTradeOrderList = subTradeOrderList;
}
public Long getTradeOrderId(){
return this.tradeOrderId;
}
public void setTradeOrderId(Long tradeOrderId){
    this.tradeOrderId = tradeOrderId;
}
public String getCodeOfError(){
return this.codeOfError;
}
public void setCodeOfError(String codeOfError){
    this.codeOfError = codeOfError;
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

}