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

public class AeResCoverDefaultApiAEDefaultFirstObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("second_string")
            private String secondString;
        /** 1 */
                @ApiField("second_obj")
            private AeResCoverDefaultApiAEDefaultSecondObject secondObj;
        /** 1 */
                @ApiListField("second_number_list")
            private List<Integer> secondNumberList;
        /** 1 */
                @ApiField("second_enum")
            private String secondEnum;
        /** 1 */
                @ApiListField("second_obj_list")
            private List<AeResCoverDefaultApiSecondObjectList> secondObjList;
    
        public String getSecondString() {
    return this.secondString;
    }
    public void setSecondString(String secondString) {
    this.secondString = secondString;
    }
        public AeResCoverDefaultApiAEDefaultSecondObject getSecondObj() {
    return this.secondObj;
    }
    public void setSecondObj(AeResCoverDefaultApiAEDefaultSecondObject secondObj) {
    this.secondObj = secondObj;
    }
        public List<Integer> getSecondNumberList() {
    return this.secondNumberList;
    }
    public void setSecondNumberList(List<Integer> secondNumberList) {
    this.secondNumberList = secondNumberList;
    }
        public String getSecondEnum() {
    return this.secondEnum;
    }
    public void setSecondEnum(String secondEnum) {
    this.secondEnum = secondEnum;
    }
        public List<AeResCoverDefaultApiSecondObjectList> getSecondObjList() {
    return this.secondObjList;
    }
    public void setSecondObjList(List<AeResCoverDefaultApiSecondObjectList> secondObjList) {
    this.secondObjList = secondObjList;
    }
    }