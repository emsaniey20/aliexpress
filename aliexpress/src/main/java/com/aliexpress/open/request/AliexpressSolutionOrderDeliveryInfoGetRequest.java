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
*  aliexpress.solution.order.delivery.info.get
*/
public class AliexpressSolutionOrderDeliveryInfoGetRequest extends BaseGopRequest<AliexpressSolutionOrderDeliveryInfoGetResponse> {

    /** order query */
    private AliexpressSolutionOrderDeliveryInfoGetSingleOrderQuery singleOrderQuery;

    public AliexpressSolutionOrderDeliveryInfoGetSingleOrderQuery getSingleOrderQuery(){
        return this.singleOrderQuery;
    }
    public void setSingleOrderQuery(AliexpressSolutionOrderDeliveryInfoGetSingleOrderQuery singleOrderQuery){
        this.singleOrderQuery = singleOrderQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.order.delivery.info.get";
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
    public Class<AliexpressSolutionOrderDeliveryInfoGetResponse> getResponseClass() {
        return AliexpressSolutionOrderDeliveryInfoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}