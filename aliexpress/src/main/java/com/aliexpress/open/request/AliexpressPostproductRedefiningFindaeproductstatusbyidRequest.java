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
*  aliexpress.postproduct.redefining.findaeproductstatusbyid
*/
public class AliexpressPostproductRedefiningFindaeproductstatusbyidRequest extends BaseGopRequest<AliexpressPostproductRedefiningFindaeproductstatusbyidResponse> {

    /** 商品ID,每次只能输入一个 */
    private Long productId;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.findaeproductstatusbyid";
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
    public Class<AliexpressPostproductRedefiningFindaeproductstatusbyidResponse> getResponseClass() {
        return AliexpressPostproductRedefiningFindaeproductstatusbyidResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}