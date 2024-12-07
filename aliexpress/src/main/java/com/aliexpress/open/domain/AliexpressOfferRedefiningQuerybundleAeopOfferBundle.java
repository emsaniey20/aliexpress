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

public class AliexpressOfferRedefiningQuerybundleAeopOfferBundle implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 搭配ID */
                @ApiField("bundle_id")
            private Long bundleId;
        /** 搭配主商品 */
                @ApiField("main_item")
            private AliexpressOfferRedefiningQuerybundleAeopBundleItem mainItem;
        /** 搭配排列顺序 */
                @ApiField("order")
            private Integer order;
        /** 搭配商品列表 */
                @ApiListField("sub_item_list")
            private List<AliexpressOfferRedefiningQuerybundleAeopBundleSubItem> subItemList;
        /** 搭配中已下架或删除的商品列表 */
                @ApiListField("tbd_or_trash_item_ids")
            private List<Long> tbdOrTrashItemIds;
    
        public Long getBundleId() {
    return this.bundleId;
    }
    public void setBundleId(Long bundleId) {
    this.bundleId = bundleId;
    }
        public AliexpressOfferRedefiningQuerybundleAeopBundleItem getMainItem() {
    return this.mainItem;
    }
    public void setMainItem(AliexpressOfferRedefiningQuerybundleAeopBundleItem mainItem) {
    this.mainItem = mainItem;
    }
        public Integer getOrder() {
    return this.order;
    }
    public void setOrder(Integer order) {
    this.order = order;
    }
        public List<AliexpressOfferRedefiningQuerybundleAeopBundleSubItem> getSubItemList() {
    return this.subItemList;
    }
    public void setSubItemList(List<AliexpressOfferRedefiningQuerybundleAeopBundleSubItem> subItemList) {
    this.subItemList = subItemList;
    }
        public List<Long> getTbdOrTrashItemIds() {
    return this.tbdOrTrashItemIds;
    }
    public void setTbdOrTrashItemIds(List<Long> tbdOrTrashItemIds) {
    this.tbdOrTrashItemIds = tbdOrTrashItemIds;
    }
    }