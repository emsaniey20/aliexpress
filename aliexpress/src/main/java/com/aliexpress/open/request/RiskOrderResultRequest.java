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
*  /risk/orderResult
*/
public class RiskOrderResultRequest extends BaseGopRequest<RiskOrderResultResponse> {

    /** 商家登陆ID */
    private String sellerId;
    /** 订单id */
    private String referenceCode;
    /** 订单审核是否通过 */
    private Boolean preLoan;
    /** 拒绝原因 */
    private String deniedReason;
    /** 审核阶段 */
    private String stage;

    public String getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(String sellerId){
        this.sellerId = sellerId;
        }
    public String getReferenceCode(){
        return this.referenceCode;
    }
    public void setReferenceCode(String referenceCode){
        this.referenceCode = referenceCode;
        }
    public Boolean getPreLoan(){
        return this.preLoan;
    }
    public void setPreLoan(Boolean preLoan){
        this.preLoan = preLoan;
        }
    public String getDeniedReason(){
        return this.deniedReason;
    }
    public void setDeniedReason(String deniedReason){
        this.deniedReason = deniedReason;
        }
    public String getStage(){
        return this.stage;
    }
    public void setStage(String stage){
        this.stage = stage;
        }

    @Override
    public String getApiName() {
        return "/risk/orderResult";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerId != null) {
                        super.addApiParameter("sellerId", sellerId.toString());
                    }
                            if (referenceCode != null) {
                        super.addApiParameter("referenceCode", referenceCode.toString());
                    }
                            if (preLoan != null) {
                        super.addApiParameter("preLoan", preLoan.toString());
                    }
                            if (deniedReason != null) {
                        super.addApiParameter("deniedReason", deniedReason.toString());
                    }
                            if (stage != null) {
                        super.addApiParameter("stage", stage.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<RiskOrderResultResponse> getResponseClass() {
        return RiskOrderResultResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}