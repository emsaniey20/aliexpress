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
*  aliexpress.trade.redefining.extendsbuyeracceptgoodstime
*/
public class AliexpressTradeRedefiningExtendsbuyeracceptgoodstimeRequest extends BaseGopRequest<AliexpressTradeRedefiningExtendsbuyeracceptgoodstimeResponse> {

    /** 需要延长收货时间的订单ID */
    private Long param0;
    /** 请求延长的具体天数 */
    private Long param1;

    public Long getParam0(){
        return this.param0;
    }
    public void setParam0(Long param0){
        this.param0 = param0;
        }
    public Long getParam1(){
        return this.param1;
    }
    public void setParam1(Long param1){
        this.param1 = param1;
        }

    @Override
    public String getApiName() {
        return "aliexpress.trade.redefining.extendsbuyeracceptgoodstime";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param0 != null) {
                        super.addApiParameter("param0", param0.toString());
                    }
                            if (param1 != null) {
                        super.addApiParameter("param1", param1.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressTradeRedefiningExtendsbuyeracceptgoodstimeResponse> getResponseClass() {
        return AliexpressTradeRedefiningExtendsbuyeracceptgoodstimeResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}