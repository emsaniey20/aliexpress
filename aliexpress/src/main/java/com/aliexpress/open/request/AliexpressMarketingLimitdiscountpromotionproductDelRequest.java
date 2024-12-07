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
*  aliexpress.marketing.limitdiscountpromotionproduct.del
*/
public class AliexpressMarketingLimitdiscountpromotionproductDelRequest extends BaseGopRequest<AliexpressMarketingLimitdiscountpromotionproductDelResponse> {

    /** 系统自动生成 */
    private AliexpressMarketingLimitdiscountpromotionproductDelAeopLimitedDiscProductIdDTO paramAeopLimitedDiscProductIdDTO;

    public AliexpressMarketingLimitdiscountpromotionproductDelAeopLimitedDiscProductIdDTO getParamAeopLimitedDiscProductIdDTO(){
        return this.paramAeopLimitedDiscProductIdDTO;
    }
    public void setParamAeopLimitedDiscProductIdDTO(AliexpressMarketingLimitdiscountpromotionproductDelAeopLimitedDiscProductIdDTO paramAeopLimitedDiscProductIdDTO){
        this.paramAeopLimitedDiscProductIdDTO = paramAeopLimitedDiscProductIdDTO;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.limitdiscountpromotionproduct.del";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramAeopLimitedDiscProductIdDTO != null) {
                        super.addApiParameter("param_aeop_limited_disc_product_id_d_t_o", new JSONWriter(true, false).write(paramAeopLimitedDiscProductIdDTO));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingLimitdiscountpromotionproductDelResponse> getResponseClass() {
        return AliexpressMarketingLimitdiscountpromotionproductDelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}