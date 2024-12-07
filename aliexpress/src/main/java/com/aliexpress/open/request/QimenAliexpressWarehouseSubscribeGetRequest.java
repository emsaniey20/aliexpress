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
*  /qimen/aliexpress/warehouse/subscribe/get
*/
public class QimenAliexpressWarehouseSubscribeGetRequest extends BaseGopRequest<QimenAliexpressWarehouseSubscribeGetResponse> {

    /** 店铺id */
    private String shopId;
    /** 仓客户id */
    private String warehouseCustomerId;
    /** 仓code */
    private String warehouseCode;
    /** 货主id */
    private String goodsOwnerId;
    /** 仓系统类型 */
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
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/subscribe/get";
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
    public Class<QimenAliexpressWarehouseSubscribeGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseSubscribeGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}