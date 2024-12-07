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
*  com.aliexpress.pay.group
*/
public class ComAliexpressPayGroupRequest extends BaseGopRequest<ComAliexpressPayGroupResponse> {



    @Override
    public String getApiName() {
        return "com.aliexpress.pay.group";
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
    public Class<ComAliexpressPayGroupResponse> getResponseClass() {
        return ComAliexpressPayGroupResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}