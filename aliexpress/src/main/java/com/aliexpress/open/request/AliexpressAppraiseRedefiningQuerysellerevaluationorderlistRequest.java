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
*  aliexpress.appraise.redefining.querysellerevaluationorderlist
*/
public class AliexpressAppraiseRedefiningQuerysellerevaluationorderlistRequest extends BaseGopRequest<AliexpressAppraiseRedefiningQuerysellerevaluationorderlistResponse> {

    /** 查询参数 */
    private AliexpressAppraiseRedefiningQuerysellerevaluationorderlistSellerEvaluationOpenQueryDTO queryDTO;

    public AliexpressAppraiseRedefiningQuerysellerevaluationorderlistSellerEvaluationOpenQueryDTO getQueryDTO(){
        return this.queryDTO;
    }
    public void setQueryDTO(AliexpressAppraiseRedefiningQuerysellerevaluationorderlistSellerEvaluationOpenQueryDTO queryDTO){
        this.queryDTO = queryDTO;
        }

    @Override
    public String getApiName() {
        return "aliexpress.appraise.redefining.querysellerevaluationorderlist";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (queryDTO != null) {
                        super.addApiParameter("query_d_t_o", new JSONWriter(true, false).write(queryDTO));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAppraiseRedefiningQuerysellerevaluationorderlistResponse> getResponseClass() {
        return AliexpressAppraiseRedefiningQuerysellerevaluationorderlistResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}