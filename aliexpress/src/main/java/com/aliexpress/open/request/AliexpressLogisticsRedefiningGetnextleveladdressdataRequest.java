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
*  aliexpress.logistics.redefining.getnextleveladdressdata
*/
public class AliexpressLogisticsRedefiningGetnextleveladdressdataRequest extends BaseGopRequest<AliexpressLogisticsRedefiningGetnextleveladdressdataResponse> {

    /** area id */
    private Long areaId;

    public Long getAreaId(){
        return this.areaId;
    }
    public void setAreaId(Long areaId){
        this.areaId = areaId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.redefining.getnextleveladdressdata";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (areaId != null) {
                        super.addApiParameter("area_id", areaId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsRedefiningGetnextleveladdressdataResponse> getResponseClass() {
        return AliexpressLogisticsRedefiningGetnextleveladdressdataResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}