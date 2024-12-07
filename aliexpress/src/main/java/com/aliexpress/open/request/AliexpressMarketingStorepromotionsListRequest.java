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
*  aliexpress.marketing.storepromotions.list
*/
public class AliexpressMarketingStorepromotionsListRequest extends BaseGopRequest<AliexpressMarketingStorepromotionsListResponse> {

    /** 查询参数 */
    private AliexpressMarketingStorepromotionsListPromotionQueryDTO promotionQueryDto;

    public AliexpressMarketingStorepromotionsListPromotionQueryDTO getPromotionQueryDto(){
        return this.promotionQueryDto;
    }
    public void setPromotionQueryDto(AliexpressMarketingStorepromotionsListPromotionQueryDTO promotionQueryDto){
        this.promotionQueryDto = promotionQueryDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.storepromotions.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (promotionQueryDto != null) {
                        super.addApiParameter("promotion_query_dto", new JSONWriter(true, false).write(promotionQueryDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingStorepromotionsListResponse> getResponseClass() {
        return AliexpressMarketingStorepromotionsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}