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
*  aliexpress.affiliate.image.search
*/
public class AliexpressAffiliateImageSearchRequest extends BaseGopRequest<AliexpressAffiliateImageSearchResponse> {

    /** API signature */
    private String appSignature;
    /** Respond parameter list, eg: commission_rate,sale_price */
    private String fields;
    /** Picture file byte array, maximum size is 100 KB */
    private FileItem imageFileBytes;
    /** Category tendency of pictures. If it is blank, it defaults to the best match. 0 - Clothing; 3 - Package; 4 - Shoes; 88888888 - Other categories */
    private String imgCid;
    /** Unique identification number of media user */
    private String mediaUserId;
    /** Number of search results, maximum 50 */
    private Integer productCnt;
    /** Ship-to country */
    private String shptTo;
    /** Sort by:SALE_PRICE_ASC, SALE_PRICE_DESC,LAST_VOLUME_ASC, LAST_VOLUME_DESC */
    private String sort;
    /** Currency: USD, GBP, CAD, EUR, UAH, MXN,TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW */
    private String targetCurrency;
    /** Language: en,ru,pt,es,fr,id,it,th,ja,ar,vi,tr,de,he,ko,nl,pl,mx,cl,iw,in */
    private String targetLanguage;
    /** Tracking id */
    private String trackingId;

    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }
    public String getFields(){
        return this.fields;
    }
    public void setFields(String fields){
        this.fields = fields;
        }
    public FileItem getImageFileBytes(){
        return this.imageFileBytes;
    }
    public void setImageFileBytes(FileItem imageFileBytes){
        this.imageFileBytes = imageFileBytes;
        }
    public String getImgCid(){
        return this.imgCid;
    }
    public void setImgCid(String imgCid){
        this.imgCid = imgCid;
        }
    public String getMediaUserId(){
        return this.mediaUserId;
    }
    public void setMediaUserId(String mediaUserId){
        this.mediaUserId = mediaUserId;
        }
    public Integer getProductCnt(){
        return this.productCnt;
    }
    public void setProductCnt(Integer productCnt){
        this.productCnt = productCnt;
        }
    public String getShptTo(){
        return this.shptTo;
    }
    public void setShptTo(String shptTo){
        this.shptTo = shptTo;
        }
    public String getSort(){
        return this.sort;
    }
    public void setSort(String sort){
        this.sort = sort;
        }
    public String getTargetCurrency(){
        return this.targetCurrency;
    }
    public void setTargetCurrency(String targetCurrency){
        this.targetCurrency = targetCurrency;
        }
    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getTrackingId(){
        return this.trackingId;
    }
    public void setTrackingId(String trackingId){
        this.trackingId = trackingId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.image.search";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (fields != null) {
                        super.addApiParameter("fields", fields.toString());
                    }
                                        if (imgCid != null) {
                        super.addApiParameter("img_cid", imgCid.toString());
                    }
                            if (mediaUserId != null) {
                        super.addApiParameter("media_user_id", mediaUserId.toString());
                    }
                            if (productCnt != null) {
                        super.addApiParameter("product_cnt", productCnt.toString());
                    }
                            if (shptTo != null) {
                        super.addApiParameter("shpt_to", shptTo.toString());
                    }
                            if (sort != null) {
                        super.addApiParameter("sort", sort.toString());
                    }
                            if (targetCurrency != null) {
                        super.addApiParameter("target_currency", targetCurrency.toString());
                    }
                            if (targetLanguage != null) {
                        super.addApiParameter("target_language", targetLanguage.toString());
                    }
                            if (trackingId != null) {
                        super.addApiParameter("tracking_id", trackingId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                            if (imageFileBytes != null) {
            super.addFileParameter("image_file_bytes", imageFileBytes);
        }
                                                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateImageSearchResponse> getResponseClass() {
        return AliexpressAffiliateImageSearchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}