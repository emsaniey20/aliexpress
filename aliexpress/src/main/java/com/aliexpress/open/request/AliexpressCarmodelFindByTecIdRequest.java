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
*  aliexpress.carmodel.findByTecId
*/
public class AliexpressCarmodelFindByTecIdRequest extends BaseGopRequest<AliexpressCarmodelFindByTecIdResponse> {

    /** tec id */
    private Long tecId;

    public Long getTecId(){
        return this.tecId;
    }
    public void setTecId(Long tecId){
        this.tecId = tecId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.carmodel.findByTecId";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tecId != null) {
                        super.addApiParameter("tec_id", tecId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressCarmodelFindByTecIdResponse> getResponseClass() {
        return AliexpressCarmodelFindByTecIdResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}