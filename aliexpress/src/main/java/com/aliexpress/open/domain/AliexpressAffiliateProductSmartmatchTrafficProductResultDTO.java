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

public class AliexpressAffiliateProductSmartmatchTrafficProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Current page number */
                @ApiField("current_page_no")
            private Long currentPageNo;
        /** Current record count of return */
                @ApiField("current_record_count")
            private Long currentRecordCount;
        /** Product list */
                @ApiListField("products")
            private List<AliexpressAffiliateProductSmartmatchTrafficProductDTO> products;
    
        public Long getCurrentPageNo() {
    return this.currentPageNo;
    }
    public void setCurrentPageNo(Long currentPageNo) {
    this.currentPageNo = currentPageNo;
    }
        public Long getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Long currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public List<AliexpressAffiliateProductSmartmatchTrafficProductDTO> getProducts() {
    return this.products;
    }
    public void setProducts(List<AliexpressAffiliateProductSmartmatchTrafficProductDTO> products) {
    this.products = products;
    }
    }