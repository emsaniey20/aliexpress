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
*  aliexpress.ds.image.search
*/
public class AliexpressDsImageSearchRequest extends BaseGopRequest<AliexpressDsImageSearchResponse> {

    /** target_language:EN,RU,PT,ES,FR,ID,IT,TH,JA,AR,VI,TR,DE,HE,KO,NL,PL,MX,CL,IW,IN */
    private String targetLanguage;
    /** target_currency:USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW */
    private String targetCurrency;
    /** count of products， max 150. */
    private Integer productCnt;
    /** SALE_PRICE_ASC, SALE_PRICE_DESC, LAST_VOLUME_ASC, LAST_VOLUME_DESC */
    private String sort;
    /** optional  Ship to Country */
    private String shptTo;
    /** image name in fileserver，max size 100 KB */
    private FileItem imageFileBytes;

    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getTargetCurrency(){
        return this.targetCurrency;
    }
    public void setTargetCurrency(String targetCurrency){
        this.targetCurrency = targetCurrency;
        }
    public Integer getProductCnt(){
        return this.productCnt;
    }
    public void setProductCnt(Integer productCnt){
        this.productCnt = productCnt;
        }
    public String getSort(){
        return this.sort;
    }
    public void setSort(String sort){
        this.sort = sort;
        }
    public String getShptTo(){
        return this.shptTo;
    }
    public void setShptTo(String shptTo){
        this.shptTo = shptTo;
        }
    public FileItem getImageFileBytes(){
        return this.imageFileBytes;
    }
    public void setImageFileBytes(FileItem imageFileBytes){
        this.imageFileBytes = imageFileBytes;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ds.image.search";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (targetLanguage != null) {
                        super.addApiParameter("target_language", targetLanguage.toString());
                    }
                            if (targetCurrency != null) {
                        super.addApiParameter("target_currency", targetCurrency.toString());
                    }
                            if (productCnt != null) {
                        super.addApiParameter("product_cnt", productCnt.toString());
                    }
                            if (sort != null) {
                        super.addApiParameter("sort", sort.toString());
                    }
                            if (shptTo != null) {
                        super.addApiParameter("shpt_to", shptTo.toString());
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
    public Class<AliexpressDsImageSearchResponse> getResponseClass() {
        return AliexpressDsImageSearchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}