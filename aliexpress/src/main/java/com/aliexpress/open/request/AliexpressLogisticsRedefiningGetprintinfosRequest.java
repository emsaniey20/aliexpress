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
*  aliexpress.logistics.redefining.getprintinfos
*/
public class AliexpressLogisticsRedefiningGetprintinfosRequest extends BaseGopRequest<AliexpressLogisticsRedefiningGetprintinfosResponse> {

    /** print detail */
    private Boolean printDetail;
    /** 12345 */
    private List<AliexpressLogisticsRedefiningGetprintinfosAeopWarehouseOrderQueryPdfRequest> warehouseOrderQueryDTOs;

    public Boolean getPrintDetail(){
        return this.printDetail;
    }
    public void setPrintDetail(Boolean printDetail){
        this.printDetail = printDetail;
        }
    public List<AliexpressLogisticsRedefiningGetprintinfosAeopWarehouseOrderQueryPdfRequest> getWarehouseOrderQueryDTOs(){
        return this.warehouseOrderQueryDTOs;
    }
    public void setWarehouseOrderQueryDTOs(List<AliexpressLogisticsRedefiningGetprintinfosAeopWarehouseOrderQueryPdfRequest> warehouseOrderQueryDTOs){
        this.warehouseOrderQueryDTOs = warehouseOrderQueryDTOs;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.redefining.getprintinfos";
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
    public Class<AliexpressLogisticsRedefiningGetprintinfosResponse> getResponseClass() {
        return AliexpressLogisticsRedefiningGetprintinfosResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}