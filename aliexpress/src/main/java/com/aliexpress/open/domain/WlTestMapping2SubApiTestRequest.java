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

public class WlTestMapping2SubApiTestRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 5 */
                @ApiField("sub_name")
            private String subName;
        /** 6 */
                @ApiField("subAge")
            private String subAge;
    
        public String getSubName() {
    return this.subName;
    }
    public void setSubName(String subName) {
    this.subName = subName;
    }
        public String getSubAge() {
    return this.subAge;
    }
    public void setSubAge(String subAge) {
    this.subAge = subAge;
    }
    }