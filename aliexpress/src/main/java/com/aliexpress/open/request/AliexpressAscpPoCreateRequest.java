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
*  aliexpress.ascp.po.create
*/
public class AliexpressAscpPoCreateRequest extends BaseGopRequest<AliexpressAscpPoCreateResponse> {

    /** 入库单创建DTO，存在主子店铺关系时，请登录主店铺 */
    private AliexpressAscpPoCreateErpPurchaseOrderCreateRequest purchaseOrderCreateRequest;

    public AliexpressAscpPoCreateErpPurchaseOrderCreateRequest getPurchaseOrderCreateRequest(){
        return this.purchaseOrderCreateRequest;
    }
    public void setPurchaseOrderCreateRequest(AliexpressAscpPoCreateErpPurchaseOrderCreateRequest purchaseOrderCreateRequest){
        this.purchaseOrderCreateRequest = purchaseOrderCreateRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.po.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (purchaseOrderCreateRequest != null) {
                        super.addApiParameter("purchase_order_create_request", new JSONWriter(true, false).write(purchaseOrderCreateRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpPoCreateResponse> getResponseClass() {
        return AliexpressAscpPoCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}