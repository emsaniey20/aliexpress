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
*  aliexpress.sellercenter.proxy.chat.message.read
*/
public class AliexpressSellercenterProxyChatMessageReadRequest extends BaseGopRequest<AliexpressSellercenterProxyChatMessageReadResponse> {

    /** CreateReadMessageProxyRequest */
    private AliexpressSellercenterProxyChatMessageReadCreateReadMessageProxyRequest input;

    public AliexpressSellercenterProxyChatMessageReadCreateReadMessageProxyRequest getInput(){
        return this.input;
    }
    public void setInput(AliexpressSellercenterProxyChatMessageReadCreateReadMessageProxyRequest input){
        this.input = input;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.proxy.chat.message.read";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (input != null) {
                        super.addApiParameter("input", new JSONWriter(true, false).write(input));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSellercenterProxyChatMessageReadResponse> getResponseClass() {
        return AliexpressSellercenterProxyChatMessageReadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}