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
*  aliexpress.trade.new.redefiningcopy3
*/
public class AliexpressTradeNewRedefiningcopy3Request extends BaseGopRequest<AliexpressTradeNewRedefiningcopy3Response> {

    /** 详细参考如下 */
    private AliexpressTradeNewRedefiningcopy3AeopTpSingleOrderQuery param1;

    public AliexpressTradeNewRedefiningcopy3AeopTpSingleOrderQuery getParam1(){
        return this.param1;
    }
    public void setParam1(AliexpressTradeNewRedefiningcopy3AeopTpSingleOrderQuery param1){
        this.param1 = param1;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.new.redefiningcopy3";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param1 != null) {
                        super.addApiParameter("param1", new JSONWriter(true, false).write(param1));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressTradeNewRedefiningcopy3Response> getResponseClass() {
        return AliexpressTradeNewRedefiningcopy3Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}