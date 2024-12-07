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
*  aliexpress.ascp.ffo.query
*/
public class AliexpressAscpFfoQueryRequest extends BaseGopRequest<AliexpressAscpFfoQueryResponse> {

    /** dto */
    private AliexpressAscpFfoQueryFulfillmentForwardOrderQueryDTO fulfillmentForwardOrderQuery;

    public AliexpressAscpFfoQueryFulfillmentForwardOrderQueryDTO getFulfillmentForwardOrderQuery(){
        return this.fulfillmentForwardOrderQuery;
    }
    public void setFulfillmentForwardOrderQuery(AliexpressAscpFfoQueryFulfillmentForwardOrderQueryDTO fulfillmentForwardOrderQuery){
        this.fulfillmentForwardOrderQuery = fulfillmentForwardOrderQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.ffo.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (fulfillmentForwardOrderQuery != null) {
                        super.addApiParameter("fulfillment_forward_order_query", new JSONWriter(true, false).write(fulfillmentForwardOrderQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpFfoQueryResponse> getResponseClass() {
        return AliexpressAscpFfoQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}