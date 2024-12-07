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
*  aliexpress.pop.choice.product.query
*/
public class AliexpressPopChoiceProductQueryRequest extends BaseGopRequest<AliexpressPopChoiceProductQueryResponse> {

    /** 半托管商品id */
    private Long productId;
    /** 语言 */
    private String language;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getLanguage(){
        return this.language;
    }
    public void setLanguage(String language){
        this.language = language;
        }

    @Override
    public String getApiName() {
        return "aliexpress.pop.choice.product.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (language != null) {
                        super.addApiParameter("language", language.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPopChoiceProductQueryResponse> getResponseClass() {
        return AliexpressPopChoiceProductQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}