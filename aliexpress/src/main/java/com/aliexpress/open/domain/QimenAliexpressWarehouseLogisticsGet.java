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

public class QimenAliexpressWarehouseLogisticsGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 尾程名称 */
                @ApiField("warehouseLogisticsSolutionsName")
            private String warehouseLogisticsSolutionsName;
        /** 尾程编码 */
                @ApiField("warehouseLogisticsSolutionsCode")
            private String warehouseLogisticsSolutionsCode;
    
        public String getWarehouseLogisticsSolutionsName() {
    return this.warehouseLogisticsSolutionsName;
    }
    public void setWarehouseLogisticsSolutionsName(String warehouseLogisticsSolutionsName) {
    this.warehouseLogisticsSolutionsName = warehouseLogisticsSolutionsName;
    }
        public String getWarehouseLogisticsSolutionsCode() {
    return this.warehouseLogisticsSolutionsCode;
    }
    public void setWarehouseLogisticsSolutionsCode(String warehouseLogisticsSolutionsCode) {
    this.warehouseLogisticsSolutionsCode = warehouseLogisticsSolutionsCode;
    }
    }