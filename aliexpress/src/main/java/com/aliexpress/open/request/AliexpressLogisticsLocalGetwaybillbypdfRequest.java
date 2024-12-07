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
*  aliexpress.logistics.local.getwaybillbypdf
*/
public class AliexpressLogisticsLocalGetwaybillbypdfRequest extends BaseGopRequest<AliexpressLogisticsLocalGetwaybillbypdfResponse> {

    /** Logistics order No */
    private Long warehouseOrderId;
    /** waybill number (tracking number) */
    private String intlTrackingNo;
    /** option to print package bill */
    private Boolean printDetail;

    public Long getWarehouseOrderId(){
        return this.warehouseOrderId;
    }
    public void setWarehouseOrderId(Long warehouseOrderId){
        this.warehouseOrderId = warehouseOrderId;
        }
    public String getIntlTrackingNo(){
        return this.intlTrackingNo;
    }
    public void setIntlTrackingNo(String intlTrackingNo){
        this.intlTrackingNo = intlTrackingNo;
        }
    public Boolean getPrintDetail(){
        return this.printDetail;
    }
    public void setPrintDetail(Boolean printDetail){
        this.printDetail = printDetail;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.local.getwaybillbypdf";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warehouseOrderId != null) {
                        super.addApiParameter("warehouse_order_id", warehouseOrderId.toString());
                    }
                            if (intlTrackingNo != null) {
                        super.addApiParameter("intl_tracking_no", intlTrackingNo.toString());
                    }
                            if (printDetail != null) {
                        super.addApiParameter("print_detail", printDetail.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsLocalGetwaybillbypdfResponse> getResponseClass() {
        return AliexpressLogisticsLocalGetwaybillbypdfResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}