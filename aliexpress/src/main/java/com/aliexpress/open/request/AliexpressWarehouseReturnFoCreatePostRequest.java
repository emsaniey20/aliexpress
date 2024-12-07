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
*  /aliexpress/warehouse/return/fo/create/post
*/
public class AliexpressWarehouseReturnFoCreatePostRequest extends BaseGopRequest<AliexpressWarehouseReturnFoCreatePostResponse> {

    /** wms、oms，易仓专用 */
    private String systemType;
    /** 易仓多租户路由ID，自研系统为固定值 */
    private String warehouseCustomerId;
    /** AE生成的退仓单ID */
    private String outBizId;
    /** 货主id */
    private String goodsOwnerId;
    /** 仓Code */
    private String warehouseCode;
    /** 实际执行时间 */
    private String realExecuteTime;
    /** 提货服务商 */
    private String pickingProvider;
    /** 提货面单号 */
    private String pickingOrderNumber;
    /** 提货面单图片 */
    private String pickingOrderUrl;
    /** 提货码 */
    private String pickingCode;
    /** 联系人电话 */
    private String contactPhone;
    /** 联系人姓名 */
    private String contactName;
    /** 操作类型 destory|self-pickup|provider-pickup|shipping */
    private String method;
    /** 货品处置列表 */
    private String items;
    /** 请求时间戳 */
    private String requestTime;
    /** 请求ID，唯一 */
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
    public String getOutBizId(){
        return this.outBizId;
    }
    public void setOutBizId(String outBizId){
        this.outBizId = outBizId;
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
    public String getRealExecuteTime(){
        return this.realExecuteTime;
    }
    public void setRealExecuteTime(String realExecuteTime){
        this.realExecuteTime = realExecuteTime;
        }
    public String getPickingProvider(){
        return this.pickingProvider;
    }
    public void setPickingProvider(String pickingProvider){
        this.pickingProvider = pickingProvider;
        }
    public String getPickingOrderNumber(){
        return this.pickingOrderNumber;
    }
    public void setPickingOrderNumber(String pickingOrderNumber){
        this.pickingOrderNumber = pickingOrderNumber;
        }
    public String getPickingOrderUrl(){
        return this.pickingOrderUrl;
    }
    public void setPickingOrderUrl(String pickingOrderUrl){
        this.pickingOrderUrl = pickingOrderUrl;
        }
    public String getPickingCode(){
        return this.pickingCode;
    }
    public void setPickingCode(String pickingCode){
        this.pickingCode = pickingCode;
        }
    public String getContactPhone(){
        return this.contactPhone;
    }
    public void setContactPhone(String contactPhone){
        this.contactPhone = contactPhone;
        }
    public String getContactName(){
        return this.contactName;
    }
    public void setContactName(String contactName){
        this.contactName = contactName;
        }
    public String getMethod(){
        return this.method;
    }
    public void setMethod(String method){
        this.method = method;
        }
    public String getItems(){
        return this.items;
    }
    public void setItems(String items){
        this.items = items;
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
        return "/aliexpress/warehouse/return/fo/create/post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (outBizId != null) {
                        super.addApiParameter("outBizId", outBizId.toString());
                    }
                            if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                            if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
                    }
                            if (realExecuteTime != null) {
                        super.addApiParameter("realExecuteTime", realExecuteTime.toString());
                    }
                            if (pickingProvider != null) {
                        super.addApiParameter("pickingProvider", pickingProvider.toString());
                    }
                            if (pickingOrderNumber != null) {
                        super.addApiParameter("pickingOrderNumber", pickingOrderNumber.toString());
                    }
                            if (pickingOrderUrl != null) {
                        super.addApiParameter("pickingOrderUrl", pickingOrderUrl.toString());
                    }
                            if (pickingCode != null) {
                        super.addApiParameter("pickingCode", pickingCode.toString());
                    }
                            if (contactPhone != null) {
                        super.addApiParameter("contactPhone", contactPhone.toString());
                    }
                            if (contactName != null) {
                        super.addApiParameter("contactName", contactName.toString());
                    }
                            if (method != null) {
                        super.addApiParameter("method", method.toString());
                    }
                            if (items != null) {
                        super.addApiParameter("items", items.toString());
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
    public Class<AliexpressWarehouseReturnFoCreatePostResponse> getResponseClass() {
        return AliexpressWarehouseReturnFoCreatePostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}