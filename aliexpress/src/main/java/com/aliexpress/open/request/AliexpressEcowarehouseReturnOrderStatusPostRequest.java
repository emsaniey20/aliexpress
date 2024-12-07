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
*  aliexpress.ecowarehouse.return.order.status.post
*/
public class AliexpressEcowarehouseReturnOrderStatusPostRequest extends BaseGopRequest<AliexpressEcowarehouseReturnOrderStatusPostResponse> {

    /** request */
    private AliexpressEcowarehouseReturnOrderStatusPostWarehouseReturnCallbackRequest warehouseReturnCallbackRequest;

    public AliexpressEcowarehouseReturnOrderStatusPostWarehouseReturnCallbackRequest getWarehouseReturnCallbackRequest(){
        return this.warehouseReturnCallbackRequest;
    }
    public void setWarehouseReturnCallbackRequest(AliexpressEcowarehouseReturnOrderStatusPostWarehouseReturnCallbackRequest warehouseReturnCallbackRequest){
        this.warehouseReturnCallbackRequest = warehouseReturnCallbackRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ecowarehouse.return.order.status.post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warehouseReturnCallbackRequest != null) {
                        super.addApiParameter("warehouse_return_callback_request", new JSONWriter(true, false).write(warehouseReturnCallbackRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressEcowarehouseReturnOrderStatusPostResponse> getResponseClass() {
        return AliexpressEcowarehouseReturnOrderStatusPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}