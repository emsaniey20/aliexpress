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
*  /qimen/aliexpress/warehouse/calculateFee/get
*/
public class QimenAliexpressWarehouseCalculateFeeGetRequest extends BaseGopRequest<QimenAliexpressWarehouseCalculateFeeGetResponse> {

    /** 仓code */
    private String warehouseCode;
    /** 高（CM） */
    private Long height;
    /** 商家在WMS系统中唯一的货主代码 */
    private String goodsOwnerId;
    /** 邮编 */
    private String zipcode;
    /** 国家 */
    private String country;
    /** 物流服务名称 */
    private String shippingMethod;
    /** 系统类型：wms、oms，易仓专用 */
    private String systemType;
    /** 长（CM） */
    private Long length;
    /** 宽（CM） */
    private Long width;
    /** 服务商 */
    private String warehouseCustomerId;
    /** 重量 */
    private Long weight;

    public String getWarehouseCode(){
        return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
        }
    public Long getHeight(){
        return this.height;
    }
    public void setHeight(Long height){
        this.height = height;
        }
    public String getGoodsOwnerId(){
        return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId){
        this.goodsOwnerId = goodsOwnerId;
        }
    public String getZipcode(){
        return this.zipcode;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
        }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }
    public String getShippingMethod(){
        return this.shippingMethod;
    }
    public void setShippingMethod(String shippingMethod){
        this.shippingMethod = shippingMethod;
        }
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }
    public Long getLength(){
        return this.length;
    }
    public void setLength(Long length){
        this.length = length;
        }
    public Long getWidth(){
        return this.width;
    }
    public void setWidth(Long width){
        this.width = width;
        }
    public String getWarehouseCustomerId(){
        return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId){
        this.warehouseCustomerId = warehouseCustomerId;
        }
    public Long getWeight(){
        return this.weight;
    }
    public void setWeight(Long weight){
        this.weight = weight;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/calculateFee/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
                    }
                            if (height != null) {
                        super.addApiParameter("height", height.toString());
                    }
                            if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                            if (zipcode != null) {
                        super.addApiParameter("zipcode", zipcode.toString());
                    }
                            if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                            if (shippingMethod != null) {
                        super.addApiParameter("shippingMethod", shippingMethod.toString());
                    }
                            if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                            if (length != null) {
                        super.addApiParameter("length", length.toString());
                    }
                            if (width != null) {
                        super.addApiParameter("width", width.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (weight != null) {
                        super.addApiParameter("weight", weight.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseCalculateFeeGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseCalculateFeeGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}