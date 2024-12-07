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

public class AliexpressAscpItemQueryString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** relation */
                @ApiListField("relation_list")
            private List<AliexpressAscpItemQueryErpScItemBindRelationDTO> relationList;
        /** 是否原箱 */
                @ApiField("is_origion")
            private String isOrigion;
        /** 是否易碎品 */
                @ApiField("is_hygroscopic")
            private String isHygroscopic;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
        /** 货品声明价值（3PL必填，其他场景下无效） */
                @ApiField("customs_unit_price")
            private String customsUnitPrice;
        /** 皮重 */
                @ApiField("t_weight")
            private String tWeight;
        /** 净重 */
                @ApiField("n_weight")
            private String nWeight;
        /** 毛重 */
                @ApiField("g_weight")
            private String gWeight;
        /** 包装材料 */
                @ApiField("package_material")
            private String packageMaterial;
        /** 颜色 */
                @ApiField("color")
            private String color;
        /** 重 */
                @ApiField("weight")
            private Integer weight;
        /** 高 */
                @ApiField("height")
            private Integer height;
        /** 宽 */
                @ApiField("width")
            private Integer width;
        /** 长度 */
                @ApiField("length")
            private Integer length;
        /** 货品条码 */
                @ApiField("whc_bar_code")
            private String whcBarCode;
        /** 货品编码 */
                @ApiField("item_code")
            private String itemCode;
        /** 类目名称 */
                @ApiField("category_name")
            private String categoryName;
        /** 类目Id */
                @ApiField("category_id")
            private Long categoryId;
        /** 品牌名称 */
                @ApiField("brand_name")
            private String brandName;
        /** 品牌Id */
                @ApiField("brand_id")
            private Long brandId;
        /** 货品名称 */
                @ApiField("title")
            private String title;
        /** 货品Id */
                @ApiField("sc_item_id")
            private Long scItemId;
    
        public List<AliexpressAscpItemQueryErpScItemBindRelationDTO> getRelationList() {
    return this.relationList;
    }
    public void setRelationList(List<AliexpressAscpItemQueryErpScItemBindRelationDTO> relationList) {
    this.relationList = relationList;
    }
        public String getIsOrigion() {
    return this.isOrigion;
    }
    public void setIsOrigion(String isOrigion) {
    this.isOrigion = isOrigion;
    }
        public String getIsHygroscopic() {
    return this.isHygroscopic;
    }
    public void setIsHygroscopic(String isHygroscopic) {
    this.isHygroscopic = isHygroscopic;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
        public String getCustomsUnitPrice() {
    return this.customsUnitPrice;
    }
    public void setCustomsUnitPrice(String customsUnitPrice) {
    this.customsUnitPrice = customsUnitPrice;
    }
        public String getTWeight() {
    return this.tWeight;
    }
    public void setTWeight(String tWeight) {
    this.tWeight = tWeight;
    }
        public String getNWeight() {
    return this.nWeight;
    }
    public void setNWeight(String nWeight) {
    this.nWeight = nWeight;
    }
        public String getGWeight() {
    return this.gWeight;
    }
    public void setGWeight(String gWeight) {
    this.gWeight = gWeight;
    }
        public String getPackageMaterial() {
    return this.packageMaterial;
    }
    public void setPackageMaterial(String packageMaterial) {
    this.packageMaterial = packageMaterial;
    }
        public String getColor() {
    return this.color;
    }
    public void setColor(String color) {
    this.color = color;
    }
        public Integer getWeight() {
    return this.weight;
    }
    public void setWeight(Integer weight) {
    this.weight = weight;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public Integer getLength() {
    return this.length;
    }
    public void setLength(Integer length) {
    this.length = length;
    }
        public String getWhcBarCode() {
    return this.whcBarCode;
    }
    public void setWhcBarCode(String whcBarCode) {
    this.whcBarCode = whcBarCode;
    }
        public String getItemCode() {
    return this.itemCode;
    }
    public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
    }
        public String getCategoryName() {
    return this.categoryName;
    }
    public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getBrandName() {
    return this.brandName;
    }
    public void setBrandName(String brandName) {
    this.brandName = brandName;
    }
        public Long getBrandId() {
    return this.brandId;
    }
    public void setBrandId(Long brandId) {
    this.brandId = brandId;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
    }