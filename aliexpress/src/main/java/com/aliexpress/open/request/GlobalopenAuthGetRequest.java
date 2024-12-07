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
*  /globalopen/auth/get
*/
public class GlobalopenAuthGetRequest extends BaseGopRequest<GlobalopenAuthGetResponse> {

    /** realObjectId */
    private String realObjectId;
    /** platformId */
    private String platformId;

    public String getRealObjectId(){
        return this.realObjectId;
    }
    public void setRealObjectId(String realObjectId){
        this.realObjectId = realObjectId;
        }
    public String getPlatformId(){
        return this.platformId;
    }
    public void setPlatformId(String platformId){
        this.platformId = platformId;
        }

    @Override
    public String getApiName() {
        return "/globalopen/auth/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (realObjectId != null) {
                        super.addApiParameter("realObjectId", realObjectId.toString());
                    }
                            if (platformId != null) {
                        super.addApiParameter("platformId", platformId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<GlobalopenAuthGetResponse> getResponseClass() {
        return GlobalopenAuthGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}