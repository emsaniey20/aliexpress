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
*  /qimen/aliexpress/warehouse/owner/id/check/get
*/
public class QimenAliexpressWarehouseOwnerIdCheckGetRequest extends BaseGopRequest<QimenAliexpressWarehouseOwnerIdCheckGetResponse> {

    /** 非必填，系统类型：wms、oms，易仓专用，其他wms可以不传此字段，用来标识调用易仓的是新的wms系统还是老的oms系统 */
    private String systemType;
    /** 千象用来标识哪个服务商 */
    private String warehouseCustomerId;
    /** 货主代码（客户代码） */
    private String goodsOwnerId;
    /** 当前货主代码对应的wms系统的tocken或者密码字段 */
    private String ownerToken;

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
    public String getOwnerToken(){
        return this.ownerToken;
    }
    public void setOwnerToken(String ownerToken){
        this.ownerToken = ownerToken;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/owner/id/check/get";
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
                            if (ownerToken != null) {
                        super.addApiParameter("ownerToken", ownerToken.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseOwnerIdCheckGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseOwnerIdCheckGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}