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
*  cainiao.global.logistics.service.query
*/
public class CainiaoGlobalLogisticsServiceQueryRequest extends BaseGopRequest<CainiaoGlobalLogisticsServiceQueryResponse> {

    /** 交易订单ID */
    private Long tradeOrderId;
    /** 国际运单号 */
    private String intlTrackingNo;
    /** 物流单号（LP） */
    private String outOrderCode;
    /** 原因 */
    private String reason;

    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public String getIntlTrackingNo(){
        return this.intlTrackingNo;
    }
    public void setIntlTrackingNo(String intlTrackingNo){
        this.intlTrackingNo = intlTrackingNo;
        }
    public String getOutOrderCode(){
        return this.outOrderCode;
    }
    public void setOutOrderCode(String outOrderCode){
        this.outOrderCode = outOrderCode;
        }
    public String getReason(){
        return this.reason;
    }
    public void setReason(String reason){
        this.reason = reason;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.logistics.service.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (intlTrackingNo != null) {
                        super.addApiParameter("intl_tracking_no", intlTrackingNo.toString());
                    }
                            if (outOrderCode != null) {
                        super.addApiParameter("out_order_code", outOrderCode.toString());
                    }
                            if (reason != null) {
                        super.addApiParameter("reason", reason.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalLogisticsServiceQueryResponse> getResponseClass() {
        return CainiaoGlobalLogisticsServiceQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}