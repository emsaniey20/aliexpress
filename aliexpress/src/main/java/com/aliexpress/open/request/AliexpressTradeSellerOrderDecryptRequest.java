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
*  aliexpress.trade.seller.order.decrypt
*/
public class AliexpressTradeSellerOrderDecryptRequest extends BaseGopRequest<AliexpressTradeSellerOrderDecryptResponse> {

    /** 订单id */
    private String orderId;
    /** 加密信息摘要 */
    private String oaid;

    public String getOrderId(){
        return this.orderId;
    }
    public void setOrderId(String orderId){
        this.orderId = orderId;
        }
    public String getOaid(){
        return this.oaid;
    }
    public void setOaid(String oaid){
        this.oaid = oaid;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.seller.order.decrypt";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderId != null) {
                        super.addApiParameter("orderId", orderId.toString());
                    }
                            if (oaid != null) {
                        super.addApiParameter("oaid", oaid.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressTradeSellerOrderDecryptResponse> getResponseClass() {
        return AliexpressTradeSellerOrderDecryptResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}