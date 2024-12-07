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
*  aliexpress.postproduct.redefining.offlineaeproduct
*/
public class AliexpressPostproductRedefiningOfflineaeproductRequest extends BaseGopRequest<AliexpressPostproductRedefiningOfflineaeproductResponse> {

    /** 下架原因，目前仅用于商品诊断优化 */
    private String editReason;
    /** 需要下架的产品id。多个产品ID用英文分号隔开。 */
    private String productIds;

    public String getEditReason(){
        return this.editReason;
    }
    public void setEditReason(String editReason){
        this.editReason = editReason;
        }
    public String getProductIds(){
        return this.productIds;
    }
    public void setProductIds(String productIds){
        this.productIds = productIds;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.offlineaeproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (editReason != null) {
                        super.addApiParameter("edit_reason", editReason.toString());
                    }
                            if (productIds != null) {
                        super.addApiParameter("product_ids", productIds.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningOfflineaeproductResponse> getResponseClass() {
        return AliexpressPostproductRedefiningOfflineaeproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}