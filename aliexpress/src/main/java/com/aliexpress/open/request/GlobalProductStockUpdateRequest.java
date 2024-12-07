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
*  global.product.stock.update
*/
public class GlobalProductStockUpdateRequest extends BaseGopRequest<GlobalProductStockUpdateResponse> {

    /** 统一商品id */
    private Long productId;
    /** 渠道库存信息 */
    private List<GlobalProductStockUpdateCspChannelSkuApiDTO> channelSkuList;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public List<GlobalProductStockUpdateCspChannelSkuApiDTO> getChannelSkuList(){
        return this.channelSkuList;
    }
    public void setChannelSkuList(List<GlobalProductStockUpdateCspChannelSkuApiDTO> channelSkuList){
        this.channelSkuList = channelSkuList;
        }

    @Override
    public String getApiName() {
        return "global.product.stock.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (channelSkuList != null) {
                        super.addApiParameter("channel_sku_list", new JSONWriter(true, false).write(channelSkuList));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<GlobalProductStockUpdateResponse> getResponseClass() {
        return GlobalProductStockUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}