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

public class AeResCoverDefaultApiThirdObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("fourthBoolean")
            private String fourthBoolean;
        /** 1 */
                @ApiField("fourthBooleanList")
            private List<Boolean> fourthBooleanList;
    
        public String getFourthBoolean() {
    return this.fourthBoolean;
    }
    public void setFourthBoolean(String fourthBoolean) {
    this.fourthBoolean = fourthBoolean;
    }
        public List<Boolean> getFourthBooleanList() {
    return this.fourthBooleanList;
    }
    public void setFourthBooleanList(List<Boolean> fourthBooleanList) {
    this.fourthBooleanList = fourthBooleanList;
    }
    }