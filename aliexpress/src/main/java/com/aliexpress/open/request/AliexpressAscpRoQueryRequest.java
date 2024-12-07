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
*  aliexpress.ascp.ro.query
*/
public class AliexpressAscpRoQueryRequest extends BaseGopRequest<AliexpressAscpRoQueryResponse> {

    /** dto */
    private AliexpressAscpRoQueryReturnOrderQueryDTO returnOrderQuery;

    public AliexpressAscpRoQueryReturnOrderQueryDTO getReturnOrderQuery(){
        return this.returnOrderQuery;
    }
    public void setReturnOrderQuery(AliexpressAscpRoQueryReturnOrderQueryDTO returnOrderQuery){
        this.returnOrderQuery = returnOrderQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.ro.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (returnOrderQuery != null) {
                        super.addApiParameter("return_order_query", new JSONWriter(true, false).write(returnOrderQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpRoQueryResponse> getResponseClass() {
        return AliexpressAscpRoQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}