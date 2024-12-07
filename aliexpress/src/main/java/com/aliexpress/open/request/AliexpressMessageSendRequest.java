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
*  aliexpress/message/send
*/
public class AliexpressMessageSendRequest extends BaseGopRequest<AliexpressMessageSendResponse> {

    /** 请求dto */
    private AliexpressMessageSendAeImSendMessageDTO imSendMessageDto;

    public AliexpressMessageSendAeImSendMessageDTO getImSendMessageDto(){
        return this.imSendMessageDto;
    }
    public void setImSendMessageDto(AliexpressMessageSendAeImSendMessageDTO imSendMessageDto){
        this.imSendMessageDto = imSendMessageDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/send";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imSendMessageDto != null) {
                        super.addApiParameter("im_send_message_dto", new JSONWriter(true, false).write(imSendMessageDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageSendResponse> getResponseClass() {
        return AliexpressMessageSendResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}