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
*  taobao.vas.subscribe.get
*/
public class TaobaoVasSubscribeGetResponse extends IopResponse {

    /** 用户订购信息 */
        @ApiListField("article_user_subscribes")
        private List<TaobaoVasSubscribeGetArticleSub> articleUserSubscribes;

public List<TaobaoVasSubscribeGetArticleSub> getArticleUserSubscribes(){
return this.articleUserSubscribes;
}
public void setArticleUserSubscribes(List<TaobaoVasSubscribeGetArticleSub> articleUserSubscribes){
    this.articleUserSubscribes = articleUserSubscribes;
}

}