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

public class AliexpressCategoryRedefiningGetallchildattributesresultAeopAttributeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 当前属性是否支持自定义枚举类型属性值。 web页面展示为“请输入或从列表选择” */
                @ApiField("support_enum_input")
            private Boolean supportEnumInput;
        /** 发布属性展现样式。list_box：下拉列表，input：输入框，input_int：输入数字，input_string：输入文本，check_box：多选框，radio：单选，other，group_table：check_box属性含有子属性，group_item：check_box多选子属性，unit：单位，interval：区间输入框 */
                @ApiField("attribute_show_type_value")
            private String attributeShowTypeValue;
        /** sku的销售属性是否可自定义名称，页面是否展示输入框，比如可以自定义不存在的颜色值：red123 */
                @ApiField("customized_name")
            private Boolean customizedName;
        /** sku的销售属性是否可自定义图片，页面是否展示上传按钮，比如可以在web后台给sku的颜色属性上传图片 */
                @ApiField("customized_pic")
            private Boolean customizedPic;
        /** 属性id */
                @ApiField("id")
            private Long id;
        /** 文本输入框型属性输入格式 文本:STRING, 数字:NUMBER， */
                @ApiField("input_type")
            private String inputType;
        /** 发布属性是否关键,填写关键属性可以提高商品质量，提升转化 */
                @ApiField("key_attribute")
            private Boolean keyAttribute;
        /** 属性名称 */
                @ApiField("names")
            private String names;
        /** 发布属性是否必填 */
                @ApiField("required")
            private Boolean required;
        /** 发布属性是否是sku的销售属性 */
                @ApiField("sku")
            private Boolean sku;
        /** sku属性展现样式（色卡|普通） */
                @ApiField("sku_style_value")
            private String skuStyleValue;
        /** 只有当前属性是SKU销售属性时有效，代表sku销售属性页面展示排序值：1～6。（推荐使用） */
                @ApiField("spec")
            private Long spec;
        /** 发布属性单位 */
                @ApiListField("units")
            private List<AliexpressCategoryRedefiningGetallchildattributesresultAeopUnit> units;
        /** 发布属性值 */
                @ApiListField("values")
            private List<AliexpressCategoryRedefiningGetallchildattributesresultAeopAttrValueDTO> values;
        /** 属性是否可见，true：页面可以展示。false：页面隐藏请isv过滤掉 */
                @ApiField("visible")
            private Boolean visible;
        /** feature的map */
                @ApiField("features")
            private String features;
    
        public Boolean getSupportEnumInput() {
    return this.supportEnumInput;
    }
    public void setSupportEnumInput(Boolean supportEnumInput) {
    this.supportEnumInput = supportEnumInput;
    }
        public String getAttributeShowTypeValue() {
    return this.attributeShowTypeValue;
    }
    public void setAttributeShowTypeValue(String attributeShowTypeValue) {
    this.attributeShowTypeValue = attributeShowTypeValue;
    }
        public Boolean getCustomizedName() {
    return this.customizedName;
    }
    public void setCustomizedName(Boolean customizedName) {
    this.customizedName = customizedName;
    }
        public Boolean getCustomizedPic() {
    return this.customizedPic;
    }
    public void setCustomizedPic(Boolean customizedPic) {
    this.customizedPic = customizedPic;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getInputType() {
    return this.inputType;
    }
    public void setInputType(String inputType) {
    this.inputType = inputType;
    }
        public Boolean getKeyAttribute() {
    return this.keyAttribute;
    }
    public void setKeyAttribute(Boolean keyAttribute) {
    this.keyAttribute = keyAttribute;
    }
        public String getNames() {
    return this.names;
    }
    public void setNames(String names) {
    this.names = names;
    }
        public Boolean getRequired() {
    return this.required;
    }
    public void setRequired(Boolean required) {
    this.required = required;
    }
        public Boolean getSku() {
    return this.sku;
    }
    public void setSku(Boolean sku) {
    this.sku = sku;
    }
        public String getSkuStyleValue() {
    return this.skuStyleValue;
    }
    public void setSkuStyleValue(String skuStyleValue) {
    this.skuStyleValue = skuStyleValue;
    }
        public Long getSpec() {
    return this.spec;
    }
    public void setSpec(Long spec) {
    this.spec = spec;
    }
        public List<AliexpressCategoryRedefiningGetallchildattributesresultAeopUnit> getUnits() {
    return this.units;
    }
    public void setUnits(List<AliexpressCategoryRedefiningGetallchildattributesresultAeopUnit> units) {
    this.units = units;
    }
        public List<AliexpressCategoryRedefiningGetallchildattributesresultAeopAttrValueDTO> getValues() {
    return this.values;
    }
    public void setValues(List<AliexpressCategoryRedefiningGetallchildattributesresultAeopAttrValueDTO> values) {
    this.values = values;
    }
        public Boolean getVisible() {
    return this.visible;
    }
    public void setVisible(Boolean visible) {
    this.visible = visible;
    }
        public String getFeatures() {
    return this.features;
    }
    public void setFeatures(String features) {
    this.features = features;
    }
    }