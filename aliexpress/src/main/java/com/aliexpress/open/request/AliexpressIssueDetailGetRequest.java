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
*  aliexpress.issue.detail.get
*/
public class AliexpressIssueDetailGetRequest extends BaseGopRequest<AliexpressIssueDetailGetResponse> {

    /** 买家登录帐号 */
    private String buyerLoginId;
    /** 纠纷id */
    private Long issueId;

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

    @Override
    public String getApiName() {
        return "aliexpress.issue.detail.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (buyerLoginId != null) {
                        super.addApiParameter("buyer_login_id", buyerLoginId.toString());
                    }
                            if (issueId != null) {
                        super.addApiParameter("issue_id", issueId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressIssueDetailGetResponse> getResponseClass() {
        return AliexpressIssueDetailGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}