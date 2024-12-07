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
*  aliexpress.merchant.oversea.brand.get
*/
public class AliexpressMerchantOverseaBrandGetRequest extends BaseGopRequest<AliexpressMerchantOverseaBrandGetResponse> {



    @Override
    public String getApiName() {
        return "aliexpress.merchant.oversea.brand.get";
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
    public Class<AliexpressMerchantOverseaBrandGetResponse> getResponseClass() {
        return AliexpressMerchantOverseaBrandGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}