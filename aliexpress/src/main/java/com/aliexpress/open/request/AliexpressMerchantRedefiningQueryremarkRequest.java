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
*  aliexpress.merchant.redefining.queryremark
*/
public class AliexpressMerchantRedefiningQueryremarkRequest extends BaseGopRequest<AliexpressMerchantRedefiningQueryremarkResponse> {

    /** 业务类型，默认为订单备注 */
    private Long bizType;
    /** 备注Id，业务类型为订单备注，则为订单Id */
    private Long remarkId;

    public Long getBizType(){
        return this.bizType;
    }
    public void setBizType(Long bizType){
        this.bizType = bizType;
        }
    public Long getRemarkId(){
        return this.remarkId;
    }
    public void setRemarkId(Long remarkId){
        this.remarkId = remarkId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.merchant.redefining.queryremark";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (bizType != null) {
                        super.addApiParameter("biz_type", bizType.toString());
                    }
                            if (remarkId != null) {
                        super.addApiParameter("remark_id", remarkId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressMerchantRedefiningQueryremarkResponse> getResponseClass() {
        return AliexpressMerchantRedefiningQueryremarkResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}