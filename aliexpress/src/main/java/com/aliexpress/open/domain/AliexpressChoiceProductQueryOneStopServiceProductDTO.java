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

public class AliexpressChoiceProductQueryOneStopServiceProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品的SKU信息 */
                @ApiListField("product_sku_list")
            private List<AliexpressChoiceProductQueryOneStopServiceProductSku> productSkuList;
        /** 商品多媒体信息 */
                @ApiField("multimedia")
            private AliexpressChoiceProductQueryMultimedia multimedia;
        /** 包裹信息 */
                @ApiField("package_dto")
            private AliexpressChoiceProductQueryAeopPackageDTO packageDto;
        /** 扩展信息 */
                @ApiField("product_ext_dto")
            private AliexpressChoiceProductQueryProductExtDTO productExtDto;
        /** 商品基本信息 */
                @ApiField("product_info_dto")
            private AliexpressChoiceProductQueryAeopProductInfoDTO productInfoDto;
        /** 商品属性列表 */
                @ApiListField("product_property_list")
            private List<AliexpressChoiceProductQueryProductProperty> productPropertyList;
        /** 详描列表 */
                @ApiListField("detail_source_list")
            private List<AliexpressChoiceProductQueryDetailSource> detailSourceList;
    
        public List<AliexpressChoiceProductQueryOneStopServiceProductSku> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<AliexpressChoiceProductQueryOneStopServiceProductSku> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public AliexpressChoiceProductQueryMultimedia getMultimedia() {
    return this.multimedia;
    }
    public void setMultimedia(AliexpressChoiceProductQueryMultimedia multimedia) {
    this.multimedia = multimedia;
    }
        public AliexpressChoiceProductQueryAeopPackageDTO getPackageDto() {
    return this.packageDto;
    }
    public void setPackageDto(AliexpressChoiceProductQueryAeopPackageDTO packageDto) {
    this.packageDto = packageDto;
    }
        public AliexpressChoiceProductQueryProductExtDTO getProductExtDto() {
    return this.productExtDto;
    }
    public void setProductExtDto(AliexpressChoiceProductQueryProductExtDTO productExtDto) {
    this.productExtDto = productExtDto;
    }
        public AliexpressChoiceProductQueryAeopProductInfoDTO getProductInfoDto() {
    return this.productInfoDto;
    }
    public void setProductInfoDto(AliexpressChoiceProductQueryAeopProductInfoDTO productInfoDto) {
    this.productInfoDto = productInfoDto;
    }
        public List<AliexpressChoiceProductQueryProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<AliexpressChoiceProductQueryProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
    }
        public List<AliexpressChoiceProductQueryDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<AliexpressChoiceProductQueryDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
    }