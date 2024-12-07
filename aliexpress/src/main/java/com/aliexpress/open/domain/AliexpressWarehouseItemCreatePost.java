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

public class AliexpressWarehouseItemCreatePost implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 新建/更新成功货品ID */
                @ApiListField("successIds")
            private List<String> successIds;
        /** 新建/更新失败货品ID */
                @ApiListField("failedIds")
            private List<String> failedIds;
    
        public List<String> getSuccessIds() {
    return this.successIds;
    }
    public void setSuccessIds(List<String> successIds) {
    this.successIds = successIds;
    }
        public List<String> getFailedIds() {
    return this.failedIds;
    }
    public void setFailedIds(List<String> failedIds) {
    this.failedIds = failedIds;
    }
    }