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
*  /aliexpress/spi/im/plugins/list
*/
public class AliexpressSpiImPluginsListRequest extends BaseGopRequest<AliexpressSpiImPluginsListResponse> {

    /** seller_id */
    private String sellerId;

    public String getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(String sellerId){
        this.sellerId = sellerId;
        }

    @Override
    public String getApiName() {
        return "/aliexpress/spi/im/plugins/list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerId != null) {
                        super.addApiParameter("seller_id", sellerId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSpiImPluginsListResponse> getResponseClass() {
        return AliexpressSpiImPluginsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}