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

public class AeMerchantAssortmentSellerPlanChanceListAdminWebResponseVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 页面信息 */
                @ApiField("page_info")
            private AeMerchantAssortmentSellerPlanChanceListPageInfo pageInfo;
        /** 数据 */
                @ApiListField("data_source")
            private List<AeMerchantAssortmentSellerPlanChanceListMotorcyclePlanChanceVO> dataSource;
    
        public AeMerchantAssortmentSellerPlanChanceListPageInfo getPageInfo() {
    return this.pageInfo;
    }
    public void setPageInfo(AeMerchantAssortmentSellerPlanChanceListPageInfo pageInfo) {
    this.pageInfo = pageInfo;
    }
        public List<AeMerchantAssortmentSellerPlanChanceListMotorcyclePlanChanceVO> getDataSource() {
    return this.dataSource;
    }
    public void setDataSource(List<AeMerchantAssortmentSellerPlanChanceListMotorcyclePlanChanceVO> dataSource) {
    this.dataSource = dataSource;
    }
    }