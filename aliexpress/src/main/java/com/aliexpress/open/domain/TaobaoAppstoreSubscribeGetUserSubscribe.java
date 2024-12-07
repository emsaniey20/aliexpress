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

public class TaobaoAppstoreSubscribeGetUserSubscribe implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订购结束时间。格式:yyyy-MM-dd HH:mm:ss */
                @ApiField("end_date")
            private String endDate;
        /** 0-无版本信息；1-初级版；2-中级版；3-高级版 */
                @ApiField("version_no")
            private Integer versionNo;
        /** 订购开始时间。格式:yyyy-MM-dd HH:mm:ss */
                @ApiField("start_date")
            private String startDate;
        /** 订购状况。应用订购者：subscribeUser;尚未订购：unsubscribeUser；非法用户：invalidateUser */
                @ApiField("status")
            private String status;
    
        public String getEndDate() {
    return this.endDate;
    }
    public void setEndDate(String endDate) {
    this.endDate = endDate;
    }
        public Integer getVersionNo() {
    return this.versionNo;
    }
    public void setVersionNo(Integer versionNo) {
    this.versionNo = versionNo;
    }
        public String getStartDate() {
    return this.startDate;
    }
    public void setStartDate(String startDate) {
    this.startDate = startDate;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
    }