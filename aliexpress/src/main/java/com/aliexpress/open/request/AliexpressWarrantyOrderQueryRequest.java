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
*  aliexpress.warranty.order.query
*/
public class AliexpressWarrantyOrderQueryRequest extends BaseGopRequest<AliexpressWarrantyOrderQueryResponse> {

    /** warranty_id */
    private String warrantyId;

    public String getWarrantyId(){
        return this.warrantyId;
    }
    public void setWarrantyId(String warrantyId){
        this.warrantyId = warrantyId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.warranty.order.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (warrantyId != null) {
                        super.addApiParameter("warranty_id", warrantyId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressWarrantyOrderQueryResponse> getResponseClass() {
        return AliexpressWarrantyOrderQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}