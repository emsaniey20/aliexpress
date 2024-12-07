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
*  aliexpress.social.shopping.payment.apply
*/
public class AliexpressSocialShoppingPaymentApplyRequest extends BaseGopRequest<AliexpressSocialShoppingPaymentApplyResponse> {

    /** cashier token, get it from place order api */
    private String cashierToken;
    /** user client ip */
    private String ip;
    /** provide by mmr, it's for mmr payment page ui */
    private String skin;
    /** json */
    private String promotionIds;
    /** user agent */
    private String userAgent;
    /** for future expansion */
    private String extraParams;
    /** order ids. get it from place order interface */
    private String orderIds;
    /** user id */
    private String snsAccountId;
    /** user use which platform. just have 3 value: pc, h5, wireless. ps wireless is for app. */
    private String platform;
    /** for vk: VK_BANKCARD, for ok: OK_BANKCARD */
    private String subPaymentOption;
    /** MMR_EBANK */
    private String paymentOption;

    public String getCashierToken(){
        return this.cashierToken;
    }
    public void setCashierToken(String cashierToken){
        this.cashierToken = cashierToken;
        }
    public String getIp(){
        return this.ip;
    }
    public void setIp(String ip){
        this.ip = ip;
        }
    public String getSkin(){
        return this.skin;
    }
    public void setSkin(String skin){
        this.skin = skin;
        }
    public String getPromotionIds(){
        return this.promotionIds;
    }
    public void setPromotionIds(String promotionIds){
        this.promotionIds = promotionIds;
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
    public String getOrderIds(){
        return this.orderIds;
    }
    public void setOrderIds(String orderIds){
        this.orderIds = orderIds;
        }
    public String getSnsAccountId(){
        return this.snsAccountId;
    }
    public void setSnsAccountId(String snsAccountId){
        this.snsAccountId = snsAccountId;
        }
    public String getPlatform(){
        return this.platform;
    }
    public void setPlatform(String platform){
        this.platform = platform;
        }
    public String getSubPaymentOption(){
        return this.subPaymentOption;
    }
    public void setSubPaymentOption(String subPaymentOption){
        this.subPaymentOption = subPaymentOption;
        }
    public String getPaymentOption(){
        return this.paymentOption;
    }
    public void setPaymentOption(String paymentOption){
        this.paymentOption = paymentOption;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.payment.apply";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (cashierToken != null) {
                        super.addApiParameter("cashier_token", cashierToken.toString());
                    }
                            if (ip != null) {
                        super.addApiParameter("ip", ip.toString());
                    }
                            if (skin != null) {
                        super.addApiParameter("skin", skin.toString());
                    }
                            if (promotionIds != null) {
                        super.addApiParameter("promotion_ids", promotionIds.toString());
                    }
                            if (userAgent != null) {
                        super.addApiParameter("user_agent", userAgent.toString());
                    }
                            if (extraParams != null) {
                        super.addApiParameter("extra_params", extraParams.toString());
                    }
                            if (orderIds != null) {
                        super.addApiParameter("order_ids", orderIds.toString());
                    }
                            if (snsAccountId != null) {
                        super.addApiParameter("sns_account_id", snsAccountId.toString());
                    }
                            if (platform != null) {
                        super.addApiParameter("platform", platform.toString());
                    }
                            if (subPaymentOption != null) {
                        super.addApiParameter("sub_payment_option", subPaymentOption.toString());
                    }
                            if (paymentOption != null) {
                        super.addApiParameter("payment_option", paymentOption.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingPaymentApplyResponse> getResponseClass() {
        return AliexpressSocialShoppingPaymentApplyResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}