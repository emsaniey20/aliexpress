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
*  aliexpress.marketing.limiteddiscountpromotion.addpromotionproduct
*/
public class AliexpressMarketingLimiteddiscountpromotionAddpromotionproductRequest extends BaseGopRequest<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductResponse> {

    /** 详细参考如下 */
    private AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopLimitedDiscProductInputDTO limitedDiscProductInputDto;

    public AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopLimitedDiscProductInputDTO getLimitedDiscProductInputDto(){
        return this.limitedDiscProductInputDto;
    }
    public void setLimitedDiscProductInputDto(AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopLimitedDiscProductInputDTO limitedDiscProductInputDto){
        this.limitedDiscProductInputDto = limitedDiscProductInputDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.limiteddiscountpromotion.addpromotionproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (limitedDiscProductInputDto != null) {
                        super.addApiParameter("limited_disc_product_input_dto", new JSONWriter(true, false).write(limitedDiscProductInputDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductResponse> getResponseClass() {
        return AliexpressMarketingLimiteddiscountpromotionAddpromotionproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}