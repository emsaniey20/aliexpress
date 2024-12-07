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
*  aliexpress.postproduct.redefining.onlineaeproduct
*/
public class AliexpressPostproductRedefiningOnlineaeproductRequest extends BaseGopRequest<AliexpressPostproductRedefiningOnlineaeproductResponse> {

    /** 需要上架的产品id列表。可输入多个，之前用半角分号分割。 */
    private String productIds;

    public String getProductIds(){
        return this.productIds;
    }
    public void setProductIds(String productIds){
        this.productIds = productIds;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.onlineaeproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productIds != null) {
                        super.addApiParameter("product_ids", productIds.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningOnlineaeproductResponse> getResponseClass() {
        return AliexpressPostproductRedefiningOnlineaeproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}