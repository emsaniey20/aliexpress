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
*  /ai/product/title/generation
*/
public class AiProductTitleGenerationRequest extends BaseGopRequest<AiProductTitleGenerationResponse> {

    /** 目标语言 */
    private String targetLanguage;
    /** 商品名称或标题 */
    private String productName;
    /** 商品类目 */
    private List<String> productCategory;
    /** 商品描述 */
    private String productDescription;
    /** 生成数量（1-6） */
    private Long generateCounts;
    /** 商品关键词 */
    private List<String> productKeyword;
    /** 商品规格 */
    private String itemSpec;

    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getProductName(){
        return this.productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
        }
    public List<String> getProductCategory(){
        return this.productCategory;
    }
    public void setProductCategory(List<String> productCategory){
        this.productCategory = productCategory;
        }
    public String getProductDescription(){
        return this.productDescription;
    }
    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
        }
    public Long getGenerateCounts(){
        return this.generateCounts;
    }
    public void setGenerateCounts(Long generateCounts){
        this.generateCounts = generateCounts;
        }
    public List<String> getProductKeyword(){
        return this.productKeyword;
    }
    public void setProductKeyword(List<String> productKeyword){
        this.productKeyword = productKeyword;
        }
    public String getItemSpec(){
        return this.itemSpec;
    }
    public void setItemSpec(String itemSpec){
        this.itemSpec = itemSpec;
        }

    @Override
    public String getApiName() {
        return "/ai/product/title/generation";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (targetLanguage != null) {
                        super.addApiParameter("targetLanguage", targetLanguage.toString());
                    }
                            if (productName != null) {
                        super.addApiParameter("productName", productName.toString());
                    }
                            if (productCategory != null) {
                        super.addApiParameter("productCategory", new JSONWriter(true, false).write(productCategory));
                    }
                            if (productDescription != null) {
                        super.addApiParameter("productDescription", productDescription.toString());
                    }
                            if (generateCounts != null) {
                        super.addApiParameter("generateCounts", generateCounts.toString());
                    }
                            if (productKeyword != null) {
                        super.addApiParameter("productKeyword", new JSONWriter(true, false).write(productKeyword));
                    }
                            if (itemSpec != null) {
                        super.addApiParameter("itemSpec", itemSpec.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AiProductTitleGenerationResponse> getResponseClass() {
        return AiProductTitleGenerationResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}