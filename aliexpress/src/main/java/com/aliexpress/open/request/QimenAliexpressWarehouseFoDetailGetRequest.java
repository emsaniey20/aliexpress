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
*  /qimen/aliexpress/warehouse/fo/detail/get
*/
public class QimenAliexpressWarehouseFoDetailGetRequest extends BaseGopRequest<QimenAliexpressWarehouseFoDetailGetResponse> {

    /** 外部单号 */
    private String outBizId;
    /** 系统类型：wms、oms，易仓专用 */
    private String systemType;
    /** 服务商 */
    private String warehouseCustomerId;
    /** WMS仓库订单号 */
    private String wmsOrderId;
    /** 商家在wms系统内唯一id */
    private String goodsOwnerId;

    public String getOutBizId(){
        return this.outBizId;
    }
    public void setOutBizId(String outBizId){
        this.outBizId = outBizId;
        }
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }
    public String getWarehouseCustomerId(){
        return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId){
        this.warehouseCustomerId = warehouseCustomerId;
        }
    public String getWmsOrderId(){
        return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId){
        this.wmsOrderId = wmsOrderId;
        }
    public String getGoodsOwnerId(){
        return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId){
        this.goodsOwnerId = goodsOwnerId;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/fo/detail/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (outBizId != null) {
                        super.addApiParameter("outBizId", outBizId.toString());
                    }
                            if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (wmsOrderId != null) {
                        super.addApiParameter("wmsOrderId", wmsOrderId.toString());
                    }
                            if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseFoDetailGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseFoDetailGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}