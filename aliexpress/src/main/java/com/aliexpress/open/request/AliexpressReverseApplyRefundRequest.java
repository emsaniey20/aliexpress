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
*  aliexpress.reverse.apply.refund
*/
public class AliexpressReverseApplyRefundRequest extends BaseGopRequest<AliexpressReverseApplyRefundResponse> {

    /** 入参 */
    private AliexpressReverseApplyRefundAeMiniAppSelfRefundReq aeSelfRefundReqForMiniApp;

    public AliexpressReverseApplyRefundAeMiniAppSelfRefundReq getAeSelfRefundReqForMiniApp(){
        return this.aeSelfRefundReqForMiniApp;
    }
    public void setAeSelfRefundReqForMiniApp(AliexpressReverseApplyRefundAeMiniAppSelfRefundReq aeSelfRefundReqForMiniApp){
        this.aeSelfRefundReqForMiniApp = aeSelfRefundReqForMiniApp;
        }

    @Override
    public String getApiName() {
        return "aliexpress.reverse.apply.refund";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeSelfRefundReqForMiniApp != null) {
                        super.addApiParameter("aeSelfRefundReqForMiniApp", new JSONWriter(true, false).write(aeSelfRefundReqForMiniApp));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressReverseApplyRefundResponse> getResponseClass() {
        return AliexpressReverseApplyRefundResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}