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
*  aliexpress.miniapp.order.confirm.shipped
*/
public class AliexpressMiniappOrderConfirmShippedRequest extends BaseGopRequest<AliexpressMiniappOrderConfirmShippedResponse> {

    /** aliexpress trade order id */
    private Long tradeOrderId;

    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.miniapp.order.confirm.shipped";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMiniappOrderConfirmShippedResponse> getResponseClass() {
        return AliexpressMiniappOrderConfirmShippedResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}