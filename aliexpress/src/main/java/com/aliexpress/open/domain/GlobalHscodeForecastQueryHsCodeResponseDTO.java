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

public class GlobalHscodeForecastQueryHsCodeResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 叶子hscode列表，全球商品和渠道商品中使用的都是hscode都是leaf_hs_code中选择的 */
                @ApiListField("leaf_hs_code_list")
            private List<GlobalHscodeForecastQueryLeafHsCode> leafHsCodeList;
        /** 叶子hscode对应的父节点。 是将父节点压缩都一个list集合中，方便查询，已经按照层级结构进行排序 */
                @ApiListField("parent_hs_code_list")
            private List<GlobalHscodeForecastQueryParentHsCode> parentHsCodeList;
    
        public List<GlobalHscodeForecastQueryLeafHsCode> getLeafHsCodeList() {
    return this.leafHsCodeList;
    }
    public void setLeafHsCodeList(List<GlobalHscodeForecastQueryLeafHsCode> leafHsCodeList) {
    this.leafHsCodeList = leafHsCodeList;
    }
        public List<GlobalHscodeForecastQueryParentHsCode> getParentHsCodeList() {
    return this.parentHsCodeList;
    }
    public void setParentHsCodeList(List<GlobalHscodeForecastQueryParentHsCode> parentHsCodeList) {
    this.parentHsCodeList = parentHsCodeList;
    }
    }