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
*  aliexpress.miniapp.order.create.precheck
*/
public class AliexpressMiniappOrderCreatePrecheckRequest extends BaseGopRequest<AliexpressMiniappOrderCreatePrecheckResponse> {

    /** pre-check request */
    private AliexpressMiniappOrderCreatePrecheckMarketPreCreateOrderRequest paramPreCreateOrderRequest;
    /** client info */
    private AliexpressMiniappOrderCreatePrecheckMarketClientInfo paramClientInfo;

    public AliexpressMiniappOrderCreatePrecheckMarketPreCreateOrderRequest getParamPreCreateOrderRequest(){
        return this.paramPreCreateOrderRequest;
    }
    public void setParamPreCreateOrderRequest(AliexpressMiniappOrderCreatePrecheckMarketPreCreateOrderRequest paramPreCreateOrderRequest){
        this.paramPreCreateOrderRequest = paramPreCreateOrderRequest;
        }
    public AliexpressMiniappOrderCreatePrecheckMarketClientInfo getParamClientInfo(){
        return this.paramClientInfo;
    }
    public void setParamClientInfo(AliexpressMiniappOrderCreatePrecheckMarketClientInfo paramClientInfo){
        this.paramClientInfo = paramClientInfo;
        }

    @Override
    public String getApiName() {
        return "aliexpress.miniapp.order.create.precheck";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramPreCreateOrderRequest != null) {
                        super.addApiParameter("param_pre_create_order_request", new JSONWriter(true, false).write(paramPreCreateOrderRequest));
                    }
                            if (paramClientInfo != null) {
                        super.addApiParameter("param_client_info", new JSONWriter(true, false).write(paramClientInfo));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressMiniappOrderCreatePrecheckResponse> getResponseClass() {
        return AliexpressMiniappOrderCreatePrecheckResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}