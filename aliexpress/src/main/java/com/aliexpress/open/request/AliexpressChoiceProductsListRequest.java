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
*  aliexpress.choice.products.list
*/
public class AliexpressChoiceProductsListRequest extends BaseGopRequest<AliexpressChoiceProductsListResponse> {

    /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
    private Long channelSellerId;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;
    /** 分页查询，每页数量，最多20个商品 */
    private Long pageSize;
    /** 查询条件 */
    private AliexpressChoiceProductsListProductSearchConditionDO searchConditionDo;
    /** 当前页 */
    private Long currentPage;
    /** version 版本号。不传默认是1。 1代表商货融合之前的版本，不能自动创建货品；   2 代表商货融合的版本，需要做货品信息的参数校验，发品成功自动商货绑定。 */
    private String version;

    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }
    public Long getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Long pageSize){
        this.pageSize = pageSize;
        }
    public AliexpressChoiceProductsListProductSearchConditionDO getSearchConditionDo(){
        return this.searchConditionDo;
    }
    public void setSearchConditionDo(AliexpressChoiceProductsListProductSearchConditionDO searchConditionDo){
        this.searchConditionDo = searchConditionDo;
        }
    public Long getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Long currentPage){
        this.currentPage = currentPage;
        }
    public String getVersion(){
        return this.version;
    }
    public void setVersion(String version){
        this.version = version;
        }

    @Override
    public String getApiName() {
        return "aliexpress.choice.products.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (searchConditionDo != null) {
                        super.addApiParameter("search_condition_do", new JSONWriter(true, false).write(searchConditionDo));
                    }
                            if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                            if (version != null) {
                        super.addApiParameter("version", version.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressChoiceProductsListResponse> getResponseClass() {
        return AliexpressChoiceProductsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}