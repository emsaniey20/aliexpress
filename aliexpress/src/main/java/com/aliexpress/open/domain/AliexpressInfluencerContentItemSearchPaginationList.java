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

public class AliexpressInfluencerContentItemSearchPaginationList implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 分页参数，滚动加载使用 */
                @ApiField("next_start_row_key")
            private String nextStartRowKey;
        /** 总数 */
                @ApiField("total_size")
            private Integer totalSize;
        /** 是否还有数据 */
                @ApiField("has_next")
            private Boolean hasNext;
        /** 商品数据 */
                @ApiListField("list")
            private List<AliexpressInfluencerContentItemSearchItemDTO> list;
    
        public String getNextStartRowKey() {
    return this.nextStartRowKey;
    }
    public void setNextStartRowKey(String nextStartRowKey) {
    this.nextStartRowKey = nextStartRowKey;
    }
        public Integer getTotalSize() {
    return this.totalSize;
    }
    public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
    }
        public Boolean getHasNext() {
    return this.hasNext;
    }
    public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    }
        public List<AliexpressInfluencerContentItemSearchItemDTO> getList() {
    return this.list;
    }
    public void setList(List<AliexpressInfluencerContentItemSearchItemDTO> list) {
    this.list = list;
    }
    }