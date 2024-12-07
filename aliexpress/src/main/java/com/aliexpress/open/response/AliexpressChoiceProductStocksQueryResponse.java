package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  aliexpress.choice.product.stocks.query
*/
public class AliexpressChoiceProductStocksQueryResponse extends IopResponse {

    /** 商品sku库存列表 */
        @ApiListField("product_sku_stock_list")
        private List<AliexpressChoiceProductStocksQueryProductSkuStockDTO> productSkuStockList;
    /** 请求结果：成功，失败 */
        @ApiField("success")
        private Boolean success;

public List<AliexpressChoiceProductStocksQueryProductSkuStockDTO> getProductSkuStockList(){
return this.productSkuStockList;
}
public void setProductSkuStockList(List<AliexpressChoiceProductStocksQueryProductSkuStockDTO> productSkuStockList){
    this.productSkuStockList = productSkuStockList;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}

}