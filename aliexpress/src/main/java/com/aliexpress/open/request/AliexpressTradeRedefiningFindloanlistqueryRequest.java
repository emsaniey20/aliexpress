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
*  aliexpress.trade.redefining.findloanlistquery
*/
public class AliexpressTradeRedefiningFindloanlistqueryRequest extends BaseGopRequest<AliexpressTradeRedefiningFindloanlistqueryResponse> {

    /** 入参 */
    private AliexpressTradeRedefiningFindloanlistqueryFundloanRequest param1;

    public AliexpressTradeRedefiningFindloanlistqueryFundloanRequest getParam1(){
        return this.param1;
    }
    public void setParam1(AliexpressTradeRedefiningFindloanlistqueryFundloanRequest param1){
        this.param1 = param1;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.redefining.findloanlistquery";
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
    public Class<AliexpressTradeRedefiningFindloanlistqueryResponse> getResponseClass() {
        return AliexpressTradeRedefiningFindloanlistqueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}