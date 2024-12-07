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
*  aliexpress.choice.product.stocks.update
*/
public class AliexpressChoiceProductStocksUpdateRequest extends BaseGopRequest<AliexpressChoiceProductStocksUpdateResponse> {

    /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
    private Long channelSellerId;
    /** 商品sku库存列表 */
    private List<AliexpressChoiceProductStocksUpdateProductSkuStockDTO> productSkuStockList;
    /** 商品id */
    private Long productId;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;

    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public List<AliexpressChoiceProductStocksUpdateProductSkuStockDTO> getProductSkuStockList(){
        return this.productSkuStockList;
    }
    public void setProductSkuStockList(List<AliexpressChoiceProductStocksUpdateProductSkuStockDTO> productSkuStockList){
        this.productSkuStockList = productSkuStockList;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }

    @Override
    public String getApiName() {
        return "aliexpress.choice.product.stocks.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (productSkuStockList != null) {
                        super.addApiParameter("product_sku_stock_list", new JSONWriter(true, false).write(productSkuStockList));
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
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
    public Class<AliexpressChoiceProductStocksUpdateResponse> getResponseClass() {
        return AliexpressChoiceProductStocksUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}