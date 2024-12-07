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
*  aliexpress.postproduct.redefining.postmultilanguageaeproduct
*/
public class AliexpressPostproductRedefiningPostmultilanguageaeproductRequest extends BaseGopRequest<AliexpressPostproductRedefiningPostmultilanguageaeproductResponse> {

    /** 扩展参数字段 json custom_image 分国家主图  vat_tags 含税标 */
    private String extParam;
    /** 产品信息 */
    private AliexpressPostproductRedefiningPostmultilanguageaeproductMultilanguageAeopAEProduct product;

    public String getExtParam(){
        return this.extParam;
    }
    public void setExtParam(String extParam){
        this.extParam = extParam;
        }
    public AliexpressPostproductRedefiningPostmultilanguageaeproductMultilanguageAeopAEProduct getProduct(){
        return this.product;
    }
    public void setProduct(AliexpressPostproductRedefiningPostmultilanguageaeproductMultilanguageAeopAEProduct product){
        this.product = product;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.postmultilanguageaeproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (extParam != null) {
                        super.addApiParameter("ext_param", extParam.toString());
                    }
                            if (product != null) {
                        super.addApiParameter("product", new JSONWriter(true, false).write(product));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningPostmultilanguageaeproductResponse> getResponseClass() {
        return AliexpressPostproductRedefiningPostmultilanguageaeproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}