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

public class CainiaoGlobalPickupResourceRecommendHsfResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 响应数据 */
                @ApiListField("data")
            private List<CainiaoGlobalPickupResourceRecommendAePickupWarehouseRecommendResponse> data;
        /** 请求处理是否成功 */
                @ApiField("success")
            private Boolean success;
    
        public List<CainiaoGlobalPickupResourceRecommendAePickupWarehouseRecommendResponse> getData() {
    return this.data;
    }
    public void setData(List<CainiaoGlobalPickupResourceRecommendAePickupWarehouseRecommendResponse> data) {
    this.data = data;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }