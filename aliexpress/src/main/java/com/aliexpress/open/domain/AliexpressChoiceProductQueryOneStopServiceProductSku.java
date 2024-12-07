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

public class AliexpressChoiceProductQueryOneStopServiceProductSku implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku供货价 */
                @ApiField("supply_price")
            private String supplyPrice;
        /** Sku属性对象list，允许1-3个sku属性对象，按sku属性顺序排放。sku属性从类目属性接口getAttributesResultByCateId获取。该项值输入sku属性，不能输入普通类目属性。 */
                @ApiListField("sku_property_list")
            private List<AliexpressChoiceProductQuerySKUProperty> skuPropertyList;
        /** SKU 的 id字段，格式：“sku_property_id:property_value_id” */
                @ApiField("id")
            private String id;
        /** skuId，AE内部生成唯一标识。编辑商货融合商品时需要回传 */
                @ApiField("sku_id")
            private Long skuId;
        /** Sku商家编码。 格式:半角英数字,长度20,不包含空格大于号和小于号。如果用户只填写零售价（productprice）和商品编码，需要完整生成一条SKU记录提交，否则商品编码无法保存。系统会认为只提交了零售价，而没有SKU，导致商品编辑未保存。 */
                @ApiField("sku_code")
            private String skuCode;
        /** sku的状态 ，是否销售，active ：销售  ； inactive ：不销售 */
                @ApiField("status")
            private String status;
        /** sku 级别重量，KG，请做好必填校验 */
                @ApiField("package_weight")
            private String packageWeight;
        /** sku级别 高度。cm，请做好必填校验 */
                @ApiField("package_height")
            private String packageHeight;
        /** sku级别 宽度。cm，请做好必填校验 */
                @ApiField("package_width")
            private String packageWidth;
        /** sku级别 长度。cm，请做好必填校验 */
                @ApiField("package_length")
            private String packageLength;
        /** 货品信息 */
                @ApiField("sc_item_info_dto")
            private AliexpressChoiceProductQueryOneStopServiceProductSkuScItemInfoDTO scItemInfoDto;
        /** 仓库列表 */
                @ApiListField("warehouse_list")
            private List<AliexpressChoiceProductQueryOneStopServiceProductSkuWarehouseStockDTO> warehouseList;
    
        public String getSupplyPrice() {
    return this.supplyPrice;
    }
    public void setSupplyPrice(String supplyPrice) {
    this.supplyPrice = supplyPrice;
    }
        public List<AliexpressChoiceProductQuerySKUProperty> getSkuPropertyList() {
    return this.skuPropertyList;
    }
    public void setSkuPropertyList(List<AliexpressChoiceProductQuerySKUProperty> skuPropertyList) {
    this.skuPropertyList = skuPropertyList;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getPackageWeight() {
    return this.packageWeight;
    }
    public void setPackageWeight(String packageWeight) {
    this.packageWeight = packageWeight;
    }
        public String getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(String packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(String packageWidth) {
    this.packageWidth = packageWidth;
    }
        public String getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(String packageLength) {
    this.packageLength = packageLength;
    }
        public AliexpressChoiceProductQueryOneStopServiceProductSkuScItemInfoDTO getScItemInfoDto() {
    return this.scItemInfoDto;
    }
    public void setScItemInfoDto(AliexpressChoiceProductQueryOneStopServiceProductSkuScItemInfoDTO scItemInfoDto) {
    this.scItemInfoDto = scItemInfoDto;
    }
        public List<AliexpressChoiceProductQueryOneStopServiceProductSkuWarehouseStockDTO> getWarehouseList() {
    return this.warehouseList;
    }
    public void setWarehouseList(List<AliexpressChoiceProductQueryOneStopServiceProductSkuWarehouseStockDTO> warehouseList) {
    this.warehouseList = warehouseList;
    }
    }