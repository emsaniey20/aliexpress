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
*  aliexpress.ascp.scitem.update
*/
public class AliexpressAscpScitemUpdateRequest extends BaseGopRequest<AliexpressAscpScitemUpdateResponse> {

    /** 货品编辑DTO，存在主子店铺关系时，请登录主店铺 */
    private AliexpressAscpScitemUpdateErpScItemUpdateDTO scitemUpdateRequest;

    public AliexpressAscpScitemUpdateErpScItemUpdateDTO getScitemUpdateRequest(){
        return this.scitemUpdateRequest;
    }
    public void setScitemUpdateRequest(AliexpressAscpScitemUpdateErpScItemUpdateDTO scitemUpdateRequest){
        this.scitemUpdateRequest = scitemUpdateRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.scitem.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (scitemUpdateRequest != null) {
                        super.addApiParameter("scitem_update_request", new JSONWriter(true, false).write(scitemUpdateRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpScitemUpdateResponse> getResponseClass() {
        return AliexpressAscpScitemUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}