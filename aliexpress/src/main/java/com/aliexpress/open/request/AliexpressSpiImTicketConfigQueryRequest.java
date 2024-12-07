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
*  /aliexpress/spi/im/ticket/config/query
*/
public class AliexpressSpiImTicketConfigQueryRequest extends BaseGopRequest<AliexpressSpiImTicketConfigQueryResponse> {

    /** 1 */
    private AliexpressSpiImTicketConfigQuery param;

    public AliexpressSpiImTicketConfigQuery getParam(){
        return this.param;
    }
    public void setParam(AliexpressSpiImTicketConfigQuery param){
        this.param = param;
        }

    @Override
    public String getApiName() {
        return "/aliexpress/spi/im/ticket/config/query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param != null) {
                        super.addApiParameter("param", new JSONWriter(true, false).write(param));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSpiImTicketConfigQueryResponse> getResponseClass() {
        return AliexpressSpiImTicketConfigQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}