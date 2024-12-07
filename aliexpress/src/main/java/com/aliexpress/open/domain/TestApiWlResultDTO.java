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

public class TestApiWlResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 返回对象 */
                @ApiField("data")
            private TestApiWlTestApiRespDTO data;
    
        public TestApiWlTestApiRespDTO getData() {
    return this.data;
    }
    public void setData(TestApiWlTestApiRespDTO data) {
    this.data = data;
    }
    }