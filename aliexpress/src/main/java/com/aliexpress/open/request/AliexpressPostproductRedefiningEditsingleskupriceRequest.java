package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  aliexpress.postproduct.redefining.editsingleskuprice
*/
public class AliexpressPostproductRedefiningEditsingleskupriceRequest extends BaseGopRequest<AliexpressPostproductRedefiningEditsingleskupriceResponse> {

    /** 需修改编辑的商品ID */
    private Long productId;
    /** 需修改编辑的商品单个SKU对应的id值。id可以通过商品查询接口：aliexpress.offer.product.query 中的aeop_ae_product_s_k_us列表中各个sku对象中“id”字段值进行获取, 没有sku销售属性的商品其id必须回传“<none>”值 */
    private String skuId;
    /** 修改编辑后的商品价格 */
    private String skuPrice;
    /** 修改编辑后的商品促销价格 */
    private String salePrice;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getSkuId(){
        return this.skuId;
    }
    public void setSkuId(String skuId){
        this.skuId = skuId;
        }
    public String getSkuPrice(){
        return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice){
        this.skuPrice = skuPrice;
        }
    public String getSalePrice(){
        return this.salePrice;
    }
    public void setSalePrice(String salePrice){
        this.salePrice = salePrice;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.editsingleskuprice";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (skuId != null) {
                        super.addApiParameter("sku_id", skuId.toString());
                    }
                            if (skuPrice != null) {
                        super.addApiParameter("sku_price", skuPrice.toString());
                    }
                            if (salePrice != null) {
                        super.addApiParameter("sale_price", salePrice.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningEditsingleskupriceResponse> getResponseClass() {
        return AliexpressPostproductRedefiningEditsingleskupriceResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}