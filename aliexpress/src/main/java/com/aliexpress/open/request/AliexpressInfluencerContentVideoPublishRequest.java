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
*  aliexpress.influencer.content.video.publish
*/
public class AliexpressInfluencerContentVideoPublishRequest extends BaseGopRequest<AliexpressInfluencerContentVideoPublishResponse> {

    /** 请求参数 */
    private AliexpressInfluencerContentVideoPublishVideoPublishRequest requestParam;

    public AliexpressInfluencerContentVideoPublishVideoPublishRequest getRequestParam(){
        return this.requestParam;
    }
    public void setRequestParam(AliexpressInfluencerContentVideoPublishVideoPublishRequest requestParam){
        this.requestParam = requestParam;
        }

    @Override
    public String getApiName() {
        return "aliexpress.influencer.content.video.publish";
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
    public Class<AliexpressInfluencerContentVideoPublishResponse> getResponseClass() {
        return AliexpressInfluencerContentVideoPublishResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}