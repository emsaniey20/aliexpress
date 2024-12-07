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
*  global.mediacenter.image.delete
*/
public class GlobalMediacenterImageDeleteRequest extends BaseGopRequest<GlobalMediacenterImageDeleteResponse> {

    /** 请求参数 */
    private GlobalMediacenterImageDeleteMediaImageOpsParamsOpenDTO requestParams;

    public GlobalMediacenterImageDeleteMediaImageOpsParamsOpenDTO getRequestParams(){
        return this.requestParams;
    }
    public void setRequestParams(GlobalMediacenterImageDeleteMediaImageOpsParamsOpenDTO requestParams){
        this.requestParams = requestParams;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.image.delete";
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
    public Class<GlobalMediacenterImageDeleteResponse> getResponseClass() {
        return GlobalMediacenterImageDeleteResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}