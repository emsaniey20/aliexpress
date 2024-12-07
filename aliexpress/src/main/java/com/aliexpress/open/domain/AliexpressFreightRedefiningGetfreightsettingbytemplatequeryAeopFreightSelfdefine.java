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

public class AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSelfdefine implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 自定义的方式（按件/按重） */
                @ApiField("custom_freight_type")
            private String customFreightType;
        /** 起始采购量 */
                @ApiField("start_order_num")
            private Long startOrderNum;
        /** 自定义按重内容 */
                @ApiListField("self_define_weight_list")
            private List<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSelfdefineWeight> selfDefineWeightList;
        /** 自定义运送国家 */
                @ApiField("shipping_country")
            private String shippingCountry;
        /** 最低报价 */
                @ApiField("min_freight")
            private Long minFreight;
        /** 截至采购量 */
                @ApiField("end_order_num")
            private Long endOrderNum;
        /** 续增运费 */
                @ApiField("add_freight")
            private Long addFreight;
        /** 每增加定额产品采购量 */
                @ApiField("per_add_num")
            private Long perAddNum;
    
        public String getCustomFreightType() {
    return this.customFreightType;
    }
    public void setCustomFreightType(String customFreightType) {
    this.customFreightType = customFreightType;
    }
        public Long getStartOrderNum() {
    return this.startOrderNum;
    }
    public void setStartOrderNum(Long startOrderNum) {
    this.startOrderNum = startOrderNum;
    }
        public List<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSelfdefineWeight> getSelfDefineWeightList() {
    return this.selfDefineWeightList;
    }
    public void setSelfDefineWeightList(List<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSelfdefineWeight> selfDefineWeightList) {
    this.selfDefineWeightList = selfDefineWeightList;
    }
        public String getShippingCountry() {
    return this.shippingCountry;
    }
    public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    }
        public Long getMinFreight() {
    return this.minFreight;
    }
    public void setMinFreight(Long minFreight) {
    this.minFreight = minFreight;
    }
        public Long getEndOrderNum() {
    return this.endOrderNum;
    }
    public void setEndOrderNum(Long endOrderNum) {
    this.endOrderNum = endOrderNum;
    }
        public Long getAddFreight() {
    return this.addFreight;
    }
    public void setAddFreight(Long addFreight) {
    this.addFreight = addFreight;
    }
        public Long getPerAddNum() {
    return this.perAddNum;
    }
    public void setPerAddNum(Long perAddNum) {
    this.perAddNum = perAddNum;
    }
    }