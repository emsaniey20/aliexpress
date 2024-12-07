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
*  aliexpress.ascp.po.selfdelivery
*/
public class AliexpressAscpPoSelfdeliveryRequest extends BaseGopRequest<AliexpressAscpPoSelfdeliveryResponse> {

    /** 根结点 */
    private AliexpressAscpPoSelfdeliveryErpLogisticsInfoProcessDTO param0;

    public AliexpressAscpPoSelfdeliveryErpLogisticsInfoProcessDTO getParam0(){
        return this.param0;
    }
    public void setParam0(AliexpressAscpPoSelfdeliveryErpLogisticsInfoProcessDTO param0){
        this.param0 = param0;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.po.selfdelivery";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param0 != null) {
                        super.addApiParameter("param0", new JSONWriter(true, false).write(param0));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpPoSelfdeliveryResponse> getResponseClass() {
        return AliexpressAscpPoSelfdeliveryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}