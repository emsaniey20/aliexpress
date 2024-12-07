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
*  aliexpress.social.item.search
*/
public class AliexpressSocialItemSearchRequest extends BaseGopRequest<AliexpressSocialItemSearchResponse> {

    /** 类目ID */
    private Long cateId;
    /** 页码 */
    private Integer pageNo;
    /** 最低价格 */
    private String minPrice;
    /** 最高价格 */
    private String maxPrice;
    /** 搜索关键字 */
    private String keyword;
    /** shipTo国家 */
    private String shipTo;
    /** 是否有视频 */
    private Boolean hasVideo;
    /** order by properties */
    private String orderBy;
    /** 是否逆序 */
    private Boolean desc;
    /** page size */
    private Integer pageSize;
    /** 是否免邮 */
    private Boolean isShipFree;
    /** 佣金最大值 */
    private String commissionRateMax;
    /** 佣金最小值 */
    private String commissionRateMin;
    /** 物流时效 */
    private Integer logisticsTime;
    /** 是否联盟商品 */
    private Boolean allianceItem;
    /** 评价分数 */
    private String commentScore;
    /** locale,格式为language+"_"+country */
    private String locale;
    /** 币种 */
    private String currency;

    public Long getCateId(){
        return this.cateId;
    }
    public void setCateId(Long cateId){
        this.cateId = cateId;
        }
    public Integer getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Integer pageNo){
        this.pageNo = pageNo;
        }
    public String getMinPrice(){
        return this.minPrice;
    }
    public void setMinPrice(String minPrice){
        this.minPrice = minPrice;
        }
    public String getMaxPrice(){
        return this.maxPrice;
    }
    public void setMaxPrice(String maxPrice){
        this.maxPrice = maxPrice;
        }
    public String getKeyword(){
        return this.keyword;
    }
    public void setKeyword(String keyword){
        this.keyword = keyword;
        }
    public String getShipTo(){
        return this.shipTo;
    }
    public void setShipTo(String shipTo){
        this.shipTo = shipTo;
        }
    public Boolean getHasVideo(){
        return this.hasVideo;
    }
    public void setHasVideo(Boolean hasVideo){
        this.hasVideo = hasVideo;
        }
    public String getOrderBy(){
        return this.orderBy;
    }
    public void setOrderBy(String orderBy){
        this.orderBy = orderBy;
        }
    public Boolean getDesc(){
        return this.desc;
    }
    public void setDesc(Boolean desc){
        this.desc = desc;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public Boolean getIsShipFree(){
        return this.isShipFree;
    }
    public void setIsShipFree(Boolean isShipFree){
        this.isShipFree = isShipFree;
        }
    public String getCommissionRateMax(){
        return this.commissionRateMax;
    }
    public void setCommissionRateMax(String commissionRateMax){
        this.commissionRateMax = commissionRateMax;
        }
    public String getCommissionRateMin(){
        return this.commissionRateMin;
    }
    public void setCommissionRateMin(String commissionRateMin){
        this.commissionRateMin = commissionRateMin;
        }
    public Integer getLogisticsTime(){
        return this.logisticsTime;
    }
    public void setLogisticsTime(Integer logisticsTime){
        this.logisticsTime = logisticsTime;
        }
    public Boolean getAllianceItem(){
        return this.allianceItem;
    }
    public void setAllianceItem(Boolean allianceItem){
        this.allianceItem = allianceItem;
        }
    public String getCommentScore(){
        return this.commentScore;
    }
    public void setCommentScore(String commentScore){
        this.commentScore = commentScore;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public String getCurrency(){
        return this.currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.item.search";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (cateId != null) {
                        super.addApiParameter("cate_id", cateId.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (minPrice != null) {
                        super.addApiParameter("min_price", minPrice.toString());
                    }
                            if (maxPrice != null) {
                        super.addApiParameter("max_price", maxPrice.toString());
                    }
                            if (keyword != null) {
                        super.addApiParameter("keyword", keyword.toString());
                    }
                            if (shipTo != null) {
                        super.addApiParameter("ship_to", shipTo.toString());
                    }
                            if (hasVideo != null) {
                        super.addApiParameter("has_video", hasVideo.toString());
                    }
                            if (orderBy != null) {
                        super.addApiParameter("order_by", orderBy.toString());
                    }
                            if (desc != null) {
                        super.addApiParameter("desc", desc.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (isShipFree != null) {
                        super.addApiParameter("is_ship_free", isShipFree.toString());
                    }
                            if (commissionRateMax != null) {
                        super.addApiParameter("commission_rate_max", commissionRateMax.toString());
                    }
                            if (commissionRateMin != null) {
                        super.addApiParameter("commission_rate_min", commissionRateMin.toString());
                    }
                            if (logisticsTime != null) {
                        super.addApiParameter("logistics_time", logisticsTime.toString());
                    }
                            if (allianceItem != null) {
                        super.addApiParameter("alliance_item", allianceItem.toString());
                    }
                            if (commentScore != null) {
                        super.addApiParameter("comment_score", commentScore.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (currency != null) {
                        super.addApiParameter("currency", currency.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialItemSearchResponse> getResponseClass() {
        return AliexpressSocialItemSearchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}