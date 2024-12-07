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
*  aliexpress/message/session/open
*/
public class AliexpressMessageSessionOpenRequest extends BaseGopRequest<AliexpressMessageSessionOpenResponse> {

    /** 请求dto */
    private AliexpressMessageSessionOpenAeImSessionOpenDTO imSessionOpenDto;

    public AliexpressMessageSessionOpenAeImSessionOpenDTO getImSessionOpenDto(){
        return this.imSessionOpenDto;
    }
    public void setImSessionOpenDto(AliexpressMessageSessionOpenAeImSessionOpenDTO imSessionOpenDto){
        this.imSessionOpenDto = imSessionOpenDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/session/open";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imSessionOpenDto != null) {
                        super.addApiParameter("im_session_open_dto", new JSONWriter(true, false).write(imSessionOpenDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageSessionOpenResponse> getResponseClass() {
        return AliexpressMessageSessionOpenResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}