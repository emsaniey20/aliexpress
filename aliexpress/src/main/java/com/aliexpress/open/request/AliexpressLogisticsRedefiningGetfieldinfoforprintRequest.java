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
*  aliexpress.logistics.redefining.getfieldinfoforprint
*/
public class AliexpressLogisticsRedefiningGetfieldinfoforprintRequest extends BaseGopRequest<AliexpressLogisticsRedefiningGetfieldinfoforprintResponse> {

    /** International logistics number */
    private String internationalLogisticsId;
    /** Logistics Order Number */
    private Long id;

    public String getInternationalLogisticsId(){
        return this.internationalLogisticsId;
    }
    public void setInternationalLogisticsId(String internationalLogisticsId){
        this.internationalLogisticsId = internationalLogisticsId;
        }
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.redefining.getfieldinfoforprint";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (internationalLogisticsId != null) {
                        super.addApiParameter("international_logistics_id", internationalLogisticsId.toString());
                    }
                            if (id != null) {
                        super.addApiParameter("id", id.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsRedefiningGetfieldinfoforprintResponse> getResponseClass() {
        return AliexpressLogisticsRedefiningGetfieldinfoforprintResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}