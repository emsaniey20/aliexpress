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
*  aliexpress.marketing.limitdiscountpromotionproduct.edit
*/
public class AliexpressMarketingLimitdiscountpromotionproductEditRequest extends BaseGopRequest<AliexpressMarketingLimitdiscountpromotionproductEditResponse> {

    /** 详细参考如下 */
    private AliexpressMarketingLimitdiscountpromotionproductEditAeopLimitedDiscProductInputDTO paramLimitedDiscProductInputDto;

    public AliexpressMarketingLimitdiscountpromotionproductEditAeopLimitedDiscProductInputDTO getParamLimitedDiscProductInputDto(){
        return this.paramLimitedDiscProductInputDto;
    }
    public void setParamLimitedDiscProductInputDto(AliexpressMarketingLimitdiscountpromotionproductEditAeopLimitedDiscProductInputDTO paramLimitedDiscProductInputDto){
        this.paramLimitedDiscProductInputDto = paramLimitedDiscProductInputDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.limitdiscountpromotionproduct.edit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramLimitedDiscProductInputDto != null) {
                        super.addApiParameter("param_limited_disc_product_input_dto", new JSONWriter(true, false).write(paramLimitedDiscProductInputDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingLimitdiscountpromotionproductEditResponse> getResponseClass() {
        return AliexpressMarketingLimitdiscountpromotionproductEditResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}