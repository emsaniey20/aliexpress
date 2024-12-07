package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressProductDiagnosisPageQueryProblemToBeOptimizedProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 问题商品名称 */
                @ApiField("product_title")
            private String productTitle;
        /** 商品问题 */
                @ApiField("product_problem")
            private AliexpressProductDiagnosisPageQueryProblemProductProblemDTO productProblem;
        /** 商品的操作状态： -1（已优化） 0（待优化） 1（已操作、检测中） 2（已下架） 3（已忽略） 4（已删除） */
                @ApiField("operate_status")
            private Integer operateStatus;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 商品影响类型 */
                @ApiField("product_impact")
            private String productImpact;
        /** 商品主图url */
                @ApiField("main_picture")
            private String mainPicture;
        /** 商品优化建议 */
                @ApiField("optimization_suggestion")
            private String optimizationSuggestion;
    
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public AliexpressProductDiagnosisPageQueryProblemProductProblemDTO getProductProblem() {
    return this.productProblem;
    }
    public void setProductProblem(AliexpressProductDiagnosisPageQueryProblemProductProblemDTO productProblem) {
    this.productProblem = productProblem;
    }
        public Integer getOperateStatus() {
    return this.operateStatus;
    }
    public void setOperateStatus(Integer operateStatus) {
    this.operateStatus = operateStatus;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductImpact() {
    return this.productImpact;
    }
    public void setProductImpact(String productImpact) {
    this.productImpact = productImpact;
    }
        public String getMainPicture() {
    return this.mainPicture;
    }
    public void setMainPicture(String mainPicture) {
    this.mainPicture = mainPicture;
    }
        public String getOptimizationSuggestion() {
    return this.optimizationSuggestion;
    }
    public void setOptimizationSuggestion(String optimizationSuggestion) {
    this.optimizationSuggestion = optimizationSuggestion;
    }
    }