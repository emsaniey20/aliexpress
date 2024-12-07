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
*  aliexpress.ascp.po.item.query
*/
public class AliexpressAscpPoItemQueryRequest extends BaseGopRequest<AliexpressAscpPoItemQueryResponse> {

    /** demo */
    private AliexpressAscpPoItemQueryPurchaseOrderItemQueryDTO purchaseOrderItemQuery;

    public AliexpressAscpPoItemQueryPurchaseOrderItemQueryDTO getPurchaseOrderItemQuery(){
        return this.purchaseOrderItemQuery;
    }
    public void setPurchaseOrderItemQuery(AliexpressAscpPoItemQueryPurchaseOrderItemQueryDTO purchaseOrderItemQuery){
        this.purchaseOrderItemQuery = purchaseOrderItemQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.po.item.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (purchaseOrderItemQuery != null) {
                        super.addApiParameter("purchase_order_item_query", new JSONWriter(true, false).write(purchaseOrderItemQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpPoItemQueryResponse> getResponseClass() {
        return AliexpressAscpPoItemQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}