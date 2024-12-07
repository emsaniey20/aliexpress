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
*  aliexpress.social.shopping.payment.queryresult
*/
public class AliexpressSocialShoppingPaymentQueryresultRequest extends BaseGopRequest<AliexpressSocialShoppingPaymentQueryresultResponse> {

    /** cashier token, get it from apply pay api */
    private String cashierRequestToken;
    /** polling query params */
    private String queryParams;
    /** user client ip */
    private String ip;
    /** user agent */
    private String userAgent;
    /** for future expansion, don't need set for ok right now */
    private String extraParams;
    /** polling query */
    private Boolean polling;
    /** ok user id */
    private String snsAccountId;
    /** get it from apply apy api */
    private String pmntId;
    /** which platform the user use.  there are 3 value for use  pc: for pc  h5: for msite  wireless: for app */
    private String platform;
    /** get it from apply pay api */
    private String cashierRequestNo;
    /** for polling times */
    private Integer counter;

    public String getCashierRequestToken(){
        return this.cashierRequestToken;
    }
    public void setCashierRequestToken(String cashierRequestToken){
        this.cashierRequestToken = cashierRequestToken;
        }
    public String getQueryParams(){
        return this.queryParams;
    }
    public void setQueryParams(String queryParams){
        this.queryParams = queryParams;
        }
    public String getIp(){
        return this.ip;
    }
    public void setIp(String ip){
        this.ip = ip;
        }
    public String getUserAgent(){
        return this.userAgent;
    }
    public void setUserAgent(String userAgent){
        this.userAgent = userAgent;
        }
    public String getExtraParams(){
        return this.extraParams;
    }
    public void setExtraParams(String extraParams){
        this.extraParams = extraParams;
        }
    public Boolean getPolling(){
        return this.polling;
    }
    public void setPolling(Boolean polling){
        this.polling = polling;
        }
    public String getSnsAccountId(){
        return this.snsAccountId;
    }
    public void setSnsAccountId(String snsAccountId){
        this.snsAccountId = snsAccountId;
        }
    public String getPmntId(){
        return this.pmntId;
    }
    public void setPmntId(String pmntId){
        this.pmntId = pmntId;
        }
    public String getPlatform(){
        return this.platform;
    }
    public void setPlatform(String platform){
        this.platform = platform;
        }
    public String getCashierRequestNo(){
        return this.cashierRequestNo;
    }
    public void setCashierRequestNo(String cashierRequestNo){
        this.cashierRequestNo = cashierRequestNo;
        }
    public Integer getCounter(){
        return this.counter;
    }
    public void setCounter(Integer counter){
        this.counter = counter;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.payment.queryresult";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (cashierRequestToken != null) {
                        super.addApiParameter("cashier_request_token", cashierRequestToken.toString());
                    }
                            if (queryParams != null) {
                        super.addApiParameter("query_params", queryParams.toString());
                    }
                            if (ip != null) {
                        super.addApiParameter("ip", ip.toString());
                    }
                            if (userAgent != null) {
                        super.addApiParameter("user_agent", userAgent.toString());
                    }
                            if (extraParams != null) {
                        super.addApiParameter("extra_params", extraParams.toString());
                    }
                            if (polling != null) {
                        super.addApiParameter("polling", polling.toString());
                    }
                            if (snsAccountId != null) {
                        super.addApiParameter("sns_account_id", snsAccountId.toString());
                    }
                            if (pmntId != null) {
                        super.addApiParameter("pmnt_id", pmntId.toString());
                    }
                            if (platform != null) {
                        super.addApiParameter("platform", platform.toString());
                    }
                            if (cashierRequestNo != null) {
                        super.addApiParameter("cashier_request_no", cashierRequestNo.toString());
                    }
                            if (counter != null) {
                        super.addApiParameter("counter", counter.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingPaymentQueryresultResponse> getResponseClass() {
        return AliexpressSocialShoppingPaymentQueryresultResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}