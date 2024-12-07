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

public class AliexpressLogisticsAbnormalorderQueryAeopPackgeInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹长度（cm） */
                @ApiField("goods_length")
            private Integer goodsLength;
        /** 包裹宽度（cm） */
                @ApiField("goods_width")
            private Integer goodsWidth;
        /** 包裹高度（cm） */
                @ApiField("goods_height")
            private Integer goodsHeight;
        /** 包裹重量（g） */
                @ApiField("goods_weight")
            private Integer goodsWeight;
    
        public Integer getGoodsLength() {
    return this.goodsLength;
    }
    public void setGoodsLength(Integer goodsLength) {
    this.goodsLength = goodsLength;
    }
        public Integer getGoodsWidth() {
    return this.goodsWidth;
    }
    public void setGoodsWidth(Integer goodsWidth) {
    this.goodsWidth = goodsWidth;
    }
        public Integer getGoodsHeight() {
    return this.goodsHeight;
    }
    public void setGoodsHeight(Integer goodsHeight) {
    this.goodsHeight = goodsHeight;
    }
        public Integer getGoodsWeight() {
    return this.goodsWeight;
    }
    public void setGoodsWeight(Integer goodsWeight) {
    this.goodsWeight = goodsWeight;
    }
    }