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
*  aliexpress.data.redefining.queryproductbusinessinfobyid
*/
public class AliexpressDataRedefiningQueryproductbusinessinfobyidResponse extends IopResponse {

    /** 单个商品浏览量。  {"addCartCount":30天加入购物车数量,"exposedCount":30天曝光量,"favoritedCount":30天加心愿单量,"gmvPerBuyer":客单价,"gmvPerBuyer30d":最近30天客单价,"gmvPerOrder":订单均额,"gmvPerOrder30d":最近30天订单均额,"outputOrder":30天成交订单数,"refundAmt":30天退款金额,"success":本次调用是否成功,"viewedCount":30天浏览量}  没有结果时的返回：   {\"itemList\":商品列表为空,\"success\":本次调用是否成功,\"totalItem\":商品数为0} */
        @ApiField("result")
        private String result;

public String getResult(){
return this.result;
}
public void setResult(String result){
    this.result = result;
}

}