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
*  /gsp/order/shipmentcancel
*/
public class GspOrderShipmentcancelRequest extends BaseGopRequest<GspOrderShipmentcancelResponse> {

    /** 子单ID */
    private List<String> orderLineIds;
    /** 取消原因 */
    private String reason;
    /** 采购单ID */
    private String purchaseOrderId;

    public List<String> getOrderLineIds(){
        return this.orderLineIds;
    }
    public void setOrderLineIds(List<String> orderLineIds){
        this.orderLineIds = orderLineIds;
        }
    public String getReason(){
        return this.reason;
    }
    public void setReason(String reason){
        this.reason = reason;
        }
    public String getPurchaseOrderId(){
        return this.purchaseOrderId;
    }
    public void setPurchaseOrderId(String purchaseOrderId){
        this.purchaseOrderId = purchaseOrderId;
        }

    @Override
    public String getApiName() {
        return "/gsp/order/shipmentcancel";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderLineIds != null) {
                        super.addApiParameter("order_line_ids", new JSONWriter(true, false).write(orderLineIds));
                    }
                            if (reason != null) {
                        super.addApiParameter("reason", reason.toString());
                    }
                            if (purchaseOrderId != null) {
                        super.addApiParameter("purchase_order_id", purchaseOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<GspOrderShipmentcancelResponse> getResponseClass() {
        return GspOrderShipmentcancelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}