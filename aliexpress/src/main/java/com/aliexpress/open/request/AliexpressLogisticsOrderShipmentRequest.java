package com.aliexpress.open.request;

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
import com.aliexpress.open.domain.*;
import com.aliexpress.open.response.*;


/**
*  aliexpress.logistics.order.shipment
*/
public class AliexpressLogisticsOrderShipmentRequest extends BaseGopRequest<AliexpressLogisticsOrderShipmentResponse> {

    /** - */
    private AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderRequest paramAeopSellerShipmentSubTradeOrderRequest;

    public AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderRequest getParamAeopSellerShipmentSubTradeOrderRequest(){
        return this.paramAeopSellerShipmentSubTradeOrderRequest;
    }
    public void setParamAeopSellerShipmentSubTradeOrderRequest(AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderRequest paramAeopSellerShipmentSubTradeOrderRequest){
        this.paramAeopSellerShipmentSubTradeOrderRequest = paramAeopSellerShipmentSubTradeOrderRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.order.shipment";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramAeopSellerShipmentSubTradeOrderRequest != null) {
                        super.addApiParameter("param_aeop_seller_shipment_sub_trade_order_request", new JSONWriter(true, false).write(paramAeopSellerShipmentSubTradeOrderRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsOrderShipmentResponse> getResponseClass() {
        return AliexpressLogisticsOrderShipmentResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}