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
*  aliexpress.social.shopping.order.cancel.notpay.query
*/
public class AliexpressSocialShoppingOrderCancelNotpayQueryRequest extends BaseGopRequest<AliexpressSocialShoppingOrderCancelNotpayQueryResponse> {

    /** Order to cancel */
    private Long orderId;

    public Long getOrderId(){
        return this.orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId = orderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.cancel.notpay.query";
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
    public Class<AliexpressSocialShoppingOrderCancelNotpayQueryResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderCancelNotpayQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}