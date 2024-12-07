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
*  /ds/order/list
*/
public class DsOrderListRequest extends BaseGopRequest<DsOrderListResponse> {

    /** page number */
    private Long pageNo;
    /** record count of each page, 1 - 50 */
    private Long pageSize;
    /** Start time, PST time */
    private String startTime;
    /** End time, PST time */
    private String endTime;
    /** Query index start value: if not passed, You can only check the first page */
    private String startQueryIndexId;
    /** Order status: Payment Completed(Buyer paid successfully), Buyer Confirmed Receipt(This status only change when :Buyer confirms receipt and settlement task begins which is manually executed by our operation team) */
    private String status;

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
    public String getEndTime(){
        return this.endTime;
    }
    public void setEndTime(String endTime){
        this.endTime = endTime;
        }
    public String getStartQueryIndexId(){
        return this.startQueryIndexId;
    }
    public void setStartQueryIndexId(String startQueryIndexId){
        this.startQueryIndexId = startQueryIndexId;
        }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
        }

    @Override
    public String getApiName() {
        return "/ds/order/list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (startTime != null) {
                        super.addApiParameter("start_time", startTime.toString());
                    }
                            if (endTime != null) {
                        super.addApiParameter("end_time", endTime.toString());
                    }
                            if (startQueryIndexId != null) {
                        super.addApiParameter("start_query_index_id", startQueryIndexId.toString());
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
    public Class<DsOrderListResponse> getResponseClass() {
        return DsOrderListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}