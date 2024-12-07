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
*  aliexpress.reverse.apply.cancel
*/
public class AliexpressReverseApplyCancelRequest extends BaseGopRequest<AliexpressReverseApplyCancelResponse> {

    /** object */
    private AliexpressReverseApplyCancelAeMiniAppCancelOrderReq aeMiniAppCancelOrderReq;

    public AliexpressReverseApplyCancelAeMiniAppCancelOrderReq getAeMiniAppCancelOrderReq(){
        return this.aeMiniAppCancelOrderReq;
    }
    public void setAeMiniAppCancelOrderReq(AliexpressReverseApplyCancelAeMiniAppCancelOrderReq aeMiniAppCancelOrderReq){
        this.aeMiniAppCancelOrderReq = aeMiniAppCancelOrderReq;
        }

    @Override
    public String getApiName() {
        return "aliexpress.reverse.apply.cancel";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeMiniAppCancelOrderReq != null) {
                        super.addApiParameter("aeMiniAppCancelOrderReq", new JSONWriter(true, false).write(aeMiniAppCancelOrderReq));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressReverseApplyCancelResponse> getResponseClass() {
        return AliexpressReverseApplyCancelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}