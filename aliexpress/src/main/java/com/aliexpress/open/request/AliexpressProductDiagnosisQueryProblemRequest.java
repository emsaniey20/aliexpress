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
*  aliexpress.product.diagnosis.queryProblem
*/
public class AliexpressProductDiagnosisQueryProblemRequest extends BaseGopRequest<AliexpressProductDiagnosisQueryProblemResponse> {



    @Override
    public String getApiName() {
        return "aliexpress.product.diagnosis.queryProblem";
    }
    @Override
    public IopHashMap getApiParams() {
            return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
            return super.getFileParams();
    }

    @Override
    public Class<AliexpressProductDiagnosisQueryProblemResponse> getResponseClass() {
        return AliexpressProductDiagnosisQueryProblemResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}