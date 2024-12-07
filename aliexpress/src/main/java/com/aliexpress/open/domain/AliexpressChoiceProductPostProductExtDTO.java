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

public class AliexpressChoiceProductPostProductExtDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 资质信息 */
                @ApiListField("aeop_qualification_struct_list")
            private List<AliexpressChoiceProductPostAeopQualificationStructDTO> aeopQualificationStructList;
        /** 特殊商品类型，目前只支持两种类型的商品发布  ：弱磁 ：240003 ；  内电 ：239818 */
                @ApiListField("special_product_type_list")
            private List<String> specialProductTypeList;
        /** 欧盟责任人id，需要调用查询欧盟责任人列表接口：aliexpress.category.eu.responsible.persons.list，获取对应的欧盟责任人列表 */
                @ApiField("msr_eu_id")
            private Long msrEuId;
        /** 产品所关联的尺码模版ID */
                @ApiField("size_chart_id")
            private Long sizeChartId;
        /** 全托管商品备货类型， 仓发：0  ；   即时补货（JIT）：1  ；    海外备仓：2 。 */
                @ApiField("product_type")
            private String productType;
    
        public List<AliexpressChoiceProductPostAeopQualificationStructDTO> getAeopQualificationStructList() {
    return this.aeopQualificationStructList;
    }
    public void setAeopQualificationStructList(List<AliexpressChoiceProductPostAeopQualificationStructDTO> aeopQualificationStructList) {
    this.aeopQualificationStructList = aeopQualificationStructList;
    }
        public List<String> getSpecialProductTypeList() {
    return this.specialProductTypeList;
    }
    public void setSpecialProductTypeList(List<String> specialProductTypeList) {
    this.specialProductTypeList = specialProductTypeList;
    }
        public Long getMsrEuId() {
    return this.msrEuId;
    }
    public void setMsrEuId(Long msrEuId) {
    this.msrEuId = msrEuId;
    }
        public Long getSizeChartId() {
    return this.sizeChartId;
    }
    public void setSizeChartId(Long sizeChartId) {
    this.sizeChartId = sizeChartId;
    }
        public String getProductType() {
    return this.productType;
    }
    public void setProductType(String productType) {
    this.productType = productType;
    }
    }