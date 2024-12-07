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
*  aliexpress.miniapp.order.cancel
*/
public class AliexpressMiniappOrderCancelResponse extends IopResponse {

    /** trade order id */
        @ApiField("trade_order_id")
        private Long tradeOrderId;

public Long getTradeOrderId(){
return this.tradeOrderId;
}
public void setTradeOrderId(Long tradeOrderId){
    this.tradeOrderId = tradeOrderId;
}

}