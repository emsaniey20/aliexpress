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
*  aliexpress.draft.product.edit
*/
public class AliexpressDraftProductEditRequest extends BaseGopRequest<AliexpressDraftProductEditResponse> {

    /** 产品信息 */
    private AliexpressDraftProductEditAeopAEProduct aeopAEProduct;

    public AliexpressDraftProductEditAeopAEProduct getAeopAEProduct(){
        return this.aeopAEProduct;
    }
    public void setAeopAEProduct(AliexpressDraftProductEditAeopAEProduct aeopAEProduct){
        this.aeopAEProduct = aeopAEProduct;
        }

    @Override
    public String getApiName() {
        return "aliexpress.draft.product.edit";
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
    public Class<AliexpressDraftProductEditResponse> getResponseClass() {
        return AliexpressDraftProductEditResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}