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
*  aliexpress.logistics.sellershipmentsupportsubtradeorder
*/
public class AliexpressLogisticsSellershipmentsupportsubtradeorderRequest extends BaseGopRequest<AliexpressLogisticsSellershipmentsupportsubtradeorderResponse> {

    /** 1 */
    private List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList;
    /** 主订单ID */
    private Long tradeOrderId;

    public List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> getSubTradeOrderList(){
        return this.subTradeOrderList;
    }
    public void setSubTradeOrderList(List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList){
        this.subTradeOrderList = subTradeOrderList;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.sellershipmentsupportsubtradeorder";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (subTradeOrderList != null) {
                        super.addApiParameter("sub_trade_order_list", new JSONWriter(true, false).write(subTradeOrderList));
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsSellershipmentsupportsubtradeorderResponse> getResponseClass() {
        return AliexpressLogisticsSellershipmentsupportsubtradeorderResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}