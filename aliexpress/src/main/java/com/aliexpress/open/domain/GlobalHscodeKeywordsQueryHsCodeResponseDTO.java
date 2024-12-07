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

public class GlobalHscodeKeywordsQueryHsCodeResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 叶子hscode列表，全球商品和渠道商品中使用的都是hscode都是leaf_hs_code_list中选择的 */
                @ApiListField("leaf_hs_code_list")
            private List<GlobalHscodeKeywordsQueryLeafHsCode> leafHsCodeList;
        /** 叶子hscode对应的父节点。 是将父节点压缩都一个list集合中，方便查询，已经按照层级结构进行排序 */
                @ApiListField("parent_hs_code_list")
            private List<GlobalHscodeKeywordsQueryParentHsCode> parentHsCodeList;
    
        public List<GlobalHscodeKeywordsQueryLeafHsCode> getLeafHsCodeList() {
    return this.leafHsCodeList;
    }
    public void setLeafHsCodeList(List<GlobalHscodeKeywordsQueryLeafHsCode> leafHsCodeList) {
    this.leafHsCodeList = leafHsCodeList;
    }
        public List<GlobalHscodeKeywordsQueryParentHsCode> getParentHsCodeList() {
    return this.parentHsCodeList;
    }
    public void setParentHsCodeList(List<GlobalHscodeKeywordsQueryParentHsCode> parentHsCodeList) {
    this.parentHsCodeList = parentHsCodeList;
    }
    }