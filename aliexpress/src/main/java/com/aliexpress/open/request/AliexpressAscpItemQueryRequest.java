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
*  aliexpress.ascp.item.query
*/
public class AliexpressAscpItemQueryRequest extends BaseGopRequest<AliexpressAscpItemQueryResponse> {

    /** DTO */
    private AliexpressAscpItemQueryScItemQueryDTO scItemQuery;

    public AliexpressAscpItemQueryScItemQueryDTO getScItemQuery(){
        return this.scItemQuery;
    }
    public void setScItemQuery(AliexpressAscpItemQueryScItemQueryDTO scItemQuery){
        this.scItemQuery = scItemQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.item.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (scItemQuery != null) {
                        super.addApiParameter("sc_item_query", new JSONWriter(true, false).write(scItemQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpItemQueryResponse> getResponseClass() {
        return AliexpressAscpItemQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}