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
*  /qimen/aliexpress/warehouse/fo/create/async/post
*/
public class QimenAliexpressWarehouseFoCreateAsyncPostRequest extends BaseGopRequest<QimenAliexpressWarehouseFoCreateAsyncPostResponse> {

    /** 地址三，门牌号 */
    private String addressAddition;
    /** 货主代码（客户代码） */
    private String goodsOwnerId;
    /** AE平台交易单号 */
    private String aeTradeOrderId;
    /** 外部单号 */
    private String outBizId;
    /** 国家二字码 */
    private String country;
    /** 市 */
    private String city;
    /** 地址2，地址1超长时，截取的地址放在地址2中 */
    private String address2;
    /** 地址1 */
    private String address1;
    /** 配送方式 */
    private String shippingMethod;
    /** 服务商 */
    private String warehouseCustomerId;
    /** 履约仓库 */
    private String warehouseCode;
    /** 邮编 */
    private String zipcode;
    /** 省份 */
    private String province;
    /** 联系电话 */
    private String phone;
    /** 系统类型：wms、oms，易仓专用 */
    private String systemType;
    /** 姓名 */
    private String name;
    /** 物品 */
    private String items;
    /** AE店铺 */
    private String shopName;

    public String getAddressAddition(){
        return this.addressAddition;
    }
    public void setAddressAddition(String addressAddition){
        this.addressAddition = addressAddition;
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
    public String getOutBizId(){
        return this.outBizId;
    }
    public void setOutBizId(String outBizId){
        this.outBizId = outBizId;
        }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
        }
    public String getAddress2(){
        return this.address2;
    }
    public void setAddress2(String address2){
        this.address2 = address2;
        }
    public String getAddress1(){
        return this.address1;
    }
    public void setAddress1(String address1){
        this.address1 = address1;
        }
    public String getShippingMethod(){
        return this.shippingMethod;
    }
    public void setShippingMethod(String shippingMethod){
        this.shippingMethod = shippingMethod;
        }
    public String getWarehouseCustomerId(){
        return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId){
        this.warehouseCustomerId = warehouseCustomerId;
        }
    public String getWarehouseCode(){
        return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
        }
    public String getZipcode(){
        return this.zipcode;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
        }
    public String getProvince(){
        return this.province;
    }
    public void setProvince(String province){
        this.province = province;
        }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
        }
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        }
    public String getItems(){
        return this.items;
    }
    public void setItems(String items){
        this.items = items;
        }
    public String getShopName(){
        return this.shopName;
    }
    public void setShopName(String shopName){
        this.shopName = shopName;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/fo/create/async/post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (addressAddition != null) {
                        super.addApiParameter("addressAddition", addressAddition.toString());
                    }
                            if (goodsOwnerId != null) {
                        super.addApiParameter("goodsOwnerId", goodsOwnerId.toString());
                    }
                            if (aeTradeOrderId != null) {
                        super.addApiParameter("aeTradeOrderId", aeTradeOrderId.toString());
                    }
                            if (outBizId != null) {
                        super.addApiParameter("outBizId", outBizId.toString());
                    }
                            if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                            if (city != null) {
                        super.addApiParameter("city", city.toString());
                    }
                            if (address2 != null) {
                        super.addApiParameter("address2", address2.toString());
                    }
                            if (address1 != null) {
                        super.addApiParameter("address1", address1.toString());
                    }
                            if (shippingMethod != null) {
                        super.addApiParameter("shippingMethod", shippingMethod.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (warehouseCode != null) {
                        super.addApiParameter("warehouseCode", warehouseCode.toString());
                    }
                            if (zipcode != null) {
                        super.addApiParameter("zipcode", zipcode.toString());
                    }
                            if (province != null) {
                        super.addApiParameter("province", province.toString());
                    }
                            if (phone != null) {
                        super.addApiParameter("phone", phone.toString());
                    }
                            if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                            if (name != null) {
                        super.addApiParameter("name", name.toString());
                    }
                            if (items != null) {
                        super.addApiParameter("items", items.toString());
                    }
                            if (shopName != null) {
                        super.addApiParameter("shopName", shopName.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                                                                                    return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseFoCreateAsyncPostResponse> getResponseClass() {
        return QimenAliexpressWarehouseFoCreateAsyncPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}