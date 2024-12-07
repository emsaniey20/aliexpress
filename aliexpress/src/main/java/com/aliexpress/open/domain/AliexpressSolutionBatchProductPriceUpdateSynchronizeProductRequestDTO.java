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

public class AliexpressSolutionBatchProductPriceUpdateSynchronizeProductRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** product id */
                @ApiField("product_id")
            private Long productId;
        /** The sku list, in which the inventory needs to be updated within the same product id */
                @ApiListField("multiple_sku_update_list")
            private List<AliexpressSolutionBatchProductPriceUpdateSynchronizeSkuRequestDTO> multipleSkuUpdateList;
        /** multi country price configuration */
                @ApiField("multi_country_price_configuration")
            private AliexpressSolutionBatchProductPriceUpdateMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration;
    
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public List<AliexpressSolutionBatchProductPriceUpdateSynchronizeSkuRequestDTO> getMultipleSkuUpdateList() {
    return this.multipleSkuUpdateList;
    }
    public void setMultipleSkuUpdateList(List<AliexpressSolutionBatchProductPriceUpdateSynchronizeSkuRequestDTO> multipleSkuUpdateList) {
    this.multipleSkuUpdateList = multipleSkuUpdateList;
    }
        public AliexpressSolutionBatchProductPriceUpdateMultiCountryPriceConfigurationDTO getMultiCountryPriceConfiguration() {
    return this.multiCountryPriceConfiguration;
    }
    public void setMultiCountryPriceConfiguration(AliexpressSolutionBatchProductPriceUpdateMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration) {
    this.multiCountryPriceConfiguration = multiCountryPriceConfiguration;
    }
    }