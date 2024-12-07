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

public class CainiaoGlobalLogisticOrderCreateOpenServiceParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** DOOR_PICKUP:上门揽收；SELF_POST:自寄；SELF_SEND:自送；UNREACHABLE_RETURN:不可达退回； */
                @ApiField("code")
            private String code;
        /** 不同物流服务的扩展信息 */
                @ApiField("features")
            private HashMap<String, Object> features;
    
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public HashMap<String, Object> getFeatures() {
    return this.features;
    }
    public void setFeatures(HashMap<String, Object> features) {
    this.features = features;
    }
    }