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
*  aliexpress.marketing.storepromotion.products.query
*/
public class AliexpressMarketingStorepromotionProductsQueryRequest extends BaseGopRequest<AliexpressMarketingStorepromotionProductsQueryResponse> {

    /** 入参 */
    private AliexpressMarketingStorepromotionProductsQueryPromotionProductQueryDTO promotionProductQueryDto;

    public AliexpressMarketingStorepromotionProductsQueryPromotionProductQueryDTO getPromotionProductQueryDto(){
        return this.promotionProductQueryDto;
    }
    public void setPromotionProductQueryDto(AliexpressMarketingStorepromotionProductsQueryPromotionProductQueryDTO promotionProductQueryDto){
        this.promotionProductQueryDto = promotionProductQueryDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.storepromotion.products.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (promotionProductQueryDto != null) {
                        super.addApiParameter("promotion_product_query_dto", new JSONWriter(true, false).write(promotionProductQueryDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingStorepromotionProductsQueryResponse> getResponseClass() {
        return AliexpressMarketingStorepromotionProductsQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}