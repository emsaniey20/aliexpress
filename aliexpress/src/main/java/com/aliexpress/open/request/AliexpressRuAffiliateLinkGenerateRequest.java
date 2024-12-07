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
*  aliexpress.ru.affiliate.link.generate
*/
public class AliexpressRuAffiliateLinkGenerateRequest extends BaseGopRequest<AliexpressRuAffiliateLinkGenerateResponse> {

    /** Converted link type: 0 stands for normal Link, 1 stands for Search Link, 2 stands for hot link */
    private Long promotionLinkType;
    /** If false, generate encrypted link */
    private Boolean shortLink;
    /** Original links comma separated */
    private String sourceValues;
    /** Original trackingID of the promoter */
    private String trackingId;

    public Long getPromotionLinkType(){
        return this.promotionLinkType;
    }
    public void setPromotionLinkType(Long promotionLinkType){
        this.promotionLinkType = promotionLinkType;
        }
    public Boolean getShortLink(){
        return this.shortLink;
    }
    public void setShortLink(Boolean shortLink){
        this.shortLink = shortLink;
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
        return "aliexpress.ru.affiliate.link.generate";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (promotionLinkType != null) {
                        super.addApiParameter("promotion_link_type", promotionLinkType.toString());
                    }
                            if (shortLink != null) {
                        super.addApiParameter("short_link", shortLink.toString());
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
    public Class<AliexpressRuAffiliateLinkGenerateResponse> getResponseClass() {
        return AliexpressRuAffiliateLinkGenerateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}