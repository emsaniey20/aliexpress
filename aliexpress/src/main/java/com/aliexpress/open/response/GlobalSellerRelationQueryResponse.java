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
*  global.seller.relation.query
*/
public class GlobalSellerRelationQueryResponse extends IopResponse {

    /** 渠道账号列表 */
        @ApiListField("seller_relation_list")
        private List<GlobalSellerRelationQuerySellerRelationApiDTO> sellerRelationList;
    /** 成功失败 */
        @ApiField("success")
        private Boolean success;
    /** 全球商品币种 */
        @ApiField("global_currency")
        private String globalCurrency;

public List<GlobalSellerRelationQuerySellerRelationApiDTO> getSellerRelationList(){
return this.sellerRelationList;
}
public void setSellerRelationList(List<GlobalSellerRelationQuerySellerRelationApiDTO> sellerRelationList){
    this.sellerRelationList = sellerRelationList;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getGlobalCurrency(){
return this.globalCurrency;
}
public void setGlobalCurrency(String globalCurrency){
    this.globalCurrency = globalCurrency;
}

}