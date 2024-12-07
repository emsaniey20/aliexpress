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

public class YushenSpiTest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("param21")
            private String param21;
    
        public String getParam21() {
    return this.param21;
    }
    public void setParam21(String param21) {
    this.param21 = param21;
    }
    }