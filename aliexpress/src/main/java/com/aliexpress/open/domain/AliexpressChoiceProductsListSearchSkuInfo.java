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

public class AliexpressChoiceProductsListSearchSkuInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku供货价 */
                @ApiField("supply_price")
            private String supplyPrice;
        /** sku审核状态 ，  1 或空 ：表示审核通过 ， 其余都是审核不通过。 当商品供货价审核不通过的时候才会存在，用来区分哪个sku的供货价审核不通过，与 suggest_price 和suggest_note 配合使用。 */
                @ApiField("sku_audit_status")
            private String skuAuditStatus;
        /** sku总库存 */
                @ApiField("sku_stock")
            private Long skuStock;
        /** sku 按照仓查询库存 */
                @ApiListField("sku_warehouse_stock_list")
            private List<AliexpressChoiceProductsListProductSkuWarehouseStockDTO> skuWarehouseStockList;
        /** 卖家订单的sku 编码： sku_code */
                @ApiField("seller_sku")
            private String sellerSku;
        /** sku_id, 编辑库存的时候使用，sku的唯一标识 */
                @ApiField("sku_id")
            private Long skuId;
        /** sku属性串 */
                @ApiField("variation")
            private String variation;
        /** 审核不通过：建议供货价 */
                @ApiField("suggest_price")
            private String suggestPrice;
        /** 审核不通过：建议标签 */
                @ApiField("suggest_note")
            private String suggestNote;
        /** 是否销售，active：销售， inactive ：不销售 */
                @ApiField("status")
            private String status;
        /** 绑定的货品信息 */
                @ApiField("product_sku_sc_item_info_dto")
            private AliexpressChoiceProductsListProductSkuScItemInfoDTO productSkuScItemInfoDto;
    
        public String getSupplyPrice() {
    return this.supplyPrice;
    }
    public void setSupplyPrice(String supplyPrice) {
    this.supplyPrice = supplyPrice;
    }
        public String getSkuAuditStatus() {
    return this.skuAuditStatus;
    }
    public void setSkuAuditStatus(String skuAuditStatus) {
    this.skuAuditStatus = skuAuditStatus;
    }
        public Long getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Long skuStock) {
    this.skuStock = skuStock;
    }
        public List<AliexpressChoiceProductsListProductSkuWarehouseStockDTO> getSkuWarehouseStockList() {
    return this.skuWarehouseStockList;
    }
    public void setSkuWarehouseStockList(List<AliexpressChoiceProductsListProductSkuWarehouseStockDTO> skuWarehouseStockList) {
    this.skuWarehouseStockList = skuWarehouseStockList;
    }
        public String getSellerSku() {
    return this.sellerSku;
    }
    public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public String getVariation() {
    return this.variation;
    }
    public void setVariation(String variation) {
    this.variation = variation;
    }
        public String getSuggestPrice() {
    return this.suggestPrice;
    }
    public void setSuggestPrice(String suggestPrice) {
    this.suggestPrice = suggestPrice;
    }
        public String getSuggestNote() {
    return this.suggestNote;
    }
    public void setSuggestNote(String suggestNote) {
    this.suggestNote = suggestNote;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public AliexpressChoiceProductsListProductSkuScItemInfoDTO getProductSkuScItemInfoDto() {
    return this.productSkuScItemInfoDto;
    }
    public void setProductSkuScItemInfoDto(AliexpressChoiceProductsListProductSkuScItemInfoDTO productSkuScItemInfoDto) {
    this.productSkuScItemInfoDto = productSkuScItemInfoDto;
    }
    }