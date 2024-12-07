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
*  cainiao.global.logistics.carrier.querylist
*/
public class CainiaoGlobalLogisticsCarrierQuerylistRequest extends BaseGopRequest<CainiaoGlobalLogisticsCarrierQuerylistResponse> {

    /** 多语言(暂不支持，保留入参) */
    private String locale;

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.logistics.carrier.querylist";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalLogisticsCarrierQuerylistResponse> getResponseClass() {
        return CainiaoGlobalLogisticsCarrierQuerylistResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}