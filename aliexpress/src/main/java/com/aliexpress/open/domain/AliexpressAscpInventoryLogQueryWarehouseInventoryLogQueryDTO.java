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

public class AliexpressAscpInventoryLogQueryWarehouseInventoryLogQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务类型(PO0  普通采购,ADJ0 报废,ADJ1 盘点调整,ADJ2 状态调整,SO0  TOC销售,SO1  TOB销售,SO4  TOC补发,RTV0 普通采购退货,RSO0 TOC销售退货,SYS1 系统调账) */
                @ApiField("biz_activity_type")
            private String bizActivityType;
        /** 交易主单号 */
                @ApiField("biz_trade_id")
            private String bizTradeId;
        /** 账套编码 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 出入库开始时间，ms级 */
                @ApiField("gmt_create_end")
            private Long gmtCreateEnd;
        /** 出入库截止时间，ms级 */
                @ApiField("gmt_create_start")
            private Long gmtCreateStart;
        /** 库存类型(1 良品，101 残品) */
                @ApiField("inventory_type")
            private Integer inventoryType;
        /** 业务主单号 */
                @ApiField("operation_order_id")
            private String operationOrderId;
        /** 分页页码 */
                @ApiField("page_index")
            private Long pageIndex;
        /** 分页大小，最大200 */
                @ApiField("page_size")
            private Long pageSize;
        /** 货品ID */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 仓编码 */
                @ApiField("store_code")
            private String storeCode;
    
        public String getBizActivityType() {
    return this.bizActivityType;
    }
    public void setBizActivityType(String bizActivityType) {
    this.bizActivityType = bizActivityType;
    }
        public String getBizTradeId() {
    return this.bizTradeId;
    }
    public void setBizTradeId(String bizTradeId) {
    this.bizTradeId = bizTradeId;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Long getGmtCreateEnd() {
    return this.gmtCreateEnd;
    }
    public void setGmtCreateEnd(Long gmtCreateEnd) {
    this.gmtCreateEnd = gmtCreateEnd;
    }
        public Long getGmtCreateStart() {
    return this.gmtCreateStart;
    }
    public void setGmtCreateStart(Long gmtCreateStart) {
    this.gmtCreateStart = gmtCreateStart;
    }
        public Integer getInventoryType() {
    return this.inventoryType;
    }
    public void setInventoryType(Integer inventoryType) {
    this.inventoryType = inventoryType;
    }
        public String getOperationOrderId() {
    return this.operationOrderId;
    }
    public void setOperationOrderId(String operationOrderId) {
    this.operationOrderId = operationOrderId;
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
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getStoreCode() {
    return this.storeCode;
    }
    public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
    }
    }