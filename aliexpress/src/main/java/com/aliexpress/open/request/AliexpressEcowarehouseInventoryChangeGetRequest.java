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
*  aliexpress.ecowarehouse.inventory.change.get
*/
public class AliexpressEcowarehouseInventoryChangeGetRequest extends BaseGopRequest<AliexpressEcowarehouseInventoryChangeGetResponse> {

    /** 库存变更模型 */
    private AliexpressEcowarehouseInventoryChangeGetInventoryChangeNotifyRequest inventoryChangeNotifyRequest;

    public AliexpressEcowarehouseInventoryChangeGetInventoryChangeNotifyRequest getInventoryChangeNotifyRequest(){
        return this.inventoryChangeNotifyRequest;
    }
    public void setInventoryChangeNotifyRequest(AliexpressEcowarehouseInventoryChangeGetInventoryChangeNotifyRequest inventoryChangeNotifyRequest){
        this.inventoryChangeNotifyRequest = inventoryChangeNotifyRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ecowarehouse.inventory.change.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (inventoryChangeNotifyRequest != null) {
                        super.addApiParameter("inventory_change_notify_request", new JSONWriter(true, false).write(inventoryChangeNotifyRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressEcowarehouseInventoryChangeGetResponse> getResponseClass() {
        return AliexpressEcowarehouseInventoryChangeGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}