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
*  /supply/item/create
*/
public class SupplyItemCreateRequest extends BaseGopRequest<SupplyItemCreateResponse> {

    /** 发货国 */
    private String country;
    /** 登陆ID */
    private String loginId;
    /** 商品sku列表 */
    private List<SupplyItemCreateSkuDTO> skuList;
    /** 备货时间 */
    private Integer deliveryTime;
    /** 发货城市 */
    private String city;
    /** 商品单元 */
    private Long itemUnit;
    /** 商品描述 */
    private String description;
    /** 标题 */
    private String title;
    /** 商品主图列表 */
    private List<String> picUrls;
    /** 语系 */
    private String locale;
    /** 拓展字段 */
    private HashMap<String, Object> features;
    /** 商品价格 */
    private String price;
    /** 身份识别 */
    private String identity;
    /** 供应商类型 */
    private String supplyType;
    /** 币种 */
    private String currency;
    /** 品牌 */
    private String brand;
    /** 商品高度 */
    private Integer height;
    /** 商品库存 */
    private Integer quantity;
    /** 目标市场 */
    private String destMarket;
    /** 商品长度 */
    private Integer length;
    /** 商品ID */
    private Long itemId;
    /** 运费模版ID */
    private Long postageTemplateId;
    /** 商品净重 */
    private String netWeight;
    /** 商品毛重 */
    private String grossWeight;
    /** 商品宽度 */
    private Integer width;
    /** 商品短描 */
    private String shortDesc;
    /** 中台叶子类目ID */
    private Long categoryId;
    /** 商品属性 */
    private List<SupplyItemCreateSupplyPvDTO> properties;

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }
    public String getLoginId(){
        return this.loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
        }
    public List<SupplyItemCreateSkuDTO> getSkuList(){
        return this.skuList;
    }
    public void setSkuList(List<SupplyItemCreateSkuDTO> skuList){
        this.skuList = skuList;
        }
    public Integer getDeliveryTime(){
        return this.deliveryTime;
    }
    public void setDeliveryTime(Integer deliveryTime){
        this.deliveryTime = deliveryTime;
        }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
        }
    public Long getItemUnit(){
        return this.itemUnit;
    }
    public void setItemUnit(Long itemUnit){
        this.itemUnit = itemUnit;
        }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
        }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
        }
    public List<String> getPicUrls(){
        return this.picUrls;
    }
    public void setPicUrls(List<String> picUrls){
        this.picUrls = picUrls;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public HashMap<String, Object> getFeatures(){
        return this.features;
    }
    public void setFeatures(HashMap<String, Object> features){
        this.features = features;
        }
    public String getPrice(){
        return this.price;
    }
    public void setPrice(String price){
        this.price = price;
        }
    public String getIdentity(){
        return this.identity;
    }
    public void setIdentity(String identity){
        this.identity = identity;
        }
    public String getSupplyType(){
        return this.supplyType;
    }
    public void setSupplyType(String supplyType){
        this.supplyType = supplyType;
        }
    public String getCurrency(){
        return this.currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
        }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
        }
    public Integer getHeight(){
        return this.height;
    }
    public void setHeight(Integer height){
        this.height = height;
        }
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
        }
    public String getDestMarket(){
        return this.destMarket;
    }
    public void setDestMarket(String destMarket){
        this.destMarket = destMarket;
        }
    public Integer getLength(){
        return this.length;
    }
    public void setLength(Integer length){
        this.length = length;
        }
    public Long getItemId(){
        return this.itemId;
    }
    public void setItemId(Long itemId){
        this.itemId = itemId;
        }
    public Long getPostageTemplateId(){
        return this.postageTemplateId;
    }
    public void setPostageTemplateId(Long postageTemplateId){
        this.postageTemplateId = postageTemplateId;
        }
    public String getNetWeight(){
        return this.netWeight;
    }
    public void setNetWeight(String netWeight){
        this.netWeight = netWeight;
        }
    public String getGrossWeight(){
        return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight){
        this.grossWeight = grossWeight;
        }
    public Integer getWidth(){
        return this.width;
    }
    public void setWidth(Integer width){
        this.width = width;
        }
    public String getShortDesc(){
        return this.shortDesc;
    }
    public void setShortDesc(String shortDesc){
        this.shortDesc = shortDesc;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }
    public List<SupplyItemCreateSupplyPvDTO> getProperties(){
        return this.properties;
    }
    public void setProperties(List<SupplyItemCreateSupplyPvDTO> properties){
        this.properties = properties;
        }

    @Override
    public String getApiName() {
        return "/supply/item/create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                            if (loginId != null) {
                        super.addApiParameter("login_id", loginId.toString());
                    }
                            if (skuList != null) {
                        super.addApiParameter("sku_list", new JSONWriter(true, false).write(skuList));
                    }
                            if (deliveryTime != null) {
                        super.addApiParameter("delivery_time", deliveryTime.toString());
                    }
                            if (city != null) {
                        super.addApiParameter("city", city.toString());
                    }
                            if (itemUnit != null) {
                        super.addApiParameter("item_unit", itemUnit.toString());
                    }
                            if (description != null) {
                        super.addApiParameter("description", description.toString());
                    }
                            if (title != null) {
                        super.addApiParameter("title", title.toString());
                    }
                            if (picUrls != null) {
                        super.addApiParameter("pic_urls", new JSONWriter(true, false).write(picUrls));
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (features != null) {
                        super.addApiParameter("features", new JSONWriter(true, false).write(features));
                    }
                            if (price != null) {
                        super.addApiParameter("price", price.toString());
                    }
                            if (identity != null) {
                        super.addApiParameter("identity", identity.toString());
                    }
                            if (supplyType != null) {
                        super.addApiParameter("supply_type", supplyType.toString());
                    }
                            if (currency != null) {
                        super.addApiParameter("currency", currency.toString());
                    }
                            if (brand != null) {
                        super.addApiParameter("brand", brand.toString());
                    }
                            if (height != null) {
                        super.addApiParameter("height", height.toString());
                    }
                            if (quantity != null) {
                        super.addApiParameter("quantity", quantity.toString());
                    }
                            if (destMarket != null) {
                        super.addApiParameter("dest_market", destMarket.toString());
                    }
                            if (length != null) {
                        super.addApiParameter("length", length.toString());
                    }
                            if (itemId != null) {
                        super.addApiParameter("item_id", itemId.toString());
                    }
                            if (postageTemplateId != null) {
                        super.addApiParameter("postage_template_id", postageTemplateId.toString());
                    }
                            if (netWeight != null) {
                        super.addApiParameter("net_weight", netWeight.toString());
                    }
                            if (grossWeight != null) {
                        super.addApiParameter("gross_weight", grossWeight.toString());
                    }
                            if (width != null) {
                        super.addApiParameter("width", width.toString());
                    }
                            if (shortDesc != null) {
                        super.addApiParameter("short_desc", shortDesc.toString());
                    }
                            if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                            if (properties != null) {
                        super.addApiParameter("properties", new JSONWriter(true, false).write(properties));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                                                                                                                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<SupplyItemCreateResponse> getResponseClass() {
        return SupplyItemCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}