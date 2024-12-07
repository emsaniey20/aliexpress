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
*  aliexpress.postproduct.redefining.editmultilanguageproduct
*/
public class AliexpressPostproductRedefiningEditmultilanguageproductRequest extends BaseGopRequest<AliexpressPostproductRedefiningEditmultilanguageproductResponse> {

    /** 待编辑的商品ID。 */
    private Long productId;
    /** 商品多语言信息 */
    private AliexpressPostproductRedefiningEditmultilanguageproductAeopAEProductMultilanguageInfo aeopAEProductMultilanguageInfo;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public AliexpressPostproductRedefiningEditmultilanguageproductAeopAEProductMultilanguageInfo getAeopAEProductMultilanguageInfo(){
        return this.aeopAEProductMultilanguageInfo;
    }
    public void setAeopAEProductMultilanguageInfo(AliexpressPostproductRedefiningEditmultilanguageproductAeopAEProductMultilanguageInfo aeopAEProductMultilanguageInfo){
        this.aeopAEProductMultilanguageInfo = aeopAEProductMultilanguageInfo;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.editmultilanguageproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (aeopAEProductMultilanguageInfo != null) {
                        super.addApiParameter("aeop_a_e_product_multilanguage_info", new JSONWriter(true, false).write(aeopAEProductMultilanguageInfo));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningEditmultilanguageproductResponse> getResponseClass() {
        return AliexpressPostproductRedefiningEditmultilanguageproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}