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
*  /aliexpress/warehouse/owner/create/post
*/
public class AliexpressWarehouseOwnerCreatePostRequest extends BaseGopRequest<AliexpressWarehouseOwnerCreatePostResponse> {

    /** wms、oms，易仓专用，其他wms可以不传此字段，用来标识调用易仓的是新的wms系统还是老的oms系统 */
    private String systemType;
    /** 易仓多租户路由ID，自研系统为固定值 */
    private String warehouseCustomerId;
    /** 货主id */
    private String goodsOwnerId;
    /** 店铺昵称 */
    private String shopName;
    /** sign|cancel */
    private String method;
    /** 业务请求时间戳 */
    private String requestTime;
    /** 业务请求ID，用于做幂等 */
    private String requestId;

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
    public String getShopName(){
        return this.shopName;
    }
    public void setShopName(String shopName){
        this.shopName = shopName;
        }
    public String getMethod(){
        return this.method;
    }
    public void setMethod(String method){
        this.method = method;
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

    @Override
    public String getApiName() {
        return "/aliexpress/warehouse/owner/create/post";
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
                            if (shopName != null) {
                        super.addApiParameter("shopName", shopName.toString());
                    }
                            if (method != null) {
                        super.addApiParameter("method", method.toString());
                    }
                            if (requestTime != null) {
                        super.addApiParameter("requestTime", requestTime.toString());
                    }
                            if (requestId != null) {
                        super.addApiParameter("requestId", requestId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressWarehouseOwnerCreatePostResponse> getResponseClass() {
        return AliexpressWarehouseOwnerCreatePostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}