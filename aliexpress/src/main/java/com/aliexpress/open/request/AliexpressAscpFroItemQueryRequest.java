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
*  aliexpress.ascp.fro.item.query
*/
public class AliexpressAscpFroItemQueryRequest extends BaseGopRequest<AliexpressAscpFroItemQueryResponse> {

    /** dto */
    private AliexpressAscpFroItemQueryFulfillmentReverseOrderItemQueryDTO fulfillmentReverseOrderItemQuery;

    public AliexpressAscpFroItemQueryFulfillmentReverseOrderItemQueryDTO getFulfillmentReverseOrderItemQuery(){
        return this.fulfillmentReverseOrderItemQuery;
    }
    public void setFulfillmentReverseOrderItemQuery(AliexpressAscpFroItemQueryFulfillmentReverseOrderItemQueryDTO fulfillmentReverseOrderItemQuery){
        this.fulfillmentReverseOrderItemQuery = fulfillmentReverseOrderItemQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.fro.item.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (fulfillmentReverseOrderItemQuery != null) {
                        super.addApiParameter("fulfillment_reverse_order_item_query", new JSONWriter(true, false).write(fulfillmentReverseOrderItemQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpFroItemQueryResponse> getResponseClass() {
        return AliexpressAscpFroItemQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}