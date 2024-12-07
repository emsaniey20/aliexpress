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
*  aliexpress.ascp.po.createPickupShippingMarkPdf
*/
public class AliexpressAscpPoCreatePickupShippingMarkPdfRequest extends BaseGopRequest<AliexpressAscpPoCreatePickupShippingMarkPdfResponse> {

    /** - */
    private AliexpressAscpPoCreatePickupShippingMarkPdfPickupShippingPrintDTO param0;

    public AliexpressAscpPoCreatePickupShippingMarkPdfPickupShippingPrintDTO getParam0(){
        return this.param0;
    }
    public void setParam0(AliexpressAscpPoCreatePickupShippingMarkPdfPickupShippingPrintDTO param0){
        this.param0 = param0;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.po.createPickupShippingMarkPdf";
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
    public Class<AliexpressAscpPoCreatePickupShippingMarkPdfResponse> getResponseClass() {
        return AliexpressAscpPoCreatePickupShippingMarkPdfResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}