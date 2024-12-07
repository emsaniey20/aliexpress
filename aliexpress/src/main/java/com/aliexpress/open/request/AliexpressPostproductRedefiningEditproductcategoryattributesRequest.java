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
*  aliexpress.postproduct.redefining.editproductcategoryattributes
*/
public class AliexpressPostproductRedefiningEditproductcategoryattributesRequest extends BaseGopRequest<AliexpressPostproductRedefiningEditproductcategoryattributesResponse> {

    /** 产品的ID */
    private Long productId;
    /** 类目属性信息 */
    private List<AliexpressPostproductRedefiningEditproductcategoryattributesAeopAeProductProperty> productCategoryAttributes;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public List<AliexpressPostproductRedefiningEditproductcategoryattributesAeopAeProductProperty> getProductCategoryAttributes(){
        return this.productCategoryAttributes;
    }
    public void setProductCategoryAttributes(List<AliexpressPostproductRedefiningEditproductcategoryattributesAeopAeProductProperty> productCategoryAttributes){
        this.productCategoryAttributes = productCategoryAttributes;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.editproductcategoryattributes";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (productCategoryAttributes != null) {
                        super.addApiParameter("product_category_attributes", new JSONWriter(true, false).write(productCategoryAttributes));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningEditproductcategoryattributesResponse> getResponseClass() {
        return AliexpressPostproductRedefiningEditproductcategoryattributesResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}