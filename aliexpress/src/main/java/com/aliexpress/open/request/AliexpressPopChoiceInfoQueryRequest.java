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
*  aliexpress.pop.choice.info.query
*/
public class AliexpressPopChoiceInfoQueryRequest extends BaseGopRequest<AliexpressPopChoiceInfoQueryResponse> {



    @Override
    public String getApiName() {
        return "aliexpress.pop.choice.info.query";
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
    public Class<AliexpressPopChoiceInfoQueryResponse> getResponseClass() {
        return AliexpressPopChoiceInfoQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}