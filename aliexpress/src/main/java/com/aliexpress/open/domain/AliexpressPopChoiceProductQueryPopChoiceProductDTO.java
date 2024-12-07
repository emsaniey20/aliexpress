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

public class AliexpressPopChoiceProductQueryPopChoiceProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 该商品下已勾选参与的国家列表 */
                @ApiListField("joined_country_list")
            private List<String> joinedCountryList;
        /** 该半托管商品下SKU列表 */
                @ApiListField("product_sku_list")
            private List<AliexpressPopChoiceProductQueryPopChoiceProductSkuDTO> productSkuList;
        /** 半托管商品id */
                @ApiField("product_id")
            private Long productId;
        /** 货币码 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 类目id */
                @ApiField("category_id")
            private Long categoryId;
    
        public List<String> getJoinedCountryList() {
    return this.joinedCountryList;
    }
    public void setJoinedCountryList(List<String> joinedCountryList) {
    this.joinedCountryList = joinedCountryList;
    }
        public List<AliexpressPopChoiceProductQueryPopChoiceProductSkuDTO> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<AliexpressPopChoiceProductQueryPopChoiceProductSkuDTO> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
    }