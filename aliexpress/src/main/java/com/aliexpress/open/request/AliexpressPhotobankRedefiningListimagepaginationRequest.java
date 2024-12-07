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
*  aliexpress.photobank.redefining.listimagepagination
*/
public class AliexpressPhotobankRedefiningListimagepaginationRequest extends BaseGopRequest<AliexpressPhotobankRedefiningListimagepaginationResponse> {

    /** none */
    private AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationRequest aeopImagePaginationRequest;

    public AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationRequest getAeopImagePaginationRequest(){
        return this.aeopImagePaginationRequest;
    }
    public void setAeopImagePaginationRequest(AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationRequest aeopImagePaginationRequest){
        this.aeopImagePaginationRequest = aeopImagePaginationRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.photobank.redefining.listimagepagination";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeopImagePaginationRequest != null) {
                        super.addApiParameter("aeop_image_pagination_request", new JSONWriter(true, false).write(aeopImagePaginationRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPhotobankRedefiningListimagepaginationResponse> getResponseClass() {
        return AliexpressPhotobankRedefiningListimagepaginationResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}