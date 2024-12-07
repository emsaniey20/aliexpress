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
*  aliexpress.ascp.scitem.create
*/
public class AliexpressAscpScitemCreateRequest extends BaseGopRequest<AliexpressAscpScitemCreateResponse> {

    /** 货品创建DTO，存在主子店铺关系时，请登录主店铺 */
    private AliexpressAscpScitemCreateErpScItemCreateDTO scitemCreateRequest;

    public AliexpressAscpScitemCreateErpScItemCreateDTO getScitemCreateRequest(){
        return this.scitemCreateRequest;
    }
    public void setScitemCreateRequest(AliexpressAscpScitemCreateErpScItemCreateDTO scitemCreateRequest){
        this.scitemCreateRequest = scitemCreateRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.scitem.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (scitemCreateRequest != null) {
                        super.addApiParameter("scitem_create_request", new JSONWriter(true, false).write(scitemCreateRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpScitemCreateResponse> getResponseClass() {
        return AliexpressAscpScitemCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}