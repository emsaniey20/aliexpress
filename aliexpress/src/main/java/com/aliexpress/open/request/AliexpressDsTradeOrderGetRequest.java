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
*  aliexpress.ds.trade.order.get
*/
public class AliexpressDsTradeOrderGetRequest extends BaseGopRequest<AliexpressDsTradeOrderGetResponse> {

    /** AE order id */
    private Long orderId;

    public Long getOrderId(){
        return this.orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId = orderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ds.trade.order.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderId != null) {
                        super.addApiParameter("order_id", orderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressDsTradeOrderGetResponse> getResponseClass() {
        return AliexpressDsTradeOrderGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}