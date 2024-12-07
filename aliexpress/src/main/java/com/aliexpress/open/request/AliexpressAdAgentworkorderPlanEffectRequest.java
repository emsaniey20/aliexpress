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
*  aliexpress.ad.agentworkorder.plan.effect
*/
public class AliexpressAdAgentworkorderPlanEffectRequest extends BaseGopRequest<AliexpressAdAgentworkorderPlanEffectResponse> {

    /** 外部服务商代投工单业务单号 */
    private String outerBizNo;
    /** AE工单单号 */
    private String bizNo;
    /** 操作结果，CONFIRM-确认,REJECT-拒绝 */
    private String operateType;
    /** 投放方案推送接口有返回planId */
    private Long planId;
    /** 操作备注 */
    private String operateDesc;
    /** 商户id */
    private Long sellerId;

    public String getOuterBizNo(){
        return this.outerBizNo;
    }
    public void setOuterBizNo(String outerBizNo){
        this.outerBizNo = outerBizNo;
        }
    public String getBizNo(){
        return this.bizNo;
    }
    public void setBizNo(String bizNo){
        this.bizNo = bizNo;
        }
    public String getOperateType(){
        return this.operateType;
    }
    public void setOperateType(String operateType){
        this.operateType = operateType;
        }
    public Long getPlanId(){
        return this.planId;
    }
    public void setPlanId(Long planId){
        this.planId = planId;
        }
    public String getOperateDesc(){
        return this.operateDesc;
    }
    public void setOperateDesc(String operateDesc){
        this.operateDesc = operateDesc;
        }
    public Long getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(Long sellerId){
        this.sellerId = sellerId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ad.agentworkorder.plan.effect";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (outerBizNo != null) {
                        super.addApiParameter("outer_biz_no", outerBizNo.toString());
                    }
                            if (bizNo != null) {
                        super.addApiParameter("biz_no", bizNo.toString());
                    }
                            if (operateType != null) {
                        super.addApiParameter("operate_type", operateType.toString());
                    }
                            if (planId != null) {
                        super.addApiParameter("plan_id", planId.toString());
                    }
                            if (operateDesc != null) {
                        super.addApiParameter("operate_desc", operateDesc.toString());
                    }
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
    public Class<AliexpressAdAgentworkorderPlanEffectResponse> getResponseClass() {
        return AliexpressAdAgentworkorderPlanEffectResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}