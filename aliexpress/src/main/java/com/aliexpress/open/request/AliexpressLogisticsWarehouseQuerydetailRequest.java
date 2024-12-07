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
*  aliexpress.logistics.warehouse.querydetail
*/
public class AliexpressLogisticsWarehouseQuerydetailRequest extends BaseGopRequest<AliexpressLogisticsWarehouseQuerydetailResponse> {

    /** 仓发订单类型 DOMESTIC 优选仓 EUOVERSEA 海外仓 */
    private String consignType;
    /** 当前页 */
    private Integer currentPage;
    /** 国内运单号 */
    private String domesticLogisticsNum;
    /** 截止创建时间 */
    private String gmtCreateEndStr;
    /** 起始创建时间 */
    private String gmtCreateStartStr;
    /** 国际运单号 */
    private String internationalLogisticsNum;
    /** 订单状态 */
    private String logisticsStatus;
    /** 页面大小 */
    private Integer pageSize;
    /** 交易单号 */
    private Long tradeOrderId;
    /** 物流服务编码 */
    private String warehouseCarrierService;

    public String getConsignType(){
        return this.consignType;
    }
    public void setConsignType(String consignType){
        this.consignType = consignType;
        }
    public Integer getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage){
        this.currentPage = currentPage;
        }
    public String getDomesticLogisticsNum(){
        return this.domesticLogisticsNum;
    }
    public void setDomesticLogisticsNum(String domesticLogisticsNum){
        this.domesticLogisticsNum = domesticLogisticsNum;
        }
    public String getGmtCreateEndStr(){
        return this.gmtCreateEndStr;
    }
    public void setGmtCreateEndStr(String gmtCreateEndStr){
        this.gmtCreateEndStr = gmtCreateEndStr;
        }
    public String getGmtCreateStartStr(){
        return this.gmtCreateStartStr;
    }
    public void setGmtCreateStartStr(String gmtCreateStartStr){
        this.gmtCreateStartStr = gmtCreateStartStr;
        }
    public String getInternationalLogisticsNum(){
        return this.internationalLogisticsNum;
    }
    public void setInternationalLogisticsNum(String internationalLogisticsNum){
        this.internationalLogisticsNum = internationalLogisticsNum;
        }
    public String getLogisticsStatus(){
        return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus){
        this.logisticsStatus = logisticsStatus;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public String getWarehouseCarrierService(){
        return this.warehouseCarrierService;
    }
    public void setWarehouseCarrierService(String warehouseCarrierService){
        this.warehouseCarrierService = warehouseCarrierService;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.warehouse.querydetail";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (consignType != null) {
                        super.addApiParameter("consign_type", consignType.toString());
                    }
                            if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                            if (domesticLogisticsNum != null) {
                        super.addApiParameter("domestic_logistics_num", domesticLogisticsNum.toString());
                    }
                            if (gmtCreateEndStr != null) {
                        super.addApiParameter("gmt_create_end_str", gmtCreateEndStr.toString());
                    }
                            if (gmtCreateStartStr != null) {
                        super.addApiParameter("gmt_create_start_str", gmtCreateStartStr.toString());
                    }
                            if (internationalLogisticsNum != null) {
                        super.addApiParameter("international_logistics_num", internationalLogisticsNum.toString());
                    }
                            if (logisticsStatus != null) {
                        super.addApiParameter("logistics_status", logisticsStatus.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (warehouseCarrierService != null) {
                        super.addApiParameter("warehouse_carrier_service", warehouseCarrierService.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsWarehouseQuerydetailResponse> getResponseClass() {
        return AliexpressLogisticsWarehouseQuerydetailResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}