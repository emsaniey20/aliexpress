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
*  aliexpress.ascp.ffo.item.query
*/
public class AliexpressAscpFfoItemQueryRequest extends BaseGopRequest<AliexpressAscpFfoItemQueryResponse> {

    /** DTO */
    private AliexpressAscpFfoItemQueryFulfillmentForwardOrderItemQueryDTO fulfillmentForwardOrderItemQuery;

    public AliexpressAscpFfoItemQueryFulfillmentForwardOrderItemQueryDTO getFulfillmentForwardOrderItemQuery(){
        return this.fulfillmentForwardOrderItemQuery;
    }
    public void setFulfillmentForwardOrderItemQuery(AliexpressAscpFfoItemQueryFulfillmentForwardOrderItemQueryDTO fulfillmentForwardOrderItemQuery){
        this.fulfillmentForwardOrderItemQuery = fulfillmentForwardOrderItemQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.ffo.item.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (fulfillmentForwardOrderItemQuery != null) {
                        super.addApiParameter("fulfillment_forward_order_item_query", new JSONWriter(true, false).write(fulfillmentForwardOrderItemQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpFfoItemQueryResponse> getResponseClass() {
        return AliexpressAscpFfoItemQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}