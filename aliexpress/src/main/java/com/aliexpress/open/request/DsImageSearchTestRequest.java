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
*  /ds/image/search/test
*/
public class DsImageSearchTestRequest extends BaseGopRequest<DsImageSearchTestResponse> {

    /** 1 */
    private String targetLanguage;
    /** 1 */
    private String targetCurrency;
    /** 1 */
    private Integer productCnt;
    /** 1 */
    private String sort;
    /** 1 */
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
    public FileItem getImageFileBytes(){
        return this.imageFileBytes;
    }
    public void setImageFileBytes(FileItem imageFileBytes){
        this.imageFileBytes = imageFileBytes;
        }

    @Override
    public String getApiName() {
        return "/ds/image/search/test";
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
    public Class<DsImageSearchTestResponse> getResponseClass() {
        return DsImageSearchTestResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}