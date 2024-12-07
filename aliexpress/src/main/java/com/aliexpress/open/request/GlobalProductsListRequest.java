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
*  global.products.list
*/
public class GlobalProductsListRequest extends BaseGopRequest<GlobalProductsListResponse> {

    /** param */
    private GlobalProductsListCspProductSearchApiRequestDTO requestParam;

    public GlobalProductsListCspProductSearchApiRequestDTO getRequestParam(){
        return this.requestParam;
    }
    public void setRequestParam(GlobalProductsListCspProductSearchApiRequestDTO requestParam){
        this.requestParam = requestParam;
        }

    @Override
    public String getApiName() {
        return "global.products.list";
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
    public Class<GlobalProductsListResponse> getResponseClass() {
        return GlobalProductsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}