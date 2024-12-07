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
*  aliexpress.social.shopping.search
*/
public class AliexpressSocialShoppingSearchRequest extends BaseGopRequest<AliexpressSocialShoppingSearchResponse> {

    /** keyword */
    private String keyword;
    /** sort */
    private String sort;
    /** start */
    private Integer start;
    /** count */
    private Integer count;
    /** category id */
    private Long categoryId;
    /** max price */
    private String maxPrice;
    /** min price */
    private String minPrice;
    /** ship from country */
    private String shipFromCountry;
    /** ship to country */
    private String shipToCountry;
    /** price range */
    private String priceRange;
    /** free shipping */
    private Boolean freeShipping;
    /** big sale */
    private Boolean bigSale;
    /** if is popular */
    private Boolean popular;

    public String getKeyword(){
        return this.keyword;
    }
    public void setKeyword(String keyword){
        this.keyword = keyword;
        }
    public String getSort(){
        return this.sort;
    }
    public void setSort(String sort){
        this.sort = sort;
        }
    public Integer getStart(){
        return this.start;
    }
    public void setStart(Integer start){
        this.start = start;
        }
    public Integer getCount(){
        return this.count;
    }
    public void setCount(Integer count){
        this.count = count;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }
    public String getMaxPrice(){
        return this.maxPrice;
    }
    public void setMaxPrice(String maxPrice){
        this.maxPrice = maxPrice;
        }
    public String getMinPrice(){
        return this.minPrice;
    }
    public void setMinPrice(String minPrice){
        this.minPrice = minPrice;
        }
    public String getShipFromCountry(){
        return this.shipFromCountry;
    }
    public void setShipFromCountry(String shipFromCountry){
        this.shipFromCountry = shipFromCountry;
        }
    public String getShipToCountry(){
        return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry){
        this.shipToCountry = shipToCountry;
        }
    public String getPriceRange(){
        return this.priceRange;
    }
    public void setPriceRange(String priceRange){
        this.priceRange = priceRange;
        }
    public Boolean getFreeShipping(){
        return this.freeShipping;
    }
    public void setFreeShipping(Boolean freeShipping){
        this.freeShipping = freeShipping;
        }
    public Boolean getBigSale(){
        return this.bigSale;
    }
    public void setBigSale(Boolean bigSale){
        this.bigSale = bigSale;
        }
    public Boolean getPopular(){
        return this.popular;
    }
    public void setPopular(Boolean popular){
        this.popular = popular;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.search";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (keyword != null) {
                        super.addApiParameter("keyword", keyword.toString());
                    }
                            if (sort != null) {
                        super.addApiParameter("sort", sort.toString());
                    }
                            if (start != null) {
                        super.addApiParameter("start", start.toString());
                    }
                            if (count != null) {
                        super.addApiParameter("count", count.toString());
                    }
                            if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                            if (maxPrice != null) {
                        super.addApiParameter("max_price", maxPrice.toString());
                    }
                            if (minPrice != null) {
                        super.addApiParameter("min_price", minPrice.toString());
                    }
                            if (shipFromCountry != null) {
                        super.addApiParameter("ship_from_country", shipFromCountry.toString());
                    }
                            if (shipToCountry != null) {
                        super.addApiParameter("ship_to_country", shipToCountry.toString());
                    }
                            if (priceRange != null) {
                        super.addApiParameter("price_range", priceRange.toString());
                    }
                            if (freeShipping != null) {
                        super.addApiParameter("free_shipping", freeShipping.toString());
                    }
                            if (bigSale != null) {
                        super.addApiParameter("big_sale", bigSale.toString());
                    }
                            if (popular != null) {
                        super.addApiParameter("popular", popular.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingSearchResponse> getResponseClass() {
        return AliexpressSocialShoppingSearchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}