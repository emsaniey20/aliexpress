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
*  /supply/item/update
*/
public class SupplyItemUpdateRequest extends BaseGopRequest<SupplyItemUpdateResponse> {

    /** 登陆ID */
    private String loginId;
    /** 商品库存 */
    private Integer quantity;
    /** sku列表 */
    private List<SupplyItemUpdateSkuUpdateDTO> skuList;
    /** 目标市场 */
    private String destMarket;
    /** 商品长描 */
    private String description;
    /** 商品标题 */
    private String title;
    /** 商品主图列表 */
    private List<String> picUrls;
    /** 商品编码 */
    private Long itemId;
    /** 拓展字段 */
    private HashMap<String, Object> features;
    /** 商品价格 */
    private String price;
    /** 身份识别 */
    private String identity;
    /** 供应商类型 */
    private String supplyType;
    /** 商品状态 */
    private Integer status;

    public String getLoginId(){
        return this.loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
        }
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
        }
    public List<SupplyItemUpdateSkuUpdateDTO> getSkuList(){
        return this.skuList;
    }
    public void setSkuList(List<SupplyItemUpdateSkuUpdateDTO> skuList){
        this.skuList = skuList;
        }
    public String getDestMarket(){
        return this.destMarket;
    }
    public void setDestMarket(String destMarket){
        this.destMarket = destMarket;
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
    public Long getItemId(){
        return this.itemId;
    }
    public void setItemId(Long itemId){
        this.itemId = itemId;
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
    public Integer getStatus(){
        return this.status;
    }
    public void setStatus(Integer status){
        this.status = status;
        }

    @Override
    public String getApiName() {
        return "/supply/item/update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (loginId != null) {
                        super.addApiParameter("login_id", loginId.toString());
                    }
                            if (quantity != null) {
                        super.addApiParameter("quantity", quantity.toString());
                    }
                            if (skuList != null) {
                        super.addApiParameter("sku_list", new JSONWriter(true, false).write(skuList));
                    }
                            if (destMarket != null) {
                        super.addApiParameter("dest_market", destMarket.toString());
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
                            if (itemId != null) {
                        super.addApiParameter("item_id", itemId.toString());
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
                            if (status != null) {
                        super.addApiParameter("status", status.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                        return super.getFileParams();
    }

    @Override
    public Class<SupplyItemUpdateResponse> getResponseClass() {
        return SupplyItemUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}