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

public class AliexpressLogisticsDsTrackinginfoQueryString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** eventDesc */
                @ApiField("event_desc")
            private String eventDesc;
        /** signedName */
                @ApiField("signed_name")
            private String signedName;
        /** status */
                @ApiField("status")
            private String status;
        /** address */
                @ApiField("address")
            private String address;
        /** eventDate */
                @ApiField("event_date")
            private String eventDate;
    
        public String getEventDesc() {
    return this.eventDesc;
    }
    public void setEventDesc(String eventDesc) {
    this.eventDesc = eventDesc;
    }
        public String getSignedName() {
    return this.signedName;
    }
    public void setSignedName(String signedName) {
    this.signedName = signedName;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getAddress() {
    return this.address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
        public String getEventDate() {
    return this.eventDate;
    }
    public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
    }
    }