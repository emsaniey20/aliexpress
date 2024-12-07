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
*  aliexpress.offer.draftproducts.get
*/
public class AliexpressOfferDraftproductsGetRequest extends BaseGopRequest<AliexpressOfferDraftproductsGetResponse> {

    /** none */
    private AliexpressOfferDraftproductsGetAeopAEProductListQuery aeopAEProductListQuery;

    public AliexpressOfferDraftproductsGetAeopAEProductListQuery getAeopAEProductListQuery(){
        return this.aeopAEProductListQuery;
    }
    public void setAeopAEProductListQuery(AliexpressOfferDraftproductsGetAeopAEProductListQuery aeopAEProductListQuery){
        this.aeopAEProductListQuery = aeopAEProductListQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.draftproducts.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeopAEProductListQuery != null) {
                        super.addApiParameter("aeop_a_e_product_list_query", new JSONWriter(true, false).write(aeopAEProductListQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferDraftproductsGetResponse> getResponseClass() {
        return AliexpressOfferDraftproductsGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}