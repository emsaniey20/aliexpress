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
*  aliexpress.solution.product.edit
*/
public class AliexpressSolutionProductEditRequest extends BaseGopRequest<AliexpressSolutionProductEditResponse> {

    /** input param */
    private AliexpressSolutionProductEditPostProductRequestDTO editProductRequest;

    public AliexpressSolutionProductEditPostProductRequestDTO getEditProductRequest(){
        return this.editProductRequest;
    }
    public void setEditProductRequest(AliexpressSolutionProductEditPostProductRequestDTO editProductRequest){
        this.editProductRequest = editProductRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.product.edit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (editProductRequest != null) {
                        super.addApiParameter("edit_product_request", new JSONWriter(true, false).write(editProductRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionProductEditResponse> getResponseClass() {
        return AliexpressSolutionProductEditResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}