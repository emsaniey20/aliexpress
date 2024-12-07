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

public class AeResCoverDefaultApiSecondObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("thirdString")
            private String thirdString;
        /** 1 */
                @ApiListField("thirdStringList")
            private List<String> thirdStringList;
        /** 1 */
                @ApiField("thirdEnum")
            private String thirdEnum;
    
        public String getThirdString() {
    return this.thirdString;
    }
    public void setThirdString(String thirdString) {
    this.thirdString = thirdString;
    }
        public List<String> getThirdStringList() {
    return this.thirdStringList;
    }
    public void setThirdStringList(List<String> thirdStringList) {
    this.thirdStringList = thirdStringList;
    }
        public String getThirdEnum() {
    return this.thirdEnum;
    }
    public void setThirdEnum(String thirdEnum) {
    this.thirdEnum = thirdEnum;
    }
    }