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
*  aliexpress.solution.product.post
*/
public class AliexpressSolutionProductPostRequest extends BaseGopRequest<AliexpressSolutionProductPostResponse> {

    /** input param */
    private AliexpressSolutionProductPostPostProductRequestDTO postProductRequest;

    public AliexpressSolutionProductPostPostProductRequestDTO getPostProductRequest(){
        return this.postProductRequest;
    }
    public void setPostProductRequest(AliexpressSolutionProductPostPostProductRequestDTO postProductRequest){
        this.postProductRequest = postProductRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.product.post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (postProductRequest != null) {
                        super.addApiParameter("post_product_request", new JSONWriter(true, false).write(postProductRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionProductPostResponse> getResponseClass() {
        return AliexpressSolutionProductPostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}