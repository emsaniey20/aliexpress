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
*  aliexpress.trade.seller.order.acceptcancel
*/
public class AliexpressTradeSellerOrderAcceptcancelRequest extends BaseGopRequest<AliexpressTradeSellerOrderAcceptcancelResponse> {

    /** 入参如下 */
    private AliexpressTradeSellerOrderAcceptcancelAeopOrderCancelRequest paramOrderCancelRequest;

    public AliexpressTradeSellerOrderAcceptcancelAeopOrderCancelRequest getParamOrderCancelRequest(){
        return this.paramOrderCancelRequest;
    }
    public void setParamOrderCancelRequest(AliexpressTradeSellerOrderAcceptcancelAeopOrderCancelRequest paramOrderCancelRequest){
        this.paramOrderCancelRequest = paramOrderCancelRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.seller.order.acceptcancel";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramOrderCancelRequest != null) {
                        super.addApiParameter("param_order_cancel_request", new JSONWriter(true, false).write(paramOrderCancelRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressTradeSellerOrderAcceptcancelResponse> getResponseClass() {
        return AliexpressTradeSellerOrderAcceptcancelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}