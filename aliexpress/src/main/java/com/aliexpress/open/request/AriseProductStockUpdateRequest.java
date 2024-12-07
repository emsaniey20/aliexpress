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
*  arise.product.stock.update
*/
public class AriseProductStockUpdateRequest extends BaseGopRequest<AriseProductStockUpdateResponse> {

    /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
    private Long channelSellerId;
    /** 渠道商品id */
    private Long productId;
    /** 库存模块 */
    private List<AriseProductStockUpdateSkuStockModel> skuStockModelList;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;

    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public List<AriseProductStockUpdateSkuStockModel> getSkuStockModelList(){
        return this.skuStockModelList;
    }
    public void setSkuStockModelList(List<AriseProductStockUpdateSkuStockModel> skuStockModelList){
        this.skuStockModelList = skuStockModelList;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }

    @Override
    public String getApiName() {
        return "arise.product.stock.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (skuStockModelList != null) {
                        super.addApiParameter("sku_stock_model_list", new JSONWriter(true, false).write(skuStockModelList));
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AriseProductStockUpdateResponse> getResponseClass() {
        return AriseProductStockUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}