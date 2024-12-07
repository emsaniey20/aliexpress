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
*  aliexpress.pop.choice.product.stocks.update
*/
public class AliexpressPopChoiceProductStocksUpdateRequest extends BaseGopRequest<AliexpressPopChoiceProductStocksUpdateResponse> {

    /** sku列表 */
    private List<AliexpressPopChoiceProductStocksUpdatePopChoiceSkuStockDTO> popChoiceSkuStockList;
    /** 商品ID */
    private Long productId;

    public List<AliexpressPopChoiceProductStocksUpdatePopChoiceSkuStockDTO> getPopChoiceSkuStockList(){
        return this.popChoiceSkuStockList;
    }
    public void setPopChoiceSkuStockList(List<AliexpressPopChoiceProductStocksUpdatePopChoiceSkuStockDTO> popChoiceSkuStockList){
        this.popChoiceSkuStockList = popChoiceSkuStockList;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.pop.choice.product.stocks.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (popChoiceSkuStockList != null) {
                        super.addApiParameter("pop_choice_sku_stock_list", new JSONWriter(true, false).write(popChoiceSkuStockList));
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPopChoiceProductStocksUpdateResponse> getResponseClass() {
        return AliexpressPopChoiceProductStocksUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}