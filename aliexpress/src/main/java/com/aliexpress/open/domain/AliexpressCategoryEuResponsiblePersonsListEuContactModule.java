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

public class AliexpressCategoryEuResponsiblePersonsListEuContactModule implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 欧盟责任人名字 */
                @ApiField("name")
            private String name;
        /** 欧盟责任人id */
                @ApiField("msr_eu_id")
            private Long msrEuId;
    
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public Long getMsrEuId() {
    return this.msrEuId;
    }
    public void setMsrEuId(Long msrEuId) {
    this.msrEuId = msrEuId;
    }
    }