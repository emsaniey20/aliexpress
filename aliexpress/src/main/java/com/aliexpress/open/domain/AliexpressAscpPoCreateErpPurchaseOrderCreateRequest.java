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

public class AliexpressAscpPoCreateErpPurchaseOrderCreateRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务租户编码，AEG场景请填写AEGDCHAIN */
                @ApiField("merchant_code")
            private String merchantCode;
        /** 期望上架日期时间戳,单位ms。精度到天即可，更高精度仍然以天为准 */
                @ApiField("eta")
            private Long eta;
        /** 业务租户Id，AEG场景请填写288000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 1：快递；2：卡车派送 */
                @ApiField("delivery_type")
            private Integer deliveryType;
        /** 入库单备注 */
                @ApiField("remark")
            private String remark;
        /** 1：上午；2：下午 */
                @ApiField("inbound_wave")
            private Integer inboundWave;
        /** 长度不得超过25位，建单请求外部单号，同一个主店铺下需全局唯一，重复时幂等返回之前创建成功的入库单号。建议使用 仓_时间戳 保证全局唯一 */
                @ApiField("request_no")
            private String requestNo;
        /** 入库单创建明细，品+计划入库数量 */
                @ApiListField("items")
            private List<AliexpressAscpPoCreateErpPurchaseOrderCreateItemDTO> items;
        /** 仓编码 */
                @ApiField("store_code")
            private String storeCode;
    
        public String getMerchantCode() {
    return this.merchantCode;
    }
    public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
    }
        public Long getEta() {
    return this.eta;
    }
    public void setEta(Long eta) {
    this.eta = eta;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Integer getDeliveryType() {
    return this.deliveryType;
    }
    public void setDeliveryType(Integer deliveryType) {
    this.deliveryType = deliveryType;
    }
        public String getRemark() {
    return this.remark;
    }
    public void setRemark(String remark) {
    this.remark = remark;
    }
        public Integer getInboundWave() {
    return this.inboundWave;
    }
    public void setInboundWave(Integer inboundWave) {
    this.inboundWave = inboundWave;
    }
        public String getRequestNo() {
    return this.requestNo;
    }
    public void setRequestNo(String requestNo) {
    this.requestNo = requestNo;
    }
        public List<AliexpressAscpPoCreateErpPurchaseOrderCreateItemDTO> getItems() {
    return this.items;
    }
    public void setItems(List<AliexpressAscpPoCreateErpPurchaseOrderCreateItemDTO> items) {
    this.items = items;
    }
        public String getStoreCode() {
    return this.storeCode;
    }
    public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
    }
    }