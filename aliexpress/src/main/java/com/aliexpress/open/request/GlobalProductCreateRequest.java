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
*  global.product.create
*/
public class GlobalProductCreateRequest extends BaseGopRequest<GlobalProductCreateResponse> {

    /** 商品模块 */
    private GlobalProductCreateCspProduct product;

    public GlobalProductCreateCspProduct getProduct(){
        return this.product;
    }
    public void setProduct(GlobalProductCreateCspProduct product){
        this.product = product;
        }

    @Override
    public String getApiName() {
        return "global.product.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (product != null) {
                        super.addApiParameter("product", new JSONWriter(true, false).write(product));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<GlobalProductCreateResponse> getResponseClass() {
        return GlobalProductCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}