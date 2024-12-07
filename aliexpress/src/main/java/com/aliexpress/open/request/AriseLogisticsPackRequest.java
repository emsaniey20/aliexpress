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
*  arise.logistics.pack
*/
public class AriseLogisticsPackRequest extends BaseGopRequest<AriseLogisticsPackResponse> {

    /** 物流打包请求信息 */
    private AriseLogisticsPackPackApiRequestDTO packRequest;

    public AriseLogisticsPackPackApiRequestDTO getPackRequest(){
        return this.packRequest;
    }
    public void setPackRequest(AriseLogisticsPackPackApiRequestDTO packRequest){
        this.packRequest = packRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.pack";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (packRequest != null) {
                        super.addApiParameter("pack_request", new JSONWriter(true, false).write(packRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsPackResponse> getResponseClass() {
        return AriseLogisticsPackResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}