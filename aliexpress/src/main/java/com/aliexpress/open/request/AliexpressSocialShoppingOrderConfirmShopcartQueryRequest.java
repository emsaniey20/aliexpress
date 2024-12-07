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
*  aliexpress.social.shopping.order.confirm.shopcart.query
*/
public class AliexpressSocialShoppingOrderConfirmShopcartQueryRequest extends BaseGopRequest<AliexpressSocialShoppingOrderConfirmShopcartQueryResponse> {

    /** input */
    private AliexpressSocialShoppingOrderConfirmShopcartQuerySnsShopcartOrderConfirmReq paramSnsShopcartOrderConfirmReq;

    public AliexpressSocialShoppingOrderConfirmShopcartQuerySnsShopcartOrderConfirmReq getParamSnsShopcartOrderConfirmReq(){
        return this.paramSnsShopcartOrderConfirmReq;
    }
    public void setParamSnsShopcartOrderConfirmReq(AliexpressSocialShoppingOrderConfirmShopcartQuerySnsShopcartOrderConfirmReq paramSnsShopcartOrderConfirmReq){
        this.paramSnsShopcartOrderConfirmReq = paramSnsShopcartOrderConfirmReq;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.confirm.shopcart.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramSnsShopcartOrderConfirmReq != null) {
                        super.addApiParameter("param_sns_shopcart_order_confirm_req", new JSONWriter(true, false).write(paramSnsShopcartOrderConfirmReq));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingOrderConfirmShopcartQueryResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderConfirmShopcartQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}