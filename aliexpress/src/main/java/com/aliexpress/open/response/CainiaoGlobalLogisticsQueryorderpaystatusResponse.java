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
*  cainiao.global.logistics.queryorderpaystatus
*/
public class CainiaoGlobalLogisticsQueryorderpaystatusResponse extends IopResponse {

    /** 查询商家是否存在未支付订单返回值 */
        @ApiField("response")
        private CainiaoGlobalLogisticsQueryorderpaystatusAeopSellerHasNotPayOrderResponse response;

public CainiaoGlobalLogisticsQueryorderpaystatusAeopSellerHasNotPayOrderResponse getResponse(){
return this.response;
}
public void setResponse(CainiaoGlobalLogisticsQueryorderpaystatusAeopSellerHasNotPayOrderResponse response){
    this.response = response;
}

}