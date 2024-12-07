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

public class AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSetting implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 标准运费折扣 */
                @ApiField("standard_shipping_discount")
            private Long standardShippingDiscount;
        /** 完全标准运费折扣 */
                @ApiField("all_standard_discount")
            private Long allStandardDiscount;
        /** 免运费国家 */
                @ApiField("free_shipping_country")
            private String freeShippingCountry;
        /** 标准运费国家 */
                @ApiField("standard_shipping_country")
            private String standardShippingCountry;
        /** 物流公司 */
                @ApiField("logistics_company")
            private String logisticsCompany;
        /** 完全标准运费折扣 */
                @ApiField("all_standard_shipping")
            private String allStandardShipping;
        /** 是否全免费 */
                @ApiField("all_free_shipping")
            private String allFreeShipping;
    
        public Long getStandardShippingDiscount() {
    return this.standardShippingDiscount;
    }
    public void setStandardShippingDiscount(Long standardShippingDiscount) {
    this.standardShippingDiscount = standardShippingDiscount;
    }
        public Long getAllStandardDiscount() {
    return this.allStandardDiscount;
    }
    public void setAllStandardDiscount(Long allStandardDiscount) {
    this.allStandardDiscount = allStandardDiscount;
    }
        public String getFreeShippingCountry() {
    return this.freeShippingCountry;
    }
    public void setFreeShippingCountry(String freeShippingCountry) {
    this.freeShippingCountry = freeShippingCountry;
    }
        public String getStandardShippingCountry() {
    return this.standardShippingCountry;
    }
    public void setStandardShippingCountry(String standardShippingCountry) {
    this.standardShippingCountry = standardShippingCountry;
    }
        public String getLogisticsCompany() {
    return this.logisticsCompany;
    }
    public void setLogisticsCompany(String logisticsCompany) {
    this.logisticsCompany = logisticsCompany;
    }
        public String getAllStandardShipping() {
    return this.allStandardShipping;
    }
    public void setAllStandardShipping(String allStandardShipping) {
    this.allStandardShipping = allStandardShipping;
    }
        public String getAllFreeShipping() {
    return this.allFreeShipping;
    }
    public void setAllFreeShipping(String allFreeShipping) {
    this.allFreeShipping = allFreeShipping;
    }
    }