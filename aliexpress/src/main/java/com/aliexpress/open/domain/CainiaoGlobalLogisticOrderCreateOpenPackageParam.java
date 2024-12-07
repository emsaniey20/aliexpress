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

public class CainiaoGlobalLogisticOrderCreateOpenPackageParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹长度 */
                @ApiField("length")
            private Long length;
        /** 包裹宽度 */
                @ApiField("width")
            private Long width;
        /** 包裹高度 */
                @ApiField("height")
            private Long height;
        /** 包裹重量 */
                @ApiField("weight")
            private Long weight;
        /** 包裹价格 */
                @ApiField("price")
            private Long price;
        /** 商品参数 */
                @ApiListField("item_params")
            private List<CainiaoGlobalLogisticOrderCreateOpenItemParam> itemParams;
        /** 包裹价格币种，CNY：人民币、USD：美元、RUB：卢布。 */
                @ApiField("currency")
            private String currency;
    
        public Long getLength() {
    return this.length;
    }
    public void setLength(Long length) {
    this.length = length;
    }
        public Long getWidth() {
    return this.width;
    }
    public void setWidth(Long width) {
    this.width = width;
    }
        public Long getHeight() {
    return this.height;
    }
    public void setHeight(Long height) {
    this.height = height;
    }
        public Long getWeight() {
    return this.weight;
    }
    public void setWeight(Long weight) {
    this.weight = weight;
    }
        public Long getPrice() {
    return this.price;
    }
    public void setPrice(Long price) {
    this.price = price;
    }
        public List<CainiaoGlobalLogisticOrderCreateOpenItemParam> getItemParams() {
    return this.itemParams;
    }
    public void setItemParams(List<CainiaoGlobalLogisticOrderCreateOpenItemParam> itemParams) {
    this.itemParams = itemParams;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
    }