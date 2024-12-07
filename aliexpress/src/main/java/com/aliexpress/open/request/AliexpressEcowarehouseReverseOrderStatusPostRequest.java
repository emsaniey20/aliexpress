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
*  aliexpress.ecowarehouse.reverse.order.status.post
*/
public class AliexpressEcowarehouseReverseOrderStatusPostRequest extends BaseGopRequest<AliexpressEcowarehouseReverseOrderStatusPostResponse> {

    /** request */
    private AliexpressEcowarehouseReverseOrderStatusPostSendReverseCallbackRequest sendReverseCallbackRequest;

    public AliexpressEcowarehouseReverseOrderStatusPostSendReverseCallbackRequest getSendReverseCallbackRequest(){
        return this.sendReverseCallbackRequest;
    }
    public void setSendReverseCallbackRequest(AliexpressEcowarehouseReverseOrderStatusPostSendReverseCallbackRequest sendReverseCallbackRequest){
        this.sendReverseCallbackRequest = sendReverseCallbackRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ecowarehouse.reverse.order.status.post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sendReverseCallbackRequest != null) {
                        super.addApiParameter("send_reverse_callback_request", new JSONWriter(true, false).write(sendReverseCallbackRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressEcowarehouseReverseOrderStatusPostResponse> getResponseClass() {
        return AliexpressEcowarehouseReverseOrderStatusPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}