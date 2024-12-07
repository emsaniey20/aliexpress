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
*  aliexpress.postproduct.redefining.setshopwindowproduct
*/
public class AliexpressPostproductRedefiningSetshopwindowproductRequest extends BaseGopRequest<AliexpressPostproductRedefiningSetshopwindowproductResponse> {

    /** 待设置橱窗的商品id，可输入多个，之前用半角分号分割。 */
    private String productIdList;

    public String getProductIdList(){
        return this.productIdList;
    }
    public void setProductIdList(String productIdList){
        this.productIdList = productIdList;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.setshopwindowproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productIdList != null) {
                        super.addApiParameter("product_id_list", productIdList.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningSetshopwindowproductResponse> getResponseClass() {
        return AliexpressPostproductRedefiningSetshopwindowproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}