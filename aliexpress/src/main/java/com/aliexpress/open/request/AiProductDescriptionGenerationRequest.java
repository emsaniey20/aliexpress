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
*  /ai/product/description/generation
*/
public class AiProductDescriptionGenerationRequest extends BaseGopRequest<AiProductDescriptionGenerationResponse> {

    /** 目标语种 */
    private String targetLanguage;
    /** 商品标题 */
    private String productTitle;
    /** 商品属性 */
    private String itemSpecs;
    /** 商品关键词 */
    private List<String> productKeyWords;
    /** 类目信息 */
    private String productCategory;
    /** 商品详细描述 */
    private String productDescription;

    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getProductTitle(){
        return this.productTitle;
    }
    public void setProductTitle(String productTitle){
        this.productTitle = productTitle;
        }
    public String getItemSpecs(){
        return this.itemSpecs;
    }
    public void setItemSpecs(String itemSpecs){
        this.itemSpecs = itemSpecs;
        }
    public List<String> getProductKeyWords(){
        return this.productKeyWords;
    }
    public void setProductKeyWords(List<String> productKeyWords){
        this.productKeyWords = productKeyWords;
        }
    public String getProductCategory(){
        return this.productCategory;
    }
    public void setProductCategory(String productCategory){
        this.productCategory = productCategory;
        }
    public String getProductDescription(){
        return this.productDescription;
    }
    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
        }

    @Override
    public String getApiName() {
        return "/ai/product/description/generation";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (targetLanguage != null) {
                        super.addApiParameter("targetLanguage", targetLanguage.toString());
                    }
                            if (productTitle != null) {
                        super.addApiParameter("productTitle", productTitle.toString());
                    }
                            if (itemSpecs != null) {
                        super.addApiParameter("itemSpecs", itemSpecs.toString());
                    }
                            if (productKeyWords != null) {
                        super.addApiParameter("productKeyWords", new JSONWriter(true, false).write(productKeyWords));
                    }
                            if (productCategory != null) {
                        super.addApiParameter("productCategory", productCategory.toString());
                    }
                            if (productDescription != null) {
                        super.addApiParameter("productDescription", productDescription.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AiProductDescriptionGenerationResponse> getResponseClass() {
        return AiProductDescriptionGenerationResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}