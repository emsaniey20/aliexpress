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
*  aliexpress.logistics.redefining.sellermodifiedshipmentsupportsubtradeorder
*/
public class AliexpressLogisticsRedefiningSellermodifiedshipmentsupportsubtradeorderRequest extends BaseGopRequest<AliexpressLogisticsRedefiningSellermodifiedshipmentsupportsubtradeorderResponse> {

    /** subtrade order list */
    private List<AliexpressLogisticsRedefiningSellermodifiedshipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList;
    /** Old logistics id */
    private String oldLogisticsNo;
    /** Trade order id */
    private Long tradeOrderId;
    /** Old logistics Service Name */
    private String oldServiceName;

    public List<AliexpressLogisticsRedefiningSellermodifiedshipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> getSubTradeOrderList(){
        return this.subTradeOrderList;
    }
    public void setSubTradeOrderList(List<AliexpressLogisticsRedefiningSellermodifiedshipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList){
        this.subTradeOrderList = subTradeOrderList;
        }
    public String getOldLogisticsNo(){
        return this.oldLogisticsNo;
    }
    public void setOldLogisticsNo(String oldLogisticsNo){
        this.oldLogisticsNo = oldLogisticsNo;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public String getOldServiceName(){
        return this.oldServiceName;
    }
    public void setOldServiceName(String oldServiceName){
        this.oldServiceName = oldServiceName;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.redefining.sellermodifiedshipmentsupportsubtradeorder";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (subTradeOrderList != null) {
                        super.addApiParameter("sub_trade_order_list", new JSONWriter(true, false).write(subTradeOrderList));
                    }
                            if (oldLogisticsNo != null) {
                        super.addApiParameter("old_logistics_no", oldLogisticsNo.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (oldServiceName != null) {
                        super.addApiParameter("old_service_name", oldServiceName.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsRedefiningSellermodifiedshipmentsupportsubtradeorderResponse> getResponseClass() {
        return AliexpressLogisticsRedefiningSellermodifiedshipmentsupportsubtradeorderResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}