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
*  aliexpress.offer.product.query
*/
public class AliexpressOfferProductQueryRequest extends BaseGopRequest<AliexpressOfferProductQueryResponse> {

    /** 商品ID, 单一商家查询商品详情的 QPS是有限流。 一个商家下的商品查询 每秒最大调用次数不能超过20个请求。 */
    private Long productId;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.product.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferProductQueryResponse> getResponseClass() {
        return AliexpressOfferProductQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}