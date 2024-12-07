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
*  aliexpress.offer.product.post
*/
public class AliexpressOfferProductPostRequest extends BaseGopRequest<AliexpressOfferProductPostResponse> {

    /** 待发布商品数据 */
    private AliexpressOfferProductPostAeopAEProduct aeopAEProduct;

    public AliexpressOfferProductPostAeopAEProduct getAeopAEProduct(){
        return this.aeopAEProduct;
    }
    public void setAeopAEProduct(AliexpressOfferProductPostAeopAEProduct aeopAEProduct){
        this.aeopAEProduct = aeopAEProduct;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.product.post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeopAEProduct != null) {
                        super.addApiParameter("aeop_a_e_product", new JSONWriter(true, false).write(aeopAEProduct));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferProductPostResponse> getResponseClass() {
        return AliexpressOfferProductPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}