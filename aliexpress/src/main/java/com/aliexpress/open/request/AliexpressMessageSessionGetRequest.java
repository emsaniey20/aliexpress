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
*  aliexpress/message/session/get
*/
public class AliexpressMessageSessionGetRequest extends BaseGopRequest<AliexpressMessageSessionGetResponse> {

    /** 请求dto */
    private AliexpressMessageSessionGetAeImQuerySessionDTO imQuerySessionDto;

    public AliexpressMessageSessionGetAeImQuerySessionDTO getImQuerySessionDto(){
        return this.imQuerySessionDto;
    }
    public void setImQuerySessionDto(AliexpressMessageSessionGetAeImQuerySessionDTO imQuerySessionDto){
        this.imQuerySessionDto = imQuerySessionDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/session/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imQuerySessionDto != null) {
                        super.addApiParameter("im_query_session_dto", new JSONWriter(true, false).write(imQuerySessionDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageSessionGetResponse> getResponseClass() {
        return AliexpressMessageSessionGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}