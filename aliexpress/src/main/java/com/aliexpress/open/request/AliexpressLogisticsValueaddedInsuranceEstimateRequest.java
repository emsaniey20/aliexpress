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
*  aliexpress.logistics.valueadded.insurance.estimate
*/
public class AliexpressLogisticsValueaddedInsuranceEstimateRequest extends BaseGopRequest<AliexpressLogisticsValueaddedInsuranceEstimateResponse> {

    /** 是否升级正逆向货值保障（默认值false） */
    private Boolean agreeUpgradeReverseParcelInsure;
    /** 交易单ID */
    private Long tradeOrderId;
    /** 保额，单位：美金(分)；最小值4500 */
    private Long insuranceCoverage;
    /** 解决方案Code（CAINIAO_STANDARD｜CAINIAO_PREMIUM｜CAINIAO_STANDARD_HEAVY） */
    private String solutionCode;

    public Boolean getAgreeUpgradeReverseParcelInsure(){
        return this.agreeUpgradeReverseParcelInsure;
    }
    public void setAgreeUpgradeReverseParcelInsure(Boolean agreeUpgradeReverseParcelInsure){
        this.agreeUpgradeReverseParcelInsure = agreeUpgradeReverseParcelInsure;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public Long getInsuranceCoverage(){
        return this.insuranceCoverage;
    }
    public void setInsuranceCoverage(Long insuranceCoverage){
        this.insuranceCoverage = insuranceCoverage;
        }
    public String getSolutionCode(){
        return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode){
        this.solutionCode = solutionCode;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.valueadded.insurance.estimate";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (agreeUpgradeReverseParcelInsure != null) {
                        super.addApiParameter("agree_upgrade_reverse_parcel_insure", agreeUpgradeReverseParcelInsure.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (insuranceCoverage != null) {
                        super.addApiParameter("insurance_coverage", insuranceCoverage.toString());
                    }
                            if (solutionCode != null) {
                        super.addApiParameter("solution_code", solutionCode.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsValueaddedInsuranceEstimateResponse> getResponseClass() {
        return AliexpressLogisticsValueaddedInsuranceEstimateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}