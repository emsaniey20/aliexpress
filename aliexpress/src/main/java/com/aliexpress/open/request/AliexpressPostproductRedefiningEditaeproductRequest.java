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
*  aliexpress.postproduct.redefining.editaeproduct
*/
public class AliexpressPostproductRedefiningEditaeproductRequest extends BaseGopRequest<AliexpressPostproductRedefiningEditaeproductResponse> {

    /** 扩展参数 json格式 */
    private String extParam;
    /** 产品信息 */
    private AliexpressPostproductRedefiningEditaeproductAeopAEProduct aeopAEProduct;

    public String getExtParam(){
        return this.extParam;
    }
    public void setExtParam(String extParam){
        this.extParam = extParam;
        }
    public AliexpressPostproductRedefiningEditaeproductAeopAEProduct getAeopAEProduct(){
        return this.aeopAEProduct;
    }
    public void setAeopAEProduct(AliexpressPostproductRedefiningEditaeproductAeopAEProduct aeopAEProduct){
        this.aeopAEProduct = aeopAEProduct;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.editaeproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (extParam != null) {
                        super.addApiParameter("ext_param", extParam.toString());
                    }
                            if (aeopAEProduct != null) {
                        super.addApiParameter("aeop_a_e_product", new JSONWriter(true, false).write(aeopAEProduct));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningEditaeproductResponse> getResponseClass() {
        return AliexpressPostproductRedefiningEditaeproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}