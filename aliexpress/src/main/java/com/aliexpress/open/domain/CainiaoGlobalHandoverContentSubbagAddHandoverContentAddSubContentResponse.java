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

public class CainiaoGlobalHandoverContentSubbagAddHandoverContentAddSubContentResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 入参的批次号 */
                @ApiField("order_code")
            private String orderCode;
        /** 追加成功的子包号列表。存在3种情况。全部追加成功，部分追加成功，全部失败。需根据返回的子包号列表长度和入参add_subbag_quantity判断。如果两者长度相等则说明全部成功，否则说明存在失败情况，可重试请求失败的数量 */
                @ApiListField("subbag_code_list")
            private List<String> subbagCodeList;
        /** 子包列表详情 */
                @ApiListField("subbag_detail_list")
            private List<CainiaoGlobalHandoverContentSubbagAddHandoverContentDTO> subbagDetailList;
    
        public String getOrderCode() {
    return this.orderCode;
    }
    public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
    }
        public List<String> getSubbagCodeList() {
    return this.subbagCodeList;
    }
    public void setSubbagCodeList(List<String> subbagCodeList) {
    this.subbagCodeList = subbagCodeList;
    }
        public List<CainiaoGlobalHandoverContentSubbagAddHandoverContentDTO> getSubbagDetailList() {
    return this.subbagDetailList;
    }
    public void setSubbagDetailList(List<CainiaoGlobalHandoverContentSubbagAddHandoverContentDTO> subbagDetailList) {
    this.subbagDetailList = subbagDetailList;
    }
    }