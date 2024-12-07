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
*  aliexpress.logistics.redefining.getonlinelogisticsservicelistbyorderid
*/
public class AliexpressLogisticsRedefiningGetonlinelogisticsservicelistbyorderidRequest extends BaseGopRequest<AliexpressLogisticsRedefiningGetonlinelogisticsservicelistbyorderidResponse> {

    /** 包裹宽度 */
    private Long goodsWidth;
    /** 包裹高度 */
    private Long goodsHeight;
    /** 包裹重量 */
    private String goodsWeight;
    /** 包裹长度 */
    private Long goodsLength;
    /** 交易订单号 */
    private Long orderId;
    /** 多语言，zh_CN：中文、en_US：英语、ru_RU：俄语 */
    private String locale;

    public Long getGoodsWidth(){
        return this.goodsWidth;
    }
    public void setGoodsWidth(Long goodsWidth){
        this.goodsWidth = goodsWidth;
        }
    public Long getGoodsHeight(){
        return this.goodsHeight;
    }
    public void setGoodsHeight(Long goodsHeight){
        this.goodsHeight = goodsHeight;
        }
    public String getGoodsWeight(){
        return this.goodsWeight;
    }
    public void setGoodsWeight(String goodsWeight){
        this.goodsWeight = goodsWeight;
        }
    public Long getGoodsLength(){
        return this.goodsLength;
    }
    public void setGoodsLength(Long goodsLength){
        this.goodsLength = goodsLength;
        }
    public Long getOrderId(){
        return this.orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId = orderId;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.redefining.getonlinelogisticsservicelistbyorderid";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (goodsWidth != null) {
                        super.addApiParameter("goods_width", goodsWidth.toString());
                    }
                            if (goodsHeight != null) {
                        super.addApiParameter("goods_height", goodsHeight.toString());
                    }
                            if (goodsWeight != null) {
                        super.addApiParameter("goods_weight", goodsWeight.toString());
                    }
                            if (goodsLength != null) {
                        super.addApiParameter("goods_length", goodsLength.toString());
                    }
                            if (orderId != null) {
                        super.addApiParameter("order_id", orderId.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsRedefiningGetonlinelogisticsservicelistbyorderidResponse> getResponseClass() {
        return AliexpressLogisticsRedefiningGetonlinelogisticsservicelistbyorderidResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}