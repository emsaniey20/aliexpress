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
*  ae.merchant.assortment.seller.arrangement.plan.list
*/
public class AeMerchantAssortmentSellerArrangementPlanListRequest extends BaseGopRequest<AeMerchantAssortmentSellerArrangementPlanListResponse> {

    /** 机会类型 */
    private Integer planType;
    /** 计划ID */
    private Long planId;
    /** 分页查询 - 开始页码 */
    private Integer pageNo;
    /** 分页查询 - 每页记录数 */
    private Integer pageSize;
    /** 排序字段，"sort": {"startTime": "asc"} */
    private String sort;
    /** 类目ID列表 */
    private List<String> categoryPath;
    /** 目标市场，国家/地区 */
    private String region;
    /** 价格带 */
    private String priceRange;
    /** 价格带币种 */
    private String priceRangeCurrency;
    /** 机会来源，如：SheIn */
    private String opportunitySource;
    /** 我参与的，1：只看已参与；0：所有分配给我的计划 */
    private Integer joinStatus;
    /** 补品计划状态，1：招募中；2：已结束；3：未开始 */
    private Integer planStatus;
    /** 只看收藏，true：只看收藏；false：所有分配给我的计划 */
    private Boolean hasCollected;

    public Integer getPlanType(){
        return this.planType;
    }
    public void setPlanType(Integer planType){
        this.planType = planType;
        }
    public Long getPlanId(){
        return this.planId;
    }
    public void setPlanId(Long planId){
        this.planId = planId;
        }
    public Integer getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Integer pageNo){
        this.pageNo = pageNo;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public String getSort(){
        return this.sort;
    }
    public void setSort(String sort){
        this.sort = sort;
        }
    public List<String> getCategoryPath(){
        return this.categoryPath;
    }
    public void setCategoryPath(List<String> categoryPath){
        this.categoryPath = categoryPath;
        }
    public String getRegion(){
        return this.region;
    }
    public void setRegion(String region){
        this.region = region;
        }
    public String getPriceRange(){
        return this.priceRange;
    }
    public void setPriceRange(String priceRange){
        this.priceRange = priceRange;
        }
    public String getPriceRangeCurrency(){
        return this.priceRangeCurrency;
    }
    public void setPriceRangeCurrency(String priceRangeCurrency){
        this.priceRangeCurrency = priceRangeCurrency;
        }
    public String getOpportunitySource(){
        return this.opportunitySource;
    }
    public void setOpportunitySource(String opportunitySource){
        this.opportunitySource = opportunitySource;
        }
    public Integer getJoinStatus(){
        return this.joinStatus;
    }
    public void setJoinStatus(Integer joinStatus){
        this.joinStatus = joinStatus;
        }
    public Integer getPlanStatus(){
        return this.planStatus;
    }
    public void setPlanStatus(Integer planStatus){
        this.planStatus = planStatus;
        }
    public Boolean getHasCollected(){
        return this.hasCollected;
    }
    public void setHasCollected(Boolean hasCollected){
        this.hasCollected = hasCollected;
        }

    @Override
    public String getApiName() {
        return "ae.merchant.assortment.seller.arrangement.plan.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (planType != null) {
                        super.addApiParameter("planType", planType.toString());
                    }
                            if (planId != null) {
                        super.addApiParameter("planId", planId.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("pageNo", pageNo.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("pageSize", pageSize.toString());
                    }
                            if (sort != null) {
                        super.addApiParameter("sort", sort.toString());
                    }
                            if (categoryPath != null) {
                        super.addApiParameter("categoryPath", new JSONWriter(true, false).write(categoryPath));
                    }
                            if (region != null) {
                        super.addApiParameter("region", region.toString());
                    }
                            if (priceRange != null) {
                        super.addApiParameter("priceRange", priceRange.toString());
                    }
                            if (priceRangeCurrency != null) {
                        super.addApiParameter("priceRangeCurrency", priceRangeCurrency.toString());
                    }
                            if (opportunitySource != null) {
                        super.addApiParameter("opportunitySource", opportunitySource.toString());
                    }
                            if (joinStatus != null) {
                        super.addApiParameter("joinStatus", joinStatus.toString());
                    }
                            if (planStatus != null) {
                        super.addApiParameter("planStatus", planStatus.toString());
                    }
                            if (hasCollected != null) {
                        super.addApiParameter("hasCollected", hasCollected.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                        return super.getFileParams();
    }

    @Override
    public Class<AeMerchantAssortmentSellerArrangementPlanListResponse> getResponseClass() {
        return AeMerchantAssortmentSellerArrangementPlanListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}