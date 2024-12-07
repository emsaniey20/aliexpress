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
*  /august/fourteen/online/first/api
*/
public class AugustFourteenOnlineFirstApiRequest extends BaseGopRequest<AugustFourteenOnlineFirstApiResponse> {

    /** 对应ID */
    private Long iD;

    public Long getID(){
        return this.iD;
    }
    public void setID(Long iD){
        this.iD = iD;
        }

    @Override
    public String getApiName() {
        return "/august/fourteen/online/first/api";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (iD != null) {
                        super.addApiParameter("ID", iD.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AugustFourteenOnlineFirstApiResponse> getResponseClass() {
        return AugustFourteenOnlineFirstApiResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}