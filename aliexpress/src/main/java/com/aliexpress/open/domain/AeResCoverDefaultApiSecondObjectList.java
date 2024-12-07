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

public class AeResCoverDefaultApiSecondObjectList implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("thirdNumber")
            private String thirdNumber;
        /** 1 */
                @ApiField("thirdObject")
            private AeResCoverDefaultApiThirdObject thirdObject;
        /** 1 */
                @ApiField("thirdNumberList")
            private Long thirdNumberList;
        /** 1 */
                @ApiField("thirdEnum2")
            private String thirdEnum2;
    
        public String getThirdNumber() {
    return this.thirdNumber;
    }
    public void setThirdNumber(String thirdNumber) {
    this.thirdNumber = thirdNumber;
    }
        public AeResCoverDefaultApiThirdObject getThirdObject() {
    return this.thirdObject;
    }
    public void setThirdObject(AeResCoverDefaultApiThirdObject thirdObject) {
    this.thirdObject = thirdObject;
    }
        public Long getThirdNumberList() {
    return this.thirdNumberList;
    }
    public void setThirdNumberList(Long thirdNumberList) {
    this.thirdNumberList = thirdNumberList;
    }
        public String getThirdEnum2() {
    return this.thirdEnum2;
    }
    public void setThirdEnum2(String thirdEnum2) {
    this.thirdEnum2 = thirdEnum2;
    }
    }