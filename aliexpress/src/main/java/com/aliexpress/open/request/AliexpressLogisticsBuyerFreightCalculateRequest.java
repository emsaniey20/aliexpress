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
*  aliexpress.logistics.buyer.freight.calculate
*/
public class AliexpressLogisticsBuyerFreightCalculateRequest extends BaseGopRequest<AliexpressLogisticsBuyerFreightCalculateResponse> {

    /** Shipping Calculation Request Parameters */
    private AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateForBuyerDTO paramAeopFreightCalculateForBuyerDTO;

    public AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateForBuyerDTO getParamAeopFreightCalculateForBuyerDTO(){
        return this.paramAeopFreightCalculateForBuyerDTO;
    }
    public void setParamAeopFreightCalculateForBuyerDTO(AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateForBuyerDTO paramAeopFreightCalculateForBuyerDTO){
        this.paramAeopFreightCalculateForBuyerDTO = paramAeopFreightCalculateForBuyerDTO;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.buyer.freight.calculate";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramAeopFreightCalculateForBuyerDTO != null) {
                        super.addApiParameter("param_aeop_freight_calculate_for_buyer_d_t_o", new JSONWriter(true, false).write(paramAeopFreightCalculateForBuyerDTO));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsBuyerFreightCalculateResponse> getResponseClass() {
        return AliexpressLogisticsBuyerFreightCalculateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}