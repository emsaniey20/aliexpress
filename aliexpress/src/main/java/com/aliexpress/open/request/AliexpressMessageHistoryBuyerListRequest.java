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
*  aliexpress/message/history/buyer/list
*/
public class AliexpressMessageHistoryBuyerListRequest extends BaseGopRequest<AliexpressMessageHistoryBuyerListResponse> {

    /** 请求dto */
    private AliexpressMessageHistoryBuyerListAeImQuerySessionDTO aeImQuerySessionDto;

    public AliexpressMessageHistoryBuyerListAeImQuerySessionDTO getAeImQuerySessionDto(){
        return this.aeImQuerySessionDto;
    }
    public void setAeImQuerySessionDto(AliexpressMessageHistoryBuyerListAeImQuerySessionDTO aeImQuerySessionDto){
        this.aeImQuerySessionDto = aeImQuerySessionDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/history/buyer/list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeImQuerySessionDto != null) {
                        super.addApiParameter("ae_im_query_session_dto", new JSONWriter(true, false).write(aeImQuerySessionDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageHistoryBuyerListResponse> getResponseClass() {
        return AliexpressMessageHistoryBuyerListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}