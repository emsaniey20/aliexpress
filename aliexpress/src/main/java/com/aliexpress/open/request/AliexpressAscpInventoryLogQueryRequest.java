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
*  aliexpress.ascp.inventory.log.query
*/
public class AliexpressAscpInventoryLogQueryRequest extends BaseGopRequest<AliexpressAscpInventoryLogQueryResponse> {

    /** 查询DTO */
    private AliexpressAscpInventoryLogQueryWarehouseInventoryLogQueryDTO warehouseInventoryLogQueryDto;

    public AliexpressAscpInventoryLogQueryWarehouseInventoryLogQueryDTO getWarehouseInventoryLogQueryDto(){
        return this.warehouseInventoryLogQueryDto;
    }
    public void setWarehouseInventoryLogQueryDto(AliexpressAscpInventoryLogQueryWarehouseInventoryLogQueryDTO warehouseInventoryLogQueryDto){
        this.warehouseInventoryLogQueryDto = warehouseInventoryLogQueryDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.inventory.log.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warehouseInventoryLogQueryDto != null) {
                        super.addApiParameter("warehouse_inventory_log_query_dto", new JSONWriter(true, false).write(warehouseInventoryLogQueryDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpInventoryLogQueryResponse> getResponseClass() {
        return AliexpressAscpInventoryLogQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}