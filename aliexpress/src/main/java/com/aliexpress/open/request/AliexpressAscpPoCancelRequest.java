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
*  aliexpress.ascp.po.cancel
*/
public class AliexpressAscpPoCancelRequest extends BaseGopRequest<AliexpressAscpPoCancelResponse> {

    /** 入库单取消DTO，存在主子店铺关系时请登录主店铺 */
    private AliexpressAscpPoCancelErpPurchaseOrderCancelRequest purchaseOrderCancelRequest;

    public AliexpressAscpPoCancelErpPurchaseOrderCancelRequest getPurchaseOrderCancelRequest(){
        return this.purchaseOrderCancelRequest;
    }
    public void setPurchaseOrderCancelRequest(AliexpressAscpPoCancelErpPurchaseOrderCancelRequest purchaseOrderCancelRequest){
        this.purchaseOrderCancelRequest = purchaseOrderCancelRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.po.cancel";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (purchaseOrderCancelRequest != null) {
                        super.addApiParameter("purchase_order_cancel_request", new JSONWriter(true, false).write(purchaseOrderCancelRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpPoCancelResponse> getResponseClass() {
        return AliexpressAscpPoCancelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}