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
*  aliexpress.merchant.redefining.queryremarks
*/
public class AliexpressMerchantRedefiningQueryremarksRequest extends BaseGopRequest<AliexpressMerchantRedefiningQueryremarksResponse> {

    /** 业务类型，0 为订单备注。 */
    private Long bizType;
    /** 业务类型为订单备注，则remark_ids为订单ID列表。 */
    private List<Long> remarkIds;

    public Long getBizType(){
        return this.bizType;
    }
    public void setBizType(Long bizType){
        this.bizType = bizType;
        }
    public List<Long> getRemarkIds(){
        return this.remarkIds;
    }
    public void setRemarkIds(List<Long> remarkIds){
        this.remarkIds = remarkIds;
        }

    @Override
    public String getApiName() {
        return "aliexpress.merchant.redefining.queryremarks";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (bizType != null) {
                        super.addApiParameter("biz_type", bizType.toString());
                    }
                            if (remarkIds != null) {
                        super.addApiParameter("remark_ids", new JSONWriter(true, false).write(remarkIds));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressMerchantRedefiningQueryremarksResponse> getResponseClass() {
        return AliexpressMerchantRedefiningQueryremarksResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}