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

public class AliexpressSolutionBatchProductPriceUpdateSingleCountryPriceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Sku price list under the same ship_to_country */
                @ApiListField("sku_price_by_country_list")
            private List<AliexpressSolutionBatchProductPriceUpdateSingleSkuPriceByCountryDTO> skuPriceByCountryList;
        /** Currently supporting RU US CA ES FR UK NL IL BR CL AU UA BY JP TH SG KR ID MY PH VN IT DE SA AE PL TR */
                @ApiField("ship_to_country")
            private String shipToCountry;
    
        public List<AliexpressSolutionBatchProductPriceUpdateSingleSkuPriceByCountryDTO> getSkuPriceByCountryList() {
    return this.skuPriceByCountryList;
    }
    public void setSkuPriceByCountryList(List<AliexpressSolutionBatchProductPriceUpdateSingleSkuPriceByCountryDTO> skuPriceByCountryList) {
    this.skuPriceByCountryList = skuPriceByCountryList;
    }
        public String getShipToCountry() {
    return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    }
    }