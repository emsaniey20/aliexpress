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
*  aliexpress/message/customer/status/get
*/
public class AliexpressMessageCustomerStatusGetRequest extends BaseGopRequest<AliexpressMessageCustomerStatusGetResponse> {

    /** 请求dto */
    private String imCustomerServiceDto;

    public String getImCustomerServiceDto(){
        return this.imCustomerServiceDto;
    }
    public void setImCustomerServiceDto(String imCustomerServiceDto){
        this.imCustomerServiceDto = imCustomerServiceDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/customer/status/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imCustomerServiceDto != null) {
                        super.addApiParameter("im_customer_service_dto", imCustomerServiceDto.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageCustomerStatusGetResponse> getResponseClass() {
        return AliexpressMessageCustomerStatusGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}