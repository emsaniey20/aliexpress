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
*  cainiao.global.logistic.order.create
*/
public class CainiaoGlobalLogisticOrderCreateRequest extends BaseGopRequest<CainiaoGlobalLogisticOrderCreateResponse> {

    /** 订单参数 */
    private CainiaoGlobalLogisticOrderCreateOpenOrderParam orderParam;
    /** 多语言 */
    private String locale;

    public CainiaoGlobalLogisticOrderCreateOpenOrderParam getOrderParam(){
        return this.orderParam;
    }
    public void setOrderParam(CainiaoGlobalLogisticOrderCreateOpenOrderParam orderParam){
        this.orderParam = orderParam;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.logistic.order.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderParam != null) {
                        super.addApiParameter("order_param", new JSONWriter(true, false).write(orderParam));
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalLogisticOrderCreateResponse> getResponseClass() {
        return CainiaoGlobalLogisticOrderCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}