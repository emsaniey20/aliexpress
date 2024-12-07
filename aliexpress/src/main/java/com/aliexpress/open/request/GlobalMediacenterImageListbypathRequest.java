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
*  global.mediacenter.image.listbypath
*/
public class GlobalMediacenterImageListbypathRequest extends BaseGopRequest<GlobalMediacenterImageListbypathResponse> {

    /** 请求参数 */
    private GlobalMediacenterImageListbypathMediaImageQueryParamsOpenDTO requestParams;

    public GlobalMediacenterImageListbypathMediaImageQueryParamsOpenDTO getRequestParams(){
        return this.requestParams;
    }
    public void setRequestParams(GlobalMediacenterImageListbypathMediaImageQueryParamsOpenDTO requestParams){
        this.requestParams = requestParams;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.image.listbypath";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (requestParams != null) {
                        super.addApiParameter("requestParams", new JSONWriter(true, false).write(requestParams));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<GlobalMediacenterImageListbypathResponse> getResponseClass() {
        return GlobalMediacenterImageListbypathResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}