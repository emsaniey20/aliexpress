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
*  /gsp/order/shipment
*/
public class GspOrderShipmentRequest extends BaseGopRequest<GspOrderShipmentResponse> {

    /** 子采购单 */
    private List<String> orderLineIds;
    /** 采购订单ID */
    private String trackingNum;
    /** 物流公司,不超过60字符 */
    private String logisticCompany;
    /** 运单号，[A-Z0-9]{1,36} */
    private String purchaseOrderId;

    public List<String> getOrderLineIds(){
        return this.orderLineIds;
    }
    public void setOrderLineIds(List<String> orderLineIds){
        this.orderLineIds = orderLineIds;
        }
    public String getTrackingNum(){
        return this.trackingNum;
    }
    public void setTrackingNum(String trackingNum){
        this.trackingNum = trackingNum;
        }
    public String getLogisticCompany(){
        return this.logisticCompany;
    }
    public void setLogisticCompany(String logisticCompany){
        this.logisticCompany = logisticCompany;
        }
    public String getPurchaseOrderId(){
        return this.purchaseOrderId;
    }
    public void setPurchaseOrderId(String purchaseOrderId){
        this.purchaseOrderId = purchaseOrderId;
        }

    @Override
    public String getApiName() {
        return "/gsp/order/shipment";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderLineIds != null) {
                        super.addApiParameter("order_line_ids", new JSONWriter(true, false).write(orderLineIds));
                    }
                            if (trackingNum != null) {
                        super.addApiParameter("tracking_num", trackingNum.toString());
                    }
                            if (logisticCompany != null) {
                        super.addApiParameter("logistic_company", logisticCompany.toString());
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
    public Class<GspOrderShipmentResponse> getResponseClass() {
        return GspOrderShipmentResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}