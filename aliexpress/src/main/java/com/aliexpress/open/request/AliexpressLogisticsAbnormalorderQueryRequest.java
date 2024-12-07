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
*  aliexpress.logistics.abnormalorder.query
*/
public class AliexpressLogisticsAbnormalorderQueryRequest extends BaseGopRequest<AliexpressLogisticsAbnormalorderQueryResponse> {

    /** 订单创建时间开始 */
    private String gmtCreateStart;
    /** 交易订单号 */
    private Long tradeOrderId;
    /** 页大小 */
    private Integer pageSize;
    /** 状态编码列表 */
    private List<String> warehouseStatusList;
    /** 状态变更时间开始 */
    private String gmtStatusUpdateStart;
    /** 运单号 */
    private String intlTrackingNo;
    /** 订单创建时间结束 */
    private String gmtCreateEnd;
    /** 当前页 */
    private Integer currentPage;
    /** 状态变更时间结束 */
    private String gmtStatusUpdateEnd;
    /** 是否需要额外的mailNo相关信息 */
    private Boolean needMailNoInfo;

    public String getGmtCreateStart(){
        return this.gmtCreateStart;
    }
    public void setGmtCreateStart(String gmtCreateStart){
        this.gmtCreateStart = gmtCreateStart;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public List<String> getWarehouseStatusList(){
        return this.warehouseStatusList;
    }
    public void setWarehouseStatusList(List<String> warehouseStatusList){
        this.warehouseStatusList = warehouseStatusList;
        }
    public String getGmtStatusUpdateStart(){
        return this.gmtStatusUpdateStart;
    }
    public void setGmtStatusUpdateStart(String gmtStatusUpdateStart){
        this.gmtStatusUpdateStart = gmtStatusUpdateStart;
        }
    public String getIntlTrackingNo(){
        return this.intlTrackingNo;
    }
    public void setIntlTrackingNo(String intlTrackingNo){
        this.intlTrackingNo = intlTrackingNo;
        }
    public String getGmtCreateEnd(){
        return this.gmtCreateEnd;
    }
    public void setGmtCreateEnd(String gmtCreateEnd){
        this.gmtCreateEnd = gmtCreateEnd;
        }
    public Integer getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage){
        this.currentPage = currentPage;
        }
    public String getGmtStatusUpdateEnd(){
        return this.gmtStatusUpdateEnd;
    }
    public void setGmtStatusUpdateEnd(String gmtStatusUpdateEnd){
        this.gmtStatusUpdateEnd = gmtStatusUpdateEnd;
        }
    public Boolean getNeedMailNoInfo(){
        return this.needMailNoInfo;
    }
    public void setNeedMailNoInfo(Boolean needMailNoInfo){
        this.needMailNoInfo = needMailNoInfo;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.abnormalorder.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (gmtCreateStart != null) {
                        super.addApiParameter("gmt_create_start", gmtCreateStart.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (warehouseStatusList != null) {
                        super.addApiParameter("warehouse_status_list", new JSONWriter(true, false).write(warehouseStatusList));
                    }
                            if (gmtStatusUpdateStart != null) {
                        super.addApiParameter("gmt_status_update_start", gmtStatusUpdateStart.toString());
                    }
                            if (intlTrackingNo != null) {
                        super.addApiParameter("intl_tracking_no", intlTrackingNo.toString());
                    }
                            if (gmtCreateEnd != null) {
                        super.addApiParameter("gmt_create_end", gmtCreateEnd.toString());
                    }
                            if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                            if (gmtStatusUpdateEnd != null) {
                        super.addApiParameter("gmt_status_update_end", gmtStatusUpdateEnd.toString());
                    }
                            if (needMailNoInfo != null) {
                        super.addApiParameter("need_mailNo_info", needMailNoInfo.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsAbnormalorderQueryResponse> getResponseClass() {
        return AliexpressLogisticsAbnormalorderQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}