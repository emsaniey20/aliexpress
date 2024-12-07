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
*  aliexpress.logistics.redefining.getprintinfo
*/
public class AliexpressLogisticsRedefiningGetprintinfoRequest extends BaseGopRequest<AliexpressLogisticsRedefiningGetprintinfoResponse> {

    /** internationalLogisticsId is international logistics waybill ID (Required) */
    private String internationalLogisticsId;

    public String getInternationalLogisticsId(){
        return this.internationalLogisticsId;
    }
    public void setInternationalLogisticsId(String internationalLogisticsId){
        this.internationalLogisticsId = internationalLogisticsId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.redefining.getprintinfo";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (internationalLogisticsId != null) {
                        super.addApiParameter("international_logistics_id", internationalLogisticsId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsRedefiningGetprintinfoResponse> getResponseClass() {
        return AliexpressLogisticsRedefiningGetprintinfoResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}