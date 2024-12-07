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
*  cainiao.global.logistics.listitemtag
*/
public class CainiaoGlobalLogisticsListitemtagRequest extends BaseGopRequest<CainiaoGlobalLogisticsListitemtagResponse> {

    /** 交易订单ID */
    private Long tradeOrderId;
    /** 商品ID列表 */
    private List<String> itemIdList;

    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public List<String> getItemIdList(){
        return this.itemIdList;
    }
    public void setItemIdList(List<String> itemIdList){
        this.itemIdList = itemIdList;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.logistics.listitemtag";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (itemIdList != null) {
                        super.addApiParameter("item_id_list", new JSONWriter(true, false).write(itemIdList));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalLogisticsListitemtagResponse> getResponseClass() {
        return CainiaoGlobalLogisticsListitemtagResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}