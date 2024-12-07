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
*  aliexpress.social.item.promotion
*/
public class AliexpressSocialItemPromotionRequest extends BaseGopRequest<AliexpressSocialItemPromotionResponse> {

    /** 推广的商品链接 */
    private String targetUrl;
    /** 子渠道号 */
    private String af;
    /** campaign Id */
    private String cn;
    /** creative id */
    private String cv;
    /** click id */
    private String dp;

    public String getTargetUrl(){
        return this.targetUrl;
    }
    public void setTargetUrl(String targetUrl){
        this.targetUrl = targetUrl;
        }
    public String getAf(){
        return this.af;
    }
    public void setAf(String af){
        this.af = af;
        }
    public String getCn(){
        return this.cn;
    }
    public void setCn(String cn){
        this.cn = cn;
        }
    public String getCv(){
        return this.cv;
    }
    public void setCv(String cv){
        this.cv = cv;
        }
    public String getDp(){
        return this.dp;
    }
    public void setDp(String dp){
        this.dp = dp;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.item.promotion";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (targetUrl != null) {
                        super.addApiParameter("target_url", targetUrl.toString());
                    }
                            if (af != null) {
                        super.addApiParameter("af", af.toString());
                    }
                            if (cn != null) {
                        super.addApiParameter("cn", cn.toString());
                    }
                            if (cv != null) {
                        super.addApiParameter("cv", cv.toString());
                    }
                            if (dp != null) {
                        super.addApiParameter("dp", dp.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialItemPromotionResponse> getResponseClass() {
        return AliexpressSocialItemPromotionResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}