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

public class AeMerchantAssortmentSellerPlanChanceListPageInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 现在第几页 */
                @ApiField("current")
            private Integer current;
        /** 一共多少页 */
                @ApiField("total")
            private Integer total;
        /** 每页多少 */
                @ApiField("page_size")
            private Integer pageSize;
    
        public Integer getCurrent() {
    return this.current;
    }
    public void setCurrent(Integer current) {
    this.current = current;
    }
        public Integer getTotal() {
    return this.total;
    }
    public void setTotal(Integer total) {
    this.total = total;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
    }