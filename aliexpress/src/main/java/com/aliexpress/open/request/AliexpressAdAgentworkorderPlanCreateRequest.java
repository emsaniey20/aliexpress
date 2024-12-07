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
*  aliexpress.ad.agentworkorder.plan.create
*/
public class AliexpressAdAgentworkorderPlanCreateRequest extends BaseGopRequest<AliexpressAdAgentworkorderPlanCreateResponse> {

    /** 预计uv */
    private Long uv;
    /** 部服务商代投工单业务单号 */
    private String outerBizNo;
    /** AE工单单号 */
    private String bizNo;
    /** 金额币种单位，默认美元 */
    private String budgetCurrency;
    /** 预计点击人数 */
    private Long clickCnt;
    /** 素材策略 */
    private String materialStrategies;
    /** 广告类型信息 */
    private String adTypes;
    /** 优化策略 */
    private String optimizeStrategies;
    /** 预算投放计划 */
    private String budgetPlans;
    /** 预计cpc，单位为分，整数 */
    private Long cpc;
    /** 人群策略，json字符串 */
    private String crowdStrategy;
    /** 预计曝光人群数量 */
    private Long impressCnt;
    /** 商家ID */
    private Long sellerId;

    public Long getUv(){
        return this.uv;
    }
    public void setUv(Long uv){
        this.uv = uv;
        }
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
    public String getBudgetCurrency(){
        return this.budgetCurrency;
    }
    public void setBudgetCurrency(String budgetCurrency){
        this.budgetCurrency = budgetCurrency;
        }
    public Long getClickCnt(){
        return this.clickCnt;
    }
    public void setClickCnt(Long clickCnt){
        this.clickCnt = clickCnt;
        }
    public String getMaterialStrategies(){
        return this.materialStrategies;
    }
    public void setMaterialStrategies(String materialStrategies){
        this.materialStrategies = materialStrategies;
        }
    public String getAdTypes(){
        return this.adTypes;
    }
    public void setAdTypes(String adTypes){
        this.adTypes = adTypes;
        }
    public String getOptimizeStrategies(){
        return this.optimizeStrategies;
    }
    public void setOptimizeStrategies(String optimizeStrategies){
        this.optimizeStrategies = optimizeStrategies;
        }
    public String getBudgetPlans(){
        return this.budgetPlans;
    }
    public void setBudgetPlans(String budgetPlans){
        this.budgetPlans = budgetPlans;
        }
    public Long getCpc(){
        return this.cpc;
    }
    public void setCpc(Long cpc){
        this.cpc = cpc;
        }
    public String getCrowdStrategy(){
        return this.crowdStrategy;
    }
    public void setCrowdStrategy(String crowdStrategy){
        this.crowdStrategy = crowdStrategy;
        }
    public Long getImpressCnt(){
        return this.impressCnt;
    }
    public void setImpressCnt(Long impressCnt){
        this.impressCnt = impressCnt;
        }
    public Long getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(Long sellerId){
        this.sellerId = sellerId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ad.agentworkorder.plan.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (uv != null) {
                        super.addApiParameter("uv", uv.toString());
                    }
                            if (outerBizNo != null) {
                        super.addApiParameter("outer_biz_no", outerBizNo.toString());
                    }
                            if (bizNo != null) {
                        super.addApiParameter("biz_no", bizNo.toString());
                    }
                            if (budgetCurrency != null) {
                        super.addApiParameter("budget_currency", budgetCurrency.toString());
                    }
                            if (clickCnt != null) {
                        super.addApiParameter("click_cnt", clickCnt.toString());
                    }
                            if (materialStrategies != null) {
                        super.addApiParameter("material_strategies", materialStrategies.toString());
                    }
                            if (adTypes != null) {
                        super.addApiParameter("ad_types", adTypes.toString());
                    }
                            if (optimizeStrategies != null) {
                        super.addApiParameter("optimize_strategies", optimizeStrategies.toString());
                    }
                            if (budgetPlans != null) {
                        super.addApiParameter("budget_plans", budgetPlans.toString());
                    }
                            if (cpc != null) {
                        super.addApiParameter("cpc", cpc.toString());
                    }
                            if (crowdStrategy != null) {
                        super.addApiParameter("crowd_strategy", crowdStrategy.toString());
                    }
                            if (impressCnt != null) {
                        super.addApiParameter("impress_cnt", impressCnt.toString());
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
    public Class<AliexpressAdAgentworkorderPlanCreateResponse> getResponseClass() {
        return AliexpressAdAgentworkorderPlanCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}