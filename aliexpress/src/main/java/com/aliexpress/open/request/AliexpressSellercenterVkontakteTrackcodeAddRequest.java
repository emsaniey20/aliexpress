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
*  aliexpress.sellercenter.vkontakte.trackcode.add
*/
public class AliexpressSellercenterVkontakteTrackcodeAddRequest extends BaseGopRequest<AliexpressSellercenterVkontakteTrackcodeAddResponse> {

    /** AddTrackCode Request */
    private AliexpressSellercenterVkontakteTrackcodeAddAddTrackCodeRequest addTrackCode;

    public AliexpressSellercenterVkontakteTrackcodeAddAddTrackCodeRequest getAddTrackCode(){
        return this.addTrackCode;
    }
    public void setAddTrackCode(AliexpressSellercenterVkontakteTrackcodeAddAddTrackCodeRequest addTrackCode){
        this.addTrackCode = addTrackCode;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.vkontakte.trackcode.add";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (addTrackCode != null) {
                        super.addApiParameter("add_track_code", new JSONWriter(true, false).write(addTrackCode));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSellercenterVkontakteTrackcodeAddResponse> getResponseClass() {
        return AliexpressSellercenterVkontakteTrackcodeAddResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}