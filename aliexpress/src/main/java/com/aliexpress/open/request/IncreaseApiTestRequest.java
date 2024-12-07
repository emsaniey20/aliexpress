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
*  /increase/api/test
*/
public class IncreaseApiTestRequest extends BaseGopRequest<IncreaseApiTestResponse> {

    /** 订单id */
    private String orderId;

    public String getOrderId(){
        return this.orderId;
    }
    public void setOrderId(String orderId){
        this.orderId = orderId;
        }

    @Override
    public String getApiName() {
        return "/increase/api/test";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderId != null) {
                        super.addApiParameter("orderId", orderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<IncreaseApiTestResponse> getResponseClass() {
        return IncreaseApiTestResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}