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

public class GlobalProductUpdateCspProduct implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 标题模块 */
                @ApiListField("subject_list")
            private List<GlobalProductUpdateSubject> subjectList;
        /** 运费模版ID。通过运费接口listFreightTemplate获取。  	 */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 备货期。取值范围:1-7;单位:天。 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** 商品初始发布语种标记 */
                @ApiField("locale")
            private String locale;
        /** 商品属性模块 */
                @ApiListField("product_property_list")
            private List<GlobalProductUpdateProductProperty> productPropertyList;
        /** sku模块 */
                @ApiListField("product_sku_list")
            private List<GlobalProductUpdateProductSKU> productSkuList;
        /** 媒体模块 */
                @ApiField("multimedia")
            private GlobalProductUpdateMultimedia multimedia;
        /** 包裹模块 */
                @ApiField("package_info")
            private GlobalProductUpdatePackageInfo packageInfo;
        /** 详描信息 */
                @ApiListField("detail_source_list")
            private List<GlobalProductUpdateDetailSource> detailSourceList;
        /** 货币单位。如果不提供该值信息，则默认为"USD"； */
                @ApiField("currency_code")
            private String currencyCode;
        /** 类目id */
                @ApiField("category_id")
            private Long categoryId;
        /** 海关描述：可以通过hscode预测接口或关键字搜索接口获取。global.hscode.forecast.query     ；     global.hscode.keywords.query    ； */
                @ApiField("hs_code_do")
            private GlobalProductUpdateHsCodeDO hsCodeDo;
    
        public List<GlobalProductUpdateSubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<GlobalProductUpdateSubject> subjectList) {
    this.subjectList = subjectList;
    }
        public Long getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getDeliveryTime() {
    return this.deliveryTime;
    }
    public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public List<GlobalProductUpdateProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<GlobalProductUpdateProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
    }
        public List<GlobalProductUpdateProductSKU> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<GlobalProductUpdateProductSKU> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public GlobalProductUpdateMultimedia getMultimedia() {
    return this.multimedia;
    }
    public void setMultimedia(GlobalProductUpdateMultimedia multimedia) {
    this.multimedia = multimedia;
    }
        public GlobalProductUpdatePackageInfo getPackageInfo() {
    return this.packageInfo;
    }
    public void setPackageInfo(GlobalProductUpdatePackageInfo packageInfo) {
    this.packageInfo = packageInfo;
    }
        public List<GlobalProductUpdateDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<GlobalProductUpdateDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public GlobalProductUpdateHsCodeDO getHsCodeDo() {
    return this.hsCodeDo;
    }
    public void setHsCodeDo(GlobalProductUpdateHsCodeDO hsCodeDo) {
    this.hsCodeDo = hsCodeDo;
    }
    }