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

public class AriseProductQueryAriseProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 标题模块 */
                @ApiListField("subject_list")
            private List<AriseProductQuerySubject> subjectList;
        /** 修改时间 格式：2022-07-18 19:55:07 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 媒体模块 */
                @ApiField("multimedia")
            private AriseProductQueryMultimedia multimedia;
        /** sku模块 */
                @ApiListField("product_sku_list")
            private List<AriseProductQueryProductSKU> productSkuList;
        /** 渠道商品id */
                @ApiField("product_id")
            private Long productId;
        /** 物流服务类型：0：平台物流，1：卖家物流 */
                @ApiField("delivery_self")
            private String deliverySelf;
        /** 商品创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 商品初始发布语种标记  格式：es_ES */
                @ApiField("locale")
            private String locale;
        /** 商品属性模块 */
                @ApiListField("product_property_list")
            private List<AriseProductQueryProductProperty> productPropertyList;
        /** 详描模块 */
                @ApiListField("detail_source_list")
            private List<AriseProductQueryDetailSource> detailSourceList;
        /** 货币单位。ARISE 的币种默认为"EUR"； */
                @ApiField("currency_code")
            private String currencyCode;
        /** arise 类目id */
                @ApiField("category_id")
            private Integer categoryId;
        /** 海关描述：可以通过hscode预测接口或关键字搜索接口获取。global.hscode.forecast.query     ；     global.hscode.keywords.query    ； */
                @ApiField("hs_code_do")
            private AriseProductQueryHsCodeDO hsCodeDo;
    
        public List<AriseProductQuerySubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<AriseProductQuerySubject> subjectList) {
    this.subjectList = subjectList;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public AriseProductQueryMultimedia getMultimedia() {
    return this.multimedia;
    }
    public void setMultimedia(AriseProductQueryMultimedia multimedia) {
    this.multimedia = multimedia;
    }
        public List<AriseProductQueryProductSKU> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<AriseProductQueryProductSKU> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getDeliverySelf() {
    return this.deliverySelf;
    }
    public void setDeliverySelf(String deliverySelf) {
    this.deliverySelf = deliverySelf;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public List<AriseProductQueryProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<AriseProductQueryProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
    }
        public List<AriseProductQueryDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<AriseProductQueryDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Integer getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
        public AriseProductQueryHsCodeDO getHsCodeDo() {
    return this.hsCodeDo;
    }
    public void setHsCodeDo(AriseProductQueryHsCodeDO hsCodeDo) {
    this.hsCodeDo = hsCodeDo;
    }
    }