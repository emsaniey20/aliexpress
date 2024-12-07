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

public class AliexpressAscpItemDetailErpScItemDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** {"0":"普货","1":"带电带磁","2":"纯电","3":"特货"} */
                @ApiField("logistics_attributes")
            private String logisticsAttributes;
        /** 货品条码 */
                @ApiField("whc_bar_code")
            private String whcBarCode;
        /** 颜色 */
                @ApiField("color")
            private String color;
        /** 1 */
                @ApiField("t_weight")
            private String tWeight;
        /** 货品编码erp系统的货品id */
                @ApiField("item_code")
            private String itemCode;
        /** 物流包裹图片 */
                @ApiField("logistics_package_pic")
            private String logisticsPackagePic;
        /** 标题 */
                @ApiField("title")
            private String title;
        /** 类目名 */
                @ApiField("category_name")
            private String categoryName;
        /** 货品销售包装图片 */
                @ApiField("sales_package_pic")
            private String salesPackagePic;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private HashMap<String, Object> extendFields;
        /** 包装材料 */
                @ApiField("package_material")
            private String packageMaterial;
        /** 高 */
                @ApiField("height")
            private String height;
        /** 品牌名 */
                @ApiField("brand_name")
            private String brandName;
        /** 1 */
                @ApiField("n_weight")
            private String nWeight;
        /** 1 */
                @ApiField("g_weight")
            private String gWeight;
        /** 长 */
                @ApiField("length")
            private String length;
        /** 规格 */
                @ApiField("specification")
            private String specification;
        /** 重量 */
                @ApiField("weight")
            private Integer weight;
        /** 货品id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 是否易碎 */
                @ApiField("is_hygroscopic")
            private String isHygroscopic;
        /** 1 */
                @ApiField("customs_unit_price")
            private String customsUnitPrice;
        /** 品牌id */
                @ApiField("brand_id")
            private String brandId;
        /** 宽 */
                @ApiField("width")
            private String width;
        /** 1 */
                @ApiField("inner_goods_pic")
            private String innerGoodsPic;
        /** 类目id */
                @ApiField("category_id")
            private Integer categoryId;
        /** 是否原箱 */
                @ApiField("is_origin")
            private String isOrigin;
    
        public String getLogisticsAttributes() {
    return this.logisticsAttributes;
    }
    public void setLogisticsAttributes(String logisticsAttributes) {
    this.logisticsAttributes = logisticsAttributes;
    }
        public String getWhcBarCode() {
    return this.whcBarCode;
    }
    public void setWhcBarCode(String whcBarCode) {
    this.whcBarCode = whcBarCode;
    }
        public String getColor() {
    return this.color;
    }
    public void setColor(String color) {
    this.color = color;
    }
        public String getTWeight() {
    return this.tWeight;
    }
    public void setTWeight(String tWeight) {
    this.tWeight = tWeight;
    }
        public String getItemCode() {
    return this.itemCode;
    }
    public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
    }
        public String getLogisticsPackagePic() {
    return this.logisticsPackagePic;
    }
    public void setLogisticsPackagePic(String logisticsPackagePic) {
    this.logisticsPackagePic = logisticsPackagePic;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public String getCategoryName() {
    return this.categoryName;
    }
    public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
    }
        public String getSalesPackagePic() {
    return this.salesPackagePic;
    }
    public void setSalesPackagePic(String salesPackagePic) {
    this.salesPackagePic = salesPackagePic;
    }
        public HashMap<String, Object> getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(HashMap<String, Object> extendFields) {
    this.extendFields = extendFields;
    }
        public String getPackageMaterial() {
    return this.packageMaterial;
    }
    public void setPackageMaterial(String packageMaterial) {
    this.packageMaterial = packageMaterial;
    }
        public String getHeight() {
    return this.height;
    }
    public void setHeight(String height) {
    this.height = height;
    }
        public String getBrandName() {
    return this.brandName;
    }
    public void setBrandName(String brandName) {
    this.brandName = brandName;
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
        public String getLength() {
    return this.length;
    }
    public void setLength(String length) {
    this.length = length;
    }
        public String getSpecification() {
    return this.specification;
    }
    public void setSpecification(String specification) {
    this.specification = specification;
    }
        public Integer getWeight() {
    return this.weight;
    }
    public void setWeight(Integer weight) {
    this.weight = weight;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getIsHygroscopic() {
    return this.isHygroscopic;
    }
    public void setIsHygroscopic(String isHygroscopic) {
    this.isHygroscopic = isHygroscopic;
    }
        public String getCustomsUnitPrice() {
    return this.customsUnitPrice;
    }
    public void setCustomsUnitPrice(String customsUnitPrice) {
    this.customsUnitPrice = customsUnitPrice;
    }
        public String getBrandId() {
    return this.brandId;
    }
    public void setBrandId(String brandId) {
    this.brandId = brandId;
    }
        public String getWidth() {
    return this.width;
    }
    public void setWidth(String width) {
    this.width = width;
    }
        public String getInnerGoodsPic() {
    return this.innerGoodsPic;
    }
    public void setInnerGoodsPic(String innerGoodsPic) {
    this.innerGoodsPic = innerGoodsPic;
    }
        public Integer getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
        public String getIsOrigin() {
    return this.isOrigin;
    }
    public void setIsOrigin(String isOrigin) {
    this.isOrigin = isOrigin;
    }
    }