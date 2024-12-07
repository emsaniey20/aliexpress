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
*  aliexpress.evaluation.listorderevaluation.get
*/
public class AliexpressEvaluationListorderevaluationGetRequest extends BaseGopRequest<AliexpressEvaluationListorderevaluationGetResponse> {

    /** 详细参考如下 */
    private AliexpressEvaluationListorderevaluationGetTradeEvaluationRequest tradeEvaluationRequest;

    public AliexpressEvaluationListorderevaluationGetTradeEvaluationRequest getTradeEvaluationRequest(){
        return this.tradeEvaluationRequest;
    }
    public void setTradeEvaluationRequest(AliexpressEvaluationListorderevaluationGetTradeEvaluationRequest tradeEvaluationRequest){
        this.tradeEvaluationRequest = tradeEvaluationRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.evaluation.listorderevaluation.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tradeEvaluationRequest != null) {
                        super.addApiParameter("trade_evaluation_request", new JSONWriter(true, false).write(tradeEvaluationRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressEvaluationListorderevaluationGetResponse> getResponseClass() {
        return AliexpressEvaluationListorderevaluationGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}