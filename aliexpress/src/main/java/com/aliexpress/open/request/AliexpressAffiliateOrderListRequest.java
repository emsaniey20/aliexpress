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
*  aliexpress.affiliate.order.list
*/
public class AliexpressAffiliateOrderListRequest extends BaseGopRequest<AliexpressAffiliateOrderListResponse> {

    /** The type of time you are querying: Payment Completed Time(The time of payment for the order), Buyer Confirmed Receipt Time(The time when the buyer confirms receipt) Completed Settlement Time(The time when commission is paid into Account Balance) */
    private String timeType;
    /** API signature */
    private String appSignature;
    /** End time, PST time */
    private String endTime;
    /** Respond parameter list. eg: commission_rate,sale_price */
    private String fields;
    /** locate */
    private String localeSite;
    /** record count of each page, 1 - 50 */
    private Long pageNo;
    /** Page number */
    private Long pageSize;
    /** Start time, PST time */
    private String startTime;
    /** Order status:  Payment Completed(Buyer paid successfully),  Buyer Confirmed Receipt(This status only change when:Buyer confirms receipt and settlement task begins which is manually executed by our operation team),  Completed Settlement(Orders have been verified and commission has been paid),  Invalid(Orders will not be settled including buyer refunds, order risks, antispam/penalty appeal failed, antispam/penalty appeal overdue, order not settled being over 180 days apart from the Completed Payment Time (such as in abnormal state like dispute), etc.) */
    private String status;

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
    public String getLocaleSite(){
        return this.localeSite;
    }
    public void setLocaleSite(String localeSite){
        this.localeSite = localeSite;
        }
    public Long getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Long pageNo){
        this.pageNo = pageNo;
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

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.order.list";
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
                            if (localeSite != null) {
                        super.addApiParameter("locale_site", localeSite.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
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
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateOrderListResponse> getResponseClass() {
        return AliexpressAffiliateOrderListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}