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
*  /aliexpress/warehouse/item/create/post
*/
public class AliexpressWarehouseItemCreatePostRequest extends BaseGopRequest<AliexpressWarehouseItemCreatePostResponse> {

    /** wms、oms，易仓专用 */
    private String systemType;
    /** 易仓多租户路由ID，自研系统为固定值 */
    private String warehouseCustomerId;
    /** 货主ID */
    private String goodsOwnerId;
    /** 货品所在仓code */
    private String warehouseCode;
    /** 业务请求时间戳 */
    private String requestTime;
    /** 业务请求ID，用于做幂等 */
    private String requestId;
    /** 货品列表 */
    private String scItems;

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
    public String getWarehouseCode(){
        return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
        }
    public String getRequestTime(){
        return this.requestTime;
    }
    public void setRequestTime(String requestTime){
        this.requestTime = requestTime;
        }
    public String getRequestId(){
        return this.requestId;
    }
    public void setRequestId(String requestId){
        this.requestId = requestId;
        }
    public String getScItems(){
        return this.scItems;
    }
    public void setScItems(String scItems){
        this.scItems = scItems;
        }

    @Override
    public String getApiName() {
        return "/aliexpress/warehouse/item/create/post";
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
                            if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
                    }
                            if (requestTime != null) {
                        super.addApiParameter("requestTime", requestTime.toString());
                    }
                            if (requestId != null) {
                        super.addApiParameter("requestId", requestId.toString());
                    }
                            if (scItems != null) {
                        super.addApiParameter("scItems", scItems.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressWarehouseItemCreatePostResponse> getResponseClass() {
        return AliexpressWarehouseItemCreatePostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}