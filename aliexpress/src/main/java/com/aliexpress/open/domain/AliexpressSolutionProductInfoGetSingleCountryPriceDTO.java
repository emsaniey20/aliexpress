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

public class AliexpressSolutionProductInfoGetSingleCountryPriceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** ship to country */
                @ApiField("ship_to_country")
            private String shipToCountry;
        /** Sku price list under the same ship_to_country */
                @ApiListField("sku_price_by_country_list")
            private List<AliexpressSolutionProductInfoGetSingleSkuPriceByCountryDTO> skuPriceByCountryList;
    
        public String getShipToCountry() {
    return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    }
        public List<AliexpressSolutionProductInfoGetSingleSkuPriceByCountryDTO> getSkuPriceByCountryList() {
    return this.skuPriceByCountryList;
    }
    public void setSkuPriceByCountryList(List<AliexpressSolutionProductInfoGetSingleSkuPriceByCountryDTO> skuPriceByCountryList) {
    this.skuPriceByCountryList = skuPriceByCountryList;
    }
    }