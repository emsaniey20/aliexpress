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
*  /qimen/aliexpress/warehouse/sku/bindlist/post
*/
public class QimenAliexpressWarehouseSkuBindlistPostRequest extends BaseGopRequest<QimenAliexpressWarehouseSkuBindlistPostResponse> {

    /** systemType */
    private String systemType;
    /** warehouseCustomerId */
    private String warehouseCustomerId;
    /** goodsOwnerId */
    private String goodsOwnerId;
    /** skuBindList */
    private String skuBindList;

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
    public String getSkuBindList(){
        return this.skuBindList;
    }
    public void setSkuBindList(String skuBindList){
        this.skuBindList = skuBindList;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/sku/bindlist/post";
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
                            if (skuBindList != null) {
                        super.addApiParameter("skuBindList", skuBindList.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseSkuBindlistPostResponse> getResponseClass() {
        return QimenAliexpressWarehouseSkuBindlistPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}