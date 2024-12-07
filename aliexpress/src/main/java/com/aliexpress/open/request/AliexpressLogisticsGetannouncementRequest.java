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
*  aliexpress.logistics.getannouncement
*/
public class AliexpressLogisticsGetannouncementRequest extends BaseGopRequest<AliexpressLogisticsGetannouncementResponse> {

    /** 商家id */
    private String sellerId;
    /** 结束时间 */
    private Long startTime;
    /** 开始时间 */
    private Long endTime;

    public String getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(String sellerId){
        this.sellerId = sellerId;
        }
    public Long getStartTime(){
        return this.startTime;
    }
    public void setStartTime(Long startTime){
        this.startTime = startTime;
        }
    public Long getEndTime(){
        return this.endTime;
    }
    public void setEndTime(Long endTime){
        this.endTime = endTime;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.getannouncement";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerId != null) {
                        super.addApiParameter("seller_id", sellerId.toString());
                    }
                            if (startTime != null) {
                        super.addApiParameter("start_time", startTime.toString());
                    }
                            if (endTime != null) {
                        super.addApiParameter("end_time", endTime.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsGetannouncementResponse> getResponseClass() {
        return AliexpressLogisticsGetannouncementResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}