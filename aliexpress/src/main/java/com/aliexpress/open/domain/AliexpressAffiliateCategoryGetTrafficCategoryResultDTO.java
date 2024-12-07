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

public class AliexpressAffiliateCategoryGetTrafficCategoryResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** category */
                @ApiListField("categories")
            private List<AliexpressAffiliateCategoryGetCategoryDTO> categories;
        /** Respond result count */
                @ApiField("total_result_count")
            private Long totalResultCount;
    
        public List<AliexpressAffiliateCategoryGetCategoryDTO> getCategories() {
    return this.categories;
    }
    public void setCategories(List<AliexpressAffiliateCategoryGetCategoryDTO> categories) {
    this.categories = categories;
    }
        public Long getTotalResultCount() {
    return this.totalResultCount;
    }
    public void setTotalResultCount(Long totalResultCount) {
    this.totalResultCount = totalResultCount;
    }
    }