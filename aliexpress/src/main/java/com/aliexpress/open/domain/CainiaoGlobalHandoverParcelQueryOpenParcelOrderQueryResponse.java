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

public class CainiaoGlobalHandoverParcelQueryOpenParcelOrderQueryResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 小包发货方式，DOOR_PICKUP/SELF_SEND/SELF_POST */
                @ApiField("pickup_type")
            private String pickupType;
        /** 交接仓编码，快递揽收场景,大包交接目的地国际分拨 */
                @ApiField("handover_warehouse_code")
            private String handoverWarehouseCode;
        /** 交接仓名称，快递揽收场景,大包交接目的地国际分拨 */
                @ApiField("handover_warehouse_name")
            private String handoverWarehouseName;
        /** 该小包是否已经组包 */
                @ApiField("has_been_handover")
            private Boolean hasBeenHandover;
        /** 关联的交接单ID */
                @ApiField("handover_order_id")
            private Long handoverOrderId;
        /** 关联的大包的编码 */
                @ApiField("handover_content_code")
            private String handoverContentCode;
        /** 关联的大包ID */
                @ApiField("handover_content_id")
            private Long handoverContentId;
        /** 是否能组包 */
                @ApiField("can_create_handover")
            private Boolean canCreateHandover;
    
        public String getPickupType() {
    return this.pickupType;
    }
    public void setPickupType(String pickupType) {
    this.pickupType = pickupType;
    }
        public String getHandoverWarehouseCode() {
    return this.handoverWarehouseCode;
    }
    public void setHandoverWarehouseCode(String handoverWarehouseCode) {
    this.handoverWarehouseCode = handoverWarehouseCode;
    }
        public String getHandoverWarehouseName() {
    return this.handoverWarehouseName;
    }
    public void setHandoverWarehouseName(String handoverWarehouseName) {
    this.handoverWarehouseName = handoverWarehouseName;
    }
        public Boolean getHasBeenHandover() {
    return this.hasBeenHandover;
    }
    public void setHasBeenHandover(Boolean hasBeenHandover) {
    this.hasBeenHandover = hasBeenHandover;
    }
        public Long getHandoverOrderId() {
    return this.handoverOrderId;
    }
    public void setHandoverOrderId(Long handoverOrderId) {
    this.handoverOrderId = handoverOrderId;
    }
        public String getHandoverContentCode() {
    return this.handoverContentCode;
    }
    public void setHandoverContentCode(String handoverContentCode) {
    this.handoverContentCode = handoverContentCode;
    }
        public Long getHandoverContentId() {
    return this.handoverContentId;
    }
    public void setHandoverContentId(Long handoverContentId) {
    this.handoverContentId = handoverContentId;
    }
        public Boolean getCanCreateHandover() {
    return this.canCreateHandover;
    }
    public void setCanCreateHandover(Boolean canCreateHandover) {
    this.canCreateHandover = canCreateHandover;
    }
    }