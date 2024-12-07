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
*  aliexpress.ascp.ro.item.query
*/
public class AliexpressAscpRoItemQueryRequest extends BaseGopRequest<AliexpressAscpRoItemQueryResponse> {

    /** dto */
    private AliexpressAscpRoItemQueryReturnOrderItemQueryDTO returnOrderItemQuery;

    public AliexpressAscpRoItemQueryReturnOrderItemQueryDTO getReturnOrderItemQuery(){
        return this.returnOrderItemQuery;
    }
    public void setReturnOrderItemQuery(AliexpressAscpRoItemQueryReturnOrderItemQueryDTO returnOrderItemQuery){
        this.returnOrderItemQuery = returnOrderItemQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.ro.item.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (returnOrderItemQuery != null) {
                        super.addApiParameter("return_order_item_query", new JSONWriter(true, false).write(returnOrderItemQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpRoItemQueryResponse> getResponseClass() {
        return AliexpressAscpRoItemQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}