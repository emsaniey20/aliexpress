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
*  /qimen/aliexpress/warehouse/sales/get
*/
public class QimenAliexpressWarehouseSalesGetRequest extends BaseGopRequest<QimenAliexpressWarehouseSalesGetResponse> {

    /** 店铺id */
    private String shopId;
    /** 客户id(千象专用) */
    private String warehouseCustomerId;
    /** 仓库编码 */
    private String warehouseCode;
    /** 货主id */
    private String goodsOwnerId;
    /** 查询起始日期 yyyy.MM.dd HH:mm:ss */
    private String startTime;
    /** 查询结束日期 yyyy.MM.dd HH:mm:ss */
    private String endTime;
    /** 系统类型：wms、oms，易仓专用，其他wms可以不传此字段 */
    private String systemType;

    public String getShopId(){
        return this.shopId;
    }
    public void setShopId(String shopId){
        this.shopId = shopId;
        }
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
    public String getGoodsOwnerId(){
        return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId){
        this.goodsOwnerId = goodsOwnerId;
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
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/sales/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (shopId != null) {
                        super.addApiParameter("shopId", shopId.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
                    }
                            if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                            if (startTime != null) {
                        super.addApiParameter("startTime", startTime.toString());
                    }
                            if (endTime != null) {
                        super.addApiParameter("endTime", endTime.toString());
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
    public Class<QimenAliexpressWarehouseSalesGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseSalesGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}