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
*  aliexpress.logistics.redefining.getonlinelogisticsinfo
*/
public class AliexpressLogisticsRedefiningGetonlinelogisticsinfoRequest extends BaseGopRequest<AliexpressLogisticsRedefiningGetonlinelogisticsinfoResponse> {

    /** logistics order code(物流单LP号) */
    private String logisticsOrderCode;
    /** domestic tracking number(国内运单号) */
    private String chinaLogisticsId;
    /** international tracking number(国际运单号) */
    private String internationalLogisticsId;
    /** status of the logistics order (INIT, WAIT, PICKUP, PICKUP, WAREHOUSE, WAREHOUSE, REROUTE, WAREHOUSE, WAIT, LOGISTICS, OUT, OUT, SEND, SEND, ORDER, ORDER, CLOSED) */
    private String logisticsStatus;
    /** time in YYYY-MM-dd HH:mm:SS */
    private String gmtCreateEndStr;
    /** page size */
    private Integer pageSize;
    /** query express order */
    private Boolean queryExpressOrder;
    /** current page */
    private Integer currentPage;
    /** trade order id(交易单号) */
    private Long orderId;
    /** time in YYYY-MM-dd HH:mm:SS */
    private String gmtCreateStartStr;
    /** logistics order id(物流单ID) */
    private Long logisticsOrderId;

    public String getLogisticsOrderCode(){
        return this.logisticsOrderCode;
    }
    public void setLogisticsOrderCode(String logisticsOrderCode){
        this.logisticsOrderCode = logisticsOrderCode;
        }
    public String getChinaLogisticsId(){
        return this.chinaLogisticsId;
    }
    public void setChinaLogisticsId(String chinaLogisticsId){
        this.chinaLogisticsId = chinaLogisticsId;
        }
    public String getInternationalLogisticsId(){
        return this.internationalLogisticsId;
    }
    public void setInternationalLogisticsId(String internationalLogisticsId){
        this.internationalLogisticsId = internationalLogisticsId;
        }
    public String getLogisticsStatus(){
        return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus){
        this.logisticsStatus = logisticsStatus;
        }
    public String getGmtCreateEndStr(){
        return this.gmtCreateEndStr;
    }
    public void setGmtCreateEndStr(String gmtCreateEndStr){
        this.gmtCreateEndStr = gmtCreateEndStr;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public Boolean getQueryExpressOrder(){
        return this.queryExpressOrder;
    }
    public void setQueryExpressOrder(Boolean queryExpressOrder){
        this.queryExpressOrder = queryExpressOrder;
        }
    public Integer getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage){
        this.currentPage = currentPage;
        }
    public Long getOrderId(){
        return this.orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId = orderId;
        }
    public String getGmtCreateStartStr(){
        return this.gmtCreateStartStr;
    }
    public void setGmtCreateStartStr(String gmtCreateStartStr){
        this.gmtCreateStartStr = gmtCreateStartStr;
        }
    public Long getLogisticsOrderId(){
        return this.logisticsOrderId;
    }
    public void setLogisticsOrderId(Long logisticsOrderId){
        this.logisticsOrderId = logisticsOrderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.redefining.getonlinelogisticsinfo";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (logisticsOrderCode != null) {
                        super.addApiParameter("logistics_order_code", logisticsOrderCode.toString());
                    }
                            if (chinaLogisticsId != null) {
                        super.addApiParameter("china_logistics_id", chinaLogisticsId.toString());
                    }
                            if (internationalLogisticsId != null) {
                        super.addApiParameter("international_logistics_id", internationalLogisticsId.toString());
                    }
                            if (logisticsStatus != null) {
                        super.addApiParameter("logistics_status", logisticsStatus.toString());
                    }
                            if (gmtCreateEndStr != null) {
                        super.addApiParameter("gmt_create_end_str", gmtCreateEndStr.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (queryExpressOrder != null) {
                        super.addApiParameter("query_express_order", queryExpressOrder.toString());
                    }
                            if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                            if (orderId != null) {
                        super.addApiParameter("order_id", orderId.toString());
                    }
                            if (gmtCreateStartStr != null) {
                        super.addApiParameter("gmt_create_start_str", gmtCreateStartStr.toString());
                    }
                            if (logisticsOrderId != null) {
                        super.addApiParameter("logistics_order_id", logisticsOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsRedefiningGetonlinelogisticsinfoResponse> getResponseClass() {
        return AliexpressLogisticsRedefiningGetonlinelogisticsinfoResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}