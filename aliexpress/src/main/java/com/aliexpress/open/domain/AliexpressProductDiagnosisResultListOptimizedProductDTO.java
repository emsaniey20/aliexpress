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

public class AliexpressProductDiagnosisResultListOptimizedProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品标题 */
                @ApiField("product_title")
            private String productTitle;
        /** 最后优化时间 */
                @ApiField("product_last_optimization_time")
            private String productLastOptimizationTime;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 商品主图 */
                @ApiField("main_picture")
            private String mainPicture;
        /** 该商品优化来源-对应isv app name */
                @ApiField("optimized_source")
            private String optimizedSource;
    
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public String getProductLastOptimizationTime() {
    return this.productLastOptimizationTime;
    }
    public void setProductLastOptimizationTime(String productLastOptimizationTime) {
    this.productLastOptimizationTime = productLastOptimizationTime;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getMainPicture() {
    return this.mainPicture;
    }
    public void setMainPicture(String mainPicture) {
    this.mainPicture = mainPicture;
    }
        public String getOptimizedSource() {
    return this.optimizedSource;
    }
    public void setOptimizedSource(String optimizedSource) {
    this.optimizedSource = optimizedSource;
    }
    }