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
*  aliexpress.postproduct.redefining.editmutilpleskustocks
*/
public class AliexpressPostproductRedefiningEditmutilpleskustocksRequest extends BaseGopRequest<AliexpressPostproductRedefiningEditmutilpleskustocksResponse> {

    /** 产品ID */
    private Long productId;
    /** SKU的库存信息(一个或着多个),格式{"id":number1,"id":number2}。number为要编辑的可售库存数量。其中id可以通过商品查询接口：aliexpress.offer.product.query 中的aeop_ae_product_s_k_us列表中各个sku对象中“id”字段值进行获取, 没有sku销售属性的商品其id必须回传“<none>”值，例如：{"<none>":240} */
    private HashMap<String, Object> skuStocks;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public HashMap<String, Object> getSkuStocks(){
        return this.skuStocks;
    }
    public void setSkuStocks(HashMap<String, Object> skuStocks){
        this.skuStocks = skuStocks;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.editmutilpleskustocks";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (skuStocks != null) {
                        super.addApiParameter("sku_stocks", new JSONWriter(true, false).write(skuStocks));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningEditmutilpleskustocksResponse> getResponseClass() {
        return AliexpressPostproductRedefiningEditmutilpleskustocksResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}