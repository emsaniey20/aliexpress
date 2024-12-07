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

public class CainiaoGlobalPickupResourceRecommendAePickupWarehouseRecommendResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 仓资源名称 */
                @ApiField("res_name")
            private String resName;
        /** 发货物流服务编码 */
                @ApiField("schema_code")
            private String schemaCode;
        /** 仓资源编码 */
                @ApiField("res_code")
            private String resCode;
    
        public String getResName() {
    return this.resName;
    }
    public void setResName(String resName) {
    this.resName = resName;
    }
        public String getSchemaCode() {
    return this.schemaCode;
    }
    public void setSchemaCode(String schemaCode) {
    this.schemaCode = schemaCode;
    }
        public String getResCode() {
    return this.resCode;
    }
    public void setResCode(String resCode) {
    this.resCode = resCode;
    }
    }