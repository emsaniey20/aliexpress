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
*  aliexpress/message/list2
*/
public class AliexpressMessageList2Request extends BaseGopRequest<AliexpressMessageList2Response> {

    /** 请求dto */
    private AliexpressMessageList2AeImQueryMessageDTO imQueryMessageDto;

    public AliexpressMessageList2AeImQueryMessageDTO getImQueryMessageDto(){
        return this.imQueryMessageDto;
    }
    public void setImQueryMessageDto(AliexpressMessageList2AeImQueryMessageDTO imQueryMessageDto){
        this.imQueryMessageDto = imQueryMessageDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/list2";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imQueryMessageDto != null) {
                        super.addApiParameter("im_query_message_dto", new JSONWriter(true, false).write(imQueryMessageDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageList2Response> getResponseClass() {
        return AliexpressMessageList2Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}