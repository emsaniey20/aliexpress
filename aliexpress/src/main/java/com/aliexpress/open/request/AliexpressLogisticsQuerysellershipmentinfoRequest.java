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
*  aliexpress.logistics.querysellershipmentinfo
*/
public class AliexpressLogisticsQuerysellershipmentinfoRequest extends BaseGopRequest<AliexpressLogisticsQuerysellershipmentinfoResponse> {

    /** Logistics id */
    private String logisticsNo;
    /** Trade order id */
    private Long tradeOrderId;
    /** Logistics service name */
    private String serviceName;
    /** Number of suborder in that order */
    private Long subTradeOrderIndex;

    public String getLogisticsNo(){
        return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo){
        this.logisticsNo = logisticsNo;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public String getServiceName(){
        return this.serviceName;
    }
    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
        }
    public Long getSubTradeOrderIndex(){
        return this.subTradeOrderIndex;
    }
    public void setSubTradeOrderIndex(Long subTradeOrderIndex){
        this.subTradeOrderIndex = subTradeOrderIndex;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.querysellershipmentinfo";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (logisticsNo != null) {
                        super.addApiParameter("logistics_no", logisticsNo.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (serviceName != null) {
                        super.addApiParameter("service_name", serviceName.toString());
                    }
                            if (subTradeOrderIndex != null) {
                        super.addApiParameter("sub_trade_order_index", subTradeOrderIndex.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsQuerysellershipmentinfoResponse> getResponseClass() {
        return AliexpressLogisticsQuerysellershipmentinfoResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}