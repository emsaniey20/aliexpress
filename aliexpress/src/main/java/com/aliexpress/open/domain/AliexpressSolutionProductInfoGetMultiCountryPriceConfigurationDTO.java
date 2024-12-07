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

public class AliexpressSolutionProductInfoGetMultiCountryPriceConfigurationDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** price type */
                @ApiField("price_type")
            private String priceType;
        /** Price list for different countries */
                @ApiListField("country_price_list")
            private List<AliexpressSolutionProductInfoGetSingleCountryPriceDTO> countryPriceList;
    
        public String getPriceType() {
    return this.priceType;
    }
    public void setPriceType(String priceType) {
    this.priceType = priceType;
    }
        public List<AliexpressSolutionProductInfoGetSingleCountryPriceDTO> getCountryPriceList() {
    return this.countryPriceList;
    }
    public void setCountryPriceList(List<AliexpressSolutionProductInfoGetSingleCountryPriceDTO> countryPriceList) {
    this.countryPriceList = countryPriceList;
    }
    }