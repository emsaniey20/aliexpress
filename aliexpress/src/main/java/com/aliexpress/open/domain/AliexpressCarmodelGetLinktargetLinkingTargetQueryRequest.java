package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressCarmodelGetLinktargetLinkingTargetQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 零件id集合 */
                @ApiListField("article_id_list")
            private List<String> articleIdList;
        /** 语言 */
                @ApiField("lang")
            private String lang;
        /** 关联车型类型 */
                @ApiField("linking_target_type")
            private String linkingTargetType;
    
        public List<String> getArticleIdList() {
    return this.articleIdList;
    }
    public void setArticleIdList(List<String> articleIdList) {
    this.articleIdList = articleIdList;
    }
        public String getLang() {
    return this.lang;
    }
    public void setLang(String lang) {
    this.lang = lang;
    }
        public String getLinkingTargetType() {
    return this.linkingTargetType;
    }
    public void setLinkingTargetType(String linkingTargetType) {
    this.linkingTargetType = linkingTargetType;
    }
    }