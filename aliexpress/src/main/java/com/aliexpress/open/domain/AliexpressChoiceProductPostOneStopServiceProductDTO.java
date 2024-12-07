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

public class AliexpressChoiceProductPostOneStopServiceProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 媒体信息 */
                @ApiField("multimedia")
            private AliexpressChoiceProductPostMultimedia multimedia;
        /** sku列表 */
                @ApiListField("product_sku_list")
            private List<AliexpressChoiceProductPostOneStopServiceProductSku> productSkuList;
        /** 包裹信息 */
                @ApiField("package_dto")
            private AliexpressChoiceProductPostAeopPackageDTO packageDto;
        /** 商品基本信息 */
                @ApiField("product_info_dto")
            private AliexpressChoiceProductPostAeopProductInfoDTO productInfoDto;
        /** 扩展信息 */
                @ApiField("product_ext_dto")
            private AliexpressChoiceProductPostProductExtDTO productExtDto;
        /** 商品属性列表 */
                @ApiListField("product_property_list")
            private List<AliexpressChoiceProductPostProductProperty> productPropertyList;
        /** 详描列表 */
                @ApiListField("detail_source_list")
            private List<AliexpressChoiceProductPostDetailSource> detailSourceList;
    
        public AliexpressChoiceProductPostMultimedia getMultimedia() {
    return this.multimedia;
    }
    public void setMultimedia(AliexpressChoiceProductPostMultimedia multimedia) {
    this.multimedia = multimedia;
    }
        public List<AliexpressChoiceProductPostOneStopServiceProductSku> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<AliexpressChoiceProductPostOneStopServiceProductSku> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public AliexpressChoiceProductPostAeopPackageDTO getPackageDto() {
    return this.packageDto;
    }
    public void setPackageDto(AliexpressChoiceProductPostAeopPackageDTO packageDto) {
    this.packageDto = packageDto;
    }
        public AliexpressChoiceProductPostAeopProductInfoDTO getProductInfoDto() {
    return this.productInfoDto;
    }
    public void setProductInfoDto(AliexpressChoiceProductPostAeopProductInfoDTO productInfoDto) {
    this.productInfoDto = productInfoDto;
    }
        public AliexpressChoiceProductPostProductExtDTO getProductExtDto() {
    return this.productExtDto;
    }
    public void setProductExtDto(AliexpressChoiceProductPostProductExtDTO productExtDto) {
    this.productExtDto = productExtDto;
    }
        public List<AliexpressChoiceProductPostProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<AliexpressChoiceProductPostProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
    }
        public List<AliexpressChoiceProductPostDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<AliexpressChoiceProductPostDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
    }