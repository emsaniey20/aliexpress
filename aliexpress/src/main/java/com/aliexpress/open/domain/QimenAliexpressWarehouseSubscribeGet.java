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

public class QimenAliexpressWarehouseSubscribeGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订阅关系是否正常 */
                @ApiField("isSubscribe")
            private Boolean isSubscribe;
        /** 当isSubscribe为false时。此字段填充失败原因 */
                @ApiField("exceptionMessage")
            private String exceptionMessage;
        /** 公司名称，当isSubscribe为true时，返回公司名称	 */
                @ApiField("companyName")
            private String companyName;
        /** 公司法人，当isSubscribe为true时，返回姓名	 */
                @ApiField("name")
            private String name;
    
        public Boolean getIsSubscribe() {
    return this.isSubscribe;
    }
    public void setIsSubscribe(Boolean isSubscribe) {
    this.isSubscribe = isSubscribe;
    }
        public String getExceptionMessage() {
    return this.exceptionMessage;
    }
    public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
    }
        public String getCompanyName() {
    return this.companyName;
    }
    public void setCompanyName(String companyName) {
    this.companyName = companyName;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
    }