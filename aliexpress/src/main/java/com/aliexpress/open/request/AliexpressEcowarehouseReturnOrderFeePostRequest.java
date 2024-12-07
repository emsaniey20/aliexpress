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
*  aliexpress.ecowarehouse.return.order.fee.post
*/
public class AliexpressEcowarehouseReturnOrderFeePostRequest extends BaseGopRequest<AliexpressEcowarehouseReturnOrderFeePostResponse> {

    /** request */
    private AliexpressEcowarehouseReturnOrderFeePostReturnFeeDetailCallbackRequest returnFeeDetailCallbackRequest;

    public AliexpressEcowarehouseReturnOrderFeePostReturnFeeDetailCallbackRequest getReturnFeeDetailCallbackRequest(){
        return this.returnFeeDetailCallbackRequest;
    }
    public void setReturnFeeDetailCallbackRequest(AliexpressEcowarehouseReturnOrderFeePostReturnFeeDetailCallbackRequest returnFeeDetailCallbackRequest){
        this.returnFeeDetailCallbackRequest = returnFeeDetailCallbackRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ecowarehouse.return.order.fee.post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (returnFeeDetailCallbackRequest != null) {
                        super.addApiParameter("return_fee_detail_callback_request", new JSONWriter(true, false).write(returnFeeDetailCallbackRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressEcowarehouseReturnOrderFeePostResponse> getResponseClass() {
        return AliexpressEcowarehouseReturnOrderFeePostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}