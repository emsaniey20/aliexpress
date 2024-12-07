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
*  aliexpress.ascp.fro.query
*/
public class AliexpressAscpFroQueryRequest extends BaseGopRequest<AliexpressAscpFroQueryResponse> {

    /** dto */
    private AliexpressAscpFroQueryFulfillmentReverseOrderQueryDTO fulfillmentReverseOrderQuery;

    public AliexpressAscpFroQueryFulfillmentReverseOrderQueryDTO getFulfillmentReverseOrderQuery(){
        return this.fulfillmentReverseOrderQuery;
    }
    public void setFulfillmentReverseOrderQuery(AliexpressAscpFroQueryFulfillmentReverseOrderQueryDTO fulfillmentReverseOrderQuery){
        this.fulfillmentReverseOrderQuery = fulfillmentReverseOrderQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.fro.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (fulfillmentReverseOrderQuery != null) {
                        super.addApiParameter("fulfillment_reverse_order_query", new JSONWriter(true, false).write(fulfillmentReverseOrderQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpFroQueryResponse> getResponseClass() {
        return AliexpressAscpFroQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}