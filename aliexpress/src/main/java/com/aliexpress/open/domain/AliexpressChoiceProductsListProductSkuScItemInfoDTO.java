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

public class AliexpressChoiceProductsListProductSkuScItemInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 货品条码 */
                @ApiField("sc_item_bar_code")
            private String scItemBarCode;
        /** 货品id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 1: 未绑定, 2: 绑定中, 3: 解绑待审核, 4: 解绑拒绝 */
                @ApiField("bind_status")
            private Long bindStatus;
        /** 货品解绑拒绝的原因 */
                @ApiField("unbind_refuse_reason")
            private String unbindRefuseReason;
    
        public String getScItemBarCode() {
    return this.scItemBarCode;
    }
    public void setScItemBarCode(String scItemBarCode) {
    this.scItemBarCode = scItemBarCode;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public Long getBindStatus() {
    return this.bindStatus;
    }
    public void setBindStatus(Long bindStatus) {
    this.bindStatus = bindStatus;
    }
        public String getUnbindRefuseReason() {
    return this.unbindRefuseReason;
    }
    public void setUnbindRefuseReason(String unbindRefuseReason) {
    this.unbindRefuseReason = unbindRefuseReason;
    }
    }