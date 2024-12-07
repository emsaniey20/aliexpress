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
*  ae.merchant.assortment.seller.plan.products.query
*/
public class AeMerchantAssortmentSellerPlanProductsQueryRequest extends BaseGopRequest<AeMerchantAssortmentSellerPlanProductsQueryResponse> {

    /** 计划ID */
    private Long planId;
    /** 一级类目ID */
    private Long topCategoryId;
    /** 叶子类目ID */
    private Long leafCategoryId;
    /** 类目数组 */
    private List<String> categoryPath;
    /** 商品分组 */
    private String countGroupEnum;
    /** 商品查询状态 */
    private Integer productStatus;
    /** 商品ID列表 */
    private List<Long> productIds;
    /** 商品名称 */
    private String productName;
    /** 商品ID */
    private String productId;
    /** 商品发布时间 时间戳 毫秒 */
    private Long productPublishTimeStart;
    /** 商品结束时间 时间戳 毫秒 */
    private Long productPublishTimeEnd;
    /** 机会类型 */
    private Integer planType;
    /** 商品报名状态 0-全部，1-未报名，2-已报名 */
    private Integer productApplyStatus;
    /** 分页查询 - 开始页码 */
    private Integer pageNo;
    /** 分页查询 - 每页记录数 */
    private Integer pageSize;
    /** 排序字段，"sort": {"startTime": "asc"} */
    private String sort;

    public Long getPlanId(){
        return this.planId;
    }
    public void setPlanId(Long planId){
        this.planId = planId;
        }
    public Long getTopCategoryId(){
        return this.topCategoryId;
    }
    public void setTopCategoryId(Long topCategoryId){
        this.topCategoryId = topCategoryId;
        }
    public Long getLeafCategoryId(){
        return this.leafCategoryId;
    }
    public void setLeafCategoryId(Long leafCategoryId){
        this.leafCategoryId = leafCategoryId;
        }
    public List<String> getCategoryPath(){
        return this.categoryPath;
    }
    public void setCategoryPath(List<String> categoryPath){
        this.categoryPath = categoryPath;
        }
    public String getCountGroupEnum(){
        return this.countGroupEnum;
    }
    public void setCountGroupEnum(String countGroupEnum){
        this.countGroupEnum = countGroupEnum;
        }
    public Integer getProductStatus(){
        return this.productStatus;
    }
    public void setProductStatus(Integer productStatus){
        this.productStatus = productStatus;
        }
    public List<Long> getProductIds(){
        return this.productIds;
    }
    public void setProductIds(List<Long> productIds){
        this.productIds = productIds;
        }
    public String getProductName(){
        return this.productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
        }
    public String getProductId(){
        return this.productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
        }
    public Long getProductPublishTimeStart(){
        return this.productPublishTimeStart;
    }
    public void setProductPublishTimeStart(Long productPublishTimeStart){
        this.productPublishTimeStart = productPublishTimeStart;
        }
    public Long getProductPublishTimeEnd(){
        return this.productPublishTimeEnd;
    }
    public void setProductPublishTimeEnd(Long productPublishTimeEnd){
        this.productPublishTimeEnd = productPublishTimeEnd;
        }
    public Integer getPlanType(){
        return this.planType;
    }
    public void setPlanType(Integer planType){
        this.planType = planType;
        }
    public Integer getProductApplyStatus(){
        return this.productApplyStatus;
    }
    public void setProductApplyStatus(Integer productApplyStatus){
        this.productApplyStatus = productApplyStatus;
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

    @Override
    public String getApiName() {
        return "ae.merchant.assortment.seller.plan.products.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (planId != null) {
                        super.addApiParameter("planId", planId.toString());
                    }
                            if (topCategoryId != null) {
                        super.addApiParameter("topCategoryId", topCategoryId.toString());
                    }
                            if (leafCategoryId != null) {
                        super.addApiParameter("leafCategoryId", leafCategoryId.toString());
                    }
                            if (categoryPath != null) {
                        super.addApiParameter("categoryPath", new JSONWriter(true, false).write(categoryPath));
                    }
                            if (countGroupEnum != null) {
                        super.addApiParameter("countGroupEnum", countGroupEnum.toString());
                    }
                            if (productStatus != null) {
                        super.addApiParameter("productStatus", productStatus.toString());
                    }
                            if (productIds != null) {
                        super.addApiParameter("productIds", new JSONWriter(true, false).write(productIds));
                    }
                            if (productName != null) {
                        super.addApiParameter("productName", productName.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("productId", productId.toString());
                    }
                            if (productPublishTimeStart != null) {
                        super.addApiParameter("productPublishTimeStart", productPublishTimeStart.toString());
                    }
                            if (productPublishTimeEnd != null) {
                        super.addApiParameter("productPublishTimeEnd", productPublishTimeEnd.toString());
                    }
                            if (planType != null) {
                        super.addApiParameter("planType", planType.toString());
                    }
                            if (productApplyStatus != null) {
                        super.addApiParameter("productApplyStatus", productApplyStatus.toString());
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
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<AeMerchantAssortmentSellerPlanProductsQueryResponse> getResponseClass() {
        return AeMerchantAssortmentSellerPlanProductsQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}