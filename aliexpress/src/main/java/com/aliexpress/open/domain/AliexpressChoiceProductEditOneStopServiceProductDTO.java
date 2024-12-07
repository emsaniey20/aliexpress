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

public class AliexpressChoiceProductEditOneStopServiceProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 扩展信息 */
                @ApiField("product_ext_dto")
            private AliexpressChoiceProductEditProductExtDTO productExtDto;
        /** 商品属性列表 */
                @ApiListField("product_property_list")
            private List<AliexpressChoiceProductEditProductProperty> productPropertyList;
        /** 详描列表 */
                @ApiListField("detail_source_list")
            private List<AliexpressChoiceProductEditDetailSource> detailSourceList;
        /** 媒体信息 */
                @ApiField("multimedia")
            private AliexpressChoiceProductEditMultimedia multimedia;
        /** sku列表 */
                @ApiListField("product_sku_list")
            private List<AliexpressChoiceProductEditOneStopServiceProductSku> productSkuList;
        /** 包裹信息 */
                @ApiField("package_dto")
            private AliexpressChoiceProductEditAeopPackageDTO packageDto;
        /** 商品基本信息 */
                @ApiField("product_info_dto")
            private AliexpressChoiceProductEditAeopProductInfoDTO productInfoDto;
    
        public AliexpressChoiceProductEditProductExtDTO getProductExtDto() {
    return this.productExtDto;
    }
    public void setProductExtDto(AliexpressChoiceProductEditProductExtDTO productExtDto) {
    this.productExtDto = productExtDto;
    }
        public List<AliexpressChoiceProductEditProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<AliexpressChoiceProductEditProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
    }
        public List<AliexpressChoiceProductEditDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<AliexpressChoiceProductEditDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
        public AliexpressChoiceProductEditMultimedia getMultimedia() {
    return this.multimedia;
    }
    public void setMultimedia(AliexpressChoiceProductEditMultimedia multimedia) {
    this.multimedia = multimedia;
    }
        public List<AliexpressChoiceProductEditOneStopServiceProductSku> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<AliexpressChoiceProductEditOneStopServiceProductSku> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public AliexpressChoiceProductEditAeopPackageDTO getPackageDto() {
    return this.packageDto;
    }
    public void setPackageDto(AliexpressChoiceProductEditAeopPackageDTO packageDto) {
    this.packageDto = packageDto;
    }
        public AliexpressChoiceProductEditAeopProductInfoDTO getProductInfoDto() {
    return this.productInfoDto;
    }
    public void setProductInfoDto(AliexpressChoiceProductEditAeopProductInfoDTO productInfoDto) {
    this.productInfoDto = productInfoDto;
    }
    }