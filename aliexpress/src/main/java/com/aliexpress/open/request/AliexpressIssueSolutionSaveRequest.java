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
*  aliexpress.issue.solution.save
*/
public class AliexpressIssueSolutionSaveRequest extends BaseGopRequest<AliexpressIssueSolutionSaveResponse> {

    /** 详细参数如下 */
    private AliexpressIssueSolutionSaveSellerAddOrModifySolutionDTO paramDto;

    public AliexpressIssueSolutionSaveSellerAddOrModifySolutionDTO getParamDto(){
        return this.paramDto;
    }
    public void setParamDto(AliexpressIssueSolutionSaveSellerAddOrModifySolutionDTO paramDto){
        this.paramDto = paramDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.issue.solution.save";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramDto != null) {
                        super.addApiParameter("param_dto", new JSONWriter(true, false).write(paramDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressIssueSolutionSaveResponse> getResponseClass() {
        return AliexpressIssueSolutionSaveResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}