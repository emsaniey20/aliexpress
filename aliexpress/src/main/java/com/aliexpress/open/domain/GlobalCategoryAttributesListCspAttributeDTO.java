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

public class GlobalCategoryAttributesListCspAttributeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否有色卡图 */
                @ApiField("has_thumbnail")
            private Boolean hasThumbnail;
        /** sku图片是否必传 */
                @ApiField("required_image")
            private Boolean requiredImage;
        /** 属性值列表 */
                @ApiListField("values")
            private List<GlobalCategoryAttributesListBaseAttributeValueDTO> values;
        /** 是否是sku销售属性 */
                @ApiField("is_sale_prop")
            private Boolean isSaleProp;
        /** 属性展现样式 ：单选或多选 、是否可输入等。  1：文本     2：富文本           3：单选          4：多选           5：日历          6：数值          7：枚举单选可输入           8：枚举多选可输入             9：图片      */
                @ApiField("attribute_show_type_value")
            private String attributeShowTypeValue;
        /** 是否是关键属性 */
                @ApiField("is_key_attribute")
            private Boolean isKeyAttribute;
        /** 是否可以自定义sku图片：  标记商品sku属性中可以挂载sku图片的销售属性 */
                @ApiField("customized_pic")
            private Boolean customizedPic;
        /** 是否必填 */
                @ApiField("required")
            private Boolean required;
        /** 是否是品牌 */
                @ApiField("is_brand_property")
            private Boolean isBrandProperty;
        /** 属性名 */
                @ApiField("name")
            private String name;
        /** 属性值 */
                @ApiField("id")
            private Integer id;
    
        public Boolean getHasThumbnail() {
    return this.hasThumbnail;
    }
    public void setHasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
    }
        public Boolean getRequiredImage() {
    return this.requiredImage;
    }
    public void setRequiredImage(Boolean requiredImage) {
    this.requiredImage = requiredImage;
    }
        public List<GlobalCategoryAttributesListBaseAttributeValueDTO> getValues() {
    return this.values;
    }
    public void setValues(List<GlobalCategoryAttributesListBaseAttributeValueDTO> values) {
    this.values = values;
    }
        public Boolean getIsSaleProp() {
    return this.isSaleProp;
    }
    public void setIsSaleProp(Boolean isSaleProp) {
    this.isSaleProp = isSaleProp;
    }
        public String getAttributeShowTypeValue() {
    return this.attributeShowTypeValue;
    }
    public void setAttributeShowTypeValue(String attributeShowTypeValue) {
    this.attributeShowTypeValue = attributeShowTypeValue;
    }
        public Boolean getIsKeyAttribute() {
    return this.isKeyAttribute;
    }
    public void setIsKeyAttribute(Boolean isKeyAttribute) {
    this.isKeyAttribute = isKeyAttribute;
    }
        public Boolean getCustomizedPic() {
    return this.customizedPic;
    }
    public void setCustomizedPic(Boolean customizedPic) {
    this.customizedPic = customizedPic;
    }
        public Boolean getRequired() {
    return this.required;
    }
    public void setRequired(Boolean required) {
    this.required = required;
    }
        public Boolean getIsBrandProperty() {
    return this.isBrandProperty;
    }
    public void setIsBrandProperty(Boolean isBrandProperty) {
    this.isBrandProperty = isBrandProperty;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public Integer getId() {
    return this.id;
    }
    public void setId(Integer id) {
    this.id = id;
    }
    }