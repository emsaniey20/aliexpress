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

public class AliexpressMerchantDiagnosisQueryIsvMerchantDiagnosisResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 体检等级 */
                @ApiField("level")
            private AliexpressMerchantDiagnosisQueryIsvMerchantHealthLevel level;
        /** 问题数量 */
                @ApiField("issue_num")
            private Integer issueNum;
        /** 处理链接 */
                @ApiField("action_url")
            private String actionUrl;
        /** 店铺体检状态 */
                @ApiField("shop_status_desc")
            private String shopStatusDesc;
    
        public AliexpressMerchantDiagnosisQueryIsvMerchantHealthLevel getLevel() {
    return this.level;
    }
    public void setLevel(AliexpressMerchantDiagnosisQueryIsvMerchantHealthLevel level) {
    this.level = level;
    }
        public Integer getIssueNum() {
    return this.issueNum;
    }
    public void setIssueNum(Integer issueNum) {
    this.issueNum = issueNum;
    }
        public String getActionUrl() {
    return this.actionUrl;
    }
    public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
    }
        public String getShopStatusDesc() {
    return this.shopStatusDesc;
    }
    public void setShopStatusDesc(String shopStatusDesc) {
    this.shopStatusDesc = shopStatusDesc;
    }
    }