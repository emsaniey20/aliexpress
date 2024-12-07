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
*  aliexpress.miniapp.single.order.query
*/
public class AliexpressMiniappSingleOrderQueryResponse extends IopResponse {

    /** order Amount */
        @ApiField("order_amount")
        private AliexpressMiniappSingleOrderQueryMoneyDTO orderAmount;
    /** order id */
        @ApiField("order_id")
        private Long orderId;
    /** order status */
        @ApiField("order_status")
        private String orderStatus;
    /** external id */
        @ApiField("external_id")
        private String externalId;

public AliexpressMiniappSingleOrderQueryMoneyDTO getOrderAmount(){
return this.orderAmount;
}
public void setOrderAmount(AliexpressMiniappSingleOrderQueryMoneyDTO orderAmount){
    this.orderAmount = orderAmount;
}
public Long getOrderId(){
return this.orderId;
}
public void setOrderId(Long orderId){
    this.orderId = orderId;
}
public String getOrderStatus(){
return this.orderStatus;
}
public void setOrderStatus(String orderStatus){
    this.orderStatus = orderStatus;
}
public String getExternalId(){
return this.externalId;
}
public void setExternalId(String externalId){
    this.externalId = externalId;
}

}