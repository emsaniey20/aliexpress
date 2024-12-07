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
*  aliexpress.solution.order.info.get
*/
public class AliexpressSolutionOrderInfoGetRequest extends BaseGopRequest<AliexpressSolutionOrderInfoGetResponse> {

    /** param */
    private AliexpressSolutionOrderInfoGetOrderDetailQuery param1;

    public AliexpressSolutionOrderInfoGetOrderDetailQuery getParam1(){
        return this.param1;
    }
    public void setParam1(AliexpressSolutionOrderInfoGetOrderDetailQuery param1){
        this.param1 = param1;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.order.info.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param1 != null) {
                        super.addApiParameter("param1", new JSONWriter(true, false).write(param1));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionOrderInfoGetResponse> getResponseClass() {
        return AliexpressSolutionOrderInfoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}