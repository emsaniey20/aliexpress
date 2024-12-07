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
*  /qimen/aliexpress/warehouse/skulist/info/get
*/
public class QimenAliexpressWarehouseSkulistInfoGetRequest extends BaseGopRequest<QimenAliexpressWarehouseSkulistInfoGetResponse> {

    /** warehouseCustomerId */
    private String warehouseCustomerId;
    /** goodsOwnerId */
    private String goodsOwnerId;
    /** systemType */
    private String systemType;
    /** skuIdList */
    private String skuIdList;
    /** warehouseCode */
    private String warehouseCode;
    /** 页面大小 */
    private Long pageSize;
    /** 页面，以1开始 */
    private Long pageNo;

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
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }
    public String getSkuIdList(){
        return this.skuIdList;
    }
    public void setSkuIdList(String skuIdList){
        this.skuIdList = skuIdList;
        }
    public String getWarehouseCode(){
        return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
        }
    public Long getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Long pageSize){
        this.pageSize = pageSize;
        }
    public Long getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Long pageNo){
        this.pageNo = pageNo;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/skulist/info/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                            if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                            if (skuIdList != null) {
                        super.addApiParameter("skuIdList", skuIdList.toString());
                    }
                            if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
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
    public Class<QimenAliexpressWarehouseSkulistInfoGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseSkulistInfoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}