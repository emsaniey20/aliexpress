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
*  aliexpress.ascp.warehouse.inventory.query
*/
public class AliexpressAscpWarehouseInventoryQueryRequest extends BaseGopRequest<AliexpressAscpWarehouseInventoryQueryResponse> {

    /** 查询DTO */
    private AliexpressAscpWarehouseInventoryQueryWarehouseInventoryQueryDTO warehouseInventoryQueryDto;

    public AliexpressAscpWarehouseInventoryQueryWarehouseInventoryQueryDTO getWarehouseInventoryQueryDto(){
        return this.warehouseInventoryQueryDto;
    }
    public void setWarehouseInventoryQueryDto(AliexpressAscpWarehouseInventoryQueryWarehouseInventoryQueryDTO warehouseInventoryQueryDto){
        this.warehouseInventoryQueryDto = warehouseInventoryQueryDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.warehouse.inventory.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warehouseInventoryQueryDto != null) {
                        super.addApiParameter("warehouse_inventory_query_dto", new JSONWriter(true, false).write(warehouseInventoryQueryDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpWarehouseInventoryQueryResponse> getResponseClass() {
        return AliexpressAscpWarehouseInventoryQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}