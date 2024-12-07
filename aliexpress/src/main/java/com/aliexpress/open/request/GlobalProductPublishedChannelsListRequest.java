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
*  global.product.published.channels.list
*/
public class GlobalProductPublishedChannelsListRequest extends BaseGopRequest<GlobalProductPublishedChannelsListResponse> {

    /** 全球商品id */
    private Long globalProductId;

    public Long getGlobalProductId(){
        return this.globalProductId;
    }
    public void setGlobalProductId(Long globalProductId){
        this.globalProductId = globalProductId;
        }

    @Override
    public String getApiName() {
        return "global.product.published.channels.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (globalProductId != null) {
                        super.addApiParameter("global_product_id", globalProductId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<GlobalProductPublishedChannelsListResponse> getResponseClass() {
        return GlobalProductPublishedChannelsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}