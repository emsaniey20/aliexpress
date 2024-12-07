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

public class AliexpressDsProductGetAeItemQueryResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Logistics information */
                @ApiField("logistics_info_dto")
            private AliexpressDsProductGetLogisticsInfoDTO logisticsInfoDto;
        /** Basic commodity information */
                @ApiField("ae_item_base_info_dto")
            private AliexpressDsProductGetAeItemBaseInfoDTO aeItemBaseInfoDto;
        /** Attribute information */
                @ApiListField("ae_item_properties")
            private List<AliexpressDsProductGetAeItemProperty> aeItemProperties;
        /** SKU information */
                @ApiListField("ae_item_sku_info_dtos")
            private List<AliexpressDsProductGetAeItemSkuInfoDTO> aeItemSkuInfoDtos;
        /** Multimedia information */
                @ApiField("ae_multimedia_info_dto")
            private AliexpressDsProductGetAeMultimediaInfoDTO aeMultimediaInfoDto;
        /** Package information */
                @ApiField("package_info_dto")
            private AliexpressDsProductGetPackageInfoDTO packageInfoDto;
        /** Store Information */
                @ApiField("ae_store_info")
            private AliexpressDsProductGetAeStoreInfo aeStoreInfo;
        /** product id converter result */
                @ApiField("product_id_converter_result")
            private AliexpressDsProductGetProductIdConverterResultDTO productIdConverterResult;
    
        public AliexpressDsProductGetLogisticsInfoDTO getLogisticsInfoDto() {
    return this.logisticsInfoDto;
    }
    public void setLogisticsInfoDto(AliexpressDsProductGetLogisticsInfoDTO logisticsInfoDto) {
    this.logisticsInfoDto = logisticsInfoDto;
    }
        public AliexpressDsProductGetAeItemBaseInfoDTO getAeItemBaseInfoDto() {
    return this.aeItemBaseInfoDto;
    }
    public void setAeItemBaseInfoDto(AliexpressDsProductGetAeItemBaseInfoDTO aeItemBaseInfoDto) {
    this.aeItemBaseInfoDto = aeItemBaseInfoDto;
    }
        public List<AliexpressDsProductGetAeItemProperty> getAeItemProperties() {
    return this.aeItemProperties;
    }
    public void setAeItemProperties(List<AliexpressDsProductGetAeItemProperty> aeItemProperties) {
    this.aeItemProperties = aeItemProperties;
    }
        public List<AliexpressDsProductGetAeItemSkuInfoDTO> getAeItemSkuInfoDtos() {
    return this.aeItemSkuInfoDtos;
    }
    public void setAeItemSkuInfoDtos(List<AliexpressDsProductGetAeItemSkuInfoDTO> aeItemSkuInfoDtos) {
    this.aeItemSkuInfoDtos = aeItemSkuInfoDtos;
    }
        public AliexpressDsProductGetAeMultimediaInfoDTO getAeMultimediaInfoDto() {
    return this.aeMultimediaInfoDto;
    }
    public void setAeMultimediaInfoDto(AliexpressDsProductGetAeMultimediaInfoDTO aeMultimediaInfoDto) {
    this.aeMultimediaInfoDto = aeMultimediaInfoDto;
    }
        public AliexpressDsProductGetPackageInfoDTO getPackageInfoDto() {
    return this.packageInfoDto;
    }
    public void setPackageInfoDto(AliexpressDsProductGetPackageInfoDTO packageInfoDto) {
    this.packageInfoDto = packageInfoDto;
    }
        public AliexpressDsProductGetAeStoreInfo getAeStoreInfo() {
    return this.aeStoreInfo;
    }
    public void setAeStoreInfo(AliexpressDsProductGetAeStoreInfo aeStoreInfo) {
    this.aeStoreInfo = aeStoreInfo;
    }
        public AliexpressDsProductGetProductIdConverterResultDTO getProductIdConverterResult() {
    return this.productIdConverterResult;
    }
    public void setProductIdConverterResult(AliexpressDsProductGetProductIdConverterResultDTO productIdConverterResult) {
    this.productIdConverterResult = productIdConverterResult;
    }
    }