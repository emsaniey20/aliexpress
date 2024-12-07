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
*  aliexpress.issue.solution.agree
*/
public class AliexpressIssueSolutionAgreeRequest extends BaseGopRequest<AliexpressIssueSolutionAgreeResponse> {

    /** 买家登录id */
    private String buyerLoginId;
    /** 纠纷id */
    private Long issueId;
    /** 若退货需提供退货地址id */
    private Long returnAddressId;
    /** 同意方案id */
    private Long solutionId;

    public String getBuyerLoginId(){
        return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId){
        this.buyerLoginId = buyerLoginId;
        }
    public Long getIssueId(){
        return this.issueId;
    }
    public void setIssueId(Long issueId){
        this.issueId = issueId;
        }
    public Long getReturnAddressId(){
        return this.returnAddressId;
    }
    public void setReturnAddressId(Long returnAddressId){
        this.returnAddressId = returnAddressId;
        }
    public Long getSolutionId(){
        return this.solutionId;
    }
    public void setSolutionId(Long solutionId){
        this.solutionId = solutionId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.issue.solution.agree";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (buyerLoginId != null) {
                        super.addApiParameter("buyer_login_id", buyerLoginId.toString());
                    }
                            if (issueId != null) {
                        super.addApiParameter("issue_id", issueId.toString());
                    }
                            if (returnAddressId != null) {
                        super.addApiParameter("return_address_id", returnAddressId.toString());
                    }
                            if (solutionId != null) {
                        super.addApiParameter("solution_id", solutionId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressIssueSolutionAgreeResponse> getResponseClass() {
        return AliexpressIssueSolutionAgreeResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}