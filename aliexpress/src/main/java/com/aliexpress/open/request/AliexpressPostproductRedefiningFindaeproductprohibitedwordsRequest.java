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
*  aliexpress.postproduct.redefining.findaeproductprohibitedwords
*/
public class AliexpressPostproductRedefiningFindaeproductprohibitedwordsRequest extends BaseGopRequest<AliexpressPostproductRedefiningFindaeproductprohibitedwordsResponse> {

    /** 商品类目ID */
    private Integer categoryId;
    /** 商品的标题 */
    private String title;
    /** 关键字 */
    private List<String> keywords;
    /** 商品类目属性 */
    private List<String> productProperties;
    /** 商品的详细描述 */
    private String detail;

    public Integer getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
        }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
        }
    public List<String> getKeywords(){
        return this.keywords;
    }
    public void setKeywords(List<String> keywords){
        this.keywords = keywords;
        }
    public List<String> getProductProperties(){
        return this.productProperties;
    }
    public void setProductProperties(List<String> productProperties){
        this.productProperties = productProperties;
        }
    public String getDetail(){
        return this.detail;
    }
    public void setDetail(String detail){
        this.detail = detail;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.findaeproductprohibitedwords";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                            if (title != null) {
                        super.addApiParameter("title", title.toString());
                    }
                            if (keywords != null) {
                        super.addApiParameter("keywords", new JSONWriter(true, false).write(keywords));
                    }
                            if (productProperties != null) {
                        super.addApiParameter("product_properties", new JSONWriter(true, false).write(productProperties));
                    }
                            if (detail != null) {
                        super.addApiParameter("detail", detail.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningFindaeproductprohibitedwordsResponse> getResponseClass() {
        return AliexpressPostproductRedefiningFindaeproductprohibitedwordsResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}