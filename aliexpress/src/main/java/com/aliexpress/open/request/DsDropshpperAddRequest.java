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
*  /ds/dropshpper/add
*/
public class DsDropshpperAddRequest extends BaseGopRequest<DsDropshpperAddResponse> {

    /** DS站点的店铺地址 */
    private String storeUrl;
    /** 扩展信息 */
    private String extendInfo;

    public String getStoreUrl(){
        return this.storeUrl;
    }
    public void setStoreUrl(String storeUrl){
        this.storeUrl = storeUrl;
        }
    public String getExtendInfo(){
        return this.extendInfo;
    }
    public void setExtendInfo(String extendInfo){
        this.extendInfo = extendInfo;
        }

    @Override
    public String getApiName() {
        return "/ds/dropshpper/add";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (storeUrl != null) {
                        super.addApiParameter("store_url", storeUrl.toString());
                    }
                            if (extendInfo != null) {
                        super.addApiParameter("extend_info", extendInfo.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<DsDropshpperAddResponse> getResponseClass() {
        return DsDropshpperAddResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}