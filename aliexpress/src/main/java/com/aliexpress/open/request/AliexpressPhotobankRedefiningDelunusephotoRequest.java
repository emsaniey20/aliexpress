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
*  aliexpress.photobank.redefining.delunusephoto
*/
public class AliexpressPhotobankRedefiningDelunusephotoRequest extends BaseGopRequest<AliexpressPhotobankRedefiningDelunusephotoResponse> {

    /** none */
    private AliexpressPhotobankRedefiningDelunusephotoAeopDeleteImageRequest aeopDeleteImageRequest;

    public AliexpressPhotobankRedefiningDelunusephotoAeopDeleteImageRequest getAeopDeleteImageRequest(){
        return this.aeopDeleteImageRequest;
    }
    public void setAeopDeleteImageRequest(AliexpressPhotobankRedefiningDelunusephotoAeopDeleteImageRequest aeopDeleteImageRequest){
        this.aeopDeleteImageRequest = aeopDeleteImageRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.photobank.redefining.delunusephoto";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeopDeleteImageRequest != null) {
                        super.addApiParameter("aeop_delete_image_request", new JSONWriter(true, false).write(aeopDeleteImageRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPhotobankRedefiningDelunusephotoResponse> getResponseClass() {
        return AliexpressPhotobankRedefiningDelunusephotoResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}