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
*  /qimen/aliexpress/warehouse/fo/intercept/post
*/
public class QimenAliexpressWarehouseFoInterceptPostRequest extends BaseGopRequest<QimenAliexpressWarehouseFoInterceptPostResponse> {

    /** 货主代码（客户代码） */
    private String goodsOwnerId;
    /** 系统类型 */
    private String systemType;
    /** 仓客户代码 */
    private String warehouseCustomerId;
    /** 取消原因 */
    private String cancelReason;
    /** WMS仓库订单号 */
    private String wmsOrderId;

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
    public String getWarehouseCustomerId(){
        return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId){
        this.warehouseCustomerId = warehouseCustomerId;
        }
    public String getCancelReason(){
        return this.cancelReason;
    }
    public void setCancelReason(String cancelReason){
        this.cancelReason = cancelReason;
        }
    public String getWmsOrderId(){
        return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId){
        this.wmsOrderId = wmsOrderId;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/fo/intercept/post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                            if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (cancelReason != null) {
                        super.addApiParameter("cancelReason", cancelReason.toString());
                    }
                            if (wmsOrderId != null) {
                        super.addApiParameter("wmsOrderId", wmsOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseFoInterceptPostResponse> getResponseClass() {
        return QimenAliexpressWarehouseFoInterceptPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}