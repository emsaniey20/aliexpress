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
*  /aliexpress/warehouse/reverse/fo/create/post
*/
public class AliexpressWarehouseReverseFoCreatePostRequest extends BaseGopRequest<AliexpressWarehouseReverseFoCreatePostResponse> {

    /** ：wms、oms，易仓专用 */
    private String systemType;
    /** 仓租户ID */
    private String warehouseCustomerId;
    /** 商家在wms系统内唯一id */
    private String goodsOwnerId;
    /** AE平台交易单号 */
    private String aeTradeOrderId;
    /** 商家在AE店铺名称 */
    private String shopName;
    /** 标识唯一的一个wms系统内的物流订单 */
    private String outBizId;
    /** 履约仓库 */
    private String warehouseCode;
    /** 寄件人参数 */
    private String senderParam;
    /** 收件人参数 */
    private String receiverParam;
    /** item详情 */
    private String itemList;
    /** 物流详情 */
    private String logisticParam;
    /** 扩展字段 */
    private String extendParam;

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
    public String getAeTradeOrderId(){
        return this.aeTradeOrderId;
    }
    public void setAeTradeOrderId(String aeTradeOrderId){
        this.aeTradeOrderId = aeTradeOrderId;
        }
    public String getShopName(){
        return this.shopName;
    }
    public void setShopName(String shopName){
        this.shopName = shopName;
        }
    public String getOutBizId(){
        return this.outBizId;
    }
    public void setOutBizId(String outBizId){
        this.outBizId = outBizId;
        }
    public String getWarehouseCode(){
        return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
        }
    public String getSenderParam(){
        return this.senderParam;
    }
    public void setSenderParam(String senderParam){
        this.senderParam = senderParam;
        }
    public String getReceiverParam(){
        return this.receiverParam;
    }
    public void setReceiverParam(String receiverParam){
        this.receiverParam = receiverParam;
        }
    public String getItemList(){
        return this.itemList;
    }
    public void setItemList(String itemList){
        this.itemList = itemList;
        }
    public String getLogisticParam(){
        return this.logisticParam;
    }
    public void setLogisticParam(String logisticParam){
        this.logisticParam = logisticParam;
        }
    public String getExtendParam(){
        return this.extendParam;
    }
    public void setExtendParam(String extendParam){
        this.extendParam = extendParam;
        }

    @Override
    public String getApiName() {
        return "/aliexpress/warehouse/reverse/fo/create/post";
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
                            if (aeTradeOrderId != null) {
                        super.addApiParameter("aeTradeOrderId", aeTradeOrderId.toString());
                    }
                            if (shopName != null) {
                        super.addApiParameter("shopName", shopName.toString());
                    }
                            if (outBizId != null) {
                        super.addApiParameter("outBizId", outBizId.toString());
                    }
                            if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
                    }
                            if (senderParam != null) {
                        super.addApiParameter("senderParam", senderParam.toString());
                    }
                            if (receiverParam != null) {
                        super.addApiParameter("receiverParam", receiverParam.toString());
                    }
                            if (itemList != null) {
                        super.addApiParameter("itemList", itemList.toString());
                    }
                            if (logisticParam != null) {
                        super.addApiParameter("logisticParam", logisticParam.toString());
                    }
                            if (extendParam != null) {
                        super.addApiParameter("extendParam", extendParam.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressWarehouseReverseFoCreatePostResponse> getResponseClass() {
        return AliexpressWarehouseReverseFoCreatePostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}