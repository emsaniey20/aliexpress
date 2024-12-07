package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  aliexpress.offer.ds.product.simplequery
*/
public class AliexpressOfferDsProductSimplequeryResponse extends IopResponse {

    /** 商品的SKU信息 */
        @ApiListField("aeop_ae_product_s_k_us")
        private List<AliexpressOfferDsProductSimplequeryAeopAEProductSKU> aeopAeProductSKUs;
    /** 产品的状态 */
        @ApiField("product_status_type")
        private String productStatusType;
    /** 网站折扣后价格 */
        @ApiField("item_offer_site_sale_price")
        private String itemOfferSiteSalePrice;
    /** 库存 */
        @ApiField("total_available_stock")
        private Long totalAvailableStock;

public List<AliexpressOfferDsProductSimplequeryAeopAEProductSKU> getAeopAeProductSKUs(){
return this.aeopAeProductSKUs;
}
public void setAeopAeProductSKUs(List<AliexpressOfferDsProductSimplequeryAeopAEProductSKU> aeopAeProductSKUs){
    this.aeopAeProductSKUs = aeopAeProductSKUs;
}
public String getProductStatusType(){
return this.productStatusType;
}
public void setProductStatusType(String productStatusType){
    this.productStatusType = productStatusType;
}
public String getItemOfferSiteSalePrice(){
return this.itemOfferSiteSalePrice;
}
public void setItemOfferSiteSalePrice(String itemOfferSiteSalePrice){
    this.itemOfferSiteSalePrice = itemOfferSiteSalePrice;
}
public Long getTotalAvailableStock(){
return this.totalAvailableStock;
}
public void setTotalAvailableStock(Long totalAvailableStock){
    this.totalAvailableStock = totalAvailableStock;
}

}