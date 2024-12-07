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

public class AliexpressAffiliateImageSearchTrafficImageSearchResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** products */
                @ApiListField("products")
            private List<AliexpressAffiliateImageSearchTrafficImageProductDTO> products;
        /** Total Record Count */
                @ApiField("total_record_count")
            private Long totalRecordCount;
        /** Coordinates of image recognition */
                @ApiField("region")
            private AliexpressAffiliateImageSearchProductImgRegionDTO region;
    
        public List<AliexpressAffiliateImageSearchTrafficImageProductDTO> getProducts() {
    return this.products;
    }
    public void setProducts(List<AliexpressAffiliateImageSearchTrafficImageProductDTO> products) {
    this.products = products;
    }
        public Long getTotalRecordCount() {
    return this.totalRecordCount;
    }
    public void setTotalRecordCount(Long totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    }
        public AliexpressAffiliateImageSearchProductImgRegionDTO getRegion() {
    return this.region;
    }
    public void setRegion(AliexpressAffiliateImageSearchProductImgRegionDTO region) {
    this.region = region;
    }
    }