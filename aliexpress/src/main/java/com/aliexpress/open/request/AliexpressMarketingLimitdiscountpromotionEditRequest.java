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
*  aliexpress.marketing.limitdiscountpromotion.edit
*/
public class AliexpressMarketingLimitdiscountpromotionEditRequest extends BaseGopRequest<AliexpressMarketingLimitdiscountpromotionEditResponse> {

    /** 输入参数 */
    private AliexpressMarketingLimitdiscountpromotionEditAeopLimitedDiscInputDTO paramLimitedDiscInputDto;

    public AliexpressMarketingLimitdiscountpromotionEditAeopLimitedDiscInputDTO getParamLimitedDiscInputDto(){
        return this.paramLimitedDiscInputDto;
    }
    public void setParamLimitedDiscInputDto(AliexpressMarketingLimitdiscountpromotionEditAeopLimitedDiscInputDTO paramLimitedDiscInputDto){
        this.paramLimitedDiscInputDto = paramLimitedDiscInputDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.limitdiscountpromotion.edit";
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
    public Class<AliexpressMarketingLimitdiscountpromotionEditResponse> getResponseClass() {
        return AliexpressMarketingLimitdiscountpromotionEditResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}