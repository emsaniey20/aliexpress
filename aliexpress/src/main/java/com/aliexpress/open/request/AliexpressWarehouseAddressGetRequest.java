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
*  /aliexpress/warehouse/address/get
*/
public class AliexpressWarehouseAddressGetRequest extends BaseGopRequest<AliexpressWarehouseAddressGetResponse> {

    /** wms、oms，易仓专用 */
    private String systemType;
    /** 仓客户ID */
    private String warehouseCustomerId;
    /** 货主ID */
    private String goodsOwnerId;
    /** 仓库Code */
    private String warehouseCode;
    /**  默认en */
    private String locale;
    /** 正向还是逆向forward，reverse */
    private String addressType;

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
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public String getAddressType(){
        return this.addressType;
    }
    public void setAddressType(String addressType){
        this.addressType = addressType;
        }

    @Override
    public String getApiName() {
        return "/aliexpress/warehouse/address/get";
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
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (addressType != null) {
                        super.addApiParameter("addressType", addressType.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressWarehouseAddressGetResponse> getResponseClass() {
        return AliexpressWarehouseAddressGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}