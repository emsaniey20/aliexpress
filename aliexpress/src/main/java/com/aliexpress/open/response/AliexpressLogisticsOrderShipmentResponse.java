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
*  aliexpress.logistics.order.shipment
*/
public class AliexpressLogisticsOrderShipmentResponse extends IopResponse {

    /** 结果 */
        @ApiField("result")
        private AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderResponse result;

public AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderResponse getResult(){
return this.result;
}
public void setResult(AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderResponse result){
    this.result = result;
}

}