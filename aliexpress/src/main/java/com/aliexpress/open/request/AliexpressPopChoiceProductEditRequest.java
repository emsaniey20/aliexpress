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
*  aliexpress.pop.choice.product.edit
*/
public class AliexpressPopChoiceProductEditRequest extends BaseGopRequest<AliexpressPopChoiceProductEditResponse> {

    /** 商品信息 */
    private AliexpressPopChoiceProductEditPopChoiceProductDTO popChoiceProduct;

    public AliexpressPopChoiceProductEditPopChoiceProductDTO getPopChoiceProduct(){
        return this.popChoiceProduct;
    }
    public void setPopChoiceProduct(AliexpressPopChoiceProductEditPopChoiceProductDTO popChoiceProduct){
        this.popChoiceProduct = popChoiceProduct;
        }

    @Override
    public String getApiName() {
        return "aliexpress.pop.choice.product.edit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (popChoiceProduct != null) {
                        super.addApiParameter("pop_choice_product", new JSONWriter(true, false).write(popChoiceProduct));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPopChoiceProductEditResponse> getResponseClass() {
        return AliexpressPopChoiceProductEditResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}