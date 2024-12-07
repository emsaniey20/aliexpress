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
*  taobao.vas.subsc.search
*/
public class TaobaoVasSubscSearchResponse extends IopResponse {

    /** 总记录数 */
        @ApiField("total_item")
        private Integer totalItem;
    /** 订购关系对象 */
        @ApiListField("article_subs")
        private List<TaobaoVasSubscSearchArticleSub> articleSubs;

public Integer getTotalItem(){
return this.totalItem;
}
public void setTotalItem(Integer totalItem){
    this.totalItem = totalItem;
}
public List<TaobaoVasSubscSearchArticleSub> getArticleSubs(){
return this.articleSubs;
}
public void setArticleSubs(List<TaobaoVasSubscSearchArticleSub> articleSubs){
    this.articleSubs = articleSubs;
}

}