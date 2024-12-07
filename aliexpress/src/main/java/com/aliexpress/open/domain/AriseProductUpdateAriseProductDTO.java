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

public class AriseProductUpdateAriseProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 标题模块 */
                @ApiListField("subject_list")
            private List<AriseProductUpdateSubject> subjectList;
        /** sku模块 */
                @ApiListField("product_sku_list")
            private List<AriseProductUpdateProductSKU> productSkuList;
        /** 媒体模块 */
                @ApiField("multimedia")
            private AriseProductUpdateMultimedia multimedia;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 物流服务类型：0：平台物流，1：卖家物流 */
                @ApiField("delivery_self")
            private String deliverySelf;
        /** 商品初始发布语种标记。 ja_JP ： 日本日语 ko_KR：韩国韩语 tr_TR：土耳其土耳其语 nl_NL：荷兰荷兰语 pl_PL：波兰波兰语 ru_RU：俄国俄语 fr_FR：法国法语 en_US：美国英语 th_TH：泰国泰语 de_DE：德国德语 es_ES：西班牙西班牙语 */
                @ApiField("locale")
            private String locale;
        /** 详描模块 */
                @ApiListField("detail_source_list")
            private List<AriseProductUpdateDetailSource> detailSourceList;
        /** 商品属性模块 。可以从类目属性查询接口查询到类目下对应的 属性id和属性值id */
                @ApiListField("product_property_list")
            private List<AriseProductUpdateProductProperty> productPropertyList;
        /** 货币单位。如果不提供该值信息，则默认为"USD"； */
                @ApiField("currency_code")
            private String currencyCode;
        /** 类目id */
                @ApiField("category_id")
            private Long categoryId;
        /** 海关描述：可以通过hscode预测接口或关键字搜索接口获取。global.hscode.forecast.query     ；     global.hscode.keywords.query    ； */
                @ApiField("hs_code_do")
            private AriseProductUpdateHsCodeDO hsCodeDo;
    
        public List<AriseProductUpdateSubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<AriseProductUpdateSubject> subjectList) {
    this.subjectList = subjectList;
    }
        public List<AriseProductUpdateProductSKU> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<AriseProductUpdateProductSKU> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public AriseProductUpdateMultimedia getMultimedia() {
    return this.multimedia;
    }
    public void setMultimedia(AriseProductUpdateMultimedia multimedia) {
    this.multimedia = multimedia;
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
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public List<AriseProductUpdateDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<AriseProductUpdateDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
        public List<AriseProductUpdateProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<AriseProductUpdateProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
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
        public AriseProductUpdateHsCodeDO getHsCodeDo() {
    return this.hsCodeDo;
    }
    public void setHsCodeDo(AriseProductUpdateHsCodeDO hsCodeDo) {
    this.hsCodeDo = hsCodeDo;
    }
    }