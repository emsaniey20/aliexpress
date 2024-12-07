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

public class GlobalProductQueryCspProduct implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 标题模块 */
                @ApiListField("subject_list")
            private List<GlobalProductQuerySubject> subjectList;
        /** 修改时间  格式：2022-07-18 19:55:07 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 运费模版ID。通过运费接口listFreightTemplate获取。 */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 备货期。取值范围:1-7;单位:天。 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** 商品初始发布语种标记 格式：en_US */
                @ApiField("locale")
            private String locale;
        /** 商品创建时间。格式：2022-07-18 19:55:07 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 商品属性模块 */
                @ApiListField("product_property_list")
            private List<GlobalProductQueryProductProperty> productPropertyList;
        /** sku模块 */
                @ApiListField("product_sku_list")
            private List<GlobalProductQueryProductSKU> productSkuList;
        /** 媒体模块 */
                @ApiField("multimedia")
            private GlobalProductQueryMultimedia multimedia;
        /** 包裹模块 */
                @ApiField("package_info")
            private GlobalProductQueryPackageInfo packageInfo;
        /** 详描信息 */
                @ApiListField("detail_source_list")
            private List<GlobalProductQueryDetailSource> detailSourceList;
        /** 货币单位。如果不提供该值信息，则默认为"USD"； */
                @ApiField("currency_code")
            private String currencyCode;
        /** 类目id */
                @ApiField("category_id")
            private Long categoryId;
        /** 海关描述：可以通过hscode预测接口或关键字搜索接口获取。global.hscode.forecast.query     ；     global.hscode.keywords.query    ； */
                @ApiField("hs_code_do")
            private GlobalProductQueryHsCodeDO hsCodeDo;
    
        public List<GlobalProductQuerySubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<GlobalProductQuerySubject> subjectList) {
    this.subjectList = subjectList;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
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
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public List<GlobalProductQueryProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<GlobalProductQueryProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
    }
        public List<GlobalProductQueryProductSKU> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<GlobalProductQueryProductSKU> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public GlobalProductQueryMultimedia getMultimedia() {
    return this.multimedia;
    }
    public void setMultimedia(GlobalProductQueryMultimedia multimedia) {
    this.multimedia = multimedia;
    }
        public GlobalProductQueryPackageInfo getPackageInfo() {
    return this.packageInfo;
    }
    public void setPackageInfo(GlobalProductQueryPackageInfo packageInfo) {
    this.packageInfo = packageInfo;
    }
        public List<GlobalProductQueryDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<GlobalProductQueryDetailSource> detailSourceList) {
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
        public GlobalProductQueryHsCodeDO getHsCodeDo() {
    return this.hsCodeDo;
    }
    public void setHsCodeDo(GlobalProductQueryHsCodeDO hsCodeDo) {
    this.hsCodeDo = hsCodeDo;
    }
    }