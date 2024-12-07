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
*  aliexpress.logistics.buyer.freight.get
*/
public class AliexpressLogisticsBuyerFreightGetRequest extends BaseGopRequest<AliexpressLogisticsBuyerFreightGetResponse> {

    /** 入参对象 */
    private AliexpressLogisticsBuyerFreightGetAeopFreightCalculateForBuyerDTO aeopFreightCalculateForBuyerDTO;

    public AliexpressLogisticsBuyerFreightGetAeopFreightCalculateForBuyerDTO getAeopFreightCalculateForBuyerDTO(){
        return this.aeopFreightCalculateForBuyerDTO;
    }
    public void setAeopFreightCalculateForBuyerDTO(AliexpressLogisticsBuyerFreightGetAeopFreightCalculateForBuyerDTO aeopFreightCalculateForBuyerDTO){
        this.aeopFreightCalculateForBuyerDTO = aeopFreightCalculateForBuyerDTO;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.buyer.freight.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeopFreightCalculateForBuyerDTO != null) {
                        super.addApiParameter("aeopFreightCalculateForBuyerDTO", new JSONWriter(true, false).write(aeopFreightCalculateForBuyerDTO));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsBuyerFreightGetResponse> getResponseClass() {
        return AliexpressLogisticsBuyerFreightGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}