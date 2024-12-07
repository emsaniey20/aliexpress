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

public class AliexpressTradeRedefiningFindorderbaseinfoTpOpenSingleOrderQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 12345 */
                @ApiField("buyer_aliid")
            private Long buyerAliid;
        /** 12345 */
                @ApiField("field_list")
            private String fieldList;
        /** 12345 */
                @ApiField("seller_operator_aliid")
            private Long sellerOperatorAliid;
        /** 12345 */
                @ApiField("show_id")
            private String showId;
        /** 12345 */
                @ApiField("ext_info_bit_flag")
            private Integer extInfoBitFlag;
        /** 订单ID */
                @ApiField("order_id")
            private Long orderId;
        /** 12345 */
                @ApiField("seller_aliid")
            private Long sellerAliid;
    
        public Long getBuyerAliid() {
    return this.buyerAliid;
    }
    public void setBuyerAliid(Long buyerAliid) {
    this.buyerAliid = buyerAliid;
    }
        public String getFieldList() {
    return this.fieldList;
    }
    public void setFieldList(String fieldList) {
    this.fieldList = fieldList;
    }
        public Long getSellerOperatorAliid() {
    return this.sellerOperatorAliid;
    }
    public void setSellerOperatorAliid(Long sellerOperatorAliid) {
    this.sellerOperatorAliid = sellerOperatorAliid;
    }
        public String getShowId() {
    return this.showId;
    }
    public void setShowId(String showId) {
    this.showId = showId;
    }
        public Integer getExtInfoBitFlag() {
    return this.extInfoBitFlag;
    }
    public void setExtInfoBitFlag(Integer extInfoBitFlag) {
    this.extInfoBitFlag = extInfoBitFlag;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getSellerAliid() {
    return this.sellerAliid;
    }
    public void setSellerAliid(Long sellerAliid) {
    this.sellerAliid = sellerAliid;
    }
    }