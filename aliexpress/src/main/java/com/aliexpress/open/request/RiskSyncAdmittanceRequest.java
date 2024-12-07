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
*  /risk/syncAdmittance
*/
public class RiskSyncAdmittanceRequest extends BaseGopRequest<RiskSyncAdmittanceResponse> {

    /** 商家登陆id */
    private String sellerLoginId;
    /** AE卖家数字ID */
    private Long adminMemberSeq;
    /** 支付宝ID */
    private String alipayId;
    /** 是否准入 */
    private Boolean admitted;
    /** 不准入原因 */
    private String deniedReason;
    /** 授信额度 */
    private Long creditLimitAmount;
    /** 币种 */
    private String creditLimitCurrency;
    /** 卖家证据类型 */
    private String certType;
    /** 卖家证据类型 */
    private String certName;
    /** 证件编码 */
    private String certNo;
    /** 芝麻分 */
    private String zhimaCreditRate;

    public String getSellerLoginId(){
        return this.sellerLoginId;
    }
    public void setSellerLoginId(String sellerLoginId){
        this.sellerLoginId = sellerLoginId;
        }
    public Long getAdminMemberSeq(){
        return this.adminMemberSeq;
    }
    public void setAdminMemberSeq(Long adminMemberSeq){
        this.adminMemberSeq = adminMemberSeq;
        }
    public String getAlipayId(){
        return this.alipayId;
    }
    public void setAlipayId(String alipayId){
        this.alipayId = alipayId;
        }
    public Boolean getAdmitted(){
        return this.admitted;
    }
    public void setAdmitted(Boolean admitted){
        this.admitted = admitted;
        }
    public String getDeniedReason(){
        return this.deniedReason;
    }
    public void setDeniedReason(String deniedReason){
        this.deniedReason = deniedReason;
        }
    public Long getCreditLimitAmount(){
        return this.creditLimitAmount;
    }
    public void setCreditLimitAmount(Long creditLimitAmount){
        this.creditLimitAmount = creditLimitAmount;
        }
    public String getCreditLimitCurrency(){
        return this.creditLimitCurrency;
    }
    public void setCreditLimitCurrency(String creditLimitCurrency){
        this.creditLimitCurrency = creditLimitCurrency;
        }
    public String getCertType(){
        return this.certType;
    }
    public void setCertType(String certType){
        this.certType = certType;
        }
    public String getCertName(){
        return this.certName;
    }
    public void setCertName(String certName){
        this.certName = certName;
        }
    public String getCertNo(){
        return this.certNo;
    }
    public void setCertNo(String certNo){
        this.certNo = certNo;
        }
    public String getZhimaCreditRate(){
        return this.zhimaCreditRate;
    }
    public void setZhimaCreditRate(String zhimaCreditRate){
        this.zhimaCreditRate = zhimaCreditRate;
        }

    @Override
    public String getApiName() {
        return "/risk/syncAdmittance";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerLoginId != null) {
                        super.addApiParameter("sellerLoginId", sellerLoginId.toString());
                    }
                            if (adminMemberSeq != null) {
                        super.addApiParameter("adminMemberSeq", adminMemberSeq.toString());
                    }
                            if (alipayId != null) {
                        super.addApiParameter("alipayId", alipayId.toString());
                    }
                            if (admitted != null) {
                        super.addApiParameter("admitted", admitted.toString());
                    }
                            if (deniedReason != null) {
                        super.addApiParameter("deniedReason", deniedReason.toString());
                    }
                            if (creditLimitAmount != null) {
                        super.addApiParameter("creditLimitAmount", creditLimitAmount.toString());
                    }
                            if (creditLimitCurrency != null) {
                        super.addApiParameter("creditLimitCurrency", creditLimitCurrency.toString());
                    }
                            if (certType != null) {
                        super.addApiParameter("certType", certType.toString());
                    }
                            if (certName != null) {
                        super.addApiParameter("certName", certName.toString());
                    }
                            if (certNo != null) {
                        super.addApiParameter("certNo", certNo.toString());
                    }
                            if (zhimaCreditRate != null) {
                        super.addApiParameter("zhimaCreditRate", zhimaCreditRate.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                return super.getFileParams();
    }

    @Override
    public Class<RiskSyncAdmittanceResponse> getResponseClass() {
        return RiskSyncAdmittanceResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}