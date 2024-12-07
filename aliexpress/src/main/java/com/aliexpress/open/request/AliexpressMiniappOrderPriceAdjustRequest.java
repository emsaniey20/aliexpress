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
*  aliexpress.miniapp.order.price.adjust
*/
public class AliexpressMiniappOrderPriceAdjustRequest extends BaseGopRequest<AliexpressMiniappOrderPriceAdjustResponse> {

    /** new price */
    private AliexpressMiniappOrderPriceAdjustMoneyDTO newPrice;
    /** old price */
    private AliexpressMiniappOrderPriceAdjustMoneyDTO oldPrice;
    /** old price - new price */
    private AliexpressMiniappOrderPriceAdjustMoneyDTO reduction;
    /** aliexpress trade order id */
    private Long tradeOrderId;

    public AliexpressMiniappOrderPriceAdjustMoneyDTO getNewPrice(){
        return this.newPrice;
    }
    public void setNewPrice(AliexpressMiniappOrderPriceAdjustMoneyDTO newPrice){
        this.newPrice = newPrice;
        }
    public AliexpressMiniappOrderPriceAdjustMoneyDTO getOldPrice(){
        return this.oldPrice;
    }
    public void setOldPrice(AliexpressMiniappOrderPriceAdjustMoneyDTO oldPrice){
        this.oldPrice = oldPrice;
        }
    public AliexpressMiniappOrderPriceAdjustMoneyDTO getReduction(){
        return this.reduction;
    }
    public void setReduction(AliexpressMiniappOrderPriceAdjustMoneyDTO reduction){
        this.reduction = reduction;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.miniapp.order.price.adjust";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (newPrice != null) {
                        super.addApiParameter("new_price", new JSONWriter(true, false).write(newPrice));
                    }
                            if (oldPrice != null) {
                        super.addApiParameter("old_price", new JSONWriter(true, false).write(oldPrice));
                    }
                            if (reduction != null) {
                        super.addApiParameter("reduction", new JSONWriter(true, false).write(reduction));
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressMiniappOrderPriceAdjustResponse> getResponseClass() {
        return AliexpressMiniappOrderPriceAdjustResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}