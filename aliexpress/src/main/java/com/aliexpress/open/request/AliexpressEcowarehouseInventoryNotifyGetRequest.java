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
*  aliexpress.ecowarehouse.inventory.notify.get
*/
public class AliexpressEcowarehouseInventoryNotifyGetRequest extends BaseGopRequest<AliexpressEcowarehouseInventoryNotifyGetResponse> {

    /** 输入 */
    private AliexpressEcowarehouseInventoryNotifyGetInventoryNotifyRequest inventoryNotifyRequest;

    public AliexpressEcowarehouseInventoryNotifyGetInventoryNotifyRequest getInventoryNotifyRequest(){
        return this.inventoryNotifyRequest;
    }
    public void setInventoryNotifyRequest(AliexpressEcowarehouseInventoryNotifyGetInventoryNotifyRequest inventoryNotifyRequest){
        this.inventoryNotifyRequest = inventoryNotifyRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ecowarehouse.inventory.notify.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (inventoryNotifyRequest != null) {
                        super.addApiParameter("inventory_notify_request", new JSONWriter(true, false).write(inventoryNotifyRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressEcowarehouseInventoryNotifyGetResponse> getResponseClass() {
        return AliexpressEcowarehouseInventoryNotifyGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}