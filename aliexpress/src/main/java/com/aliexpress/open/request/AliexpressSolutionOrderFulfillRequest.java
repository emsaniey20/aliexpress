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
*  aliexpress.solution.order.fulfill
*/
public class AliexpressSolutionOrderFulfillRequest extends BaseGopRequest<AliexpressSolutionOrderFulfillResponse> {

    /** Actual logistics service selected by the user (logistics service key: This interface obtains the currently supportable logistics according to all the supportable logistics services listed by api.listLogisticsService. Please visit the forum link http://bbs.seller.aliexpress.com/bbs/read.php?tid=266120&page=1&toread=1#tpc for the detailed list of logistics services supported by the platform.) */
    private String serviceName;
    /** When serviceName=other, fill in the corresponding tracking website. */
    private String trackingWebsite;
    /** order ID for delivery by the user */
    private String outRef;
    /** Status including: all shipments (all), part of the delivery (part) */
    private String sendType;
    /** Remarks (only in English, and the length is limited to 512 characters) */
    private String description;
    /** logistics number */
    private String logisticsNo;

    public String getServiceName(){
        return this.serviceName;
    }
    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
        }
    public String getTrackingWebsite(){
        return this.trackingWebsite;
    }
    public void setTrackingWebsite(String trackingWebsite){
        this.trackingWebsite = trackingWebsite;
        }
    public String getOutRef(){
        return this.outRef;
    }
    public void setOutRef(String outRef){
        this.outRef = outRef;
        }
    public String getSendType(){
        return this.sendType;
    }
    public void setSendType(String sendType){
        this.sendType = sendType;
        }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
        }
    public String getLogisticsNo(){
        return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo){
        this.logisticsNo = logisticsNo;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.order.fulfill";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (serviceName != null) {
                        super.addApiParameter("service_name", serviceName.toString());
                    }
                            if (trackingWebsite != null) {
                        super.addApiParameter("tracking_website", trackingWebsite.toString());
                    }
                            if (outRef != null) {
                        super.addApiParameter("out_ref", outRef.toString());
                    }
                            if (sendType != null) {
                        super.addApiParameter("send_type", sendType.toString());
                    }
                            if (description != null) {
                        super.addApiParameter("description", description.toString());
                    }
                            if (logisticsNo != null) {
                        super.addApiParameter("logistics_no", logisticsNo.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionOrderFulfillResponse> getResponseClass() {
        return AliexpressSolutionOrderFulfillResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}