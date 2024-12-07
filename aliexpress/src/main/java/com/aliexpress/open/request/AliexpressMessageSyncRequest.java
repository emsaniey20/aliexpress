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
*  aliexpress/message/sync
*/
public class AliexpressMessageSyncRequest extends BaseGopRequest<AliexpressMessageSyncResponse> {

    /** 请求dto */
    private AliexpressMessageSyncAeImSyncDataDTO imSyncDataDto;

    public AliexpressMessageSyncAeImSyncDataDTO getImSyncDataDto(){
        return this.imSyncDataDto;
    }
    public void setImSyncDataDto(AliexpressMessageSyncAeImSyncDataDTO imSyncDataDto){
        this.imSyncDataDto = imSyncDataDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/sync";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imSyncDataDto != null) {
                        super.addApiParameter("im_sync_data_dto", new JSONWriter(true, false).write(imSyncDataDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageSyncResponse> getResponseClass() {
        return AliexpressMessageSyncResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}