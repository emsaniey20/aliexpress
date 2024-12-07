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
*  aliexpress.ascp.po.query
*/
public class AliexpressAscpPoQueryRequest extends BaseGopRequest<AliexpressAscpPoQueryResponse> {

    /** 系统自动生成 */
    private AliexpressAscpPoQueryPurchaseOrderQueryDTO purchaseOrderQuery;

    public AliexpressAscpPoQueryPurchaseOrderQueryDTO getPurchaseOrderQuery(){
        return this.purchaseOrderQuery;
    }
    public void setPurchaseOrderQuery(AliexpressAscpPoQueryPurchaseOrderQueryDTO purchaseOrderQuery){
        this.purchaseOrderQuery = purchaseOrderQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.po.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (purchaseOrderQuery != null) {
                        super.addApiParameter("purchase_order_query", new JSONWriter(true, false).write(purchaseOrderQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpPoQueryResponse> getResponseClass() {
        return AliexpressAscpPoQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}