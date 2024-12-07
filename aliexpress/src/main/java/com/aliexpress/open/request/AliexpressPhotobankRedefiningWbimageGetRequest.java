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
*  aliexpress.photobank.redefining.wbimage.get
*/
public class AliexpressPhotobankRedefiningWbimageGetRequest extends BaseGopRequest<AliexpressPhotobankRedefiningWbimageGetResponse> {

    /** 请求参数 */
    private AliexpressPhotobankRedefiningWbimageGetGetWBImageRequest getWbImageRequest;

    public AliexpressPhotobankRedefiningWbimageGetGetWBImageRequest getGetWbImageRequest(){
        return this.getWbImageRequest;
    }
    public void setGetWbImageRequest(AliexpressPhotobankRedefiningWbimageGetGetWBImageRequest getWbImageRequest){
        this.getWbImageRequest = getWbImageRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.photobank.redefining.wbimage.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (getWbImageRequest != null) {
                        super.addApiParameter("get_wb_image_request", new JSONWriter(true, false).write(getWbImageRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPhotobankRedefiningWbimageGetResponse> getResponseClass() {
        return AliexpressPhotobankRedefiningWbimageGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}