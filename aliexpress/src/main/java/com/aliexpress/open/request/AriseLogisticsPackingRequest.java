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
*  arise.logistics.packing
*/
public class AriseLogisticsPackingRequest extends BaseGopRequest<AriseLogisticsPackingResponse> {

    /** 物流打包请求信息 */
    private AriseLogisticsPackingPackApiRequestDTO packRequest;

    public AriseLogisticsPackingPackApiRequestDTO getPackRequest(){
        return this.packRequest;
    }
    public void setPackRequest(AriseLogisticsPackingPackApiRequestDTO packRequest){
        this.packRequest = packRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.packing";
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
    public Class<AriseLogisticsPackingResponse> getResponseClass() {
        return AriseLogisticsPackingResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}