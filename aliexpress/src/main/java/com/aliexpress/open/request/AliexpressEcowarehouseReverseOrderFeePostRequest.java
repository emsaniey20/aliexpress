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
*  aliexpress.ecowarehouse.reverse.order.fee.post
*/
public class AliexpressEcowarehouseReverseOrderFeePostRequest extends BaseGopRequest<AliexpressEcowarehouseReverseOrderFeePostResponse> {

    /** request */
    private AliexpressEcowarehouseReverseOrderFeePostReverseFeeDetailCallbackRequest reverseFeeDetailCallbackRequest;

    public AliexpressEcowarehouseReverseOrderFeePostReverseFeeDetailCallbackRequest getReverseFeeDetailCallbackRequest(){
        return this.reverseFeeDetailCallbackRequest;
    }
    public void setReverseFeeDetailCallbackRequest(AliexpressEcowarehouseReverseOrderFeePostReverseFeeDetailCallbackRequest reverseFeeDetailCallbackRequest){
        this.reverseFeeDetailCallbackRequest = reverseFeeDetailCallbackRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ecowarehouse.reverse.order.fee.post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (reverseFeeDetailCallbackRequest != null) {
                        super.addApiParameter("reverse_fee_detail_callback_request", new JSONWriter(true, false).write(reverseFeeDetailCallbackRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressEcowarehouseReverseOrderFeePostResponse> getResponseClass() {
        return AliexpressEcowarehouseReverseOrderFeePostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}