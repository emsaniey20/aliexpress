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
*  aliexpress/message/session/tag/update
*/
public class AliexpressMessageSessionTagUpdateRequest extends BaseGopRequest<AliexpressMessageSessionTagUpdateResponse> {

    /** 请求dto */
    private AliexpressMessageSessionTagUpdateAeImSessionViewUpdateDTO imSessionViewUpdateDto;

    public AliexpressMessageSessionTagUpdateAeImSessionViewUpdateDTO getImSessionViewUpdateDto(){
        return this.imSessionViewUpdateDto;
    }
    public void setImSessionViewUpdateDto(AliexpressMessageSessionTagUpdateAeImSessionViewUpdateDTO imSessionViewUpdateDto){
        this.imSessionViewUpdateDto = imSessionViewUpdateDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/session/tag/update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imSessionViewUpdateDto != null) {
                        super.addApiParameter("im_session_view_update_dto", new JSONWriter(true, false).write(imSessionViewUpdateDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageSessionTagUpdateResponse> getResponseClass() {
        return AliexpressMessageSessionTagUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}