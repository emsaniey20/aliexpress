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

public class AliexpressPostproductRedefiningEditsingleskupriceErrorDetail implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误代码 */
                @ApiField("error_code")
            private String errorCode;
        /** productIds */
                @ApiListField("product_ids")
            private List<Long> productIds;
    
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public List<Long> getProductIds() {
    return this.productIds;
    }
    public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
    }
    }