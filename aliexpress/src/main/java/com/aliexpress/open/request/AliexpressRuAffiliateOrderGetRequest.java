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
*  aliexpress.ru.affiliate.order.get
*/
public class AliexpressRuAffiliateOrderGetRequest extends BaseGopRequest<AliexpressRuAffiliateOrderGetResponse> {

    /** Is main order: Y or N */
    private String isMainOrder;
    /** Order ids comma separated */
    private String orderIds;

    public String getIsMainOrder(){
        return this.isMainOrder;
    }
    public void setIsMainOrder(String isMainOrder){
        this.isMainOrder = isMainOrder;
        }
    public String getOrderIds(){
        return this.orderIds;
    }
    public void setOrderIds(String orderIds){
        this.orderIds = orderIds;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ru.affiliate.order.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (isMainOrder != null) {
                        super.addApiParameter("is_main_order", isMainOrder.toString());
                    }
                            if (orderIds != null) {
                        super.addApiParameter("order_ids", orderIds.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressRuAffiliateOrderGetResponse> getResponseClass() {
        return AliexpressRuAffiliateOrderGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}