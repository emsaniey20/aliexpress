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
*  aliexpress.social.shopping.order.cancel
*/
public class AliexpressSocialShoppingOrderCancelRequest extends BaseGopRequest<AliexpressSocialShoppingOrderCancelResponse> {

    /** Order to cancel */
    private Long orderId;
    /** Reason description */
    private String reason;

    public Long getOrderId(){
        return this.orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId = orderId;
        }
    public String getReason(){
        return this.reason;
    }
    public void setReason(String reason){
        this.reason = reason;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.cancel";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderId != null) {
                        super.addApiParameter("order_id", orderId.toString());
                    }
                            if (reason != null) {
                        super.addApiParameter("reason", reason.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingOrderCancelResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderCancelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}