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
*  global.mediacenter.video.getbystoragename
*/
public class GlobalMediacenterVideoGetbystoragenameRequest extends BaseGopRequest<GlobalMediacenterVideoGetbystoragenameResponse> {

    /** 视频存储id。用于发布商品时使用 */
    private String storeName;

    public String getStoreName(){
        return this.storeName;
    }
    public void setStoreName(String storeName){
        this.storeName = storeName;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.video.getbystoragename";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (storeName != null) {
                        super.addApiParameter("store_name", storeName.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<GlobalMediacenterVideoGetbystoragenameResponse> getResponseClass() {
        return GlobalMediacenterVideoGetbystoragenameResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}