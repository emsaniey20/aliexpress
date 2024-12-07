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
*  taobao.vas.order.search
*/
public class TaobaoVasOrderSearchResponse extends IopResponse {

    /** 2 */
        @ApiField("total_item")
        private Integer totalItem;
    /** dd */
        @ApiListField("article_biz_orders")
        private List<TaobaoVasOrderSearchArticleBizOrder> articleBizOrders;

public Integer getTotalItem(){
return this.totalItem;
}
public void setTotalItem(Integer totalItem){
    this.totalItem = totalItem;
}
public List<TaobaoVasOrderSearchArticleBizOrder> getArticleBizOrders(){
return this.articleBizOrders;
}
public void setArticleBizOrders(List<TaobaoVasOrderSearchArticleBizOrder> articleBizOrders){
    this.articleBizOrders = articleBizOrders;
}

}