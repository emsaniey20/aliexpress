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
*  /aliexpress/spi/im/message/send
*/
public class AliexpressSpiImMessageSendRequest extends BaseGopRequest<AliexpressSpiImMessageSendResponse> {

    /** 1 */
    private AliexpressSpiImMessageSend param;

    public AliexpressSpiImMessageSend getParam(){
        return this.param;
    }
    public void setParam(AliexpressSpiImMessageSend param){
        this.param = param;
        }

    @Override
    public String getApiName() {
        return "/aliexpress/spi/im/message/send";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param != null) {
                        super.addApiParameter("param", new JSONWriter(true, false).write(param));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSpiImMessageSendResponse> getResponseClass() {
        return AliexpressSpiImMessageSendResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}