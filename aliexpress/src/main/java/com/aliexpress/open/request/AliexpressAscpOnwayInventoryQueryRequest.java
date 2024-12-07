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
*  aliexpress.ascp.onway.inventory.query
*/
public class AliexpressAscpOnwayInventoryQueryRequest extends BaseGopRequest<AliexpressAscpOnwayInventoryQueryResponse> {

    /** 查询DTO */
    private AliexpressAscpOnwayInventoryQueryOnWayInventoryQueryDTO onWayInventoryQueryDto;

    public AliexpressAscpOnwayInventoryQueryOnWayInventoryQueryDTO getOnWayInventoryQueryDto(){
        return this.onWayInventoryQueryDto;
    }
    public void setOnWayInventoryQueryDto(AliexpressAscpOnwayInventoryQueryOnWayInventoryQueryDTO onWayInventoryQueryDto){
        this.onWayInventoryQueryDto = onWayInventoryQueryDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.onway.inventory.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (onWayInventoryQueryDto != null) {
                        super.addApiParameter("on_way_inventory_query_dto", new JSONWriter(true, false).write(onWayInventoryQueryDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpOnwayInventoryQueryResponse> getResponseClass() {
        return AliexpressAscpOnwayInventoryQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}