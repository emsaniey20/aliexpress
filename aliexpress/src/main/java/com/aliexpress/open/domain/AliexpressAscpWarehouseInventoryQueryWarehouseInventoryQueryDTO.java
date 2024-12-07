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

public class AliexpressAscpWarehouseInventoryQueryWarehouseInventoryQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 账套编码 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 库存类型（1 良品，101 残品） */
                @ApiField("inventory_type")
            private Integer inventoryType;
        /** 分页页码 */
                @ApiField("page_index")
            private Long pageIndex;
        /** 分页大小，最大30 */
                @ApiField("page_size")
            private Long pageSize;
        /** 货品列表，最多30个 */
                @ApiListField("sc_item_id_list")
            private List<Long> scItemIdList;
        /** 仓编码 */
                @ApiField("store_code")
            private String storeCode;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Integer getInventoryType() {
    return this.inventoryType;
    }
    public void setInventoryType(Integer inventoryType) {
    this.inventoryType = inventoryType;
    }
        public Long getPageIndex() {
    return this.pageIndex;
    }
    public void setPageIndex(Long pageIndex) {
    this.pageIndex = pageIndex;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public List<Long> getScItemIdList() {
    return this.scItemIdList;
    }
    public void setScItemIdList(List<Long> scItemIdList) {
    this.scItemIdList = scItemIdList;
    }
        public String getStoreCode() {
    return this.storeCode;
    }
    public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
    }
    }