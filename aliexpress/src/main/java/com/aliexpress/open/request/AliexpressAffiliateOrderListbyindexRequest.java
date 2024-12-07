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
*  aliexpress.affiliate.order.listbyindex
*/
public class AliexpressAffiliateOrderListbyindexRequest extends BaseGopRequest<AliexpressAffiliateOrderListbyindexResponse> {

    /** The type of time you are querying: Payment Completed Time(The time of payment for the order), Buyer Confirmed Receipt Time(The time when the buyer confirms receipt) Completed Settlement Time(The time when commission is paid into Account Balance) */
    private String timeType;
    /** API signature */
    private String appSignature;
    /** End time, PST time */
    private String endTime;
    /** Respond parameter list. eg: commission_rate,sale_price */
    private String fields;
    /** record count of each page, 1 - 50 */
    private Long pageSize;
    /** Start time, PST time */
    private String startTime;
    /** Order status:  Payment Completed(Buyer paid successfully),  Buyer Confirmed Receipt(This status only change when:Buyer confirms receipt and settlement task begins which is manually executed by our operation team),  Completed Settlement(Orders have been verified and commission has been paid),  Invalid(Orders will not be settled including buyer refunds, order risks, antispam/penalty appeal failed, antispam/penalty appeal overdue, order not settled being over 180 days apart from the Completed Payment Time (such as in abnormal state like dispute), etc.) */
    private String status;
    /** Query index start value: if not passed, You can only check the first page */
    private String startQueryIndexId;

    public String getTimeType(){
        return this.timeType;
    }
    public void setTimeType(String timeType){
        this.timeType = timeType;
        }
    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }
    public String getEndTime(){
        return this.endTime;
    }
    public void setEndTime(String endTime){
        this.endTime = endTime;
        }
    public String getFields(){
        return this.fields;
    }
    public void setFields(String fields){
        this.fields = fields;
        }
    public Long getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Long pageSize){
        this.pageSize = pageSize;
        }
    public String getStartTime(){
        return this.startTime;
    }
    public void setStartTime(String startTime){
        this.startTime = startTime;
        }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
        }
    public String getStartQueryIndexId(){
        return this.startQueryIndexId;
    }
    public void setStartQueryIndexId(String startQueryIndexId){
        this.startQueryIndexId = startQueryIndexId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.order.listbyindex";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (timeType != null) {
                        super.addApiParameter("time_type", timeType.toString());
                    }
                            if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (endTime != null) {
                        super.addApiParameter("end_time", endTime.toString());
                    }
                            if (fields != null) {
                        super.addApiParameter("fields", fields.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (startTime != null) {
                        super.addApiParameter("start_time", startTime.toString());
                    }
                            if (status != null) {
                        super.addApiParameter("status", status.toString());
                    }
                            if (startQueryIndexId != null) {
                        super.addApiParameter("start_query_index_id", startQueryIndexId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateOrderListbyindexResponse> getResponseClass() {
        return AliexpressAffiliateOrderListbyindexResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}