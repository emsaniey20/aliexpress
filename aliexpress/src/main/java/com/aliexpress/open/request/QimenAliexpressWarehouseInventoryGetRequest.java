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
*  /qimen/aliexpress/warehouse/inventory/get
*/
public class QimenAliexpressWarehouseInventoryGetRequest extends BaseGopRequest<QimenAliexpressWarehouseInventoryGetResponse> {

    /** 非必填，系统类型：wms、oms，易仓专用，其他wms可以不传此字段，用来标识调用易仓的是新的wms系统还是老的oms系统 */
    private String systemType;
    /** warehouseCustomerId */
    private String warehouseCustomerId;
    /** 货主ID */
    private String goodsOwnerId;
    /** 这里的仓code列表是商家在AE平台申请了的海外仓列表 */
    private String warehouseCodeList;
    /** 当skuIdList为空时，需要查询当前goodsOwnerId在warehouseCodeList中所有的sku的库存；当skuIdList不为空时，查询skuIdList在warehouseCodeList的库存即可 */
    private String skuIdList;
    /** pageSize */
    private String pageSize;
    /** pageNo */
    private String pageNo;

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
    public String getGoodsOwnerId(){
        return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId){
        this.goodsOwnerId = goodsOwnerId;
        }
    public String getWarehouseCodeList(){
        return this.warehouseCodeList;
    }
    public void setWarehouseCodeList(String warehouseCodeList){
        this.warehouseCodeList = warehouseCodeList;
        }
    public String getSkuIdList(){
        return this.skuIdList;
    }
    public void setSkuIdList(String skuIdList){
        this.skuIdList = skuIdList;
        }
    public String getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(String pageSize){
        this.pageSize = pageSize;
        }
    public String getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(String pageNo){
        this.pageNo = pageNo;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/inventory/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                            if (warehouseCodeList != null) {
                        super.addApiParameter("warehouseCodeList", warehouseCodeList.toString());
                    }
                            if (skuIdList != null) {
                        super.addApiParameter("skuIdList", skuIdList.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("pageSize", pageSize.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("pageNo", pageNo.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseInventoryGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseInventoryGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}