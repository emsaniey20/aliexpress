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
*  aliexpress.warranty.order.querycustomer
*/
public class AliexpressWarrantyOrderQuerycustomerRequest extends BaseGopRequest<AliexpressWarrantyOrderQuerycustomerResponse> {

    /** 1 */
    private String warrantyId;

    public String getWarrantyId(){
        return this.warrantyId;
    }
    public void setWarrantyId(String warrantyId){
        this.warrantyId = warrantyId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.warranty.order.querycustomer";
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
    public Class<AliexpressWarrantyOrderQuerycustomerResponse> getResponseClass() {
        return AliexpressWarrantyOrderQuerycustomerResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}