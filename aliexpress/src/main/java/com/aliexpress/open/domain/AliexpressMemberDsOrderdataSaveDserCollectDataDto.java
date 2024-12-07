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

public class AliexpressMemberDsOrderdataSaveDserCollectDataDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** AE商品ID */
                @ApiField("ae_product_id")
            private String aeProductId;
        /** SKU站外销售金额,保留2位小数 */
                @ApiField("product_amount")
            private String productAmount;
        /** 订单站外销售金额,保留2位小数 */
                @ApiField("order_amount")
            private String orderAmount;
        /** 站外支付时间,GMT时间，格式YYYYMMDD:HHMMSS */
                @ApiField("paytime")
            private String paytime;
        /** AE商品SKU信息,SKU键值对：  "200000182:193;200007763:201336100" */
                @ApiField("ae_sku_info")
            private String aeSkuInfo;
        /** 商品站外url */
                @ApiField("product_url")
            private String productUrl;
        /** AE订单id */
                @ApiField("ae_orderid")
            private String aeOrderid;
    
        public String getAeProductId() {
    return this.aeProductId;
    }
    public void setAeProductId(String aeProductId) {
    this.aeProductId = aeProductId;
    }
        public String getProductAmount() {
    return this.productAmount;
    }
    public void setProductAmount(String productAmount) {
    this.productAmount = productAmount;
    }
        public String getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(String orderAmount) {
    this.orderAmount = orderAmount;
    }
        public String getPaytime() {
    return this.paytime;
    }
    public void setPaytime(String paytime) {
    this.paytime = paytime;
    }
        public String getAeSkuInfo() {
    return this.aeSkuInfo;
    }
    public void setAeSkuInfo(String aeSkuInfo) {
    this.aeSkuInfo = aeSkuInfo;
    }
        public String getProductUrl() {
    return this.productUrl;
    }
    public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
    }
        public String getAeOrderid() {
    return this.aeOrderid;
    }
    public void setAeOrderid(String aeOrderid) {
    this.aeOrderid = aeOrderid;
    }
    }