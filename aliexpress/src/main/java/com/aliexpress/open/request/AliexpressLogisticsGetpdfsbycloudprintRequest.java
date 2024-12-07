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
*  aliexpress.logistics.getpdfsbycloudprint
*/
public class AliexpressLogisticsGetpdfsbycloudprintRequest extends BaseGopRequest<AliexpressLogisticsGetpdfsbycloudprintResponse> {

    /** 是否打印详情 */
    private Boolean printDetail;
    /** 批量查询线上发货信息进去打印,列表类型，以json格式来表达 */
    private List<AliexpressLogisticsGetpdfsbycloudprintAeopWarehouseOrderQueryPdfRequest> warehouseOrderQueryDTOs;

    public Boolean getPrintDetail(){
        return this.printDetail;
    }
    public void setPrintDetail(Boolean printDetail){
        this.printDetail = printDetail;
        }
    public List<AliexpressLogisticsGetpdfsbycloudprintAeopWarehouseOrderQueryPdfRequest> getWarehouseOrderQueryDTOs(){
        return this.warehouseOrderQueryDTOs;
    }
    public void setWarehouseOrderQueryDTOs(List<AliexpressLogisticsGetpdfsbycloudprintAeopWarehouseOrderQueryPdfRequest> warehouseOrderQueryDTOs){
        this.warehouseOrderQueryDTOs = warehouseOrderQueryDTOs;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.getpdfsbycloudprint";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (printDetail != null) {
                        super.addApiParameter("print_detail", printDetail.toString());
                    }
                            if (warehouseOrderQueryDTOs != null) {
                        super.addApiParameter("warehouse_order_query_d_t_os", new JSONWriter(true, false).write(warehouseOrderQueryDTOs));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsGetpdfsbycloudprintResponse> getResponseClass() {
        return AliexpressLogisticsGetpdfsbycloudprintResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}