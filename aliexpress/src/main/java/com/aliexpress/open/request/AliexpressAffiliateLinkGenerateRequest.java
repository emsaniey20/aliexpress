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
*  aliexpress.affiliate.link.generate
*/
public class AliexpressAffiliateLinkGenerateRequest extends BaseGopRequest<AliexpressAffiliateLinkGenerateResponse> {

    /** API signature */
    private String appSignature;
    /** Promotion link type: 0 for normal link which has standard commission , and 2 for hot link which has hot product commission */
    private Long promotionLinkType;
    /** original link or value */
    private String sourceValues;
    /** Your trackingID */
    private String trackingId;

    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }
    public Long getPromotionLinkType(){
        return this.promotionLinkType;
    }
    public void setPromotionLinkType(Long promotionLinkType){
        this.promotionLinkType = promotionLinkType;
        }
    public String getSourceValues(){
        return this.sourceValues;
    }
    public void setSourceValues(String sourceValues){
        this.sourceValues = sourceValues;
        }
    public String getTrackingId(){
        return this.trackingId;
    }
    public void setTrackingId(String trackingId){
        this.trackingId = trackingId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.link.generate";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (promotionLinkType != null) {
                        super.addApiParameter("promotion_link_type", promotionLinkType.toString());
                    }
                            if (sourceValues != null) {
                        super.addApiParameter("source_values", sourceValues.toString());
                    }
                            if (trackingId != null) {
                        super.addApiParameter("tracking_id", trackingId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateLinkGenerateResponse> getResponseClass() {
        return AliexpressAffiliateLinkGenerateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}