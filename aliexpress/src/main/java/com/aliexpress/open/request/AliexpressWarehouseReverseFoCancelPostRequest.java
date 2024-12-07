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
*  /aliexpress/warehouse/reverse/fo/cancel/post
*/
public class AliexpressWarehouseReverseFoCancelPostRequest extends BaseGopRequest<AliexpressWarehouseReverseFoCancelPostResponse> {

    /** wms、oms，易仓专用 */
    private String systemType;
    /** 租户ID */
    private String warehouseCustomerId;
    /** 商家ID */
    private String goodsOwnerId;
    /** WMS仓库订单号 */
    private String wmsOrderId;
    /** wmsOrderId与outBizId,必须至少一个 */
    private String outBizId;
    /** 取消原因 */
    private String cancelReason;

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
    public String getWmsOrderId(){
        return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId){
        this.wmsOrderId = wmsOrderId;
        }
    public String getOutBizId(){
        return this.outBizId;
    }
    public void setOutBizId(String outBizId){
        this.outBizId = outBizId;
        }
    public String getCancelReason(){
        return this.cancelReason;
    }
    public void setCancelReason(String cancelReason){
        this.cancelReason = cancelReason;
        }

    @Override
    public String getApiName() {
        return "/aliexpress/warehouse/reverse/fo/cancel/post";
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
                            if (wmsOrderId != null) {
                        super.addApiParameter("wmsOrderId", wmsOrderId.toString());
                    }
                            if (outBizId != null) {
                        super.addApiParameter("outBizId", outBizId.toString());
                    }
                            if (cancelReason != null) {
                        super.addApiParameter("cancelReason", cancelReason.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressWarehouseReverseFoCancelPostResponse> getResponseClass() {
        return AliexpressWarehouseReverseFoCancelPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}