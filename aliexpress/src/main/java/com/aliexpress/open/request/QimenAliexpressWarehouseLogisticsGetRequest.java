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
*  /qimen/aliexpress/warehouse/logistics/get
*/
public class QimenAliexpressWarehouseLogisticsGetRequest extends BaseGopRequest<QimenAliexpressWarehouseLogisticsGetResponse> {

    /** 仓客户id(针对易仓) */
    private String warehouseCustomerId;
    /** 仓code */
    private String warehouseCode;
    /** 系统类型：wms、oms，易仓专用，其他wms可以不传此字段 */
    private String systemType;

    public String getWarehouseCustomerId(){
        return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId){
        this.warehouseCustomerId = warehouseCustomerId;
        }
    public String getWarehouseCode(){
        return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
        }
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/logistics/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
                    }
                            if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseLogisticsGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseLogisticsGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}