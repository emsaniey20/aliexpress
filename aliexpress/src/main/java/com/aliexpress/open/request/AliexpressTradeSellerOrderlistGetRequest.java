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
*  aliexpress.trade.seller.orderlist.get
*/
public class AliexpressTradeSellerOrderlistGetRequest extends BaseGopRequest<AliexpressTradeSellerOrderlistGetResponse> {

    /** 入参 */
    private AliexpressTradeSellerOrderlistGetAeopOrderQuery paramAeopOrderQuery;

    public AliexpressTradeSellerOrderlistGetAeopOrderQuery getParamAeopOrderQuery(){
        return this.paramAeopOrderQuery;
    }
    public void setParamAeopOrderQuery(AliexpressTradeSellerOrderlistGetAeopOrderQuery paramAeopOrderQuery){
        this.paramAeopOrderQuery = paramAeopOrderQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.seller.orderlist.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramAeopOrderQuery != null) {
                        super.addApiParameter("param_aeop_order_query", new JSONWriter(true, false).write(paramAeopOrderQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressTradeSellerOrderlistGetResponse> getResponseClass() {
        return AliexpressTradeSellerOrderlistGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}