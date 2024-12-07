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
*  aliexpress.influencer.content.resource.check
*/
public class AliexpressInfluencerContentResourceCheckRequest extends BaseGopRequest<AliexpressInfluencerContentResourceCheckResponse> {

    /** 请求参数 */
    private AliexpressInfluencerContentResourceCheckResourceCheckRequest requestParam;

    public AliexpressInfluencerContentResourceCheckResourceCheckRequest getRequestParam(){
        return this.requestParam;
    }
    public void setRequestParam(AliexpressInfluencerContentResourceCheckResourceCheckRequest requestParam){
        this.requestParam = requestParam;
        }

    @Override
    public String getApiName() {
        return "aliexpress.influencer.content.resource.check";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (requestParam != null) {
                        super.addApiParameter("request_param", new JSONWriter(true, false).write(requestParam));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressInfluencerContentResourceCheckResponse> getResponseClass() {
        return AliexpressInfluencerContentResourceCheckResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}