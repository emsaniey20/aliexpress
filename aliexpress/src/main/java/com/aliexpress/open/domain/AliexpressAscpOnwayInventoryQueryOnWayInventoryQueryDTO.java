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

public class AliexpressAscpOnwayInventoryQueryOnWayInventoryQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 账套编码 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 入库仓编码 */
                @ApiField("inbound_store_code")
            private String inboundStoreCode;
        /** 库存类型(1 采购在途，2 调拨在途，3 销售在途，4 销退在途) */
                @ApiField("inventory_type")
            private Integer inventoryType;
        /** 出库仓编码 */
                @ApiField("outbound_store_code")
            private String outboundStoreCode;
        /** 货品Id列表，最多30个 */
                @ApiListField("sc_item_id_list")
            private List<Long> scItemIdList;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public String getInboundStoreCode() {
    return this.inboundStoreCode;
    }
    public void setInboundStoreCode(String inboundStoreCode) {
    this.inboundStoreCode = inboundStoreCode;
    }
        public Integer getInventoryType() {
    return this.inventoryType;
    }
    public void setInventoryType(Integer inventoryType) {
    this.inventoryType = inventoryType;
    }
        public String getOutboundStoreCode() {
    return this.outboundStoreCode;
    }
    public void setOutboundStoreCode(String outboundStoreCode) {
    this.outboundStoreCode = outboundStoreCode;
    }
        public List<Long> getScItemIdList() {
    return this.scItemIdList;
    }
    public void setScItemIdList(List<Long> scItemIdList) {
    this.scItemIdList = scItemIdList;
    }
    }