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

public class AliexpressOfferDraftproductsGetAeopFindProductListResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品基本信息列表 */
                @ApiListField("aeop_a_e_product_display_d_t_o_list")
            private List<AliexpressOfferDraftproductsGetAeopAEProductDisplaySampleDTO> aeopAEProductDisplayDTOList;
        /** 当前页 */
                @ApiField("current_page")
            private Long currentPage;
        /** 总商品数 */
                @ApiField("product_count")
            private Long productCount;
        /** 总页数 */
                @ApiField("total_page")
            private Long totalPage;
    
        public List<AliexpressOfferDraftproductsGetAeopAEProductDisplaySampleDTO> getAeopAEProductDisplayDTOList() {
    return this.aeopAEProductDisplayDTOList;
    }
    public void setAeopAEProductDisplayDTOList(List<AliexpressOfferDraftproductsGetAeopAEProductDisplaySampleDTO> aeopAEProductDisplayDTOList) {
    this.aeopAEProductDisplayDTOList = aeopAEProductDisplayDTOList;
    }
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
        public Long getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Long productCount) {
    this.productCount = productCount;
    }
        public Long getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
    }
    }