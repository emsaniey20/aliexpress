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

public class AliexpressChoiceProductPostOneStopServiceProductSku implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku供货价 */
                @ApiField("supply_price")
            private String supplyPrice;
        /** Sku属性对象list，允许1-3个sku属性对象，按sku属性顺序排放。sku属性从类目属性接口getAttributesResultByCateId获取。该项值输入sku属性，不能输入普通类目属性。 */
                @ApiListField("sku_property_list")
            private List<AliexpressChoiceProductPostSKUProperty> skuPropertyList;
        /** Sku商家编码，新发对应货品编码。当货品编码已经存在时，需要保证填写的货品条码与存在货品的货品编码保持相同。新发商品会自动绑定到已经存在的货品上 */
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
        /** 货品信息对象 */
                @ApiField("sc_item_info_dto")
            private AliexpressChoiceProductPostOneStopServiceProductSkuScItemInfoDTO scItemInfoDto;
        /** 库存列表 */
                @ApiListField("warehouse_list")
            private List<AliexpressChoiceProductPostOneStopServiceProductSkuWarehouseStockDTO> warehouseList;
    
        public String getSupplyPrice() {
    return this.supplyPrice;
    }
    public void setSupplyPrice(String supplyPrice) {
    this.supplyPrice = supplyPrice;
    }
        public List<AliexpressChoiceProductPostSKUProperty> getSkuPropertyList() {
    return this.skuPropertyList;
    }
    public void setSkuPropertyList(List<AliexpressChoiceProductPostSKUProperty> skuPropertyList) {
    this.skuPropertyList = skuPropertyList;
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
        public AliexpressChoiceProductPostOneStopServiceProductSkuScItemInfoDTO getScItemInfoDto() {
    return this.scItemInfoDto;
    }
    public void setScItemInfoDto(AliexpressChoiceProductPostOneStopServiceProductSkuScItemInfoDTO scItemInfoDto) {
    this.scItemInfoDto = scItemInfoDto;
    }
        public List<AliexpressChoiceProductPostOneStopServiceProductSkuWarehouseStockDTO> getWarehouseList() {
    return this.warehouseList;
    }
    public void setWarehouseList(List<AliexpressChoiceProductPostOneStopServiceProductSkuWarehouseStockDTO> warehouseList) {
    this.warehouseList = warehouseList;
    }
    }