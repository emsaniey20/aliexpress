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

public class CaocaiTestLocalApi0815we implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 测试a */
                @ApiField("vv")
            private String vv;
        /** 测试b */
                @ApiField("bb")
            private String bb;
    
        public String getVv() {
    return this.vv;
    }
    public void setVv(String vv) {
    this.vv = vv;
    }
        public String getBb() {
    return this.bb;
    }
    public void setBb(String bb) {
    this.bb = bb;
    }
    }