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

public class CainiaoGlobalLogisticsListitemtagItemTag implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品ID */
                @ApiField("item_id")
            private String itemId;
        /** 商品标详情列表 */
                @ApiListField("tag_detail_list")
            private List<CainiaoGlobalLogisticsListitemtagItemTagDetail> tagDetailList;
    
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public List<CainiaoGlobalLogisticsListitemtagItemTagDetail> getTagDetailList() {
    return this.tagDetailList;
    }
    public void setTagDetailList(List<CainiaoGlobalLogisticsListitemtagItemTagDetail> tagDetailList) {
    this.tagDetailList = tagDetailList;
    }
    }