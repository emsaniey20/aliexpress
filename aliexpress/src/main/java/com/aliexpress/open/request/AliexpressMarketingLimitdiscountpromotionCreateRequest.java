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
*  aliexpress.marketing.limitdiscountpromotion.create
*/
public class AliexpressMarketingLimitdiscountpromotionCreateRequest extends BaseGopRequest<AliexpressMarketingLimitdiscountpromotionCreateResponse> {

    /** 详细参考如下 */
    private AliexpressMarketingLimitdiscountpromotionCreateAeopLimitedDiscInputDTO paramLimitedDiscInputDto;

    public AliexpressMarketingLimitdiscountpromotionCreateAeopLimitedDiscInputDTO getParamLimitedDiscInputDto(){
        return this.paramLimitedDiscInputDto;
    }
    public void setParamLimitedDiscInputDto(AliexpressMarketingLimitdiscountpromotionCreateAeopLimitedDiscInputDTO paramLimitedDiscInputDto){
        this.paramLimitedDiscInputDto = paramLimitedDiscInputDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.limitdiscountpromotion.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramLimitedDiscInputDto != null) {
                        super.addApiParameter("param_limited_disc_input_dto", new JSONWriter(true, false).write(paramLimitedDiscInputDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingLimitdiscountpromotionCreateResponse> getResponseClass() {
        return AliexpressMarketingLimitdiscountpromotionCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}