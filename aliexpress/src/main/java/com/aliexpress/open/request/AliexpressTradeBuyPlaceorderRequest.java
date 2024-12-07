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
*  aliexpress.trade.buy.placeorder
*/
public class AliexpressTradeBuyPlaceorderRequest extends BaseGopRequest<AliexpressTradeBuyPlaceorderResponse> {

    /** specific order parameters */
    private AliexpressTradeBuyPlaceorderPlaceOrderRequest4OpenApiDTO paramPlaceOrderRequest4OpenApiDTO;

    public AliexpressTradeBuyPlaceorderPlaceOrderRequest4OpenApiDTO getParamPlaceOrderRequest4OpenApiDTO(){
        return this.paramPlaceOrderRequest4OpenApiDTO;
    }
    public void setParamPlaceOrderRequest4OpenApiDTO(AliexpressTradeBuyPlaceorderPlaceOrderRequest4OpenApiDTO paramPlaceOrderRequest4OpenApiDTO){
        this.paramPlaceOrderRequest4OpenApiDTO = paramPlaceOrderRequest4OpenApiDTO;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.buy.placeorder";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramPlaceOrderRequest4OpenApiDTO != null) {
                        super.addApiParameter("param_place_order_request4_open_api_d_t_o", new JSONWriter(true, false).write(paramPlaceOrderRequest4OpenApiDTO));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressTradeBuyPlaceorderResponse> getResponseClass() {
        return AliexpressTradeBuyPlaceorderResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}