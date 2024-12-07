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
*  global.mediacenter.folder.query
*/
public class GlobalMediacenterFolderQueryRequest extends BaseGopRequest<GlobalMediacenterFolderQueryResponse> {

    /** 请求参数 */
    private GlobalMediacenterFolderQueryMediaFolderQueryParamsOpenDTO requestParams;

    public GlobalMediacenterFolderQueryMediaFolderQueryParamsOpenDTO getRequestParams(){
        return this.requestParams;
    }
    public void setRequestParams(GlobalMediacenterFolderQueryMediaFolderQueryParamsOpenDTO requestParams){
        this.requestParams = requestParams;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.folder.query";
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
    public Class<GlobalMediacenterFolderQueryResponse> getResponseClass() {
        return GlobalMediacenterFolderQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}