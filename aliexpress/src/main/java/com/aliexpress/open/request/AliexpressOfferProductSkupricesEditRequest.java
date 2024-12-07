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
*  aliexpress.offer.product.skuprices.edit
*/
public class AliexpressOfferProductSkupricesEditRequest extends BaseGopRequest<AliexpressOfferProductSkupricesEditResponse> {

    /** 商品id */
    private Long productId;
    /** 商品sku与价格映射表。 SKU的价格信息(一个或着多个),格式{"id1":price1,"id2":price2}； 其中id可以通过商品查询接口：aliexpress.offer.product.query 中的aeop_ae_product_s_k_us列表中各个sku对象中“id”字段值进行获取, 没有sku销售属性的商品其id必须回传“<none>”值，例如：{ "<none>": "0.6"} */
    private HashMap<String, Object> skuIdPriceMap;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public HashMap<String, Object> getSkuIdPriceMap(){
        return this.skuIdPriceMap;
    }
    public void setSkuIdPriceMap(HashMap<String, Object> skuIdPriceMap){
        this.skuIdPriceMap = skuIdPriceMap;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.product.skuprices.edit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (skuIdPriceMap != null) {
                        super.addApiParameter("sku_id_price_map", new JSONWriter(true, false).write(skuIdPriceMap));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferProductSkupricesEditResponse> getResponseClass() {
        return AliexpressOfferProductSkupricesEditResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}