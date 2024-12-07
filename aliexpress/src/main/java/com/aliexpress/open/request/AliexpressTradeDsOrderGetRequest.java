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
*  aliexpress.trade.ds.order.get
*/
public class AliexpressTradeDsOrderGetRequest extends BaseGopRequest<AliexpressTradeDsOrderGetResponse> {

    /** order query conditions */
    private AliexpressTradeDsOrderGetAeopSingleOrderQuery singleOrderQuery;

    public AliexpressTradeDsOrderGetAeopSingleOrderQuery getSingleOrderQuery(){
        return this.singleOrderQuery;
    }
    public void setSingleOrderQuery(AliexpressTradeDsOrderGetAeopSingleOrderQuery singleOrderQuery){
        this.singleOrderQuery = singleOrderQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.ds.order.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (singleOrderQuery != null) {
                        super.addApiParameter("single_order_query", new JSONWriter(true, false).write(singleOrderQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressTradeDsOrderGetResponse> getResponseClass() {
        return AliexpressTradeDsOrderGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}