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
*  aliexpress.sellercenter.proxy.chat.message.create
*/
public class AliexpressSellercenterProxyChatMessageCreateRequest extends BaseGopRequest<AliexpressSellercenterProxyChatMessageCreateResponse> {

    /** CreateMessageRequest */
    private AliexpressSellercenterProxyChatMessageCreateCreateMessageProxyRequest input;

    public AliexpressSellercenterProxyChatMessageCreateCreateMessageProxyRequest getInput(){
        return this.input;
    }
    public void setInput(AliexpressSellercenterProxyChatMessageCreateCreateMessageProxyRequest input){
        this.input = input;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.proxy.chat.message.create";
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
    public Class<AliexpressSellercenterProxyChatMessageCreateResponse> getResponseClass() {
        return AliexpressSellercenterProxyChatMessageCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}