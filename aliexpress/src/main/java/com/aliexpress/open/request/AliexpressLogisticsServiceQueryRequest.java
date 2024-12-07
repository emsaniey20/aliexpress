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
*  aliexpress.logistics.service.query
*/
public class AliexpressLogisticsServiceQueryRequest extends BaseGopRequest<AliexpressLogisticsServiceQueryResponse> {

    /** 入參对象 */
    private AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceRequest interfaceRequest;

    public AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceRequest getInterfaceRequest(){
        return this.interfaceRequest;
    }
    public void setInterfaceRequest(AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceRequest interfaceRequest){
        this.interfaceRequest = interfaceRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.service.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (interfaceRequest != null) {
                        super.addApiParameter("interface_request", new JSONWriter(true, false).write(interfaceRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsServiceQueryResponse> getResponseClass() {
        return AliexpressLogisticsServiceQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}